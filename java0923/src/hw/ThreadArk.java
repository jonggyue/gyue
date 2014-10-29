package hw;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author KOSTA 86기 김종규
 * Document   : ThreadArk created on : 2014. 9. 23, 오후 4:47:15
 */
public class ThreadArk extends JFrame{
    private JPanel p1;
    private JButton btn;
    private Canvas can;
     Thread1 t1 = new Thread1();
                Thread2 t2 = new Thread2();
    public ThreadArk(){
        p1 = new JPanel();
        p1.add(btn = new JButton("Click"));
        add(p1, "South");
        setBounds(200, 200, 800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
                
                add(can = new Canvas(){

                    @Override // 화면을 지우고, paint(Graphics g)를 호출
                    public void update(Graphics g) {
                        paint(g);
                    }

                    @Override
                    public void paint(Graphics g) {
                        g.setColor(Color.red);
                        g.drawArc(200, 200, 100, 100, 0, t1.angle1);
                        g.drawArc(400, 200, 100, 100, 0, t2.angle2);
                        can.repaint();// 화면을 지우고 paint(Graphics g)를 호출
                    }
                   
                 
                });
                can.setBackground(Color.white);
                can.setBounds(0, 0, 800, 500);
                can.setVisible(true);
                t1.start();
                try {
                    t1.join();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                
                t2.start();
            }
        });
    }
    public static void main(String[] args) {
        new ThreadArk();
    }


}
