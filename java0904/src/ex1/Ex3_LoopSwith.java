package ex1;

import java.util.Scanner;

/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Ex3_LoopSwith created on : 2014. 9. 4, 오전 10:35:26
 */
public class Ex3_LoopSwith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //for문을 이용한 무한루프
        xx:for(;;){
            System.out.print("색상을 입력 :(R,G,B) 종료는 bye : ");
            String col = sc.nextLine();
            col = col.toLowerCase();//대소문자변경
           // String res = "";
            switch(col){
                case "red" :
                    System.out.println("빨간새이네요 ^^");
                    break;
                case "blue" :
                    System.out.println("파란새이네요 ^^");
                    break;
                case "bye" :
                    System.out.println("종료하고싶은데요! ^^");
                    break xx;
            }

        }

            //System.out.println("당신이 입력한 색상은 " + res + "입니다.");
     }
}


