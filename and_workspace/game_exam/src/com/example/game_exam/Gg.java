package com.example.game_exam;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Gg extends Activity implements OnClickListener {
	private OddGame og;
	private Button btn1, btn2, btn3;
	private TextView text1, text2, text3, text4, text5, text6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game_layout);
		og = new OddGame();
		btn1 = (Button) findViewById(R.id.hBtn);
		btn2 = (Button) findViewById(R.id.jBtn);
		btn3 = (Button) findViewById(R.id.eBtn);
		text1 = (TextView) findViewById(R.id.userText);
		text2 = (TextView) findViewById(R.id.cpuText);
		text3 = (TextView) findViewById(R.id.totalCount);
		text4 = (TextView) findViewById(R.id.rateText);
		text5 = (TextView) findViewById(R.id.winCount);
		text6 = (TextView) findViewById(R.id.giftText);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
	}
    private int total = 0;
	private int win = 0;
	@Override
	public void onClick(View v) {
		
		int calRate = 0;
	
		String cpu = null;
		String user = null;
		int cpunum = og.cpuRandom();
		if (cpunum == 1) {
			cpu = "hole";
		} else
			cpu = "jjak";

		// TODO Auto-generated method stub
		if (v == btn1) {
			user = "hole";
			if (cpunum == 1) {
				win++;
			}
		} else if (v == btn2) {
			user = "jjak";
			if (cpunum == 2)
				win++;
		} else if (v == btn3) {
			user = "end";
		}
		total++;
		calRate = og.calRate(win, total);
		text1.setText(user);
		text2.setText(cpu);
		text3.setText("total: " + total);
		text4.setText("rate :" + calRate);
		text5.setText("win" +win);
		text6.setText(og.printGift(calRate));
	}
	
}
