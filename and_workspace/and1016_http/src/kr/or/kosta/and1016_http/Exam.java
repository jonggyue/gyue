package kr.or.kosta.and1016_http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

@SuppressLint("NewApi")
public class Exam extends Activity {
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
				String url = "http://192.168.7.109:8084/server1015/ex3_jsondata.jsp";
				getHttpGet(url);
			}
		});
	}

	public String getHttpGet(String url) {
		// 1.)
		HttpClient client = new DefaultHttpClient();
		StringBuffer str = new StringBuffer();
		//
		HttpGet httpGet = new HttpGet(url);

		//
		try {
			HttpResponse response = client.execute(httpGet);
			StatusLine statusLine = response.getStatusLine();
			int statusCode = statusLine.getStatusCode();
			// 정상적인 응답결과, 404,500 등
			if (statusCode == 200) {
				HttpEntity entity = response.getEntity();
				InputStream content = entity.getContent();
				// 적절한 2차 스트림을 사용해서 내용을 모두
				// StringBuffer에 저장하시오. -조를 지목할 예정 !
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(content));
				String line = "";
				while ((line = reader.readLine()) != null) {
					str.append(line).append("\r\n");
				}

			} else {
				Log.d("Error", "접속실패!");
			}
			JSONArray data;
			try {
				// SimpleAdater에 저장하기 위한 저장소
				ArrayList<HashMap<String, String>> myArrList = new ArrayList<HashMap<String, String>>();
				HashMap<String, String> map;
				// ---------------------------------------------
				data = new JSONArray(str.toString());
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
				sAdapter = new SimpleAdapter(Exam.this, myArrList,
						R.layout.ex3_column, new String[] { "CustomerID",
								"Name", "Email" },
						new int[] { R.id.colCustomerID, R.id.colName,
								R.id.colEmail });
				listv.setAdapter(sAdapter);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str.toString();
	}
}
