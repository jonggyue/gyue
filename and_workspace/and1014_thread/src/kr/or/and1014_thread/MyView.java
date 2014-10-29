package kr.or.and1014_thread;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.view.View;

public class MyView extends View {
	private Paint textP; // 캔버스에게 글자를 표시
	private int miSec; // 0.001초
	private int sec; // 초
	private int min; // 분
	private int hour; // 시

	public MyView(Context context) {
		super(context);
		textP = new Paint();
		textP.setTextSize(30);
		textP.setColor(Color.RED);
		textP.setAntiAlias(true); // 부드러운처리
		handler.sendEmptyMessageDelayed(0, 10);
	}

	// 화면을 그려주는 메서드 - 캔버스를 주입받아서 draw계열의 메서드를 호출해서
	// 사용할 수 있다.
	@Override
	protected void onDraw(Canvas canvas) {
		canvas.drawText("Time :" + hour + " : " + min + " : " + sec + " : "
				+ miSec, 0, 80, textP);
	}

	Handler handler = new Handler() {
		public void handleMessage(Message msg) {
			if (miSec < 100) {
				miSec++;
			} else if (miSec == 100) {
				miSec = 0;
				sec++;
			}
			if (sec == 60) {
				sec = 0;
				min++;
			}
			if (min == 60) {
				min = 0;
				hour++;
			}

			invalidate(); // canvas를 갱신하기 위해서 호출!
			handler.sendEmptyMessageDelayed(0, 10);
		};
	};
}
