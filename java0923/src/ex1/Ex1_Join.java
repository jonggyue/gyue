package ex1;

/**
 *
 * @author KOSTA 86�� ������ Document : Ex1_Join created on : 2014. 9. 23, ����
 * 9:05:54
 */
// ���� �����尡 ������ ����ɶ� ���� �ٸ� �����尡 ��� �ϵ��� �����ϴ� �޼���
public class Ex1_Join {

    private static long startTime = 0;

    public static void main(String[] args) throws InterruptedException {
        Ex1_Thread1 t1 = new Ex1_Thread1();
        startTime = System.currentTimeMillis();
        t1.start();
        t1.join(); // t1�� �۾��� ������ ���� �ٸ� ������� ���
        Ex1_Thread2 t2 = new Ex1_Thread2();
        //***runnable�� �������̽��� Ŭ������ �߻�ż����� run�� ������ �ֱ⶧����
        //start()ȣ��x, run();�� ȣ���Ѵٴ°��� �����尡 �ƴ� ���ο��� run()�ϰڴٴ� ��
        //�ᱹ �����尡 �����Ϸ��� start�� ȣ��Ǿ����� ������ ������ ��������
        //runnable�������̽��� ������������ �����带 �����ؼ� ���ʺ��� �ּҸ� �־���Ѵ�
        Thread tt2 = new Thread(t2);
        tt2.start();
        tt2.join();
        System.out.println("�ɸ��ð� : " + (System.currentTimeMillis() - startTime));
    }
}
