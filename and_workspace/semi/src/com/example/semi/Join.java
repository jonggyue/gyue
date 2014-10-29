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
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Join extends Activity {
	private EditText txt_id, txt_pwd1, txt_pwd2, txt_name, txt_birth, txt_tel;
	private RadioButton rbtn1, rbtn2, rbtn3, rbtn4;
	private Button btn1, btn2, btn3;
	private String id, pwd1, pwd2, name, birth, tel, gender, auth;
	private TextView res1, res2;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.join2);
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		// 퍼미션 StrictMode
		// android.os.Build.VERSION.SDK_INT 기기 버전 정보
		if (android.os.Build.VERSION.SDK_INT > 9) {
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
					.permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}

		txt_id = (EditText) findViewById(R.id.join_txt1);
		txt_pwd1 = (EditText) findViewById(R.id.join_txt2);
		txt_pwd2 = (EditText) findViewById(R.id.join_txt3);
		txt_name = (EditText) findViewById(R.id.join_txt4);
		txt_birth = (EditText) findViewById(R.id.join_txt5);
		txt_tel = (EditText) findViewById(R.id.join_txt6);
		rbtn1 = (RadioButton) findViewById(R.id.radio1);
		rbtn2 = (RadioButton) findViewById(R.id.radio2);
		rbtn3 = (RadioButton) findViewById(R.id.radio3);
		rbtn4 = (RadioButton) findViewById(R.id.radio4);
		btn1 = (Button) findViewById(R.id.join_btn1);
		btn2 = (Button) findViewById(R.id.join_btn2);
		btn3 = (Button) findViewById(R.id.join_btn3);
		// res1 = (TextView) findViewById(R.id.ex1_res1);
		// res2 = (TextView) findViewById(R.id.ex1_res2);

		id = txt_id.getText().toString().trim();
		pwd1 = txt_pwd1.getText().toString();
		pwd2 = txt_pwd2.getText().toString();
		name = txt_name.getText().toString();
		birth = txt_birth.getText().toString();
		tel = txt_tel.getText().toString();
		gender = "";
		auth = "";
		// url = "http://192.168.7.167:8084/semi1022/join_test.jsp";

		// 아이디 중복 버튼
		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				String url = "http://192.168.7.167:8084//semi1022/join_id_ckeck.jsp";
				ArrayList<NameValuePair> id_ck = new ArrayList<NameValuePair>();
				id_ck.add(new BasicNameValuePair("idv", txt_id.getText()
						.toString()));

				try {
					String msg = getHttpPost(url, id_ck);
					Toast.makeText(Join.this, msg, 3000).show();
					// res1.setText("<"+txt_id.getText().toString()+">");
					// res2.setText(msg);
					// Toast.makeText(Join.this, msg, 3000).show();
				} catch (ClientProtocolException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		// 뒤로 가기 버튼
		btn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();

			}
		});

		// 가입 신청 버튼
		btn3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// String id = "gagaga";
				// String pwd1 = "2345";
				// // String pwd2 = txt_pwd2.getText().toString();
				// String name = "jae";
				// String birth = "2043-34-55";
				// String tel = "010-3950-3284";
				// String gender = "sex";
				// String auth = "auth";
				// -----------------------------------------------------

				if (pwd1.equals(pwd2)) {
					// ------------------------------------------------------
					String url = "http://192.168.7.167:8084/semi1022/join_test.jsp";
					// -------------------------------------------------------------

					if (rbtn1.isChecked()) {
						gender = "male";
					} else if (rbtn2.isChecked()) {
						gender = "female";
					}

					if (rbtn3.isChecked()) {
						auth = "special";
					} else if (rbtn4.isChecked()) {
						auth = "ordinary";
					}

					ArrayList<NameValuePair> info = new ArrayList<NameValuePair>();

					info.add(new BasicNameValuePair("id", id));
					info.add(new BasicNameValuePair("pwd", pwd1));
					info.add(new BasicNameValuePair("name", name));
					info.add(new BasicNameValuePair("birth", birth));
					info.add(new BasicNameValuePair("tel", tel));
					info.add(new BasicNameValuePair("sex", gender));
					info.add(new BasicNameValuePair("auth", auth));
					// -----------------------------------------------------------
					try {
						String msg = getHttpPost(url, info);
						Toast.makeText(Join.this, "가입 완료", 3000).show();
						finish();
					} catch (ClientProtocolException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					Toast.makeText(Join.this, "비밀번호가 일치하지 않습니다", 3000).show();
				}

			}
		});
	}

	protected String getHttpPost(String url, ArrayList<NameValuePair> info)
			throws ClientProtocolException, IOException {

		StringBuffer sb = new StringBuffer();

		// 1. HttpClient 객체를 생성한다
		HttpClient client = new DefaultHttpClient();

		// 2. 전송방식 결정 (Post)
		HttpPost httpPost = new HttpPost(url);
		httpPost.setEntity(new UrlEncodedFormEntity(info));

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
