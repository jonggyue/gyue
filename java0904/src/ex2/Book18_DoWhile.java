package ex2;

import java.util.Scanner;

/**
 *
 * @author KOSTA 86�� ������
 Document   : Book18_DoWhile created on : 2014. 9. 4, ���� 12:08:11
 */
public class Book18_DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selection;
        do{
            System.out.print("SeLect number : ");
            selection = Integer.parseInt(sc.nextLine());
            
            System.out.println("Your number is : "+ selection);
        }
        while(selection != 0);
    }
}
