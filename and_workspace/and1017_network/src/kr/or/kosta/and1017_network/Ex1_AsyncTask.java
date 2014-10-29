package kr.or.kosta.and1017_network;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Ex1_AsyncTask extends Activity {
	private Button btn1, btn2, btn3;
	private TextView mTextView;
	private int i;
	private String[] mStringArray = {"w","w","w",".","k","o","s","t","a",".","o","r",".","k","r"};
	private MyThread myThread = null;
	
	public class MyThread extends AsyncTask<Void, Void, Void>{

		@Override
		protected Void doInBackground(Void... params) {
			for(i =0; i< mStringArray.length; i++){
				publishProgress(); // =>onProgressUpdate
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return null;
		}
		//UI�ڵ鸵
		@Override
		protected void onProgressUpdate(Void... values) {
			mTextView.setText(mTextView.getText()+mStringArray[i]);
			super.onProgressUpdate(values);
			
		}
		
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex1);
		mTextView = (TextView) findViewById(R.id.ex1_text1);
		btn1 = (Button) findViewById(R.id.ex1_btn1);
		btn2 = (Button) findViewById(R.id.ex1_btn2);
		btn3 = (Button) findViewById(R.id.ex1_btn3);
		btn1.setOnClickListener(myOnClick);
		btn2.setOnClickListener(myOnClick);
		btn3.setOnClickListener(myOnClick);
		
		
	}
	OnClickListener myOnClick = new OnClickListener() {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.ex1_btn1:
				//AsysncTask 
				myThread = (MyThread) new MyThread().execute();
				
				break;
			case R.id.ex1_btn2:
				if(myThread != null){
					myThread.cancel(true);
				}
				break;
			case R.id.ex1_btn3:
				mTextView.setText("");
				break;

			}
		}
	};
}
