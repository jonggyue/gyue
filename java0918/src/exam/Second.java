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
 * @author KOSTA 86기 김종규 Document : Ex2_GUI created on : 2014. 9. 17, 오후 1:44:13
 */

public class Second extends JFrame implements ActionListener {

   
    private JPanel p1,p; //컴포넌트이면서 컨테이너 객체
    private JButton btn1, btn2, btn3; // 컴포넌트 버튼객체
    private int i ;

    public Second(JPanel p) throws HeadlessException {
        
        // JPanel 객체를 생성
        p1 = new JPanel();
        this.p = p;

        // p1은 상단메뉴, 버튼을 적재
        p1.add(btn1 = new JButton("Red"));
        p1.add(btn2 = new JButton("Green"));
        p1.add(btn3 = new JButton("Blue"));

        //EventListener를 등록
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        // 버튼의 색상 지정
        btn1.setBackground(Color.red);
        btn2.setBackground(Color.green);
        btn3.setBackground(Color.blue);
        
        
        // JFrame에 적재 
        add(p1);

        // x,y,z,h
        setBounds(100, 100, 300, 400);
        // 창종료(x)시 프로그램 종료(jdk 5)
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
