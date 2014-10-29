package exam;

import java.util.Scanner;
/**
 *
 * @author 1
 * Document   : Exam3 created on : 2014. 9. 3, 오후 4:04:21
 */
public class Exam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단입력 : ");
        int num = Integer.parseInt(sc.nextLine());
        int range;
        while(true){
             System.out.print("범위입력(3,5,7,9 만 입력가능) : ");
             range = Integer.parseInt(sc.nextLine());
             if(range==3 || range==5 || range==7 || range==9){
                 break;
            }
             System.out.println("범위가 틀립니다. 다시입력하세요.");
        }
        for(int b= (num-(range/2)); b <= (num+(range/2)); b++){
                if(b>0){
                    System.out.print("----------------");
                }
            }
        System.out.println("");
        
        
        for(int a= (num-(range/2)); a <= (num+(range/2)); a++){
            if(a>0){
                System.out.print("    " + a + "단         ");
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