package ex1;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex4_String created on : 2014. 9. 4, ���� 11:26:27
 */
public class Ex4_String {
    public static void main(String[] args) {
        String str = "AB";
        str+= "C";
        str+= "D";
        str+= "E";
        System.out.println(str);
        String msg1 = "Test";
        String msg2 = "Test";
        System.out.println(msg1==msg2);//�ּҰ� ��
        //msg1���� ��ü�� ���������� ���Ǯ(static��)�� �����Ǿ� ���������� ������� ȣ��
        //���� msg1�� msg2�� ���� �ּҰ��� ����
        System.out.println(msg1.equals(msg2));
    }

}
