package com.ex1;

import com.ex1.R;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

public class PlaceMapFragmen extends FragmentActivity{
	private GoogleMap map;
	
@Override
protected void onCreate(Bundle arg0) {
	super.onCreate(arg0);
	//GoogleMap 객체를 xml에서 얻어와서 생성
	setContentView(R.layout.ex2_map);
	double latitude = 37.478911;
	double longitude = 127.012339;
	map = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.fragment1)).getMap();
	// Map의 위치를 이동하기
	CameraUpdate update = CameraUpdateFactory.newLatLng(new LatLng(latitude, longitude));
	// 설정된 맵의 좌표로 이동
	map.moveCamera(update);
	
	// 확대설정
	CameraUpdate zoom = CameraUpdateFactory.zoomTo(15);
	map.animateCamera(zoom);
	
	// 마커설정을 위한 객체 생성
	MarkerOptions markOp = new MarkerOptions();
	// 마커 위치
	markOp.position(new LatLng(latitude, longitude));
	// 마커 타이틀
	markOp.title("My Mark!");
	markOp.snippet("Hello! I`m here");
	
	// 말풍선
	map.addMarker(markOp).showInfoWindow();
	
	// 마크 리스너 달기
	map.setOnMarkerClickListener(new OnMarkerClickListener() {
		
		@Override
		public boolean onMarkerClick(Marker arg0) {
			Toast.makeText(getApplicationContext(), "Make Clicked!", 3000).show();
			return false;
		}
	});
}
	
}
