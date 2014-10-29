package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOSTA 86�� ������ Document : ATM created on : 2014. 9. 23, ���� 10:41:47
 */
public class ATM implements Runnable {

    private long despsiteMoney = 10000;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            if (getDespsiteMoney() <= 0) {
                break;
            }
            withDraw(1000);
        }
    }

    public long getDespsiteMoney() {
        return despsiteMoney;

    }
    //�Ӱ迵�� �߻����� : ��������� �𿩼� �������� �۾��ϴ� ��
    // ���⼭ ���ü� ������ �߻� �� �� �ִ�.
    // synchronized �� �ɾ �ۼ� Lock Poop�� �����尡 ����
    // �ش� ���� �� ���� �ٸ� �������� ������ ���� �ʴ´�.
    private synchronized void withDraw(int howMuch) {
        String tname = Thread.currentThread().getName();
        if (getDespsiteMoney() > 0) {
            // 1000�� ���Ѵ�.
            despsiteMoney -= howMuch;

            System.out.println("ThreadNmae : " + tname + ".");
            System.out.println("�ܾ� : " + getDespsiteMoney() + "");

        } else if(getDespsiteMoney() == 0){
            System.out.println("ThreadNmae : " + tname + ".");
            System.out.println("�ܾ��� �����մϴ�.");
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        Thread mother = new Thread(atm, "Mother");
        Thread son = new Thread(atm, "Son");
        mother.start();
        son.start();
    }
}
