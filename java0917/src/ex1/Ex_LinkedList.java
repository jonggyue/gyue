package ex1;

import java.util.LinkedList;

/**
 *
 * @author KOSTA 86�� ������ Document : Ex_LinkedList created on : 2014. 9. 17, ����
 * 11:21:30
 */
// jdk5���� �߰��� �������̽��� Queue �������̽� ������ Ŭ�����̴�.
// Deque extends Queue �̹Ƿ� �ᱹ Queue�� ������ Ŭ������
// ť����(First-In-First-Out)
// ���Լ��� - ����(offer() : ���޵� ��Ҹ� ������ ��ҷ� �߰��Ѵ�.)
//          - ����(poll() : ���� ù��° ��Ҹ� ��ȯ�� �����Ѵ�.)
// add() : ���������� ���޵� ��Ҹ� �߰��Ѵ�.
// peak() : ���� ù��° ��Ҹ� ��ȯ�Ѵ�. (������ ���� ����)
// ArrayList �� �������� �����͸� �о� �� �� �Ǵ� �������� �߰� ����
// �϶� ����
// Ex_LinkedList : �б� �ð��� ������, �߰� �����͸� �߰�/���� ������.
// �����Ͱ� ���� ���� ���ټ��� ��������.
public class Ex_LinkedList {

    public static void main(String[] args) {
        String[] item = {"K7", "SM7", "LF�ҳ�Ÿ"};
        LinkedList<String> q = new LinkedList<>();
        for (String n : item) {
            q.offer(n); // ��� �߰�
        }
        System.out.println("q�� ũ�� : " + q.size());
        //���� for������ ���-get(index) ���
        for (String e : q) {
            System.out.println(e);
        }
        System.out.println("q�� ũ��2 :" + q.size());
        String data = "";
        //�� �а� ���ﶧ ����
        while ((data = q.poll()) != null) {
            System.out.println(data + "����!");
        }
        System.out.println("q�� ũ��3 : " + q.size());
    }

}
