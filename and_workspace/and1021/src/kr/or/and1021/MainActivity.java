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
		//����Ʈ�� ����ؼ� startService�� �����ϸ� �� ��ü�� ���񽺷� ���۵ȴ�
		sstartService(it);
	}
}