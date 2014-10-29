package ex1;

/**
 *
 * @author KOSTA 86기 김종규 Document : PaintA created on : 2014. 9. 11, 오전 10:03:20
 */
public class PaintA {

    // 사용자가 호출시에 Home의 주소값과 주문한 색상값을 호출할 수 있도록
    // 정의 한다.
    // 전달받은 home의 주소에서 setDoorColor란 자원을 꺼내서 가공한다.

    public void paintHome(Home home, String col) {
        System.out.println("A회사");
        home.setDoorColor(col);
    }

}
