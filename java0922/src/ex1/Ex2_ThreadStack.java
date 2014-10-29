package ex1;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Ex2_ThreadStack created on : 2014. 9. 22, 오전 10:48:14
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
    
    //main이 스택에 쌓인후 start()수행 후 별도의 스택을 생성하여 run한다. 
    public static void main(String[] args) {
        new Ex2_ThreadStack().run();
    }

}
