package kr.or.kosta.and1017_network;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

@SuppressLint("NewApi")
public class New_Semimock extends Activity {
	// ä�� ����
	private TextView txt1, txt2, txt3, txt4;
	private EditText edit;
	private Button btn;

	// ĵ���� ����
	private int x, y;
	private int[] colorList = { Color.RED, Color.GREEN, Color.YELLOW,
			Color.BLUE, Color.BLACK };
	private int[] sizeList = { 10, 15, 20, 25, 30 };
	private Spinner col, size, stroke, write;
	private int color_s, size_s;
	private Style style_s, style;
	private String ip, port, nick;
	private int color, weight;

	// ��Ʈ��ũ
	private String proto1, proto2, proto3, proto4, proto5, proto6, proto7,
			proto8;
	private StringTokenizer st;
	private Socket s;
	private BufferedReader in;
	private PrintWriter out;
	private Handler networkHandler;

	private InnerCanvas view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mock);

		// ��Ʈ��ũ �ڵ鷯 ����
		networkHandler = new Handler();

		// Thread Policy------------------------
		if (android.os.Build.VERSION.SDK_INT > 9) {
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
					.permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}

		// UI��ü ����
		txt1 = (TextView) findViewById(R.id.textView1);
		txt2 = (TextView) findViewById(R.id.textView2);
		txt3 = (TextView) findViewById(R.id.textView3);
		txt4 = (TextView) findViewById(R.id.textView4);
		edit = (EditText) findViewById(R.id.editText1);
		edit.setSingleLine();
		btn = (Button) findViewById(R.id.button1);

		LinearLayout ly = (LinearLayout) findViewById(R.id.layout_canvas);
		col = (Spinner) findViewById(R.id.spinner1);
		size = (Spinner) findViewById(R.id.spinner2);
		stroke = (Spinner) findViewById(R.id.spinner3);
		write = (Spinner) findViewById(R.id.spinner4);

		// Socket ����
		try {
			s = new Socket("192.168.7.109", 8888);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// View����
		view = new InnerCanvas(this,s);
		ly.addView(view);

		// readLine Thead�� ������
		play();

		// ---------------------------------------�����ʵ�
		// ���ӹ濡�� �ܾ ���� �� ��ư ������
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				try {
					out = new PrintWriter(new BufferedOutputStream(s
							.getOutputStream()), true);
					// ä�� ���������� �ϼ�
					// room/chat/all/user/msg/1/none/none
					// ��) �ʿ信 ���� ���������� ���� ....
					// root/chat/user1/me/msg/2/icon/none
					// root/file/file/none/none/none/none/none
					StringBuilder sb = new StringBuilder();
					sb.append("room/chat/all/miso/");
					sb.append(edit.getText()).append("/1/none/none");
					out.println(sb.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});

		// ĵ���� ���� ���ǳ�
		col.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				color_s = colorList[position];
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {

			}
		});

		// ĵ���� ���� ���ǳ�
		size.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				size_s = sizeList[position];
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {

			}
		});
	}



	private void play() {
		
		new Thread(new Runnable() {
			// ��Ʈ���� ���ؼ� �޾ƿ� ���������� �޾Ƴ�

			@Override
			public void run() {
				try {
					in = new BufferedReader(new InputStreamReader(
							s.getInputStream(), "UTF-8"));
					while (true) {

						String protocol = in.readLine();
						
						Log.d("Msg", protocol);
						
						
						st = new StringTokenizer(protocol, "/");

						// �������� ��������
						proto1 = st.nextToken();
						proto2 = st.nextToken();
						proto3 = st.nextToken();
						proto4 = st.nextToken();
						proto5 = st.nextToken();
						proto6 = st.nextToken();
						proto7 = st.nextToken();
						proto8 = st.nextToken();
						
						

						// �������� �Ǻ�
					
						
								networkHandler.post(new Runnable() {

									@Override
									public void run() {
										 if (proto1.equals("room") && proto2.equals("chat")) {
										// �ڸ�����
										if (proto6.equals("1")) {
											txt1.setText(proto5);
										} else if (proto6.equals("2")) {
											txt2.setText(proto5);
										} else if (proto6.equals("3")) {
											txt3.setText(proto5);
										} else if (proto6.equals("4")) {
											txt4.setText(proto5);
										}
										}
									}
								});
							
						} 

					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
}