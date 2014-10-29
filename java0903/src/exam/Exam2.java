package exam;

import java.util.Scanner;

/**
 *연습문제
 * 수를 입력하세요. 8
 * 범위를 입력하세요. 3
 * [Result]
 * 0 1 2
 * 3 4 5
 * 6 7 8
 * 
 * 수를 입력하세요. 9
 * 범위를 입력하세요. 5
 * [Result]
 * 0 1 2 3 4
 * 5 6 7 8 9
 * @author 1
 * Document   : Exam2 created on : 2014. 9. 3, 오후 2:27:51
 */
public class Exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j=0;
        System.out.print("수를 입력하세요 : ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.print("범위를 입력하세요 : ");
        int range = Integer.parseInt(sc.nextLine());
        System.out.println("[Result]");
        for(int i=0; i<=num; i++){
            System.out.print(i + " ");
            j++;
            if(j==range){
                System.out.println("");
                j=0;
            }
        }
//        다른 정답
//        for(int i=0; i<=num; i++){
//            if(num!=0 && i%range==0){
//                System.out.println();
//            }
//            System.out.print(i + "\t");
//        }
    }
}
