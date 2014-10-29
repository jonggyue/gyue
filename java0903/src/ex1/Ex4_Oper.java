package ex1;
/**
 *
 * @author 1
 * Document   : Ex4_Oper created on : 2014. 9. 3, 오전 11:09:07
 */
public class Ex4_Oper {
    public static void main(String[] args) {
        int a = 10; //1010
        int b = 7;  //0111 &연산  => 0010=2
        int c = a & b;
        System.out.println("변수 c : "+ c);
    }

}
