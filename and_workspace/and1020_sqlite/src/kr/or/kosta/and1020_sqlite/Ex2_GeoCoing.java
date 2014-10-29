package kr.or.kosta.and1020_sqlite;

import java.io.IOException;
import java.util.List;

import kr.or.kosta.and1020_sqllite.R;
import android.app.Activity;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
// 주소나 지명(위도/경도) 좌표로 변환
// <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
// <uses-permission android:name="android.permission.INTERNET"/>

public class Ex2_GeoCoing extends Activity {
	private Geocoder coder;
	private TextView result;
	private Button btn1, btn2;
	private EditText lattitude, longitude, address;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex2_geo);
		coder = new Geocoder(this);
		result = (TextView) findViewById(R.id.ex2_res);
		btn1 = (Button) findViewById(R.id.ex2_btn1);
		btn2 = (Button) findViewById(R.id.ex2_btn2);
		lattitude = (EditText) findViewById(R.id.lattitude);
		longitude = (EditText) findViewById(R.id.longitude);
		address = (EditText) findViewById(R.id.address);

		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// 위도와 경도에 해당하는 주소들의 리스트를 반환받기 위한
				// List를 선언
				List<Address> list = null;
				String latt = lattitude.getText().toString().trim();
				String longi = longitude.getText().toString().trim();
				Log.d("lattitude", latt);
				Log.d("longgitude", longi);

				try {
					list = coder.getFromLocation(Double.parseDouble(latt),
							Double.parseDouble(longi), 10);
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (list != null) {
					result.setText(list.get(0).toString());
				}
			}
		});

		btn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				List<Address> list = null;
				// 거리에 해당하는 주소의 리스트를 반환
				try {
					list = coder.getFromLocationName(address.getText()
							.toString().trim(), 10);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (list != null) {
					result.setText(list.get(0).toString());
				}
			}
		});
	}

}
