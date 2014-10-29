package kr.or.and1013;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class Ex3_GridView extends Activity{
	private GridView gv;
	//이미지를 배열로 생성
	private int[] arrImg = {R.drawable.g};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.e)
		gv = findViewById(R.id.ex3_grid);
	}
}
