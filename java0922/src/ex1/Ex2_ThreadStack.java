package ex1;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex2_ThreadStack created on : 2014. 9. 22, ���� 10:48:14
 */
public class Ex2_ThreadStack extends Thread{

    @Override
    public void run() {
        showStack();
    }

    private void showStack() {
        try {
            throw new InterruptedException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //main�� ���ÿ� ������ start()���� �� ������ ������ �����Ͽ� run�Ѵ�. 
    public static void main(String[] args) {
        new Ex2_ThreadStack().run();
    }

}
