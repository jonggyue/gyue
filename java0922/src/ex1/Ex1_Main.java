package ex1;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex1_Main created on : 2014. 9. 22, ���� 10:34:31
 */
// �������� �����ֱⰡ �ֱ� ������ �����尡 �ٽ� ���� �� �� ����.
// �ϳ��� �����忡 �ϳ��� start()�� ȣ��
public class Ex1_Main {
    public static void main(String[] args) {
        System.out.println("���� �޼��� ���� ����!");
        Ex11_MyThread t1 = new Ex11_MyThread();// 1 , 1
        //  Ex11_MyThread�� �ִ� riun()�޼��带
        // �ϳ��� ���ÿ��� ȣ���� �� ����
        // t1.run(); //2
        //=========================
        // �ü���� �����ٷ��� ���� ��û�ϱ� ?����
        // ���� ��� ����� �� ��
        t1.start();
        t1 = new Ex11_MyThread();
        t1.start(); // ������ ��������: �ذ��ϱ����ؼ��� �������ʿ���
        System.out.println("���� �޼��� ���� ��"); // ���. 2
        
    }

}
