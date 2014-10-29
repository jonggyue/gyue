package kr.or.and1013;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Ex2_Res extends Activity{
	private TextView text;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex2_res);
		text = findViewById(R.id.Ex2_restext);
		Intent intent = getIntent();
		Bundle myBundle = new Bundle();
		myBundle.putString("key", s.toString());
		intent.putExtras(myBundle);
		startActivity(intent);
	}
}
