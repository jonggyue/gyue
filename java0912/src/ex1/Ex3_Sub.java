package ex1;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex3_Sub created on : 2014. 9. 12, ���� 10:44:37
 */
public class Ex3_Sub extends Ex3_Super{
    private String age; //����

    public Ex3_Sub(String age, String msg, int num) {
        super(num, msg); // super�� �׻� �������� ȣ��Ǿ�� ��.
        this.age = age;
        
    }
    public void subMethod(){
        System.out.println("����� �ڽ��� �޼��� �Դϴ�.");
    }
    //������̼� : ���� ������ �ּ� / ���⼭�� JVM�� Override��� �ν�
    //Ű����..
    @Override
    public void superCar() {
        System.out.println("������ �ڵ���!");
    }
    

}
