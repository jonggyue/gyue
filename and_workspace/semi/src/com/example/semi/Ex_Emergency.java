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

	// ������ �浵�� �ش��ϴ� �ּҵ��� ����Ʈ�� ��ȯ�ޱ� ���� List�� ����μ���
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
		// ũ�����׸�� �����ؼ�
		Criteria criteria = new Criteria();
		// GPS�� ���� ��Ȯ�� ������ ���ϱ� ���ؼ� ���е��� ���δ�.
		criteria.setAccuracy(Criteria.ACCURACY_FINE);
		// 3. ���� ������ ���ι��̴����� �Ѱ��ش�.
		// 2��°���� true�� Ȱ��ȭ �Ǿ��� ���� ������ ���´�.
		provider = manager.getBestProvider(criteria, true);
		// provider, �ֱ�, �Ÿ�, ������, 3�ʴ� 3���� �Ÿ�
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
					// �ִ밪�� �������Ŀ� list�� ��� �۾�
					list = coder.getFromLocation(Double.parseDouble(latt),
							Double.parseDouble(longi), 10);
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (list != null) {
					// list�� �޾ƿ� address�� �ּҸ� ����Ѵ�.
					result.setText(String
							.valueOf(list.get(0).getAddressLine(0)));
					sendSMS("01062841850", result.getText().toString());
					startActivity(new Intent("android.intent.action.CALL", Uri
							.parse("tel:01062841850")));
				} else {
					result.setText("������ �浵�� �Էµ��� �ʾҽ��ϴ�");
				}
			}
		});

		btn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				List<Address> list = null;
				// �Ÿ��� �ش�Ǵ� �ּ��� ����Ʈ�� ��ȯ
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
					result.setText("�ּҰ� �Էµ��� �ʾҽ��ϴ�");
				}
			}
		});

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				if (list != null) {
					// ��ư�� ������ Ŭ���ؼ� ��޻�Ȳ�� ����
					btn1.performClick();
				} else {
					sendSMS("01062841850", "��޿�û�� �����߽��ϴ�!");
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
			// ���°��� �ٲ�� �Ǹ�

		}

		@Override
		public void onProviderEnabled(String provider) {
			// TODO Auto-generated method stub
			// ��밡���ϰ� �Ǹ�

		}

		@Override
		public void onProviderDisabled(String provider) {
			// TODO Auto-generated method stub
			// ����Ҽ� ���� �ȴٸ�

		}
	}

	// SMS�߼�
	private void sendSMS(String reciver, String context) {
		String SENT = "SMS_SENT";
		String DELIVERED = "SMS_DELIVERED";

		// �ڵ����� �޽����� �����ϱ� ���� AutoSend���
		PendingIntent sentPI = PendingIntent.getBroadcast(Ex_Emergency.this, 0,
				new Intent(SENT), 0);

		PendingIntent deliveredPI = PendingIntent.getBroadcast(
				Ex_Emergency.this, 0, new Intent(DELIVERED), 0);

		SmsManager sms = SmsManager.getDefault();
		sms.sendTextMessage(reciver, null, context, sentPI, deliveredPI);

		Uri uri = Uri.parse("smsto:" + reciver);

		// �ش� ��ȭ��ȣ�� SMS �����ϱ� ���� ����Ʈ ����
		Intent it = new Intent(Intent.ACTION_SENDTO, uri);
	}
}