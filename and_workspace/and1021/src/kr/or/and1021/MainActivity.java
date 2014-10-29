package kr.or.and1021;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Intent it = new Intent(this.MyService.class);
		//인텐트를 사용해서 startService로 전달하면 그 객체는 서비스로 시작된다
		sstartService(it);
	}
}