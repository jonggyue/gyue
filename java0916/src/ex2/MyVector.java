package ex2;

import java.util.Vector;

/**
 *
 * @author KOSTA 86�� ������ Document : MyVector created on : 2014. 9. 16, ����
 * 12:13:38
 */
public class MyVector {

    public static void main(String[] args) {
        // �÷����� �ڷᱸ���̰�, ��ü�� ������ ��!
        Vector v = new Vector();
        v.add(new String("Test"));
        v.add(10); // Integer
        v.add('A');
        v.add(true);
        v.add(3.14f); //Float
        v.add(100L); //Long
        System.out.println("������ ũ�� : " + v.size());

        for (Object e : v) {
            // Vector�� ����� �� ��ü�� �ڷ����� ������ �̸����� ����ϱ�
            if (e instanceof String) {
                System.out.println("String : " + e);
            } else if (e instanceof Character) {
                System.out.println("Character : " + e);
            } else if (e instanceof Integer) {
                System.out.println("Integer : " + e);
            } else if (e instanceof Float) {
                System.out.println("Float : " + e);
            } else if (e instanceof Double) {
                System.out.println("Double : " + e);
            } else if (e instanceof Long) {
                System.out.println("Long : " + e);
            } else if (e instanceof Short) {
                System.out.println("Short : " + e);
            }

            //System.out.println(e);
        }

    }

}
