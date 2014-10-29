package kr.or.and1014_thread;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Ex1_Thread extends Activity {
	private TextView text1, text2;
	private Button btn1, btn2, btn3;
	private int fnum, bnum; // ��ư�� Ŭ���� �� ���� ������ ��

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex1_thread);
		text1 = (TextView) findViewById(R.id.ex1_text2);
		text2 = (TextView) findViewById(R.id.ex1_text3);
		btn1 = (Button) findViewById(R.id.ex1_Btn);
		btn2 = (Button) findViewById(R.id.ex1_Btn2);
		btn3 = (Button) findViewById(R.id.ex1_Btn3);
		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				text1.setText("For:" + fnum++);
				//text2.setText("Back:" + bnum);
			}
		});
		// stop : stop�϶��� �ڵ鷯�� ���� (removeMessage(what) )
		// btn2 => GONE, btn3 =>VISIBLE
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//handler.removeMessages(0);
				handler.sendEmptyMessage(1);
			}
		});
		// start : 
		btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				handler.sendEmptyMessageDelayed(3, 1000);
			}
		});
		//�����带 ����Ͽ� UI�����ϱ⿡ ������
//		MyThread myT = new MyThread();
//		myT.setDaemon(true);
//		myT.start();
		//�ڵ鷯�� ���ӹ޾Ƽ� ���
		// �ڵ鷯 ��ü�� �޼����� ������
		// UI�� �ֱ����� �ݺ��۾��� �ʿ��� �� �����带 ����ؼ� ���
		// �����尣�� �޼��� ������ �ʿ��� ������ ���
		// ���������� �ڵ鷯�� �ϳ��� ������� ������
		handler.sendEmptyMessageDelayed(0, 1000);

	}

	// Thread �����ؼ� �����غ���
	public class MyThread extends Thread {

		@Override
		public void run() {
			// text2�� ���� bnum�� �����尡 ����.���� �ϵ��� �غ���.
			while (true) {
				try {
					bnum++;
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	// Handler �����ؼ� �����غ���
	Handler handler = new Handler() {
		public void handleMessage(Message msg) {
			if (msg.what == 0) {
				bnum++;
				text2.setText("Back:" + bnum);
				// ���ȣ���� ���ؼ� �������� �ݺ��� ���� �Ѵ�.
				handler.sendEmptyMessageDelayed(0, 1000);
			}else if( msg.what==1){ // stop
				handler.removeMessages(0);
				btn2.setVisibility(View.GONE);
				btn3.setVisibility(View.VISIBLE);
			}else if( msg.what == 3){ // start
				bnum++;
				text2.setText("Back:" + bnum);
				handler.sendEmptyMessageDelayed(0, 1000);
				btn2.setVisibility(View.VISIBLE);
				btn3.setVisibility(View.GONE);
			}
		}
	};
}
