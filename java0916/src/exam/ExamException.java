package exam;

import java.util.Scanner;

/**
 *
 * @author KOSTA 86�� ������ Document : ExamException created on : 2014. 9. 16, ����
 * 9:45:13
 */
public class ExamException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�� �Է� : ");

        try {
            // ���� �߻� �Ҽ��ִ� ���� ������ �ۼ� �ؾ��Ѵ�.
            int num = Integer.parseInt(sc.nextLine());
            int com = (int) (Math.random() * 3); //0-2
            int res = num / com;
            System.out.println("�Է��� ��/������ ��");
            System.out.println("��°�� : " + res);
            System.out.println("�ڿ��ݳ�"); //���� ������ �۵�x�ϱ⶧���� �̷���ȵ�
        } catch (NumberFormatException e) {
            // ���ڰ� �ƴ� �ٸ� ���� �Է������� : NumberFormatException
            System.out.println("���ڸ� �Է��ϼ���.");
            // return; ������ ������ ĳġ�� �ڷδ� ���ϰ� ��ü���α׷�����
        } catch (ArithmeticException e) {
            //������ ���� 0�̵ǿ� �Է��� ��/0 ���� : ArithmeticException
            System.out.println("random�� 0 �Դϴ�.");
        } finally {//������ ����Ǳ⶧���� �ֿ� �����Է�;
            //catch���� return�̳� /  try���� �������� ���๮�尰���͵�
            System.out.println("�߿��ѰŸ�!!���⿡ �ۼ�");
        }
        System.out.println("���α׷� �ֿ� ���� "); // catch�� ������ ������ ���� �ȵ�

    }

}
