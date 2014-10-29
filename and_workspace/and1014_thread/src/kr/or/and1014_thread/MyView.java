package kr.or.and1014_thread;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.view.View;

public class MyView extends View {
	private Paint textP; // ĵ�������� ���ڸ� ǥ��
	private int miSec; // 0.001��
	private int sec; // ��
	private int min; // ��
	private int hour; // ��

	public MyView(Context context) {
		super(context);
		textP = new Paint();
		textP.setTextSize(30);
		textP.setColor(Color.RED);
		textP.setAntiAlias(true); // �ε巯��ó��
		handler.sendEmptyMessageDelayed(0, 10);
	}

	// ȭ���� �׷��ִ� �޼��� - ĵ������ ���Թ޾Ƽ� draw�迭�� �޼��带 ȣ���ؼ�
	// ����� �� �ִ�.
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

			invalidate(); // canvas�� �����ϱ� ���ؼ� ȣ��!
			handler.sendEmptyMessageDelayed(0, 10);
		};
	};
}
