package ex1;
/**
 *
 * @author 1
 * Document   : Ex5_Oper created on : 2014. 9. 3, 오전 11:12:38
 */
public class Ex5_Oper {
    public static void main(String[] args) {
        //시피트연산자 >>bit값을 오른쪽으로 이동
        // 빈자리는 부호값으로 대입
        //<<
        int a = 12; // 0000 1100
        int b = 2;  // 0000 0011 =>3
        int c = a>>b;
        System.out.println(c);
    }

}
