package ex1;

/**
 *
 * @author KOSTA 86�� ������ Document : Home created on : 2014. 9. 11, ���� 10:02:54
 */
public class Home {
// call by reference ��
    private String doorColor;//�빮�� ���� : ������ ����
    // setter/getter�� ��� ĸ��ȭ

    public String getDoorColor() { // �빮���� Ȯ���ϵ��� ����
        return doorColor;
    }

    public void setDoorColor(String doorC) { // �빮���� �����ϵ��� ����
        doorColor = doorC; // doorC�� call by value
    }

}
