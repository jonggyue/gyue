package ex1;

import java.util.Scanner;

/**
 *
 * @author 1
 * Document   : Ex7_Operator created on : 2014. 9. 2, 오후 3:11:06
 */
public class Ex7_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수 1 : ");
        //Integer java.lang소속
        int num1 = Integer.parseInt(sc.nextLine());
        //parseInt 정수가될법한 것_스트링으로받아들이는값을 인트형으로
        //nextLine이 스트링으로 받기때문에 integer의 래퍼클래스인 parseInt를 사용하여
        System.out.print("수 2 : ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.println(num1+"+"+num2+"="+(num1+num2));
        //==========================================================
        System.out.println("입력받은 수가 짝수 이면 true를 출력하시오.");
        int num3 = Integer.parseInt(sc.nextLine());
        System.out.println("입력받은수 :" + num3 + " " + ((num3%2)==0));
        
    }

}
