package ex2;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex1_Abstract created on : 2014. 9. 12, ���� 12:00:48
 */

// �߻�޼��带 ���� Ŭ������ �ݵ�� �߻�Ŭ�������� �Ѵ�.
public abstract class Ex1_Abstract {
    private String money;

    public Ex1_Abstract() {
        money = "money";
    }
    
    // �߻� �޼��� : ���� �Űܶ�.
    abstract public void moveMount();
    // �Ϲ� �޼��� 
    public String getMoney() {
        return money;
    }
    

}
