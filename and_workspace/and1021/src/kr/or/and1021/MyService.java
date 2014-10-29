package kr.or.and1021;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service implements Runnable{
	@Override
	public void onCreate() {
		super.onCreate();
		// 서비스가 시작될때 스레드를 생성하고 시작시킨다.
		Thread myThread = new Thread(this);
		myThread.start();
	}
	private int count = 0;
	@Override
	public void run() {
		while(true){
			count++;
			System.out.println("Count"+count);
			if(count==10){
				//특정 조건에 해당되면 아래의 인텐트를 사용해서 특정 엑티비티로 이동시키겠다.
				//서비스에서 현재 액티비티로 이동을 하기 위해서는
				Intent intent = new Intent(MyService.this, AA.class);
				//서비스에서 이동해야 될 엑티비티의 TASK를 활성 해줘야 한다
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(intent);
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

}
