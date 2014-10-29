package or.or.kosta.and1009;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

// 1. 안드로이드 화면을 가진 객체를 상속 받는다.
// JFrame처럼!
public class MyFirstApp extends Activity{
	
	// 2. Android의 JVM이 메인메서드처럼 호출! - oncr [ctrl + space]
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// 3.삭제 하면 안됨!
		super.onCreate(savedInstanceState);
		// 4. 사용할 레이아웃 불러오기
		setContentView(R.layout.activity_main);
		// 5. 이제부턴 알아서 사용..
		// id가 ex_1msg인 textView에 프로그램이 시작이 될때
		// 하트를 출력하도록 해보자.
		// 그러기 위해서는 일단 R.java에서 등록된 ex1_msg에접근
		TextView text1 = (TextView)findViewById(R.id.ex1_msg);
		text1.setTextColor(Color.RED);
		text1.setText("♥♥♥♥");
		
		
	}
}
