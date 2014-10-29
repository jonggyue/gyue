package ex1;

/**
 *
 * @author KOSTA 86기 김종규 Document : Ex1_Join created on : 2014. 9. 23, 오전
 * 9:05:54
 */
// 현재 스레드가 무사히 종료될때 까지 다른 스레드가 대기 하도록 지정하는 메서드
public class Ex1_Join {

    private static long startTime = 0;

    public static void main(String[] args) throws InterruptedException {
        Ex1_Thread1 t1 = new Ex1_Thread1();
        startTime = System.currentTimeMillis();
        t1.start();
        t1.join(); // t1의 작업이 끝날때 까지 다른 스레드는 대기
        Ex1_Thread2 t2 = new Ex1_Thread2();
        //***runnable를 인터페이스한 클래스는 추상매서드인 run만 가지고 있기때문에
        //start()호출x, run();을 호출한다는것은 스레드가 아닌 메인에게 run()하겠다는 것
        //결국 스레드가 동작하려면 start가 호출되었을때 별도의 스택을 제공받음
        //runnable인터페이스를 구현받은것은 스레드를 생성해서 러너블의 주소를 주어야한다
        Thread tt2 = new Thread(t2);
        tt2.start();
        tt2.join();
        System.out.println("걸린시간 : " + (System.currentTimeMillis() - startTime));
    }
}
