package ex2;

/**
 *
 * @author 1 Document : Ex2_if created on : 2014. 9. 3, 오전 11:15:53
 */
public class Ex6_If {

    public static void main(String[] args) {
        //if(조건) : true일?만 실행 하겠다.
        int su = 3;
        String msg;
//        if (su > 5) {
//            System.out.println("실행!");
//        }
        System.out.println("나도 if문의 가족이 되고 싶어요!");
        
        //조건과 나머지를 실행하겠다.
        if(su > 5){
            msg = "크다.";
        }
        else{
           msg = "작다"; 
        }
        System.out.println("결과 : "+msg);
    }

}
