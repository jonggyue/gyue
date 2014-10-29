package or.or.kosta.and1009;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CoinGame extends Activity implements OnClickListener{
	private Button frontBtn,backBtn,endBtn;
	private ImageView img;
	private TextView resText, totalText;
	private int totalNum;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hole);
		frontBtn = (Button)findViewById(R.id.ga_fr_btn1);
		backBtn = (Button)findViewById(R.id.ga_bk_btn1);
		endBtn = (Button)findViewById(R.id.ga_ex_btn1);
		img = (ImageView)findViewById(R.id.coinImg);
		resText = (TextView) findViewById(R.id.resMsg);
		totalText = (TextView) findViewById(R.id.ga_total_num);
		
		
		frontBtn.setOnClickListener(this);
		backBtn.setOnClickListener(this);
		endBtn.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View v) {
		if(v == frontBtn){
			game(1);
		}else if(v == backBtn){
			game(2);
		}else if( v == endBtn){
			
		}
		

		
	}
	/*
	 메서드 동작 설계 :
	 frontBtn일 경우에 game 매서드에 1이라는 인자값을 전달해서 호출하고,
	 backBtn일 경우에 game 매서드에 2이라는 인자값을 전달해서 호출한다.
	 이 매서드가 호출될때 마다 랜덤한 수(1,2)를 얻어와서 사용자가 입력한
	 값과 비교해서 결과값을 출력(cpu의 이미지 처리와 승패 처리)한다.
	 */
	public void game(int n){
		int cpu = (int)(Math.random()*2+1);
		//cpu가 1일때 동전의 앞면
		if(cpu == 1){
			img.setImageResource(R.drawable.front);
		}else if (cpu == 2){
			img.setImageResource(R.drawable.back);
		}
		if( n == cpu){
			resText.setTextColor(Color.BLUE);
			resText.setText("WIN");
		}else{
			resText.setTextColor(Color.RED);
			resText.setText("LOSE");
		}
		totalNum++;
		totalText.setText(totalNum);
		
	}

}
