package exam;

import java.util.Scanner;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : Exam1 created on : 2014. 9. 4, ���� 1:47:44
 */
public class Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ȧ ¦ �� �� [1-Ȧ, 2-¦, 3-����]");
        int total=0;//�����Ǽ�
        int win=0;//�¸�Ƚ��
        int winper;//�·�
        int num;
        String pre = "";//��������

        while(true){
            num = Integer.parseInt(sc.nextLine());
            String you="", cpu="";
            int cnum = (int) (Math.random() * 2 +1);
            
            
            if( cnum == 1 ){
                cpu = "Ȧ";
            } else if( cnum == 2 ){
                cpu = "¦";
            }
            
            if(num == 1){
                you = "Ȧ";
            }else if(num == 2){
                you = "¦";
            }else if(num == 3){
                break;
            }else{
                System.out.println("�߸��Է��Ͽ����ϴ�.  [1-Ȧ, 2-¦, 3-����]");
                continue;
            }
            total++;
            System.out.println("1-Ȧ, 2-¦, 3-���� : " + num);
            System.out.println("TOTAL : "+ total);
            System.out.println(" CPU  : "+ cpu);
            System.out.println(" YOU  : "+ you);
            
            printlin();
            
            if(num==cnum){
                win++;
                System.out.println("WIN "+win);
                System.out.println("[�¸��ϼ˽��ϴ�.]");
            }else{
                System.out.println("LOSE");
                System.out.println("[����� �����ϴ�.]");
            }
            printlin();

        }

        winper = winn(win,total);//(int) (((double)win/(double)total)*100);
        if(total>=10){
            if(winper>=100){
                pre = "�ι��� ������";
            }else if(winper>=90){
                pre = "����";
            }else if(winper>=80){
                pre = "�ҳ�Ÿ";
            }else if(winper>=70){
                pre = "��Ƽ��";
            }else if(winper>=60){
                pre = "������";
            }else{
                pre = "�����ϴ�.";
            }
        }else{
            pre = "�����ϴ�.";
        }
        
        System.out.println("�� �� �� ��");
        printlin();
        System.out.println("TOTAL : "+ total);
        System.out.println(" WIN  : "+win);
        System.out.println(" �·� : "+winper+"%");
        System.out.println(" ��ǰ : "+pre);
        condition();
        
 
    }
    public static int winn(int win, int total){
        int rate = (int) (((double)win/total) * 100);
        return rate;
        //�޼����� ��ȯ�� - ��Ȱ�� �ڷ������� ���
        //return �ڷ����� �´°�
        // int xx = winn(50,100);
    }
    private static void printlin() {
        System.out.println("-----------------");
    }
    private static void condition() {
        System.out.println("=================================");
        System.out.println("      ��ǰ����       10���̻�");
        System.out.println("  �·�   100%�̻� : �ι��� ������");
        System.out.println("  �·�   90%�̻�  : ����");
        System.out.println("  �·�   80%�̻�  : �ҳ�Ÿ");
        System.out.println("  �·�   70%�̻�  : ��Ƽ��");
        System.out.println("  �·�   60%�̻�  : ������");
    }
    public static String gift(int win){
        String pre="";
        return pre;
    }

}
