package exam;

import java.util.Scanner;

/**
 *
 * @author KOSTA 86기 김종규 Document : ExamException created on : 2014. 9. 16, 오전
 * 9:45:13
 */
public class ExamException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수 입력 : ");

        try {
            // 예외 발생 할수있는 상위 순으로 작성 해야한다.
            int num = Integer.parseInt(sc.nextLine());
            int com = (int) (Math.random() * 3); //0-2
            int res = num / com;
            System.out.println("입력한 수/랜덤한 수");
            System.out.println("출력결과 : " + res);
            System.out.println("자원반납"); //에러 생성시 작동x하기때문에 이러면안됨
        } catch (NumberFormatException e) {
            // 숫자가 아닌 다른 값을 입력했을때 : NumberFormatException
            System.out.println("숫자만 입력하세요.");
            // return; 리턴을 넣으면 캐치문 뒤로는 안하고 전체프로그램종료
        } catch (ArithmeticException e) {
            //랜덤한 수가 0이되여 입력한 수/0 에러 : ArithmeticException
            System.out.println("random이 0 입니다.");
        } finally {//무조건 수행되기때문에 주요 로직입력;
            //catch문의 return이나 /  try문의 에러다음 수행문장같은것들
            System.out.println("중요한거만!!여기에 작성");
        }
        System.out.println("프로그램 주요 로직 "); // catch에 리턴이 있으면 수행 안됨

    }

}
