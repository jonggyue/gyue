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
		// q��ư�� Ŭ���� �� subActivity�� �̵��� �ϱ� ���ؼ�
		// intent�۾��� �Ѵ�
		// intent - �ɺθ��� A -> B �̵��ϰ� ���ִ� ��ü
		btn1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//open intent = intent(context, �̵��� ��ü)
				Intent intent = new Intent(Ex4_Main.this, Ex5_Sub.class);
				// ����Ʈ�� ���ؼ� �̵������ִ� �޼��带 ȣ��
				// ��Ƽ��Ƽ�� ������ �� ������ ����Ʈ������ ���ڷ� ����
				// �Ŵ��н�Ʈ���� ���ǵ� ��Ƽ��Ƽ�� ȣ���� ��!
				startActivity(intent);
			}
		});
	}
}