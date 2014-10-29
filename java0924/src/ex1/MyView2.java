package kr.or.kosta.and1014_thread;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

public class MyView2 extends View {
	int width, height;// 화면의 폭과 높이
	int bottleW, bottleH;// 맥주병의 폭과 높이.
	int centerX, centerY;// 화면의 중심점.
	Bitmap bottle;// 맥주병 이미지.
	// /int degree; // 캔바스가 돌아간 각도.
	private float degree, a;
	private boolean start, stop;

	public MyView2(Context context) {
		super(context);
		WindowManager manager = (WindowManager) context
				.getSystemService(Context.WINDOW_SERVICE);
		Display display = manager.getDefaultDisplay();
		width = display.getWidth();
		height = display.getHeight();
		// 화면의 중심점 읽어오기.
		centerX = width / 2;
		centerY = height / 2;
		// 이미지 읽어오기
		bottle = BitmapFactory
				.decodeResource(getResources(), R.drawable.bottle);
		// 이미지의 크기
		bottleW = (bottle.getWidth() / 2) - 30;
		bottleH = (bottle.getHeight() / 2) - 30;
		bottle = Bitmap.createScaledBitmap(bottle, bottleW, bottleH, false);
		start = true;
		stop = false;
		degree = 1;
		handler.sendEmptyMessageDelayed(0, 10);
	}

	// 그리는 메소드
	@Override
	protected void onDraw(Canvas canvas) {
		// 캔바스를 시계방향으로 30도 회전시키기. 회전축의 중심 >> (centerX,centerY)
		canvas.rotate(degree, centerX, centerY);
		canvas.drawBitmap(bottle, centerX - bottleW / 2, centerY - bottleH / 2,
				null);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		handler.sendEmptyMessageDelayed(1, 10);
		start = false;
		stop = true;
		return true;
	}

	// 핸들러 정의하기
	Handler handler = new Handler() {
		public void handleMessage(Message msg) {

			if (msg.what == 0) {
				invalidate();
				if (start == true) {
					if (degree < 500) {
						a += 0.1;
					}
					degree += a;
					handler.sendEmptyMessageDelayed(0, 10);
				} else if (stop == true) {
					if (a > 0) {
						a -= 0.1;
						handler.sendEmptyMessageDelayed(0, 10);
					} else if (a <= 0) {
						a = 0;
						stop = false;
						start = true;
						handler.removeMessages(0);
					}
					degree += a;
				}

			}

		}
	};
}
