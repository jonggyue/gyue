package exam;

import java.util.Scanner;

/**
 *
 * @author 1
 * Document   : Exam1 created on : 2014. 9. 3, ���� 11:35:00
 */
public class Exam1 {
    public static void main(String[] args) {
        //Scanner�� ���� ���� �Է¹��� �� �� ���� Ȧ������ ¦�������� ����ϼ���.
        //�׼��� Ȧ������ ¦�������� ����ϼ���.
        // ex) �� �Է� 
        // �� ����� �Է� ���Ǽ���x
        
        String result;
        
        Scanner sc = new Scanner(System.in);
        //����ڷκ��� ���� �ޱ� ���� ���� ����� �޼��� ȣ��
        System.out.print("�� �Է� : ");
        int num = Integer.parseInt(sc.nextLine());
        //Ȧ������ ¦�������� �����ϱ� ���� ����� ��¹��� ������ ������ ����
        //�� ����Է������� ����
        if(num%2==1){
            result = "Ȧ��";
        }
        else{
            result = "¦��";
        }
        System.out.println("�Է��� �� [ " + num + " ] �� " + result + "�Դϴ�.");
        //�����丮���� �ߺ��� �����Ͽ� ȿ���� ����_�����Ҷ�
    }

}
