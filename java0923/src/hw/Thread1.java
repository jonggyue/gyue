package hw;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOSTA 86�� ������ Document : Thread1 created on : 2014. 9. 23, ���� 4:48:14
 */
public class Thread1 extends Thread {

    public static int angle1;

    @Override
    public void run() {
        for (angle1 = 0; angle1 <= 360; angle1 += 10) {
            try {
                Thread.sleep(500);
                System.out.println("angle1 : "+angle1);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }
    }

}
