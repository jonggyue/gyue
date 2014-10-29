package ex1;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Ex2_Main created on : 2014. 9. 16, 오전 10:37:18
 */
public class Ex2_Main {
    Ex2_Throws et;
    public Ex2_Main(String m){
        et = new Ex2_Throws();
        try {
            et.setData(m);
        } catch (NumberFormatException e) {
            System.out.println("당신은 문자를 입력했습니다.");
            e.printStackTrace(); // 에러메세지 확인
        }
    }
    
    public static void main(String[] args) {
        Ex2_Main ref = new Ex2_Main("13");
    }
}
