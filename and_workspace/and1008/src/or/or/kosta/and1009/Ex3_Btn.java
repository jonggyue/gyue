package or.or.kosta.and1009;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
// onclick 핸들링
public class Ex3_Btn extends Activity implements OnClickListener{
	// Button, TextView 객체 선언
	private Button btn1, btn2, btn3;
	private TextView restext;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mybtn);
		btn1 = (Button) findViewById(R.id.ex3_btn1);
		btn2 = (Button) findViewById(R.id.ex3_btn2);
		btn3 = (Button) findViewById(R.id.ex3_btn3);
		restext = (TextView) findViewById(R.id.ex3_text);
		// 버튼에 색상 지정해보기
		btn1.setTextColor(Color.WHITE);
		btn1.setBackgroundColor(Color.RED);
		btn2.setTextColor(Color.WHITE);
		btn2.setBackgroundColor(Color.BLUE);
		btn3.setTextColor(Color.WHITE);
		btn3.setBackgroundColor(Color.GREEN);
		// 버튼에 이벤트리스너 감시자 등록하기.(ClickEvent)
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if(v == btn1){
			restext.setText("Click Btn1");
		}else if( v == btn2){
			restext.setText("Click Btn2");
		}else if( v == btn3){
			restext.setText("Click Btn3");
		}
		
	}
}
