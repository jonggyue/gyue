package ex1;


/**
 *
 * @author KOSTA 86기 김종규 Document : Ex1_callbyvalue created on : 2014. 9. 11, 오전
 9:31:13
 */
public class Ex1_callbyvalue {

    public static void test(int n) {
        n = n + 10;
        System.out.println("n1 = " + n);
    }

    public static void main(String[] args) {
        int n = 10;
        test(n);
        System.out.println("n2 = " + n);
    }
}
