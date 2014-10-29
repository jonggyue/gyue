package ex2;

/**
 * @author kosta Document : MyThread1 Created on : 2014. 9. 23, 오후 5:19:04
 */
import java.awt.Canvas;

public class MyThread1 implements Runnable{

    private MultiCanvas myCan;
    //생성자 생성
    public MyThread1(MultiCanvas myCan) {
        this.myCan = myCan; //자기자신을 호출
    }

    @Override // 스레드 동작
    public void run() {
        
        while (myCan.getArcNum() <= 380) {
            System.out.println("첫번째 스레드 동작중" + myCan.getArcNum() + " " + Thread.currentThread().getName());
            System.out.println("arcNum2" + myCan.getArcNum2());
            try {
                Thread.sleep(500); // 스레드가 동작할때 0.5초단위로
            } catch (InterruptedException ex) {
                ex.printStackTrace(); // 에러메세지 출력
                System.out.println("발생");
            }
            int tmpN = myCan.getArcNum();
            tmpN += tmpN + 10;
            myCan.setArcNum(tmpN);
            myCan.getCan().repaint(); //스레드에게 화면을 갱신할 것을 요청, 0.1초마다 확인해서 용청이 있으면 update()를 호출한다.
        }
    }
}
