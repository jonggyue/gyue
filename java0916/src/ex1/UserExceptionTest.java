package ex1;

import java.util.Scanner;

/**
 *
 * @author KOSTA 86기 김종규 Document : UserExceptionTest created on : 2014. 9. 16,
 * 오전 10:53:17
 */
public class UserExceptionTest {
    UserException ues;
    private void test(String n) throws UserException {
        
        if (n.length() < 1) {
            throw ues = new UserException("값을 넣어야 합니다.");
        }else{
            System.out.println("Test1");
            throw ues = new UserException("최종예선", 703);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("글입력 : ");
        String n = sc.nextLine();
        // 현재 객체를 생성
        UserExceptionTest ut = new UserExceptionTest();
        try {
            ut.test(n);
            
        } catch (UserException e) {
            //발생한 예외 객체가 기억하고 있는 간략한 메세지만 반환
            System.out.println(e.getMessage());
            //예외의 정보를 순차적인 메서드 호출된 기록까지 모두 출력이
            // 되어서 상세하게 확인
            //e. printStackTrace();
        }finally{
            System.out.println("PORT = "+ ut.ues.getPort());
        }
    }

}
