package or.or.kosta.and1009;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

// 1. �ȵ���̵� ȭ���� ���� ��ü�� ��� �޴´�.
// JFrameó��!
public class MyFirstApp extends Activity{
	
	// 2. Android�� JVM�� ���θ޼���ó�� ȣ��! - oncr [ctrl + space]
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// 3.���� �ϸ� �ȵ�!
		super.onCreate(savedInstanceState);
		// 4. ����� ���̾ƿ� �ҷ�����
		setContentView(R.layout.activity_main);
		// 5. �������� �˾Ƽ� ���..
		// id�� ex_1msg�� textView�� ���α׷��� ������ �ɶ�
		// ��Ʈ�� ����ϵ��� �غ���.
		// �׷��� ���ؼ��� �ϴ� R.java���� ��ϵ� ex1_msg������
		TextView text1 = (TextView)findViewById(R.id.ex1_msg);
		text1.setTextColor(Color.RED);
		text1.setText("��������");
		
		
	}
}
