package kr.or.kosta.and1016_http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Binder;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/* Get방식으로 Http연결 하기
 * 1. 표준 HttpClient객체를 생성한다. (DefaultHttpClient 객체 )
 * 2. 전송방식에 따른 HttpGet/HttpPost를 결정
 *    Get방식이라면 HttpGet(전송할url) 객체를 생성
 * 3. url로 Get으로 전송, Response 객체를 통해서 클라이언트가 받도록 구현 
 * 4. 전송받은 Response를 통해서 서버의 상태값을 가져올 수 있다.
 * 5. 응답객체로 부터 Entity : 서버의 모든 자원을 가지고 잇다.
 * 6. 데이터를 얻어내기 위해서 Entity가 제공해주는 InputStream을 받아서 사용할 수 있다.
 * 
 */
public class Ex1_GetToday extends Activity {
	private Button btn1;
	private TextView result;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex1_http);
		// 퍼미션 strictMode
		// android.os.Build.VERSION.SDK_INT기기버전 정보
		if(android.os.Build.VERSION.SDK_INT > 9){
			StrictMode.ThreadPolicy policy = 
					new StrictMode.ThreadPolicy.Builder().permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}
		result = (TextView) findViewById(R.id.ex1_textRes);
		btn1 = (Button) findViewById(R.id.ex1_btn1);
		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// 서버의 url
				String url = "http://192.168.7.109:8084/server1015/ex1_hello.jsp";
				result.setText(getHttpGet(url));
			}
		});
	}

	// get방식을 처리하기 위한 메서드
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
				while((line = reader.readLine())!=null){
					str.append(line).append("\r\n");
				}
			} else {
				Log.d("Error", "접속실패!");
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str.toString();
	}
}
