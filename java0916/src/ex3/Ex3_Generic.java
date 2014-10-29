package ex3;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author KOSTA 86�� ������ Document : Ex3_Generic created on : 2014. 9. 16, ����
 * 3:31:29
 */
// jdk 5���� ��ü���� ĳ���� ������ �ذ��ϱ� ���ؼ�
// �����÷����� ����
public class Ex3_Generic {

    public static void main(String[] args) {
        // Vector �� ArrayList ���̴� ����ȭ ���� ����! 
        // Vector �� ����ȭ�� ���� �ϴ� ���! ������ �ٸ� �κ����� ��ü����!
        // Generig -String�� ���� �� �ִ� ArrayList
        // jdk7���� ����� �伭;
        // ArrayList<String> str = new ArrayList<String>();
        ArrayList<String> str = new ArrayList<>();

        str.add("ok");
        str.add(String.valueOf(10));
        str.add(String.valueOf(3.14f));
        System.out.println(str.size());

        for (String e : str) {
            System.out.println(e);
        }
        System.out.println("");
        Iterator<String> it = str.iterator();

        while (it.hasNext()) {
            String string = it.next();
            System.out.println(string);
        }
        ArrayList<Integer> num = new ArrayList<>();
        num.add(Integer.parseInt("10"));
        System.out.println(num.get(0));
        
        //����>ArrayList����ϴ� ���ϱ�
        // ȸ�������� �����ϰ� �;��. �ٵ� ���׸����� ǥ���Ǹ�
        // ��� ���� �ٸ� �ڷ������� �־ ȸ�������� ������ �� ���� ���?
        //����ȭ��
        /* 1-ȸ�������Է�, 2-ȸ������Ʈ���, 3-���� : 1
            ȸ����ȣ(int):
            ȸ�����̸�(String):
            ȸ���� ������ (float) :
            ȸ���� ���ǿ��� (boolean) :
            ȸ���� �̸��� (String) :
            ���� : 18
            [�̼�����] / ����
        1-ȸ�������Է�, 2-ȸ������Ʈ���, 3-���� : 1
        �ݺ� �ؼ� 5�� ���� �߰� 
        1-ȸ�������Է�, 2-ȸ������Ʈ���, 3-���� : 2
        ȸ�� ��ȣ : 1
        �̸� : ȫ�浿
        ������ : 60.5 kg
        ���ǿ��� : false
        �̸��� : a@aa.com
        -------------------
        */
        
    }

}
