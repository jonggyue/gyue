package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOSTA 86기 김종규
 * Document   : MyThread created on : 2014. 9. 16, 오전 11:34:02
 */
public class MyThread {

    public MyThread() {
        for(int i = 0; i<10; i++){
            try {
                // 일반적인 예외는 반드시 컴파일단계에서 점검함!
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new MyThread();
    }

}
