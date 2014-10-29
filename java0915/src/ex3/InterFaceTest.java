
package ex3;

// interface 설계 : 인터페이느느 메뉴판처럼 상수와 추상메서드로
// 목록화 되어 있다.
public interface InterFaceTest {
    public static final int A = 100; // 상수
    int b = 200; // 상수
    public abstract int getA(); // 추상 메서드
    public int getB(); // abstract를 붙이지 않아도 인터페이스에서는 추상메서드로 인식
    
}
