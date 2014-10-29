package ex1;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Ex1_Main created on : 2014. 9. 22, 오전 10:34:31
 */
// 스레드의 생명주기가 있기 때문에 스레드가 다시 재사용 될 수 없다.
// 하나의 스레드에 하나의 start()만 호출
public class Ex1_Main {
    public static void main(String[] args) {
        System.out.println("메인 메서드 수행 시작!");
        Ex11_MyThread t1 = new Ex11_MyThread();// 1 , 1
        //  Ex11_MyThread에 있는 riun()메서드를
        // 하나의 스택에서 호출한 것 뿐임
        // t1.run(); //2
        //=========================
        // 운영체제의 스켈줄러로 부터 요청하기 ?문에
        // 언제 어떻게 수행될 지 모름
        t1.start();
        t1 = new Ex11_MyThread();
        t1.start(); // 오류가 나는이유: 해결하기위해서는 생성이필요함
        System.out.println("메인 메서드 수행 끝"); // 대기. 2
        
    }

}
