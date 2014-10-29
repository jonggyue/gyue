package ex1;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : NewA created on : 2014. 9. 5, 오전 11:28:54
 */
public class NewA {
    public static void main(String[] args) {
        NewClass ref = new NewClass();
        ref.insertPay(1000, "dd");
        int pay = ref.getPay();
        int res = pay * 1000;
        System.out.println("당신의 급여는 "+res+"입니다.");
        //자바로 설계할때 속성은 private로 기본으로설정한다-클래스의 정보 은닉화
        
    }

}
