package ex1;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : Main1 created on : 2014. 9. 12, ���� 10:22:50
 */
public class Main1 {
    public static void main(String[] args) {
        MP3Phone ref = new MP3Phone("������6", "1000000", 2000 , 1000);
        System.out.println("�𵨸� : "+ref.model); //�θ�
        System.out.println("���� : "+ref.getNumber()); //�θ�
        System.out.println("ȭ�� : "+ref.getChord()); // �θ� ���
        System.out.println("ũ�� : "+ref.getSize()); // �ڽ�
    }

}
