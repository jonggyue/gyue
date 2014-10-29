package kr.or.kosta.and1020_sqlite;

import kr.or.kosta.and1020_sqllite.R;
import android.app.Activity;
import android.app.Service;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

public class OnlyGeoLocation extends Activity {
	// �ڽ��� ���� ��ġ�� ���� ���ؼ� LocationManager�� ������
	LocationManager manager;

	TextView txtTime, txtBearing, txtSpeed, txtAltitude, txtProvider;
	String locationProvider;
	String provider;
	String str_my_latitude, str_my_longitude;

	LocationListener sLocationListener = null;
	Location location;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.onlygeo);
		// ��Ƽ����:��
		txtAltitude = (TextView) findViewById(R.id.altitude);
		txtSpeed = (TextView) findViewById(R.id.speed);
		txtBearing = (TextView) findViewById(R.id.bearing);
		txtTime = (TextView) findViewById(R.id.time);
		txtProvider = (TextView) findViewById(R.id.provider);

		// 1.LocationManager��ü�� �����Ѵ�.
		if (manager == null) {
			manager = (LocationManager) getSystemService(Service.LOCATION_SERVICE);
		}
		if (sLocationListener == null) {
			sLocationListener = new MyLocationListener();
		}
		// ũ�����׸�� �����ؼ�
		Criteria criteria = new Criteria();
		// GPS�κ��� ��Ȯ�� ������ ���ϱ� ���ؼ� ���е��� ���δ�.
		criteria.setAccuracy(Criteria.ACCURACY_FINE);
		criteria.setAltitudeRequired(true);
		criteria.setBearingRequired(true);
		criteria.setSpeedRequired(true);

		// 3.���� ������ ���ι��̴����� �Ѱ��ش�. 2��° ���� true��
		// Ȱ��ȭ �Ǿ��� ���� ������ ���´�.
		provider = manager.getBestProvider(criteria, true);
		// provider,�ֱ�,�Ÿ�,������, 3�ʴ� 3���ͰŸ�
		manager.requestLocationUpdates(provider, 3000, 3, sLocationListener);
		location = manager.getLastKnownLocation(provider);

	}
	class MyLocationListener implements LocationListener{

		@Override
		public void onLocationChanged(Location location) {
			double latitude = location.getLatitude();
			// Getting longitude of the current locateion
			double longitude = location.getLongitude();
			
			str_my_latitude = Double.toString(location.getLatitude());
			str_my_longitude = Double.toString(location.getLongitude());
			
			Double Altitude = location.getAltitude();
			float Speed = location.getSpeed();
			float Bearing = location.getBearing();
			long Time = location.getTime();
			
			txtTime.setText(String.valueOf(Time));
			txtBearing.setText(String.valueOf(Speed));
			txtSpeed.setText(String.valueOf(Bearing));
			txtAltitude.setText(String.valueOf(Altitude));
		}

		@Override
		public void onStatusChanged(String provider, int status, Bundle extras) {
			// ���°��� �ٲ�� �Ǹ�
			
		}

		@Override
		public void onProviderEnabled(String provider) {
			// ��� �����ϰԵǸ�
			
		}

		@Override
		public void onProviderDisabled(String provider) {
			// ����Ҽ� ���� �ȴٸ�
			
		}
		
	}
}
