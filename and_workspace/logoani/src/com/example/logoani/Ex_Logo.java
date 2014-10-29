package com.example.logoani;



import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class Ex_Logo extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logomain);
	}

	public void onWindowFocusChanged(boolean hasFocus) {
		// TODO Auto-generated method stub
		ImageView imgView = (ImageView) findViewById(R.id.animationImage);
		imgView.setVisibility(ImageView.VISIBLE);
		imgView.setBackgroundResource(R.anim.rocket);
		AnimationDrawable frameAnimation = (AnimationDrawable) imgView
				.getBackground();
		frameAnimation.start();
		super.onWindowFocusChanged(hasFocus);
	}
}
