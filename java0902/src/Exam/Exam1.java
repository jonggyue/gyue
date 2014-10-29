package Exam;

import java.util.Scanner;

/**
 *
 * @author 1 Document : Exam1 created on : 2014. 9. 2, 오후 3:33:28
 */
public class Exam1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num1을 입력하시오 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("num2을 입력하시오 : ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.println("다음 질문이 참인가 거짓인가?");
        System.out.println("num1이 num2보다 큰가? " + (num1 > num2));
        System.out.println("num1이 num2보다 작은가? " + (num1 < num2));
        System.out.println("num1이 num2보다 크거나 같은가? " + (num1 >= num2));
        System.out.println("num1이 num2보다 작거나 같은가? " + (num1 <= num2));
        System.out.println("num1이 num2보다 같은가? " + (num1 == num2));
        System.out.println("num1이 num2보다 다른가? " + (num1 != num2));

    }

}
