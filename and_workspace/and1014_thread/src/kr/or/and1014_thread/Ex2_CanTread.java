package kr.or.and1014_thread;

import android.app.Activity;
import android.os.Bundle;

public class Ex2_CanTread extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new MyView2(this));
	}
}
