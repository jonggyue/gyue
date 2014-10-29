package ex2;

/**
 * @author kosta Document : MyThread1 Created on : 2014. 9. 23, ���� 5:19:04
 */
import java.awt.Canvas;

public class MyThread1 implements Runnable{

    private MultiCanvas myCan;
    //������ ����
    public MyThread1(MultiCanvas myCan) {
        this.myCan = myCan; //�ڱ��ڽ��� ȣ��
    }

    @Override // ������ ����
    public void run() {
        
        while (myCan.getArcNum() <= 380) {
            System.out.println("ù��° ������ ������" + myCan.getArcNum() + " " + Thread.currentThread().getName());
            System.out.println("arcNum2" + myCan.getArcNum2());
            try {
                Thread.sleep(500); // �����尡 �����Ҷ� 0.5�ʴ�����
            } catch (InterruptedException ex) {
                ex.printStackTrace(); // �����޼��� ���
                System.out.println("�߻�");
            }
            int tmpN = myCan.getArcNum();
            tmpN += tmpN + 10;
            myCan.setArcNum(tmpN);
            myCan.getCan().repaint(); //�����忡�� ȭ���� ������ ���� ��û, 0.1�ʸ��� Ȯ���ؼ� ��û�� ������ update()�� ȣ���Ѵ�.
        }
    }
}
