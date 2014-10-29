package ex1;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Ex1_Thread1 created on : 2014. 9. 23, 오전 9:07:06
 */
public class Ex1_Thread1 extends Thread{

    @Override
    public void run() {
        for(int i=0; i<300; i++){
            System.out.print("-");
        }
        System.out.println("");
    }
    
}
