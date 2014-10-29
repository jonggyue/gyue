package exam;

/**
 *
 * @author KOSTA 86기 김종규 Document : ExamStar created on : 2014. 9. 22, 오전
 * 11:07:27
 */
public class ExamStar extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.print("i = " + i + "\t");
                if ((i % 2) == 0) {
                    System.out.println("★");
                } else {
                    System.out.println("□");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            

        }
    }

    public static void main(String[] args) {
        new ExamStar().start();
    }

}
