package kr.or.and1010;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Ex7_Res extends Activity{
	private TextView resText;
	private Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex7_res);
		resText = (TextView) findViewById(R.id.ex7_resv);
		// Intent로 부터 Bundle를 받아서 파라미터값(key)을 사용해서
		// 값을 뽑아내자.
		Intent intent = getIntent();
		Bundle myBundle = intent.getExtras();
		String data = myBundle.getString("val");
		resText.setText(data);
		btn = (Button) findViewById(R.id.ex7_Btn);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
}
