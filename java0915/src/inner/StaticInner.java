package inner;

/**
 *
 * @author KOSTA 86�� ������ Document : StaticInner created on : 2014. 9. 15, ����
 * 3:20:25
 */
public class StaticInner {

    int a = 10;
    private int b = 100;
    static int c = 200;

    static class Inner {

        // ��¿�� ���� ����Ŭ���� �ȿ��� static�ڿ��� ����ϰ� �ȴٸ�
        // �̶� ����Ŭ������ static����Ŭ���� ���Ƿ� �Ǿ�� �Ѵ�.

        static int d = 1000;

        public void printData() {
//                System.out.println("int a : "+a);
//                System.out.println("int b : "+b);
            System.out.println("int c : "+c);
        }
    }
    public static void main(String[] args) {
        // ����Ŭ���� ������ rpintData();
        StaticInner.Inner inner = new StaticInner.Inner();
        inner.printData();
    }
}
