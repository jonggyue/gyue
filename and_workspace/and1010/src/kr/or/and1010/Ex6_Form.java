package kr.or.and1010;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Ex6_Form extends Activity{
	private EditText edit;
	private Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex6_form);
		edit = (EditText) findViewById(R.id.ex6_edit);
		btn = (Button) findViewById(R.id.ex6_Btn);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Ex6_Form.this, Ex7_Res.class);
				// edit�� ���� �Է��� ���� Ex7_Res.java�� �����ϱ� ���ؼ�
				// Bundle��ü�� �����ؼ� ����Ѵ�.
				Bundle myBundle = new Bundle();
				// putXX("Key",Val);
				myBundle.putString("val", edit.getText().toString());
				// intent���� ����
				intent.putExtras(myBundle);
				
				startActivity(intent);
			}
		});
	}
}
