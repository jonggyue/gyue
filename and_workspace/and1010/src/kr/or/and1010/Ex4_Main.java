package kr.or.and1010;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Ex4_Main extends Activity {
	private Button btn1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex4_main);
		btn1 = (Button) findViewById(R.id.ex4_Btn);
		// q버튼을 클릭할 때 subActivity로 이동을 하기 위해서
		// intent작업을 한다
		// intent - 심부름꾼 A -> B 이동하게 해주는 객체
		btn1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//open intent = intent(context, 이동할 객체)
				Intent intent = new Intent(Ex4_Main.this, Ex5_Sub.class);
				// 인텐트를 통해서 이동시켜주는 메서드를 호출
				// 엑티비티를 시작할 때 오픈한 인텐트정보를 인자로 전달
				// 매니패스트에서 정의된 액티비티만 호출이 됨!
				startActivity(intent);
			}
		});
	}
}
