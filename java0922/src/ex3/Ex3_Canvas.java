package ex3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex3_Canvas created on : 2014. 9. 22, ���� 2:44:34
 */
public class Ex3_Canvas extends JFrame{
    private Canvas can;
    private int x, y;
    public Ex3_Canvas(){
        // Canvas�� ����Ŭ������ �����ϱ�
        add(can = new Canvas(){
            // �׸��� �׸��� ���� �׷����� ��ҿ� �׷��ִ� ����
            
            @Override
            public void update(Graphics g) {
                paint(g);
            }

            @Override
            public void paint(Graphics g) {
                // �� �׷�����
                g.setColor(Color.pink);
                g.fillOval(x, y, 30, 30);
                g.setColor(Color.red);
                g.drawArc(200, 100, 100, 100, 0, 90);
            }
            
        });
        can.setBackground(Color.white);
        can.addMouseMotionListener(new MouseMotionAdapter() {
            // swing������ �׼��� ó���ϴ� �̺�Ʈ�� �����ϴ� �߻�޼��尡 �������϶���
            // �ʿ��Ѱ͸� ��� ����϶�� ���� Ŭ���� : �ƴ�ŸŬ����
            // �ƴ�Ÿ�� �߻�Ŭ�����̱� ������
            // empty�޼��带 ���� �س��� �̰��� ���, �͸���Ŭ����
            // �� ������ ���� �� �� ����ڰ� �ʿ��� �͸� ������ ����
            @Override
            public void mouseDragged(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                System.out.println(x+":"+y);
                // paint�� JVM�� ȣ�� - �׷��� ����� ����
                // repaint()�� ȣ��
                // ����) repaint() -> JVM -> update() -> paint();
                // update() : �⺻�� ĵ������ �����ִ� ����
                can.repaint();
            }

        });
        setBounds(100, 100, 400, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Ex3_Canvas();
    }
}
