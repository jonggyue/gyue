package exam;

import java.util.Scanner;
/**
 *
 * @author 1
 * Document   : Exam3 created on : 2014. 9. 3, ���� 4:04:21
 */
public class Exam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("���Է� : ");
        int num = Integer.parseInt(sc.nextLine());
        int range;
        while(true){
             System.out.print("�����Է�(3,5,7,9 �� �Է°���) : ");
             range = Integer.parseInt(sc.nextLine());
             if(range==3 || range==5 || range==7 || range==9){
                 break;
            }
             System.out.println("������ Ʋ���ϴ�. �ٽ��Է��ϼ���.");
        }
        for(int b= (num-(range/2)); b <= (num+(range/2)); b++){
                if(b>0){
                    System.out.print("----------------");
                }
            }
        System.out.println("");
        
        
        for(int a= (num-(range/2)); a <= (num+(range/2)); a++){
            if(a>0){
                System.out.print("    " + a + "��         ");
            }
            
        }
        System.out.println("");
         for(int b= (num-(range/2)); b <= (num+(range/2)); b++){
                if(b>0){
                    System.out.print("----------------");
                }
            }
        System.out.println("");
        for(int i = 1; i<=9; i++){
            for(int j= (num-(range/2)); j <= (num+(range/2)); j++){
                if(j>0){
                    System.out.print(j + " x " + i + " = " + (i*j)+ "\t");
                }
            }
            System.out.println("");
        }
        
    }
}