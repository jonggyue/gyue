package ex2;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Book17_IfElse created on : 2014. 9. 4, 오후 12:15:47
 */
public class Book17_IfElse {
    public static void main(String[] args) {
        System.out.println("compare(3, 5) : " + compare(3, 5));
        System.out.println("compare(5, 5) : " + compare(5, 5));
        System.out.println("compare(7, 2) : " + compare(7, 2));
    }
    
    private static int compare(int x, int y){
        if(x > y){
            return 1;
        } else if ( x < y){
            return -1;
        } else {
            return 0;
        }
    }
}
