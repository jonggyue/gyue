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
 * @author KOSTA 86기 김종규 Document : ContainerExample created on : 2014. 9. 15,
 * 오전 10:32:25
 */
// extends JFrame 는 가장 base, Container 인 객체이므로
// 상속으로 처리하는것이 바람직하다.
// 인터페이스는 다중 구현이 가능하다.
public class ContainerExample extends JFrame implements InterFaceTest, MsgBank {

    private JPanel p, p2;
    private JButton btn;
    private JLabel lb;

    public ContainerExample() {
        // 패널 생성
        p = new JPanel();
        p2 = new JPanel();
        // 자바에서는 다중상속이 안되기 때문에.. 기존 Animal을 사용하거나
        // 재정의 해서 사용한다.
        String msg = new Animal().msg("클릭");
        // 재정의 하기 위한 내부익명클래스로 사용
        Animal ani = new Animal() {

            @Override
            public String msg(String msg) {
                return " [하트] " + msg;
            }

        };
        p.add(btn = new JButton(msg));
        add(p, "North");
        // p2 적용
        p2.add(lb = new JLabel("임시내용"));
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
// interFaceTest 인터페이스를 재정의

    @Override
    public int getA() {
        return A;
    }

    @Override
    public int getB() {
        return b;
    }

    // MyBank 인터페이스를 재정의
    @Override
    public String printMsg(String msg) {
        return "My Msg" + msg;
    }

}
