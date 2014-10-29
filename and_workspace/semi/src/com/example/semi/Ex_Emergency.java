package com.example.semi;

import java.io.IOException;
import java.util.List;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ex_Emergency extends Activity {
	private Geocoder coder;
	private TextView result;
	private Button btn1, btn2;
	private EditText lattitude, longitude, address;

	double slati;
	double slongi;
	LocationManager manager;
	String locationProvider;
	String provider;
	String str_my_latitude, str_my_longitude;
	LocationListener sLocationListener = null;
	Location location;

	// 위도와 경도에 해당하는 주소들의 리스트를 반환받기 위한 List를 멤버로선언
	List<Address> list = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.emergency);
		coder = new Geocoder(this);
		result = (TextView) findViewById(R.id.ex1_res);
		btn1 = (Button) findViewById(R.id.ex1_btn1);
		btn2 = (Button) findViewById(R.id.ex1_btn2);
		lattitude = (EditText) findViewById(R.id.ex1_lattitude);
		longitude = (EditText) findViewById(R.id.ex1_longitude);
		address = (EditText) findViewById(R.id.ex1_address);

		if (manager == null) {
			manager = (LocationManager) getSystemService(Service.LOCATION_SERVICE);
		}
		if (sLocationListener == null) {
			sLocationListener = new MyLocationListener();
		}
		// 크라이테리어를 생성해서
		Criteria criteria = new Criteria();
		// GPS로 부터 정확한 정보를 구하기 위해서 정밀도를 높인다.
		criteria.setAccuracy(Criteria.ACCURACY_FINE);
		// 3. 위의 설정을 프로바이더에게 넘겨준다.
		// 2번째인자 true는 활성화 되었을 때만 정보를 얻어온다.
		provider = manager.getBestProvider(criteria, true);
		// provider, 주기, 거리, 감지자, 3초당 3미터 거리
		manager.requestLocationUpdates(provider, 3000, 3, sLocationListener);
		location = manager.getLastKnownLocation(provider);

		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String latt = String.valueOf(slati);
				String longi = String.valueOf(slongi);
				Log.d("lattitude", latt);
				Log.d("longitude", longi);

				try {
					// 최대값을 선언한후에 list에 담는 작업
					list = coder.getFromLocation(Double.parseDouble(latt),
							Double.parseDouble(longi), 10);
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (list != null) {
					// list로 받아온 address의 주소만 출력한다.
					result.setText(String
							.valueOf(list.get(0).getAddressLine(0)));
					sendSMS("01062841850", result.getText().toString());
					startActivity(new Intent("android.intent.action.CALL", Uri
							.parse("tel:01062841850")));
				} else {
					result.setText("위도와 경도가 입력되지 않았습니다");
				}
			}
		});

		btn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				List<Address> list = null;
				// 거리에 해당되는 주소의 리스트를 반환
				try {
					list = coder.getFromLocationName(address.getText()
							.toString().trim(), 10);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (list != null) {
					result.setText(String
							.valueOf(list.get(0).getAddressLine(0)));
				} else {
					result.setText("주소가 입력되지 않았습니다");
				}
			}
		});

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				if (list != null) {
					// 버튼을 강제로 클릭해서 긴급상황을 전파
					btn1.performClick();
				} else {
					sendSMS("01062841850", "긴급요청이 도착했습니다!");
					startActivity(new Intent("android.intent.action.CALL", Uri
							.parse("tel:01062841850")));
				}
			}
		}, 10000);

	}

	class MyLocationListener implements LocationListener {

		@Override
		public void onLocationChanged(Location location) {
			slati = location.getLatitude();
			slongi = location.getLongitude();

			str_my_latitude = Double.toString(location.getLatitude());
			str_my_longitude = Double.toString(location.getLongitude());

			lattitude.setText(String.valueOf(slati));
			longitude.setText(String.valueOf(slongi));
		}

		@Override
		public void onStatusChanged(String provider, int status, Bundle extras) {
			// TODO Auto-generated method stub
			// 상태값이 바뀌게 되면

		}

		@Override
		public void onProviderEnabled(String provider) {
			// TODO Auto-generated method stub
			// 사용가능하게 되면

		}

		@Override
		public void onProviderDisabled(String provider) {
			// TODO Auto-generated method stub
			// 사용할수 없게 된다면

		}
	}

	// SMS발송
	private void sendSMS(String reciver, String context) {
		String SENT = "SMS_SENT";
		String DELIVERED = "SMS_DELIVERED";

		// 자동으로 메시지를 전달하기 위한 AutoSend기능
		PendingIntent sentPI = PendingIntent.getBroadcast(Ex_Emergency.this, 0,
				new Intent(SENT), 0);

		PendingIntent deliveredPI = PendingIntent.getBroadcast(
				Ex_Emergency.this, 0, new Intent(DELIVERED), 0);

		SmsManager sms = SmsManager.getDefault();
		sms.sendTextMessage(reciver, null, context, sentPI, deliveredPI);

		Uri uri = Uri.parse("smsto:" + reciver);

		// 해당 전화번호로 SMS 전송하기 위한 인텐트 생성
		Intent it = new Intent(Intent.ACTION_SENDTO, uri);
	}
}