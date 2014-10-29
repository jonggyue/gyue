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
public class Ex4_Runnable extends JFrame implements Runnable {

    JPanel p1, p2;
    private JButton btn1;
    private JTextArea res;
    private JLabel lb;
// 연습문제 : 사용자가 입력하는 시간을 체크해서
    // 10초안에 입력하도록 구현하시오
    // 단)입력을 했으면 카운트가 멈추도록 구현되어야함
    // 10초를 넘길경우 경고메세지가 출력!(2개의 스레드로 구현-메인제외)
    public Ex4_Runnable() {
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
                // Thread를 동작
                //                     this 주소값받아야하는데 내부클래스라서
                Thread t = new Thread(Ex4_Runnable.this);
                t.start();
                
                String input = JOptionPane.showInputDialog("값을 입력");
                res.append("입력하신값은 :" + input + "입니다.\n");
                t.stop();
//                for(int i=10; i>0; i--){
//                    try{
//                        res.append(String.valueOf(i+"\n"));
//                        res.repaint();
//                        Thread.sleep(1000);
//                    }catch(InterruptedException ex){
//                        ex.printStackTrace();
//                    }
//                    
//                    
//                }
            }
        });

    }

    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            try {
                res.append(String.valueOf(i + "\n"));
                res.repaint();
                Thread.sleep(1000);
                
                 
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }
        System.exit(0);

    }

    public static void main(String[] args) {
        new Ex4_Runnable();
    }

}
