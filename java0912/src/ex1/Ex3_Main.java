package ex1;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex3_Main created on : 2014. 9. 12, ���� 10:51:23
 */
public class Ex3_Main {
    public static void main(String[] args) {
        // �ڽ��� �����ؼ� ��ü�� �����ϴ� ���
       Ex3_Sub ref1 = new Ex3_Sub("30��", "ȫ�浿", 3000);
       ref1.subMethod();
        System.out.println(ref1.superMethod());
        ref1.superCar(); // �ڽ��� superCar(); ȣ���̵�
        System.out.println("==========================");

     // �θ� �����ؼ� ��ü�� �����ϴ� ���
        Ex3_Super ref2 = new Ex3_Sub("45", "qq", 100);
        ref2.superCar();
        
    }
    

}
