package ex2;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex1_AbstractMain created on : 2014. 9. 12, ���� 12:04:33
 */
// �߻�Ŭ������ �߻�޼��尡 �ִٸ� �ݵ�� ������ �ؼ� ����ؾ� ���
// �޾Ƽ� �߻�Ŭ������ ������ �ִ� �ٸ� �ڿ�(���⼭�� 1000��)�� ����� ��
// �ִ�. ��, �߻��� �䱸������ ������ �ȴ�.
public class Ex1_AbstractMain extends Ex1_Abstract{

    @Override
    public void moveMount() {
        System.out.println("���� �Ű���"+getMoney()+"�޾��� ");
    }
    public static void main(String[] args) {
        //�θ� �����ؼ� ��ü�� ������ ��� (�ڽ��� �����Ѱ͵� �غ��� �ٶ�)
        Ex1_Abstract ref = new Ex1_AbstractMain();
        ref.moveMount(); //�θ��� �޼��带 ȣ�������� ������ (*****)��
        //�ڽ� �޼��尡 ȣ���� ��..
        //(����) �߻� Ŭ������ ���������� new�� �����ڷ� �����Ǿ
        // ���� �� ���� ������ �̿ϼ��� �߻�޼���� ���� �صθ�
        // �����ǵ� �ڽĿ� ���ؼ� �ϼ��̵Ǿ ����̵� **
        // 
    }
   

}
