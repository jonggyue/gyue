package ex1;

import java.util.Scanner;

/**
 *
 * @author 1
 * Document   : Ex7_IfElseIf created on : 2014. 9. 3, ���� 1:50:30
 */
public class Ex7_IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�����ϴ� ���� �Է� (red,blue,green...) : ");
        String msg = sc.nextLine();
        //���� : if(msg == "red") ��ü�����Ǽ� �ּҰ��� �ٸ�
        //equalsIgnoreCase() : ����ڰ����࿡ Red, RED ��ҹ��� ���о��� StringŬ������ ���ڿ��� ���� �����ش�.
        if(msg.equalsIgnoreCase("red")){
            System.out.println("������ �̱���.");
        }else if(msg.equalsIgnoreCase("blue")){
            System.out.println("�Ķ����Դϴ�.");
        }else if(msg.equalsIgnoreCase("green")){
            System.out.println("�ʷϻ� �̱���.");
        }else{
            System.out.println("�𸣰ڽ��ϴ�.");
        }
    }

}
