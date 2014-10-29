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
		// android.os.Build.VERSION.SDK_INT������ ����
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
		// ����
		// 1.�Ʒ��� json�����͸� url�� �޾Ƽ� ó��

		StringBuffer jsonQuery = new StringBuffer();

		jsonQuery
				.append("[{'CustomerID':'C001','Name':'Win Weerachai','Email':'win.weerachai@thaicreate.com' ,'CountryCode':'TH','Budget':'1000000','Used':'600000'},");
		jsonQuery
				.append("{'CustomerID':'C002','Name':'John Smith','Email':'john.smith@thaicreate.com' ,'CountryCode':'EN','Budget':'2000000','Used':'800000'},");
		jsonQuery
				.append("{'CustomerID':'C003','Name':'Jame Born','Email':'jame.born@thaicreate.com' ,'CountryCode':'US','Budget':'3000000','Used':'600000'},");
		jsonQuery
				.append("{'CustomerID':'C004','Name':'Chalee Angel','Email':'chalee.angel@thaicreate.com' ,'CountryCode':'US','Budget':'4000000','Used':'100000'}]");

		// 2.andmem���̺� groupid - a, b, c �� ǥ��
		// �� �����͸� [{}] �����ؼ� ����
		// ======================================

		// jsonData�� �о� ���̴� ����
		// [{key:val},{},{}] => JSONArray �� jsonData�� �о�;�
		// �ݺ������� �ϳ��� JSONObject�� �о� ���� ���ִ�.
		JSONArray data;
		try {
			// SimpleAdater�� �����ϱ� ���� �����
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
