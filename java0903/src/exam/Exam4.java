package exam;

import java.util.Scanner;

/**
 *
 * @author 1 Document : Exam4 created on : 2014. 9. 3, ���� 4:04:21
 */
public class Exam4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�� �Է� : ");
        int dan = Integer.parseInt(sc.nextLine());
        System.out.print("���� �Է�(3,5,7,9) : ");
        int limit = Integer.parseInt(sc.nextLine());
        int start = dan - limit / 2;
        int end = dan + limit / 2;
        for (int i = 0; i <= 9; i++) {
            for (int j = start; j <= end; j++) {
                if (i == 0) {
                    System.out.print(j+"��\t\t");
		}else{
			if (j >= 0) {
                        System.out.print(j + " x " + i + " = " + (i * j) + "\t");
                    } else {
                        System.out.print("**********\t");
                    }
                }
            }
            System.out.println("");
        }
    }
}
    

