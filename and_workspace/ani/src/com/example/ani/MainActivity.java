//package com.example.animatesample;
//
//import android.app.Activity;
//import android.graphics.drawable.AnimationDrawable;
//import android.os.Bundle;
//import android.view.Menu;
//import android.widget.ImageView;
//
//public class MainActivity extends Activity {
//
//	private AnimationDrawable frameAnimation;
//    private ImageView view;
//	
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
//		
//		// ��Ʈ�� ImageView ��ü�� �����´�
//        view = (ImageView) findViewById(R.id.imageAnimation);
// 
//        // animation_list.xml �� ImageView ��׶��忡 �����Ѵ�
//        view.setBackgroundResource(R.drawable.frame_animation_list);
// 
//        // �̹����� ���۽�Ű������  AnimationDrawable ��ü�� �����´�.
//        frameAnimation = (AnimationDrawable) view.getBackground();
//	}
//
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}
//	
//	// ���ÿ� ��Ŀ���� ���� �����Ѵ�
//	@Override
//    public void onWindowFocusChanged(boolean hasFocus) {
//        super.onWindowFocusChanged(hasFocus);
//        if (hasFocus) {
//            // ���ÿ� ��Ŀ���� ���� ���۵ȴ�
//            frameAnimation.start();
//        } else {
//            // ���ÿ� ��Ŀ���� ������ �����Ѵ�
//            frameAnimation.stop();
//        }
//    }
//}
