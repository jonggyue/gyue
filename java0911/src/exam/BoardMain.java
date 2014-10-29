package exam;

import java.util.Scanner;

/**
 *
 * @author KOSTA 86기 김종규
 * Document   : BoardMain created on : 2014. 9. 11, 오후 2:06:18
 */
public class BoardMain {
    // 1.입력, 2.출력, 3.종료 : 1
    // 제목 :
    // 성별 :('M', 'F', 'm', 'f',)경고메세지 !
    // 작성자 :
    // 내용 :
    // 현재날짜 : 
    // 1.입력, 2.출력, 3.종료 : 2
    // 제목 ~~~~현재 날짜가 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        BoardReference ref = new BoardReference();
        int num;

        while(true){
            
            System.out.print("1.입력 2.출력 3.종료 : ");
            num = Integer.parseInt(sc.nextLine());
            if(num==1){
                BoardVO v = new BoardVO();
                System.out.print("제목 : ");
                v.setTitle(sc.nextLine());
                System.out.print("성별 : ");
                v.setGender(sc.nextLine());
                System.out.print("작성자 : ");
                v.setPost(sc.nextLine());
                System.out.print("내용 : ");
                v.setContent(sc.nextLine());
                System.out.print("현재날짜 : ");
                v.setDay(sc.nextLine());
                
                /*
                boolean result = vc.info(vo);
                if(result == false){
                    System.out.println("성별에는 M,F,m,f만 입력가능합니다.);
                }
                */
                
                ref.info(v);
                
            }
            if(num==2){
                System.out.println("제목 : "+ref.getVo().getTitle());
                System.out.println("성별 : "+ref.getVo().getGender());
                System.out.println("작성자 : "+ref.getVo().getPost());
                System.out.println("내용 : "+ref.getVo().getContent());
                System.out.println("현재날짜 : "+ref.getVo().getDay());
            }
            if(num==3){
                break;
            }
        }
        
    }
    

}
