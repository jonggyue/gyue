package ex1;

import java.util.Scanner;

/**
 *
 * @author 1
 * Document   : Ex1_Oper created on : 2014. 9. 3, 오전 10:14:31
 */
public class Ex1_Oper {
    //비교연산자-변수나 상수값을 비교 할 때 쓰이는 연산자. 결과는
    //항상 boolean (true/false)
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean c = a<b; // 변수 a가 변수 b 보다 작다.
        System.out.println(a+" a = "+ "  b = "+b);
        System.out.println("a < b : "+ c);
        c = a>b; //변수 a가 변수 b보다 크다.
        System.out.println("a > b : "+ c);
        c = a!= b; // 변수 a와 b가 서로 같지 않다.
        System.out.println("a != b : "+ c);
        c = a == b; //변수 a와 b가 서로 같다.
        System.out.println("a == b : "+ c);
        c = a >= b; //변수 a가 변수 b보다 크거나 같다.
        System.out.println("a >= b : "+ c);
        c = a <= b; //변수 a가 변수 b보다 작거나 같다.
        System.out.println("a <= b : "+ c);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("수 1 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("수 2 : ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.println("수1이 수2보다 크다. : "+(num1>num2));
        System.out.println("수1이 수2보다 작다. : "+(num1<num2));
        System.out.println("수1이 수2보다 크거나 같다. : "+(num1>=num2));
        System.out.println("수1이 수2보다 작거나 같다. : "+(num1<=num2));
        System.out.println("수1이 수2보다 같다. : "+(num1==num2));
        System.out.println("수1이 수2보다 같지 않다. : "+(num1!=num2));
        
        
        
        
    }

}
