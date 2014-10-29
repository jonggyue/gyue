package com.example.anitest;


import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity{

	


	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	    }
	   
	    public void onWindowFocusChanged (boolean hasFocus) 
	    {
	     ImageView img = (ImageView)findViewById(R.id.imageView1);
	        AnimationDrawable ani;
	        
	        ani = getAnimation();//애니메이션을 불러옵니다.
	        img.setBackgroundDrawable(ani);
	        ani.start();//정상적으로 애니메이션이 구현되는예제..
	    }
	    
	    public AnimationDrawable getAnimation()
	    {
	     AnimationDrawable ani = new AnimationDrawable();
	     BitmapDrawable[] frame = new BitmapDrawable[10];
	   
	   frame[0] = (BitmapDrawable)getResources().getDrawable(R.drawable.z1);
	   frame[1] = (BitmapDrawable)getResources().getDrawable(R.drawable.z2);
	   frame[2] = (BitmapDrawable)getResources().getDrawable(R.drawable.z3);
	   frame[3] = (BitmapDrawable)getResources().getDrawable(R.drawable.z4);
	   frame[4] = (BitmapDrawable)getResources().getDrawable(R.drawable.z5);
	   
	   
	   for(int x = 0; x < 50; x++)
	   {
	    ani.addFrame(frame[x],100);
	   }
	   
	   ani.setOneShot(false);
	   return ani;
	    }
	 
	

}
