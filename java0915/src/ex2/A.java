package ex2;

/**
 *
 * @author KOSTA 86기 김종규 Document : A created on : 2014. 9. 15, 오전 10:11:31
 */
// 추상클래스를 상속받으면 그 추상클래스가 가지고
// 있는 추상 메서드를 구현해야될 목적이 있다.
public class A extends Super {

    @Override //추상이라서 강제화되어있어 art + insert로는 추가 x
    // 옆에 전구로 추가했음
    public void draw(String msg) {
        System.out.println(msg + "를 그립니다.");
    }

}
