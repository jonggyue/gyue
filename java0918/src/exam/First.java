package exam;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author KOSTA 86�� ������ Document : First created on : 2014. 9. 18, ���� 5:40:57
 */
public class First extends JFrame implements ActionListener {

    private JPanel p;// ������Ʈ�̸鼭 �����̳� ��ü
    private JButton btn; // ������Ʈ ��ư��ü
    private int i = 0;
    
            

    public First(int i) throws HeadlessException {
        p = new JPanel(); // JPanel ��ü�� ����
        this.i =i;

        p.add(btn = new JButton("view")); // ��ư����

        btn.addActionListener(this); // EventListener���

        add(p); //JFrame�� ����

        setBounds(100, 100, 300, 400); // âũ�� x,y,z,h
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        

    }

    public static void main(String[] args) {
        new First(0);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
         Second sec = new Second(p);
        i++;
        if (i % 2 == 1) { // ��ư�� �������� close, �� ������ view
            btn.setText("Close");
            sec.setVisible(true);
            

        } else if (i % 1 == 0) {
            btn.setText("view");
            sec.setVisible(false);
            
        }

    }

}
