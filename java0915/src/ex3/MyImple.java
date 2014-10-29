package ex3;

/**
 *
 * @author KOSTA 86기 김종규 Document : MyImple created on : 2014. 9. 15, 오후
 * 12:10:44
 */
// 이렇게 다른 인터페이스들을 상속한 MyInter1_2를 구현하면
// 부모 인터페이스까지 모드 재정의 해서 구현해야 한다.

public class MyImple implements MyInter1_2 {

    @Override
    public int getdate() {
        return 100;
    }

    @Override
    public int getA() {
        return 200;
    }

    @Override
    public int getB() {
        return 300;
    }

}
