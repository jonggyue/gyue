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
        
        // 에니메이션을 구동하기 위한 이미지뷰를 가져와 애니메이션을 세팅합니다.
        mIvAnimation = (ImageView) findViewById(R.id.animation);
        mIvAnimation.setBackgroundResource(R.anim.anim);
    }

	@Override
	public void onWindowFocusChanged(boolean hasFocus)
	{
		super.onWindowFocusChanged(hasFocus);
		
		// 배경이미지로 등록된 이미지 Drawable을 가져와 애니메이션을 시작합니다.
		AnimationDrawable adAnimatedDrawable = (AnimationDrawable) mIvAnimation.getBackground();
		adAnimatedDrawable.start();
	}
}