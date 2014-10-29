package ex1;
/**
 *
 * @author 1
 * Document   : Ex8_For created on : 2014. 9. 3, 오후 2:09:41
 */
public class Ex8_For {
    public static void main(String[] args) {
        loopFor();
    }

    private static void loopFor() {
        // 초기식, 초기화 등 =>일생동안 딱 한번의 의미
        // for(초기식; 조건식; 증감식){
        // 실행문;
        // }
        
        //초기식의 변수 i의값이 0이 할당
        for(int i=0; i<10; i++){
            System.out.println(i+ " ");
        }
    }

}
