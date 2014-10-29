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
	//GoogleMap ��ü�� xml���� ���ͼ� ����
	setContentView(R.layout.ex2_map);
	double latitude = 37.478911;
	double longitude = 127.012339;
	map = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.fragment1)).getMap();
	// Map�� ��ġ�� �̵��ϱ�
	CameraUpdate update = CameraUpdateFactory.newLatLng(new LatLng(latitude, longitude));
	// ������ ���� ��ǥ�� �̵�
	map.moveCamera(update);
	
	// Ȯ�뼳��
	CameraUpdate zoom = CameraUpdateFactory.zoomTo(15);
	map.animateCamera(zoom);
	
	// ��Ŀ������ ���� ��ü ����
	MarkerOptions markOp = new MarkerOptions();
	// ��Ŀ ��ġ
	markOp.position(new LatLng(latitude, longitude));
	// ��Ŀ Ÿ��Ʋ
	markOp.title("My Mark!");
	markOp.snippet("Hello! I`m here");
	
	// ��ǳ��
	map.addMarker(markOp).showInfoWindow();
	
	// ��ũ ������ �ޱ�
	map.setOnMarkerClickListener(new OnMarkerClickListener() {
		
		@Override
		public boolean onMarkerClick(Marker arg0) {
			Toast.makeText(getApplicationContext(), "Make Clicked!", 3000).show();
			return false;
		}
	});
}
	
}