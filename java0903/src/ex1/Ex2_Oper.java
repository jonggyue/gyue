package exam;
/**
 *&&: AND
�Ѵ� true �϶� true
�������� true�� ���� �������� �����ϸ�, �������� false�̸� �������� �������� �ʴ´�  
||: OR
���� �ϳ��� true�̸� true
�������� true�̸� �������� �������� ������ �������� false�� ?�� �������� �����Ѵ�.

 * @author 1
 * Document   : OperTest created on : 2014. 9. 3, ���� 10:44:42
 */
public class Ex2_Oper {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean c = ((a += 12) > b) || (a==(b+=2));
        System.out.println("c = "+c);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

}
