package ex1;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex1_Robo created on : 2014. 9. 5, ���� 10:30:20
 *   Ŭ������ �����ϰ� ���� �ϴ� ���
 *   ���������� : public, default
 *   Class���� ��ù���ڴ� �׻� �빮�ڷ� �ۼ�, �ĺ��� ����Ģ
 *   main�޼���� �и��Ѵ�.
 */

public class Ex1_Robo {
    /**
     * power�� ������ ���� ����ϴ� �Ӽ�,
     * true�� ��������, false�� ��������
     */
    boolean power; //�߸��� �ڵ�: ����ʵ带 ���⼭ �����ϸ� �ٸ��ڵ忡�� �ߺ��� �Ͼ����
    /**
     * col�� �����̸�, ����, ��� ������ �����Ҷ� ����ϼ���.
     * 
     */
    String col;
    /**
     * @param num : �κ��� ���°����� 0���� ū���� ���۵ǵ��� �Ǿ�����
     * @return boolean ������ ����� �޾Ƽ� �˾Ƽ� �����Ͻÿ�.
     */
    public boolean move(int num){
        boolean res = false;
        if(num == 0){
            System.out.println("�κ��� ����ϴ�.");
        }else{
                System.out.println("�κ��� "+num+"�� �ӵ��ο����Դϴ�.");
                res = true;
        }
        return res;
    }
    //����ʵ��� power���� �����ִ� �޼���
    public boolean isPower(){
        return power;
    }
}
