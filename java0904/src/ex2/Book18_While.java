package ex2;
/**
 *
 * @author KOSTA 86기 김종규
 Document   : Book18_While created on : 2014. 9. 4, 오후 12:07:03
 */
public class Book18_While {
    public static void main(String[] args) {
        int total = 0;
        
        int number = 1;
        while ( number <= 10){
            total += number;
            number++;
        }
        System.out.println("total : "+ total);
    }
}
