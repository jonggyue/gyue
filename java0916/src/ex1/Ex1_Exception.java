package ex1;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex1_Exception created on : 2014. 9. 16, ���� 9:28:31
 */
/*
Exception: ������ �����̸� ���α׷������� ó���Ѵ�.
    -�Ϲ����� ���� : �������� �� �߻��ϴ� ����
        ��)I/O�� ������ �а��� �ϴµ� ����� ������ ���ٸ�...
    -���� �� ����
        ��)0���� ������ ���α׷� ��, ������ ���ڿ� ���ڸ� �ִ´ٴ� ��
            ������ �ÿ��� ���� �� �� ���� ����
ErEror : ġ������ �����̸� JVM�� �����Ͽ� ó���Ѵ�.

    ����ó��)
    Try{
        ���ܰ� �߻� ������ �����;
        ���๮;-���ܰ� �߻��Ǹ� ������ �ȵ� *****
    }catch(���ܰ�ü ������){
        ���� ���� �����;
    }
    
*/
public class Ex1_Exception {
    public static void main(String[] args) {
        // �迭�� ����� ������ �ʱ�ȭ�� �ѹ��� �� ����.(���� ����)
        int[] var = {10, 200, 30};
        int size = var.length;
        for(int i=0; i<=size; i++){
            // ���ܹ߻����� �迭�� �ε����� 3�� ã����
            // ArrayIndexOutOfBoundsException: 3
            // ����ó��
            try {
                System.out.println(var[i]); // i=3�϶� ������ �߻��ؼ�
                System.out.println("����"); // ���̻� ����x
            } catch (Exception e) {
                System.out.println("�迭�� ������ �Ѱ���ϴ�.");
            }
            //System.out.println(var[i]); 
        }
        System.out.println("���α׷� ����");
    }

}
