package kr.or.kosta.and1016_http;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

@SuppressLint("NewApi")
public class Ex3_JSon extends Activity {
	private Button btn1;
	private ListView listv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex3_jsondata);
		// android.os.Build.VERSION.SDK_INT기기버전 정보
		if (android.os.Build.VERSION.SDK_INT > 9) {
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
					.permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}
		listv = (ListView) findViewById(R.id.ex3_listview);
		btn1 = (Button) findViewById(R.id.ex_btn1);
		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				searchData();
			}
		});

	}

	private void searchData() {
		// 과제
		// 1.아래의 json데이터를 url로 받아서 처리

		StringBuffer jsonQuery = new StringBuffer();

		jsonQuery
				.append("[{'CustomerID':'C001','Name':'Win Weerachai','Email':'win.weerachai@thaicreate.com' ,'CountryCode':'TH','Budget':'1000000','Used':'600000'},");
		jsonQuery
				.append("{'CustomerID':'C002','Name':'John Smith','Email':'john.smith@thaicreate.com' ,'CountryCode':'EN','Budget':'2000000','Used':'800000'},");
		jsonQuery
				.append("{'CustomerID':'C003','Name':'Jame Born','Email':'jame.born@thaicreate.com' ,'CountryCode':'US','Budget':'3000000','Used':'600000'},");
		jsonQuery
				.append("{'CustomerID':'C004','Name':'Chalee Angel','Email':'chalee.angel@thaicreate.com' ,'CountryCode':'US','Budget':'4000000','Used':'100000'}]");

		// 2.andmem테이블에 groupid - a, b, c 로 표현
		// 그 데이터를 [{}] 선택해서 추출
		// ======================================

		// jsonData를 읽어 들이는 동작
		// [{key:val},{},{}] => JSONArray 로 jsonData를 읽어와야
		// 반복문으로 하나씩 JSONObject로 읽어 들일 수있다.
		JSONArray data;
		try {
			// SimpleAdater에 저장하기 위한 저장소
			ArrayList<HashMap<String, String>> myArrList = new ArrayList<HashMap<String, String>>();
			HashMap<String, String> map;
			// ---------------------------------------------
			data = new JSONArray(jsonQuery.toString());
			for (int i = 0; i < data.length(); i++) {
				JSONObject c = data.getJSONObject(i);
				map = new HashMap<String, String>();
				map.put("CustomerID", c.getString("CustomerID"));
				map.put("Name", c.getString("Name"));
				map.put("Email", c.getString("Email"));
				map.put("CountryCode", c.getString("CountryCode"));
				map.put("Budget", c.getString("Budget"));
				map.put("Used", c.getString("Used"));
				myArrList.add(map);

			}
			SimpleAdapter sAdapter;
			sAdapter = new SimpleAdapter(Ex3_JSon.this, myArrList,
					R.layout.ex3_column, new String[] { "CustomerID", "Name",
							"Email" }, new int[] { R.id.colCustomerID,
							R.id.colName, R.id.colEmail });
			listv.setAdapter(sAdapter);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
