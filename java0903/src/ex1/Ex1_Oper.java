package ex1;

import java.util.Scanner;

/**
 *
 * @author 1
 * Document   : Ex1_Oper created on : 2014. 9. 3, ���� 10:14:31
 */
public class Ex1_Oper {
    //�񱳿�����-������ ������� �� �� �� ���̴� ������. �����
    //�׻� boolean (true/false)
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean c = a<b; // ���� a�� ���� b ���� �۴�.
        System.out.println(a+" a = "+ "  b = "+b);
        System.out.println("a < b : "+ c);
        c = a>b; //���� a�� ���� b���� ũ��.
        System.out.println("a > b : "+ c);
        c = a!= b; // ���� a�� b�� ���� ���� �ʴ�.
        System.out.println("a != b : "+ c);
        c = a == b; //���� a�� b�� ���� ����.
        System.out.println("a == b : "+ c);
        c = a >= b; //���� a�� ���� b���� ũ�ų� ����.
        System.out.println("a >= b : "+ c);
        c = a <= b; //���� a�� ���� b���� �۰ų� ����.
        System.out.println("a <= b : "+ c);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("�� 1 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("�� 2 : ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.println("��1�� ��2���� ũ��. : "+(num1>num2));
        System.out.println("��1�� ��2���� �۴�. : "+(num1<num2));
        System.out.println("��1�� ��2���� ũ�ų� ����. : "+(num1>=num2));
        System.out.println("��1�� ��2���� �۰ų� ����. : "+(num1<=num2));
        System.out.println("��1�� ��2���� ����. : "+(num1==num2));
        System.out.println("��1�� ��2���� ���� �ʴ�. : "+(num1!=num2));
        
        
        
        
    }

}
