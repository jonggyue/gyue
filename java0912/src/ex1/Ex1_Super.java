package ex1;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex1_Super created on : 2014. 9. 12, ���� 9:41:19
 */
/*
    has a : Ư�� ��ü ������ ������ �ٸ� ��ü�� �ּҸ� ������ �ִ� ���� �ǹ�
    is a : Ư�� ��ü�� �ٸ� ��ü���� �ڽ��� �ɷ��� ���Խ����ִ� ��� ���踦 �ǹ�
*/
public class Ex1_Super {
    String model; // ��
    private String number; // ��ȭ��ȣ
    int chord; // ȭ��

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getChord() {
        return chord;
    }
    
}