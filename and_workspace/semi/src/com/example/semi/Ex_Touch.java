package com.example.semi;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class Ex_Touch extends Activity {

	int start_x = 0, start_y = 0;
	int count_a = 0, count_b = 0;
	private static MediaPlayer mp_hurry, mp_informain;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		View view = new MyView(this);
		setContentView(view);
		mp_hurry = MediaPlayer.create(this, R.raw.hurry);
		mp_hurry.setLooping(false);// 반복재생
		mp_informain = MediaPlayer.create(this, R.raw.information);
		mp_informain.setLooping(false);
	}

	protected class MyView extends View {

		public MyView(Context context) {
			super(context);
		}

		@Override
		protected void onDraw(Canvas canvas) {
			super.onDraw(canvas);
			Paint paint = new Paint();
			Bitmap b = BitmapFactory.decodeResource(getResources(),
					R.drawable.sos);
			canvas.drawBitmap(b, 300, 700, null);
		}

		@Override
		public boolean onTouchEvent(MotionEvent event) {
			super.onTouchEvent(event);

			// event
			// event 종류/각각의 특성
			if (event.getAction() == MotionEvent.ACTION_DOWN) {
				start_x = (int) event.getX();
				start_y = (int) event.getY();
				if (start_x < 300 && start_y < 500) {
					count_a++;
				} else if (start_x > 300 && start_y > 500) {
					count_b++;
				}
				if (count_a == 5) {
					String msg = "길안내를 시작합니다";
					count_a = 0;
					count_b = 0;
					mp_informain.start();
					Toast.makeText(Ex_Touch.this, msg, Toast.LENGTH_SHORT)
							.show();
				} else if (count_b == 5) {
					String msg = "긴급요청";
					count_a = 0;
					count_b = 0;
					mp_hurry.start();
					Toast.makeText(Ex_Touch.this, msg, Toast.LENGTH_SHORT)
							.show();
					Intent intent = new Intent(Ex_Touch.this,
							Ex_Emergency.class);
					startActivity(intent);
				}
				new Thread(new Runnable() {

					@Override
					public void run() {
						try {
							Thread.sleep(5000);
							count_a = 0;
							count_b = 0;
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}).start();

			}

			// if (event.getAction() == MotionEvent.ACTION_UP) {
			// finish_x = (int) event.getX();
			// finish_y = (int) event.getY();
			//
			// if (Math.abs(d_x) > 50) {
			// count_x++;
			// } else if (Math.abs(d_y) > 50) {
			// count_y++;
			// }
			//
			// }
			// if (count_x == 5) {
			// String msg = "1.모션실행";
			// count_x = 0;
			// count_y = 0;
			// Toast.makeText(Ex_Touch.this, msg, Toast.LENGTH_SHORT).show();
			// } else if (count_y == 5) {
			// String msg = "2.모션실행";
			// count_x = 0;
			// count_y = 0;
			// Toast.makeText(Ex_Touch.this, msg, Toast.LENGTH_SHORT).show();
			// }

			return true;

		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
