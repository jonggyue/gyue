package ex1;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : Main created on : 2014. 9. 11, ���� 10:03:36
 */
public class Main {
    public static void main(String[] args) {
        //��ü����, static�޼��尡 �ƴ����� �����ؾߵ�
        Home ref = new Home();
        PaintA a = new PaintA();
        PaintB b = new PaintB();
        
        ref.setDoorColor("�ʷϻ�");
        System.out.println("���� �빮 ���� : "+ref.getDoorColor());
        //CallByReference�� ���� ȣ��� ��ü�� �ּҰ��� ����
        a.paintHome(ref, "��Ȳ��");// �ð��� A
        b.paintHome(ref, "������");// �ð��� B ��� ���� �ּҸ� ���� �ִ�.
        System.out.println("���� �빮 ���� : " +ref.getDoorColor());// ������ �ð��� ���� ���
    }

}
