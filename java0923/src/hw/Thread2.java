package hw;

import static hw.Thread1.angle1;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOSTA 86�� ������ Document : Thread2 created on : 2014. 9. 23, ���� 4:48:23
 */
public class Thread2 extends Thread {

    public static int angle2;

    @Override
    public void run() {
        for (angle2 = 0; angle2 <= 360; angle2 += 10) {
            try {
                Thread.sleep(500);
                System.out.println("angle2 : "+angle2);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }
}
