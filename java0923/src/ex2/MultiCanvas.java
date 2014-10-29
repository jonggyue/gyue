package ex2;

/**
 * @author kosta Document : MultiCanvas Created on : 2014. 9. 23, 오후 5:18:28
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiCanvas extends JFrame {
    // 컴포넌트 선언
    private JPanel p;
    private JButton btn1;
    private Canvas can;
    private int arcNum;
    private int arcNum2;
    // 쓰레드 선언
    private Thread t1, t2;
    //MyThread1,MyThread2 클래스의 값들을 getter/setter 사용
    public Thread getT1() {
        return t1;
    }
    

    public Canvas getCan() {
        return can;
    }

    public void setCan(Canvas can) {
        this.can = can;
    }

    public int getArcNum() {
        return arcNum;
    }

    public void setArcNum(int arcNum) {
        this.arcNum = arcNum;
    }

    public int getArcNum2() {
        return arcNum2;
    }

    public void setArcNum2(int arcNum2) {
        this.arcNum2 = arcNum2;
    }

    public MultiCanvas() throws InterruptedException {
        //다른 클래스에 있는 스레드를 불러옴
        t1 = new Thread(new MyThread1(MultiCanvas.this));
        t2 = new Thread(new MyThread2(MultiCanvas.this));
        //캔버스 생성
        can = new Canvas() {
            @Override
            public void paint(Graphics g) {
                g.drawArc(100, 100, 100, 100, 0, arcNum);
                g.drawArc(300, 100, 100, 100, 0, arcNum2);
            }

            @Override//화면을 지우고 paint(Graphics g)를 호출
            public void update(Graphics g) {
                paint(g);
            }
        };
        //컨포넌트들을 설정
        add(can);
        add(p = new JPanel(), "South");
        p.add(btn1 = new JButton("Click"));
        //버튼을 눌렀을때 동작
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                t1.start();

                t2.start();
            }
        });
        // 컨포넌트들을 설정
        setBounds(300, 100, 800, 400);
        setVisible(true); //활성화
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) throws InterruptedException {
        MultiCanvas ref = new MultiCanvas();// MultiCanvas()객체생성
    }
}
