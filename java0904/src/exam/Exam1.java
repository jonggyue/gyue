package exam;

import java.util.Scanner;

/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Exam1 created on : 2014. 9. 4, 오후 1:47:44
 */
public class Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("홀 짝 게 임 [1-홀, 2-짝, 3-종료]");
        int total=0;//게임판수
        int win=0;//승리횟수
        int winper;//승률
        int num;
        String pre = "";//선물내역

        while(true){
            num = Integer.parseInt(sc.nextLine());
            String you="", cpu="";
            int cnum = (int) (Math.random() * 2 +1);
            
            
            if( cnum == 1 ){
                cpu = "홀";
            } else if( cnum == 2 ){
                cpu = "짝";
            }
            
            if(num == 1){
                you = "홀";
            }else if(num == 2){
                you = "짝";
            }else if(num == 3){
                break;
            }else{
                System.out.println("잘못입력하였습니다.  [1-홀, 2-짝, 3-종료]");
                continue;
            }
            total++;
            System.out.println("1-홀, 2-짝, 3-종료 : " + num);
            System.out.println("TOTAL : "+ total);
            System.out.println(" CPU  : "+ cpu);
            System.out.println(" YOU  : "+ you);
            
            printlin();
            
            if(num==cnum){
                win++;
                System.out.println("WIN "+win);
                System.out.println("[승리하셧습니다.]");
            }else{
                System.out.println("LOSE");
                System.out.println("[당신은 졌습니다.]");
            }
            printlin();

        }

        winper = winn(win,total);//(int) (((double)win/(double)total)*100);
        if(total>=10){
            if(winper>=100){
                pre = "두바이 국민차";
            }else if(winper>=90){
                pre = "에쿠스";
            }else if(winper>=80){
                pre = "소나타";
            }else if(winper>=70){
                pre = "마티즈";
            }else if(winper>=60){
                pre = "자전거";
            }else{
                pre = "없습니다.";
            }
        }else{
            pre = "없습니다.";
        }
        
        System.out.println("게 임 종 료");
        printlin();
        System.out.println("TOTAL : "+ total);
        System.out.println(" WIN  : "+win);
        System.out.println(" 승률 : "+winper+"%");
        System.out.println(" 상품 : "+pre);
        condition();
        
 
    }
    public static int winn(int win, int total){
        int rate = (int) (((double)win/total) * 100);
        return rate;
        //메서드의 반환형 - 반활될 자료형으로 명시
        //return 자료형에 맞는값
        // int xx = winn(50,100);
    }
    private static void printlin() {
        System.out.println("-----------------");
    }
    private static void condition() {
        System.out.println("=================================");
        System.out.println("      상품조건       10판이상");
        System.out.println("  승률   100%이상 : 두바이 국민차");
        System.out.println("  승률   90%이상  : 에쿠스");
        System.out.println("  승률   80%이상  : 소나타");
        System.out.println("  승률   70%이상  : 마티즈");
        System.out.println("  승률   60%이상  : 자전거");
    }
    public static String gift(int win){
        String pre="";
        return pre;
    }

}
