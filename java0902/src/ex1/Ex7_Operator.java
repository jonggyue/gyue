package ex1;

import java.util.Scanner;

/**
 *
 * @author 1
 * Document   : Ex7_Operator created on : 2014. 9. 2, ���� 3:11:06
 */
public class Ex7_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�� 1 : ");
        //Integer java.lang�Ҽ�
        int num1 = Integer.parseInt(sc.nextLine());
        //parseInt �������ɹ��� ��_��Ʈ�����ι޾Ƶ��̴°��� ��Ʈ������
        //nextLine�� ��Ʈ������ �ޱ⶧���� integer�� ����Ŭ������ parseInt�� ����Ͽ�
        System.out.print("�� 2 : ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.println(num1+"+"+num2+"="+(num1+num2));
        //==========================================================
        System.out.println("�Է¹��� ���� ¦�� �̸� true�� ����Ͻÿ�.");
        int num3 = Integer.parseInt(sc.nextLine());
        System.out.println("�Է¹����� :" + num3 + " " + ((num3%2)==0));
        
    }

}
