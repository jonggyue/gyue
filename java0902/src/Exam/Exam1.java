package Exam;

import java.util.Scanner;

/**
 *
 * @author 1 Document : Exam1 created on : 2014. 9. 2, ���� 3:33:28
 */
public class Exam1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num1�� �Է��Ͻÿ� : ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("num2�� �Է��Ͻÿ� : ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.println("���� ������ ���ΰ� �����ΰ�?");
        System.out.println("num1�� num2���� ū��? " + (num1 > num2));
        System.out.println("num1�� num2���� ������? " + (num1 < num2));
        System.out.println("num1�� num2���� ũ�ų� ������? " + (num1 >= num2));
        System.out.println("num1�� num2���� �۰ų� ������? " + (num1 <= num2));
        System.out.println("num1�� num2���� ������? " + (num1 == num2));
        System.out.println("num1�� num2���� �ٸ���? " + (num1 != num2));

    }

}
