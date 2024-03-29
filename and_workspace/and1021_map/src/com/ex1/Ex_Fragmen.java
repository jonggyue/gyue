package com.ex1;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Service;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class Ex_Fragmen extends FragmentActivity {
	LocationManager manager;
	LatLng managerNET;
	String locationProvider;
	String provider;
	String str_my_latitude, str_my_longitude;

	LocationListener sLocationListener = null;
	Location location;

	private GoogleMap googlemap;

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.ex2_map);
		googlemap = ((SupportMapFragment) getSupportFragmentManager()
				.findFragmentById(R.id.fragment1)).getMap();
		googlemap.setMyLocationEnabled(true);
		if (manager == null) {
			manager = (LocationManager) getSystemService(Service.LOCATION_SERVICE);
		}

		Criteria criteria = new Criteria();
		criteria.setAccuracy(criteria.ACCURACY_FINE);
		criteria.setAltitudeRequired(true);
		criteria.setBearingRequired(true);
		criteria.setSpeedRequired(true);

		provider = manager.getBestProvider(criteria, true);
		// provider, 주기, 거리, 감지자, 3초당 3미터 거리
		manager.requestLocationUpdates(provider, 3000, 3,
				 sLocationListener);
		location = manager.getLastKnownLocation(provider);
	}

	class MyLocationListener implements LocationListener {

		@Override
		public void onLocationChanged(Location location) {
			double latitude = location.getLatitude();
			double longitude = location.getLongitude();

			str_my_latitude = Double.toString(location.getLatitude());
			str_my_longitude = Double.toString(location.getLongitude());

			LatLng gpsValue = new LatLng(location.getLatitude(),
					location.getLongitude());
			googlemap.moveCamera(CameraUpdateFactory
					.newLatLngZoom(gpsValue, 15));

			double Altitude = location.getAltitude();
			float Speed = location.getSpeed();
			float Bearing = location.getBearing();
			long Time = location.getTime();

			MarkerOptions markOp = new MarkerOptions();
			markOp.position(gpsValue);
			markOp.title("My Mark!");
			markOp.snippet("Test Snippet");

			// 마커를 추가하고 말풍선 표시한 것을 보여주도록 호출
			googlemap.addMarker(markOp);
		}

		@Override
		public void onStatusChanged(String provider, int status, Bundle extras) {
			// 상태가바뀌면

		}

		@Override
		public void onProviderEnabled(String provider) {
			// 사용가능하게되면

		}

		@Override
		public void onProviderDisabled(String provider) {
			// 사용할수없게되면

		}

	}
}
