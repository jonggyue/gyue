package or.or.kosta.and1009;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.SlidingPaneLayout.PanelSlideListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class exam extends Activity implements OnClickListener{
	private Button btn1,btn2,btn3;
	private LinearLayout back;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exam1);
		btn1 = (Button) findViewById(R.id.btn1);
		btn2 = (Button) findViewById(R.id.btn2);
		btn3 = (Button) findViewById(R.id.btn3);
		back = (LinearLayout) findViewById(R.id.back);
		
		btn1.setTextColor(Color.WHITE);
		btn1.setBackgroundColor(Color.RED);
		btn2.setTextColor(Color.WHITE);
		btn2.setBackgroundColor(Color.BLUE);
		btn3.setTextColor(Color.WHITE);
		btn3.setBackgroundColor(Color.GREEN);
		
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		
	}



	@Override
	public void onClick(View v) {
		if( v == btn1 ){
			back.setBackgroundColor(Color.RED);
		}else if ( v == btn2 ){
			back.setBackgroundColor(Color.BLUE);
		}else if ( v == btn3 ){
			back.setBackgroundColor(Color.GREEN);
		}
	}
}
