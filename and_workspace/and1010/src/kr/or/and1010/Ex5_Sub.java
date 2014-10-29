package kr.or.and1010;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Ex5_Sub extends Activity{
	private Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex5_sub);
		btn = (Button) findViewById(R.id.ex5_Btn);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Ex5_Sub.this, Ex4_Main.class);
				startActivity(intent);
			}
		});
		
	}
}
