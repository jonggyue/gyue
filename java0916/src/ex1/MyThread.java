package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : MyThread created on : 2014. 9. 16, ���� 11:34:02
 */
public class MyThread {

    public MyThread() {
        for(int i = 0; i<10; i++){
            try {
                // �Ϲ����� ���ܴ� �ݵ�� �����ϴܰ迡�� ������!
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
