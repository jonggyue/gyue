package ex1;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : Main created on : 2014. 9. 12, ���� 10:16:01
 */
public class Main {
    public static void main(String[] args) {
        // �ڽ�Ŭ������ ������ �� ��ü ����
        D_carPhone ref = new D_carPhone("�ֳ�Ʈ3", "500000", 1000, "20px");
        System.out.println("�𵨸� : "+ref.model); //�θ�
        System.out.println("���� : "+ref.getNumber()); //�θ�
        System.out.println("ȭ�� : "+ref.getChord()); // �θ� ���
        System.out.println("�ȼ� : "+ref.getPixel()); // �ڽ�
        
    }

}
