package kr.or.kosta.and1013;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class Ex2_ListView extends Activity{
	private ListView listv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex2_listview);
		listv = (ListView) findViewById(R.id.ex2_list);
		// ListView의 데이터 영역 -------------------------
		final ArrayList<HashMap<String, String>> myList = 
				new ArrayList<HashMap<String,String>>();
		HashMap<String, String> map;
		map = new HashMap<String, String>();
		map.put("MemberID", "AMan");
		map.put("Name", "KimGilDong");
		map.put("Tel","010-121-1215");
		myList.add(map);
		map = new HashMap<String, String>();
		map.put("MemberID", "Kapa1");
		map.put("Name", "Parkyounji");
		map.put("Tel","010-1915-1915");
		myList.add(map);
		map = new HashMap<String, String>();
		map.put("MemberID", "Kapa2");
		map.put("Name", "Parksumi");
		map.put("Tel","010-9215-1519");
		myList.add(map);
		map = new HashMap<String, String>();
		map.put("MemberID", "Kapa3");
		map.put("Name", "Parkjisu");
		map.put("Tel","010-1215-1515");
		myList.add(map);
		map = new HashMap<String, String>();
		map.put("MemberID", "Kapa4");
		map.put("Name", "Sinyounji");
		map.put("Tel","010-2275-1585");
		myList.add(map);
		map = new HashMap<String, String>();
		map.put("MemberID", "Kapa5");
		map.put("Name", "Nooyounji");
		map.put("Tel","010-2215-1522");
		myList.add(map);
		map = new HashMap<String, String>();
		map.put("MemberID", "Kapa6");
		map.put("Name", "Beayounji");
		map.put("Tel","010-1215-1215");
		myList.add(map);
		map = new HashMap<String, String>();
		map.put("MemberID", "Kapa7");
		map.put("Name", "Gondyounji");
		map.put("Tel","010-1215-4515");
		myList.add(map);
		map = new HashMap<String, String>();
		map.put("MemberID", "Kapa8");
		map.put("Name", "Songyounji");
		map.put("Tel","010-1215-3515");
		myList.add(map);
		map = new HashMap<String, String>();
		map.put("MemberID", "Kapa9");
		map.put("Name", "Leeyounji");
		map.put("Tel","010-1215-2515");
		myList.add(map);
		//----------------------------------------------
		SimpleAdapter sAdapter = null;
		// SimpleAdapter: xml에 데이터를 쉽게 배치 적용할 수 있다.
		// SimpleAdapter(context, data, 배치될레이아웃resource,
		// , data에서 읽어올 키값을 배열로 지정,
		// 배치될 레이아웃 리소스에서 컬럼값을 id로 지정);
		sAdapter = new SimpleAdapter(this, myList
				,R.layout.ex2_column,
				new String[]{"MemberID","Name","Tel"},
				new int[]{R.id.ex2_memId,R.id.ex2_memName,R.id.ex2_memTel});
		// listview에 세팅
		listv.setAdapter(sAdapter);
		listv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// 선택한 item에 해당되는 
				//ArrayList로 부터 HashMap 반환받는다.
				HashMap<String, String> map = myList.get(position);
			    // Map에서 Key로 받아내기
				String idv = map.get("MemberID");
				String namev = map.get("Name");
				String telv = map.get("Tel");
				StringBuffer s = new StringBuffer();
				s.append(idv).append("/").append(namev).append("/");
				s.append(telv);
						
				Toast.makeText(Ex2_ListView.this,
						s.toString() , 3000).show();
				
				Intent intent = new Intent(Ex2_ListView.this, Ex2_Res.class);
				Bundle mybBundle = new Bundle();
				mybBundle.putString("key", s.toString());
				intent.putExtras(mybBundle);
				startActivity(intent);
			}
		});
	}
}







