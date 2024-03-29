package ex2;

/**
 * @author kosta Document : MyThread2 Created on : 2014. 9. 23, 오후 5:19:27
 */

import java.awt.Canvas;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread2 implements Runnable {

    private MultiCanvas myCan;

    public MyThread2(MultiCanvas myCan) {
        this.myCan = myCan;
    }

    @Override
    public void run() {
        try {
            myCan.getT1().join();// join()쓰레드가 동작이 끝날때까지 기다렸다가 다음 쓰레드를 동작
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        while (myCan.getArcNum2() <= 380) {
            System.out.println("두번째 스레드 동작중" + myCan.getArcNum2() + " " + Thread.currentThread().getName());
            System.out.println("두번째 arcNum2" + myCan.getArcNum());
            try {
                Thread.sleep(500); // 스레드가 동작할때 0.5초단위로
            } catch (InterruptedException ex) {
                ex.printStackTrace(); // 에러메세지출력
                System.out.println("발생");
            }
            int tmpN = myCan.getArcNum2();
            tmpN += tmpN + 10;
            myCan.setArcNum2(tmpN);
            myCan.getCan().repaint();
        }
    }
}
