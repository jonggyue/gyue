package ex1;
/**
 *
 * @author KOSTA 86기 김종규
 Document   : Ex3_ThreadSingle created on : 2014. 9. 22, 오전 11:19:45
 */
// -연습문제 : start는 다른 클래스와 공유해야될 자원이기 때문에 static으로
// 변겅하고 Thred가 tngodehlf dlfdmf Ex3_MyTread에게 담당시켜
// 사용해보자.
public class Ex3_ThreadSingle {
    public static long start;
    public static void main(String[] args) {
        Ex3_Sing sing = new Ex3_Sing();
        sing.start();
        start = System.currentTimeMillis();
        
        //------------Thread가 수행
//        for(int i =0; i<300; i++){
//            System.out.print("*");
//        }
//        System.out.println("");
        
//        System.out.println(System.currentTimeMillis()-start);
        // --------그대로
        for(int i =0; i<300; i++){
            System.out.print("X");
        }
        System.out.println("");
        System.out.println(System.currentTimeMillis()-start);
    }

}
