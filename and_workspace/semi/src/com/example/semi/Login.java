package com.example.semi;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Activity {
	private Button btn_log, btn_join;
	private EditText text_id, text_pwd;
	private Switch switch1;
	private String id, pwd;
	private TextView res1, res2;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login1);
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		// 퍼미션 StrictMode
		// android.os.Build.VERSION.SDK_INT 기기 버전 정보
		if (android.os.Build.VERSION.SDK_INT > 9) {
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
					.permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}

		btn_log = (Button) findViewById(R.id.login_btn1);
		btn_join = (Button) findViewById(R.id.login_btn2);
		text_id = (EditText) findViewById(R.id.login_txt1);
		text_pwd = (EditText) findViewById(R.id.login_txt2);
		switch1 = (Switch) findViewById(R.id.login_switch);
		// res1 = (TextView) findViewById(R.id.log_txt);
		// res2 = (TextView) findViewById(R.id.log_txt2);

		id = text_id.getText().toString();
		pwd = text_pwd.getText().toString();

		btn_log.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi")
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Login.this, Ex_Touch.class);
				startActivity(intent);
				String url = "http://192.168.7.167:8084/semi1022/login_test.jsp";
				ArrayList<NameValuePair> log_info = new ArrayList<NameValuePair>();
				log_info.add(new BasicNameValuePair("idv", text_id.getText()
						.toString()));
				log_info.add(new BasicNameValuePair("pwd", text_pwd.getText()
						.toString()));

				try {
					String msg = getHttpPost(url, log_info);
					Toast.makeText(Login.this, msg, 3000).show();
					// res1.setText("<"+text_id.getText().toString()+">");
					// res2.setText(msg);
				} catch (ClientProtocolException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// 자동 로그인 설정
				// switch1.setOnCheckedChangeListener(new
				// OnCheckedChangeListener() {
				//
				// @Override
				// public void onCheckedChanged(CompoundButton buttonView,
				// boolean isChecked) {
				// if (isChecked) {
				//
				// }
				//
				// }
				// });

			}
		});

		btn_join.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Login.this, Join.class);
				startActivity(intent);
			}
		});

	}

	protected String getHttpPost(String url, ArrayList<NameValuePair> log_info)
			throws ClientProtocolException, IOException {

		StringBuffer sb = new StringBuffer();

		// 1. HttpClient 객체를 생성한다
		HttpClient client = new DefaultHttpClient();

		// 2. 전송방식 결정 (Post)
		HttpPost httpPost = new HttpPost(url);
		httpPost.setEntity(new UrlEncodedFormEntity(log_info));

		HttpResponse response = client.execute(httpPost);

		StatusLine statusLine = response.getStatusLine();
		int statuscode = statusLine.getStatusCode();

		if (statuscode == 200) {
			HttpEntity entity = response.getEntity();
			InputStream is = entity.getContent();
			Scanner sc = new Scanner(is);
			while (sc.hasNext()) {
				sb.append(sc.nextLine());
			}
		}
		return sb.toString();
	}

}
