package exam;

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

public class Second extends JFrame implements ActionListener {

   
    private JPanel p1,p; //������Ʈ�̸鼭 �����̳� ��ü
    private JButton btn1, btn2, btn3; // ������Ʈ ��ư��ü
    private int i ;

    public Second(JPanel p) throws HeadlessException {
        
        // JPanel ��ü�� ����
        p1 = new JPanel();
        this.p = p;

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
        
        
        // JFrame�� ���� 
        add(p1);

        // x,y,z,h
        setBounds(100, 100, 300, 400);
        // â����(x)�� ���α׷� ����(jdk 5)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        if(i!=0&&i%2 == 0){
            System.exit(0);
        }
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        

        JButton vv = (JButton) e.getSource();
        p.setBackground(vv.getBackground());

  

        

    }

}
