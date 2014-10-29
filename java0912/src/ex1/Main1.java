package ex1;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Main1 created on : 2014. 9. 12, 오전 10:22:50
 */
public class Main1 {
    public static void main(String[] args) {
        MP3Phone ref = new MP3Phone("아이폰6", "1000000", 2000 , 1000);
        System.out.println("모델명 : "+ref.model); //부모
        System.out.println("가격 : "+ref.getNumber()); //부모
        System.out.println("화음 : "+ref.getChord()); // 부모에 등록
        System.out.println("크기 : "+ref.getSize()); // 자식
    }

}
