package ex1;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex1_Thread2 created on : 2014. 9. 23, ���� 9:09:21
 */
public class Ex1_Thread2 implements Runnable{

    @Override
    public void run() {
  
        for(int i=0; i<300; i++){
            System.out.print("l");
        }
        System.out.println("");
    }

}
