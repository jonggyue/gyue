package ex3;

/**
 *
 * @author KOSTA 86�� ������ Document : InterTestEx created on : 2014. 9. 15, ����
 * 11:32:09
 */
// �������̽��� ����ϴ� Ŭ������ implements��� Ű����� �������̽���
// �����ؼ� �߻�޼��带 ������ �ؾ� �� ������ �ִ�.
public class InterTestEx implements InterFaceTest {

    @Override
    public int getA() {
        return A;
    }

    @Override
    public int getB() {
        return b;
    }

    public static void main(String[] args) {
        InterTestEx it1 = new InterTestEx();
        System.out.println("A�� ��" + it1.getA());//100
        System.out.println("B�� ��" + it1.getB());//200
    }
}
