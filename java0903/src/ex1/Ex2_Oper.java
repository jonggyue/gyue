package exam;
/**
 *&&: AND
둘다 true 일때 true
선조건이 true일 때만 후조건을 실행하며, 선조건이 false이면 후조건은 실행하지 않는다  
||: OR
둘중 하나라도 true이면 true
선조건이 true이면 후조건을 실행하지 않으며 선조건이 false일 ?만 후조건을 실행한다.

 * @author 1
 * Document   : OperTest created on : 2014. 9. 3, 오전 10:44:42
 */
public class Ex2_Oper {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean c = ((a += 12) > b) || (a==(b+=2));
        System.out.println("c = "+c);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

}
