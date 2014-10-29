package kr.or.kosta.and1016_http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

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
import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

@SuppressLint("NewApi")
public class Ex2_PostLogin extends Activity {
	private Button btn1;
	private EditText idv, pwdv;
	private TextView text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex2_post);
		// 퍼미션 strictMode
		// android.os.Build.VERSION.SDK_INT기기버전 정보
		if (android.os.Build.VERSION.SDK_INT > 9) {
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
					.permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}

		idv = (EditText) findViewById(R.id.ex2_idtext);
		pwdv = (EditText) findViewById(R.id.ex2_pwdtext);
		text = (TextView) findViewById(R.id.ex2_resText);
		btn1 = (Button) findViewById(R.id.ex2_btn1);
		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// 서버의 url
				String url = "http://192.168.7.109:8084/server1016/login.jsp";
				// Parameter를 전송하기 위한 담당객체를 생성후
				// Parameter를 대입을 하자
				ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
				params.add(new BasicNameValuePair("id", idv.getText()
						.toString().trim()));
				params.add(new BasicNameValuePair("pwd", pwdv.getText()
						.toString().trim()));
				text.setText(getHttpPost(url, params));

			}
		});
	}

	protected String getHttpPost(String url, ArrayList<NameValuePair> params) {
		HttpClient client = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(url);
		StringBuffer str = new StringBuffer();

		try {
			httpPost.setEntity(new UrlEncodedFormEntity(params));
			HttpResponse response = client.execute(httpPost);
			StatusLine statusLine = response.getStatusLine();
			int statusCode = statusLine.getStatusCode();
			if (statusCode == 200) {
				InputStream content = response.getEntity().getContent();
				// Scanner로 사용
				Scanner reader = new Scanner(content);

				String line = "";
				while (reader.hasNext()) {
					line = reader.nextLine();
					str.append(line);
				}
				//예전버전
//				BufferedReader reader = new BufferedReader(
//						new InputStreamReader(content));
//				String line = "";
//				while((line = reader.readLine()) != null ){
//					str.append(line);
//				}

			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return str.toString();
	}
}
