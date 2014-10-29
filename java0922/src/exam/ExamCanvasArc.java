package exam;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author KOSTA 86기 김종규 Document : ExamCanvasArc created on : 2014. 9. 22, 오후
 * 3:41:21
 */
// 버튼을 클릭했을 때 arc을 0 ->10 도씩 증가해서 360만큼큼 그리시오.
// 즉 스레드 2개를 사용해서 웡늘 2개를 그리도록 한다.
public class ExamCanvasArc extends Frame {

    private Canvas can;
    private int x, y, angle, arcx, arcy;

    public ExamCanvasArc() {
        arcx=200;
        arcy=100;
        add(can = new Canvas() {

            @Override
            public void update(Graphics g) {
                paint(g);
            }

            @Override
            public void paint(Graphics g) {
                g.setColor(Color.red);
                g.fillOval(x, y, 1, 1);
                g.setColor(Color.blue);
                g.drawArc(arcx, arcy, 100, 100, 0, angle);

            }

        });
        can.setBackground(Color.white);
        can.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                 x = e.getX();
                y = e.getY();
                System.out.println(x+":"+y);
                
                can.repaint();
                if(angle == 0) {
                    new Thread() {

                        @Override
                        public void run() {
                            try {
                                for (angle = 0; angle <= 360; angle += 10) {
                                    Thread.sleep(100);
                                    can.repaint();
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                    }.start();
                }else{
                    angle =0;
                    arcx+=200;
                    if(arcx==800){
                       arcy+=200;
                       arcx=200;
                    }
                    
                }
                
            }
            
});

        setBounds(100, 200, 400, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ExamCanvasArc();
    }
}
