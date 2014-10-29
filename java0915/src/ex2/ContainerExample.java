package ex2;

import ex1.Animal;
import ex3.InterFaceTest;
import ex3.MsgBank;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author KOSTA 86�� ������ Document : ContainerExample created on : 2014. 9. 15,
 * ���� 10:32:25
 */
// extends JFrame �� ���� base, Container �� ��ü�̹Ƿ�
// ������� ó���ϴ°��� �ٶ����ϴ�.
// �������̽��� ���� ������ �����ϴ�.
public class ContainerExample extends JFrame implements InterFaceTest, MsgBank {

    private JPanel p, p2;
    private JButton btn;
    private JLabel lb;

    public ContainerExample() {
        // �г� ����
        p = new JPanel();
        p2 = new JPanel();
        // �ڹٿ����� ���߻���� �ȵǱ� ������.. ���� Animal�� ����ϰų�
        // ������ �ؼ� ����Ѵ�.
        String msg = new Animal().msg("Ŭ��");
        // ������ �ϱ� ���� �����͸�Ŭ������ ���
        Animal ani = new Animal() {

            @Override
            public String msg(String msg) {
                return " [��Ʈ] " + msg;
            }

        };
        p.add(btn = new JButton(msg));
        add(p, "North");
        // p2 ����
        p2.add(lb = new JLabel("�ӽó���"));
        p2.setBackground(Color.PINK);
        add(p2);
        setLocation(100, 200);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ContainerExample();
    }
// interFaceTest �������̽��� ������

    @Override
    public int getA() {
        return A;
    }

    @Override
    public int getB() {
        return b;
    }

    // MyBank �������̽��� ������
    @Override
    public String printMsg(String msg) {
        return "My Msg" + msg;
    }

}
