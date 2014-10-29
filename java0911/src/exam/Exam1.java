package exam;

/**
 *
 * @author KOSTA 86기 김종규 Document : Exam1 created on : 2014. 9. 11, 오전 9:37:56
 */
public class Exam1 {
// Call by Value예제
    public void test(int n) {
        n = n + 10;
        System.out.println("n1 = " + n);
    }

    public static void main(String[] args) {
        int n = 10;
        Exam1 r = new Exam1();// test()매서드가 static이면 선언을 안해주어도되지만 아님으로 새로운 객체를 heap영역에 생성하여 참조해야된다
        r.test(n);
        System.out.println("n2 = " + n);
    }

}
