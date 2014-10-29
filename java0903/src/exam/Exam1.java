package exam;

import java.util.Scanner;

/**
 *
 * @author 1
 * Document   : Exam1 created on : 2014. 9. 3, 오전 11:35:00
 */
public class Exam1 {
    public static void main(String[] args) {
        //Scanner로 부터 수를 입력받은 후 그 수가 홀수인지 짝수인지를 출력하세요.
        //그수가 홀수인지 짝수인지를 출력하세요.
        // ex) 수 입력 
        // 단 양수만 입력 조건설정x
        
        String result;
        
        Scanner sc = new Scanner(System.in);
        //사용자로부터 수를 받기 위한 변수 선언과 메서드 호출
        System.out.print("수 입력 : ");
        int num = Integer.parseInt(sc.nextLine());
        //홀수인지 짝수인지를 구별하기 위한 제어문과 출력문을 저장할 변수를 선언
        //단 양수입력했을때 기준
        if(num%2==1){
            result = "홀수";
        }
        else{
            result = "짝수";
        }
        System.out.println("입력한 수 [ " + num + " ] 은 " + result + "입니다.");
        //리팩토리에서 중복을 제거하여 효율을 높임_수정할때
    }

}
