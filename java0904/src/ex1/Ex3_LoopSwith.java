package ex1;

import java.util.Scanner;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex3_LoopSwith created on : 2014. 9. 4, ���� 10:35:26
 */
public class Ex3_LoopSwith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //for���� �̿��� ���ѷ���
        xx:for(;;){
            System.out.print("������ �Է� :(R,G,B) ����� bye : ");
            String col = sc.nextLine();
            col = col.toLowerCase();//��ҹ��ں���
           // String res = "";
            switch(col){
                case "red" :
                    System.out.println("�������̳׿� ^^");
                    break;
                case "blue" :
                    System.out.println("�Ķ����̳׿� ^^");
                    break;
                case "bye" :
                    System.out.println("�����ϰ��������! ^^");
                    break xx;
            }

        }

            //System.out.println("����� �Է��� ������ " + res + "�Դϴ�.");
     }
}


