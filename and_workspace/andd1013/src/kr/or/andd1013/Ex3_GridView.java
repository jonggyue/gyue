//package kr.or.andd1013;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.AdapterView.OnItemClickListener;
//import android.widget.GridView;
//
//public class Ex3_GridView extends Activity{
//	private GridView gv;
//	private int[] arrImg = {R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5};
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.ex3_gridview);
//		
//		gv = (GridView) findViewById(R.id.ex3_gridview);
//		gv.setAdapter(new imageAdapter(this));
//		gv.setOnItemClickListener(new OnItemClickListener() {
//
//			@Override
//			public void onItemClick(AdapterView<?> parent, View view,
//					int position, long id) {
//				
//			}
//		});
//	}
//}
