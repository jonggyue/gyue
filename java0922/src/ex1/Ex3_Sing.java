package ex1;

/**
 *
 * @author KOSTA 86기 김종규 Document : Ex3_Sing created on : 2014. 9. 22, 오전
 11:31:24
 */
public class Ex3_Sing extends Thread {

    @Override
    public void run() {

        try {
            for (int i = 0; i < 300; i++) {
                System.out.print("*");
            }
            System.out.println("");
            System.out.println(System.currentTimeMillis()-Ex3_ThreadSingle.start);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
