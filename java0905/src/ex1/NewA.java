package ex1;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : NewA created on : 2014. 9. 5, ���� 11:28:54
 */
public class NewA {
    public static void main(String[] args) {
        NewClass ref = new NewClass();
        ref.insertPay(1000, "dd");
        int pay = ref.getPay();
        int res = pay * 1000;
        System.out.println("����� �޿��� "+res+"�Դϴ�.");
        //�ڹٷ� �����Ҷ� �Ӽ��� private�� �⺻���μ����Ѵ�-Ŭ������ ���� ����ȭ
        
    }

}
