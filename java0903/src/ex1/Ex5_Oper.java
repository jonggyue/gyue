package ex1;
/**
 *
 * @author 1
 * Document   : Ex5_Oper created on : 2014. 9. 3, ���� 11:12:38
 */
public class Ex5_Oper {
    public static void main(String[] args) {
        //����Ʈ������ >>bit���� ���������� �̵�
        // ���ڸ��� ��ȣ������ ����
        //<<
        int a = 12; // 0000 1100
        int b = 2;  // 0000 0011 =>3
        int c = a>>b;
        System.out.println(c);
    }

}
