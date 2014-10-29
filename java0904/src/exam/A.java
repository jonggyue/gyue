package exam;

import java.util.Scanner;

/**
 *
 * @author KOSTA 86기 김종규
 * Document   : A created on : 2014. 9. 4, 오후 4:22:07
 */
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 횟수를 입력하시오 : ");
        int total = Integer.parseInt(sc.nextLine());
        System.out.print("조건에 만족하는 횟수를 입력하시오 : ");
        int count = Integer.parseInt(sc.nextLine());
        int res = ExamGame.winn(count, total);
        System.out.println("만족하는 확률 : "+ res + "%");
    }
}
