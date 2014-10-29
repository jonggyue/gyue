package ex1;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Main created on : 2014. 9. 12, 오전 10:16:01
 */
public class Main {
    public static void main(String[] args) {
        // 자식클래스를 참조로 한 객체 생성
        D_carPhone ref = new D_carPhone("겔노트3", "500000", 1000, "20px");
        System.out.println("모델명 : "+ref.model); //부모
        System.out.println("가격 : "+ref.getNumber()); //부모
        System.out.println("화음 : "+ref.getChord()); // 부모에 등록
        System.out.println("픽셀 : "+ref.getPixel()); // 자식
        
    }

}
