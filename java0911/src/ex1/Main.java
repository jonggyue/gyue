package ex1;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Main created on : 2014. 9. 11, 오전 10:03:36
 */
public class Main {
    public static void main(String[] args) {
        //객체생성, static메서드가 아님으로 생성해야됨
        Home ref = new Home();
        PaintA a = new PaintA();
        PaintB b = new PaintB();
        
        ref.setDoorColor("초록색");
        System.out.println("원래 대문 색상 : "+ref.getDoorColor());
        //CallByReference는 인자 호출시 객체의 주소값을 전달
        a.paintHome(ref, "주황색");// 시공사 A
        b.paintHome(ref, "검은색");// 시공사 B 모두 같은 주소를 보고 있다.
        System.out.println("현재 대문 색상 : " +ref.getDoorColor());// 마지막 시공한 색상 출력
    }

}
