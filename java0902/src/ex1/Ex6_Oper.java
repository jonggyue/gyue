package ex1;

import java.util.Scanner;

/**
 *
 * @author 1
 * Document   : Ex6_Oper created on : 2014. 9. 2, ���� 2:01:29
 */
public class Ex6_Oper {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        System.out.println("a�� b��"+(a==b));
//        //�Ϲ��ڷ����϶��� ����
//        //�����ڷ����϶��� �ּҰ���
//        
//        String str1 = new String("T");
//        String str2 = new String("T");
//        System.out.println("str1,str2��"+(str1==str2));
//        
//        String str3 = "TT";
//        String str4 = "TT";
//        System.out.println("str3,str4��"+(str3==str4));
        
        
        //scanner Ŭ������ ����ؼ� ����ڷ� ���� �Է�ó��
        //�� �ʺ�)Ÿ���� ��
        //scanner sc ���� �ϸ鼭 ����
        //���� - Ŭ������ ����ϱ� ���ؼ��� ctrl + space�� �θ�
        //scanner�� java.util������
        Scanner sc = new Scanner(System.in);
        
        //UI ���ڸ� �Է��ϼ���.
        System.out.print("�޼��� �Է�1 :");
        
        //����ڷ� ���� ���ڿ��� �Է� ���� �� String msg�� �����ϱ�
        //sc,nextLine(0�� �޼��尡 ȣ���� �Ǹ� String���� ��ȯ�Ǳ⶧����
        //�Ʒ��� ���� ���� Ÿ���� ������ �����ؼ� ���� �� �ִ�.
        //�޼���м�) �Է¹��� ���ڿ��� ���� ������ �о String���� ��ȯ�Ѵ�.
        String msg = sc.nextLine();
        
        
        System.out.print("�޼��� �Է�2 :");
        String msg2 = sc.nextLine();
        //blocking �޼��� :������ �����ɶ����� ��ٸ�, ����ڰ� �Է��Ͽ� ����ĥ������
        System.out.println("=========");
        System.out.println("�Է°�1 :"+msg);
        System.out.println("�Է°�2 :"+msg2);
        System.out.println("msg/msg2 �ּҰ��� �� : "+(msg == msg2));//false
        //String Ŭ���� : ���ڿ����� ������ ��ü
        System.out.println("msg/msg2 �����:"+(msg.equals(msg2)));//true
        //����
        String svc1 = new String("MyTest");
        String svc2 = new String("MyTest");
        System.out.println("svc1/svc2 ������ ��"+(svc1.equals(svc2)));//true
        
    }
}
