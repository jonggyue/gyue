package ex3;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex_Construtor created on : 2014. 9. 11, ���� 3:47:15
 */
public class Ex_Construtor {
    // �����ϴܰ� -> JVM����
    // �����ڰ� �����ڸ� �ٷ� ���� �ص��� ������ �����Ϸ���
    // �⺻�����ڸ� ���� �صд�.
    // �����ڴ� Ŭ������� ���� ��ȯ���� ����.
    // ����: ���� Ŭ������ �ʱ�ȭ ��Ű�°��� �����̴�.
    // �⺻������
//    public Ex_Construtor(){
//        
//    }
    private String msg;
    // ����� �ڿ��� �ʱ�ȭ �ϴ� ���� !!!!!!
    // ���ڰ��� �ִ� ������
    
    // ����Ŭ������ ���� ������ �� �ִ� ���,�޼���(setter),������ ��!
    public Ex_Construtor(String msg){
        this.msg = msg;
    } //�����ڰ� ��� ������ �����ڸ� �ϳ��� �����ϸ�
    //��, �����Ϸ��� �⺻�����ڸ� ����������ʴ´�.*****
    
    public static void main(String[] args) {
        //Ŭ������ ��ü�� ����
        Ex_Construtor ref = new Ex_Construtor("����");// ����
        ref.test(); // �޼��� ȣ��
        //�����ڴ� ������ ������ �ִ�
        
    }

    private void test() {
        System.out.println("�׽�Ʈ!!");
    }
}
