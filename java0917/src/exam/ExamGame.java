package exam;

import java.util.Scanner;

/**
 * @author kosta 
 * Document   : ExamGame Created on : 2014. 9. 4, 오후 2:16:09
 */
public class ExamGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //지역변수 초기화
        int winCnt=0, totalCnt=0;//이긴횟수, 총 게임수 선언 및 초기화
        //""0번지, "홀"1번지, "짝"2번지
        String[] m = {"","홀","짝"}; 
        while (true) {//무한루프시작            
            System.out.print("홀-1,짝-2,종료-3:");
            int num = Integer.parseInt(sc.nextLine());
            int cNum = (int) (Math.random()*2)+1;
            String msg="";
            if(num == 3){//3을 입력할때 무한루프 탈출
                System.out.println("TOTAL:"+totalCnt);
                System.out.println("WIN :"+winCnt);
                //int winN = winn(winCnt, totalCnt);
               // System.out.println("승률:"+winN +"%");
                //System.out.println("상품 :"+gift(winN));
                System.out.println("종료");
                break;
            }else if(num == cNum){
                msg ="[승리 하셨습니다]";
                winCnt++;
            }else if(num != cNum){
                msg ="[당신은 졌습니다.]";
            }
            totalCnt++;//총 게임수 카운트
            System.out.println("TOTAL:"+totalCnt);
            //m[1]="홀"      [""],["홀"],["짝"]
            System.out.println("CPU :"+m[cNum]);
            System.out.println("YOU :"+m[num]);
         
            System.out.println("-------------");
            System.out.println("WIN :"+winCnt);
            System.out.println(msg);
        }
    }
    //확률 구하는 메서드
    public int winn(int win,int total){
       int rate = (int) (((double)win/total) * 100);

        return rate;
    }
    //상품결정하는 메서드
    public String gift(int winNum){
        String gMsg="";
        if(winNum == 100){
            gMsg="축하합니다.  페라리 당첨입니다. ^^";
        }else if(winNum < 100 && winNum >= 90){
            gMsg="축하합니다. 그랜저 당첨입니다.";
        }else if(winNum < 90 && winNum >= 80){
            gMsg="축하합니다. 소나타 당첨입니다.";
        }else if(winNum < 90 && winNum >= 80){
            gMsg="축하합니다. 소나타 당첨입니다.";
        }else if(winNum < 80 && winNum >= 60){
            gMsg="축하합니다. 당나귀 당첨입니다.";
        }else{
            gMsg="축하합니다. 숨쉬기 운동 1000번 당첨입니다.";
        }
        return gMsg;
    }
}
