package inner;

/**
 *
 * @author KOSTA 86기 김종규 Document : StaticInner created on : 2014. 9. 15, 오후
 * 3:20:25
 */
public class StaticInner {

    int a = 10;
    private int b = 100;
    static int c = 200;

    static class Inner {

        // 어쩔수 없이 내부클래스 안에서 static자원을 사용하게 된다면
        // 이때 내부클래스는 static내부클래스 정의로 되어야 한다.

        static int d = 1000;

        public void printData() {
//                System.out.println("int a : "+a);
//                System.out.println("int b : "+b);
            System.out.println("int c : "+c);
        }
    }
    public static void main(String[] args) {
        // 내부클래스 생성후 rpintData();
        StaticInner.Inner inner = new StaticInner.Inner();
        inner.printData();
    }
}
