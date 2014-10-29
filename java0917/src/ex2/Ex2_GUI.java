package ex2;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author KOSTA 86�� ������ Document : Ex2_GUI created on : 2014. 9. 17, ���� 1:44:13
 */
// 1.Event����
// 2.Event�� ���� �������̽��� ����
// 3.������ �߻�޼��带 �������ؼ��ؼ� ���� �����ϰ�
// 4.Event�� ����� ���ü���� ������(addXXListener(this))�� ���·� �ۼ�
// 5.�̿� ���� ����� ����Ŭ������ ���� �����ϴ�.
public class Ex2_GUI extends JFrame implements ActionListener {

    private JPanel p1, p2; //������Ʈ�̸鼭 �����̳� ��ü
    private JButton btn1, btn2, btn3; // ������Ʈ ��ư��ü
    private JLabel lb; // text�� �������� ǥ�� ������Ʈ ����ü

    public Ex2_GUI() throws HeadlessException {
        // JPanel ��ü�� ����
        p1 = new JPanel();
        p2 = new JPanel();
        // p1�� ��ܸ޴�, ��ư�� ����
        p1.add(btn1 = new JButton("Red"));
        p1.add(btn2 = new JButton("Green"));
        p1.add(btn3 = new JButton("Blue"));

        //EventListener�� ���
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        // ��ư�� ���� ����
        btn1.setBackground(Color.red);
        btn2.setBackground(Color.green);
        btn3.setBackground(Color.blue);
        // JFrame�� ���� - ����(North)
        add(p1, "North");
        // p2�� jLavel����, �̺�Ʈ�� ���� Text�� ���
        p2.add(lb = new JLabel("��"));

        // JFrame�� ���� - �⺻��(Center)
        add(p2);
        // x,y,z,h
        setBounds(100, 100, 300, 400);
        // â����(x)�� ���α׷� ����(jdk 5)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); // â�� Ȱ��ȭ
    }

    public static void main(String[] args) {
        new Ex2_GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object v = e.getSource();
        JButton vv = (JButton) e.getSource();
        String msg = "";
        if (v == btn1) {
            msg = "A";
        } else if (v == btn2) {
            msg = "B";
        }else if (v == btn3){
            msg = "C";
        }
        lb.setText(msg + "������ ������ ������ ���� ��� ��������.!");
        p2.setBackground(vv.getBackground());

    }

}
