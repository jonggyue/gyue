package ex1;

import java.util.Scanner;

/**
 *
 * @author 1
 * Document   : Ex7_IfElseIf created on : 2014. 9. 3, 오후 1:50:30
 */
public class Ex7_IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("좋아하는 생상 입력 (red,blue,green...) : ");
        String msg = sc.nextLine();
        //오류 : if(msg == "red") 객체생성되서 주소값이 다름
        //equalsIgnoreCase() : 사용자가만약에 Red, RED 대소문자 구분없이 String클래스의 문자열의 값을 비교해준다.
        if(msg.equalsIgnoreCase("red")){
            System.out.println("빨간색 이군요.");
        }else if(msg.equalsIgnoreCase("blue")){
            System.out.println("파란색입니다.");
        }else if(msg.equalsIgnoreCase("green")){
            System.out.println("초록색 이군요.");
        }else{
            System.out.println("모르겠습니다.");
        }
    }

}
