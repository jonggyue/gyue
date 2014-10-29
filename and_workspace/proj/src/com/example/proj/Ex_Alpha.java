package com.example.proj;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Ex_Alpha extends Activity{
	private ImageView image;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alpha_main);
		
		image = (ImageView) findViewById(R.id.test);
		Animation alphaAnim = AnimationUtils.loadAnimation(this, R.anim.alpha);
		image.startAnimation(alphaAnim);
	}
}
