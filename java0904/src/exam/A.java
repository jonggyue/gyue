package exam;

import java.util.Scanner;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : A created on : 2014. 9. 4, ���� 4:22:07
 */
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�� Ƚ���� �Է��Ͻÿ� : ");
        int total = Integer.parseInt(sc.nextLine());
        System.out.print("���ǿ� �����ϴ� Ƚ���� �Է��Ͻÿ� : ");
        int count = Integer.parseInt(sc.nextLine());
        int res = ExamGame.winn(count, total);
        System.out.println("�����ϴ� Ȯ�� : "+ res + "%");
    }
}
