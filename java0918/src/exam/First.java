package exam;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author KOSTA 86기 김종규 Document : First created on : 2014. 9. 18, 오후 5:40:57
 */
public class First extends JFrame implements ActionListener {

    private JPanel p;// 컴포넌트이면서 컨테이너 객체
    private JButton btn; // 컴포넌트 버튼객체
    private int i = 0;
    
            

    public First(int i) throws HeadlessException {
        p = new JPanel(); // JPanel 객체를 생성
        this.i =i;

        p.add(btn = new JButton("view")); // 버튼적재

        btn.addActionListener(this); // EventListener등록

        add(p); //JFrame에 적재

        setBounds(100, 100, 300, 400); // 창크기 x,y,z,h
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
        if (i % 2 == 1) { // 버튼을 눌렀을때 close, 또 누르면 view
            btn.setText("Close");
            sec.setVisible(true);
            

        } else if (i % 1 == 0) {
            btn.setText("view");
            sec.setVisible(false);
            
        }

    }

}
