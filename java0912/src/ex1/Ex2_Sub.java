package ex1;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Ex2_Sub created on : 2014. 9. 12, 오전 10:33:36
 */
public class Ex2_Sub extends Ex2_Super{
    // 상속받은 부모클래스의 기본생성자가 없을 때
    // 자식 클래스의 기본생성자가 있다면 super();가 생략되어 있기 때문에
    // 부모 클래스의 기본생성자를 호출하기 때문에 오류가 난다.
    // 아래처럼 해결 가능.
    public Ex2_Sub() {
        super(10);
    }

}
