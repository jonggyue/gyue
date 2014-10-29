package inner;

import exam.Animal2;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : LocalInner created on : 2014. 9. 15, ���� 2:44:52
 */
// ���ó���Ŭ���� : Ư�� �޼��� �ȿ��� ���ǵǴ� Ŭ����.
// ���������� ���� �����̶� �޼��尡 ȣ�� �� �� ��ü�� ������ �� �ְ�
// �޼����� ������ ������ ���������� ���� �ڵ����� �Ҹ��!
public class LocalInner extends Animal2{
    private int a = 100; // �������
    public void myMethod(int n){
        int b = 200; // �޼��� ���� ��������
        final int c = 300; // ���
        //Local����Ŭ����
        class Inner{
            public void getData(){
                // �ܺ�Ŭ������ �ڿ� ����!
                System.out.println("int a : "+a);
                // ���������� ���� ����(jdk8���� ����, jdk5,6,7�ȵ�)
                // jdk5~7������� �ݵ�� ���������� ����� �����ؾ� ��
                System.out.println("local int b : "+n);
            }
        }
        Inner i = new Inner();
        i.getData();
    }
    public static void main(String[] args) {
        LocalInner outer = new LocalInner();
        outer.myMethod(10);
    }

    @Override
    public String col() {
        return "���� Ŭ������ ����� �ڿ��� ������";
    }

}
