package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOSTA 86기 김종규 Document : ATM created on : 2014. 9. 23, 오전 10:41:47
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
    //임계영역 발생지점 : 스레드들이 모여서 공동으로 작업하는 고간
    // 여기서 동시성 문제가 발생 될 수 있다.
    // synchronized 를 걸어서 작성 Lock Poop에 스레드가 들어가서
    // 해당 일을 할 동안 다른 스레드의 간섭을 받지 않는다.
    private synchronized void withDraw(int howMuch) {
        String tname = Thread.currentThread().getName();
        if (getDespsiteMoney() > 0) {
            // 1000씩 감한다.
            despsiteMoney -= howMuch;

            System.out.println("ThreadNmae : " + tname + ".");
            System.out.println("잔액 : " + getDespsiteMoney() + "");

        } else if(getDespsiteMoney() == 0){
            System.out.println("ThreadNmae : " + tname + ".");
            System.out.println("잔액이 부족합니다.");
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
