package exam;

/**
 *
 * @author KOSTA 86�� ������ Document : Exam1 created on : 2014. 9. 11, ���� 9:37:56
 */
public class Exam1 {
// Call by Value����
    public void test(int n) {
        n = n + 10;
        System.out.println("n1 = " + n);
    }

    public static void main(String[] args) {
        int n = 10;
        Exam1 r = new Exam1();// test()�ż��尡 static�̸� ������ �����־������ �ƴ����� ���ο� ��ü�� heap������ �����Ͽ� �����ؾߵȴ�
        r.test(n);
        System.out.println("n2 = " + n);
    }

}
