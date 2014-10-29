package kr.pe.theeye.animatedimageview;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * @author Eye
 */
public class AnimatedImageViewActivity extends Activity
{
	private ImageView mIvAnimation;
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // ���ϸ��̼��� �����ϱ� ���� �̹����並 ������ �ִϸ��̼��� �����մϴ�.
        mIvAnimation = (ImageView) findViewById(R.id.animation);
        mIvAnimation.setBackgroundResource(R.anim.anim);
    }

	@Override
	public void onWindowFocusChanged(boolean hasFocus)
	{
		super.onWindowFocusChanged(hasFocus);
		
		// ����̹����� ��ϵ� �̹��� Drawable�� ������ �ִϸ��̼��� �����մϴ�.
		AnimationDrawable adAnimatedDrawable = (AnimationDrawable) mIvAnimation.getBackground();
		adAnimatedDrawable.start();
	}
}