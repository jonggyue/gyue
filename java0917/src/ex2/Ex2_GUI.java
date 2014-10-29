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
 * @author KOSTA 86기 김종규 Document : Ex2_GUI created on : 2014. 9. 17, 오후 1:44:13
 */
// 1.Event결정
// 2.Event에 따른 인터페이스를 구현
// 3.구현된 추상메서드를 재정의해서해서 일을 정의하고
// 4.Event가 적용될 대상객체에게 감지자(addXXListener(this))의 형태로 작성
// 5.이와 같은 방법을 내부클래스로 정의 가능하다.
public class Ex2_GUI extends JFrame implements ActionListener {

    private JPanel p1, p2; //검포넌트이면서 컨테이너 객체
    private JButton btn1, btn2, btn3; // 컴포넌트 버튼객체
    private JLabel lb; // text나 아이콘을 표시 컴포넌트 ㄱ개체

    public Ex2_GUI() throws HeadlessException {
        // JPanel 객체를 생성
        p1 = new JPanel();
        p2 = new JPanel();
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
        // JFrame에 적재 - 위쪽(North)
        add(p1, "North");
        // p2는 jLavel적재, 이벤트에 따른 Text를 출력
        p2.add(lb = new JLabel("♥"));

        // JFrame에 적재 - 기본값(Center)
        add(p2);
        // x,y,z,h
        setBounds(100, 100, 300, 400);
        // 창종료(x)시 프로그램 종료(jdk 5)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); // 창을 활성화
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
        lb.setText(msg + "구역에 공격이 왔으니 총을 들고 대응하자.!");
        p2.setBackground(vv.getBackground());

    }

}
