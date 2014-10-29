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
	 �޼��� ���� ���� :
	 frontBtn�� ��쿡 game �ż��忡 1�̶�� ���ڰ��� �����ؼ� ȣ���ϰ�,
	 backBtn�� ��쿡 game �ż��忡 2�̶�� ���ڰ��� �����ؼ� ȣ���Ѵ�.
	 �� �ż��尡 ȣ��ɶ� ���� ������ ��(1,2)�� ���ͼ� ����ڰ� �Է���
	 ���� ���ؼ� ������� ���(cpu�� �̹��� ó���� ���� ó��)�Ѵ�.
	 */
	public void game(int n){
		int cpu = (int)(Math.random()*2+1);
		//cpu�� 1�϶� ������ �ո�
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
