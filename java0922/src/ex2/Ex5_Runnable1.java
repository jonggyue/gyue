package ex2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author KOSTA 86기 김종규 Document : Ex4_Runnable created on : 2014. 9. 22, 오전
 * 11:45:02
 */
public class Ex5_Runnable1 extends JFrame {

    JPanel p1, p2;
    private JButton btn1;
    private JTextArea res;
    private JLabel lb;
// 연습문제 : 사용자가 입력하는 시간을 체크해서
    // 10초안에 입력하도록 구현하시오
    // 단)입력을 했으면 카운트가 멈추도록 구현되어야함
    // 10초를 넘길경우 경고메세지가 출력!(2개의 스레드로 구현-메인제외)
    private static boolean inputCheck;

    public Ex5_Runnable1() {
        setTitle("단일 스레드 테스트");
        p1 = new JPanel();
        p1.add(btn1 = new JButton("Click"));
        p1.add(lb = new JLabel("10"));
        add(p1, "North");
        p2 = new JPanel();
        res = new JTextArea(20, 50);
        p2.add(res);
        add(p2);
        setBounds(200, 200, 600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                res.setText("");
                new Thread() {

                    @Override
                    public void run() {
                        String input = JOptionPane.showInputDialog("값을 입력");
                        inputCheck = true;
                        res.append("입력하신값은 :" + input + "입니다.\n");

                    }

                }.start();
                new Thread() {

                    @Override
                    public void run() {
                        for (int i = 10; i > 0; i--) {
                            try {
                                if (inputCheck) {
                                    lb.setText("Good Job");
                                    inputCheck = false;
                                    return;
                                }
                                lb.setText(String.valueOf(i));
                                Thread.sleep(1000);

                            } catch (Exception e) {
                            }
                        }
                        JOptionPane.showMessageDialog(Ex5_Runnable1.this, "10초동안 입력했어야 합니다.");

                        System.exit(0);
                    }

                }.start();

            }
        });

    }

    public static void main(String[] args) {
        new Ex5_Runnable1();
    }

}
