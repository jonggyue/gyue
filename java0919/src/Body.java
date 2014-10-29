
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : Body created on : 2014. 9. 19, ���� 9:08:38
 */
public class Body extends JFrame {
    private JPanel jp1, jp2;
    private JButton btn1;
    private Menu menu;
    //Menu���� �����ؼ� ������ �����ϱ� ����
    //JPanel���� �ּҸ� getter�� �����Ѵ�
    public JPanel getJp1(){
        return jp1;
    }
    public JPanel getJp2(){
        return jp2;
    }
    
    
    public Body(){
        menu = new Menu(this);
        menu.setVisible(false);
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp1.add(btn1 = new JButton("View"));
        btn1.setBackground(Color.BLUE);
        btn1.setForeground(Color.WHITE);
        add(jp1,"North");
        add(jp2);
        setBounds(300, 200, 300, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);       
        setVisible(true);
        
        //�������̽����� ����Ŭ������ ����
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(menu.isVisible()){
                    btn1.setText("Close");
                    btn1.setBackground(Color.red);
                    menu.setVisible(false);
                }else{
                    btn1.setText("View");
                    btn1.setBackground(Color.blue);
                    menu.setVisible(true);
                }
            }
        });
    }
    public static void main(String[] args) {
        new Body();
    }

}
