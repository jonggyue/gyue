package ex1;

import java.util.Scanner;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex1_RoboMain created on : 2014. 9. 5, ���� 10:36:03
 */
public class Ex1_RoboMain {
    //Ex1_Robo.class �޾Ƽ� �����ϱ����� �۾�
    public static void main(String[] args) {
        //�����ڷ��� Ex1)Robo ref; ����
        //new �����ڸ� ����ؼ� Ex1_Robo() Heap������ ����
        Ex1_Robo ref = new Ex1_Robo();
        //�Ӽ��� ���� �Ҵ�
        ref.power = true; // �������� �ִ� Ex1_Robo��ü�� �ڿ��� power��
                          // true���� ������ ����.
                          // ���� ref.isPoewr() �޼��带 ȣ���ϸ� �翬�� true���� ������ �ִ�
                          // power���ΰ��� Ȯ���� �� �ִ�.
        if(ref.isPower() == true){
            System.out.println("�κ��� ������ �������ϴ�.");
        }else{
            System.out.println("�κ��� ������ �������ϴ�.");
        }
        // �������� : Ex1_Robo ��ü�� move()�� ȣ���ؼ�
        // �κ��� �����̰� �����ϰ� ���α׷��� �Ͻÿ�.
        
//        Scanner sc = new Scanner(System.in);
//        int rv = Integer.parseInt(sc.nextLine());
//        ref.move(rv);
        
        boolean rv = ref.move(10);
        if(!rv){
            System.out.println("�κ� ���ۿ� ������ �ֽ��ϴ�.");
        }
    }
}
