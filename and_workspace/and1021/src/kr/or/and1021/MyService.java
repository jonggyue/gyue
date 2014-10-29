package kr.or.and1021;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service implements Runnable{
	@Override
	public void onCreate() {
		super.onCreate();
		// ���񽺰� ���۵ɶ� �����带 �����ϰ� ���۽�Ų��.
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
				//Ư�� ���ǿ� �ش�Ǹ� �Ʒ��� ����Ʈ�� ����ؼ� Ư�� ��Ƽ��Ƽ�� �̵���Ű�ڴ�.
				//���񽺿��� ���� ��Ƽ��Ƽ�� �̵��� �ϱ� ���ؼ���
				Intent intent = new Intent(MyService.this, AA.class);
				//���񽺿��� �̵��ؾ� �� ��Ƽ��Ƽ�� TASK�� Ȱ�� ����� �Ѵ�
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
