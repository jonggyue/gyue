package ex3;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Ex_Construtor created on : 2014. 9. 11, 오후 3:47:15
 */
public class Ex_Construtor {
    // 컴파일단계 -> JVM실행
    // 개발자가 생성자를 다로 정의 해두지 않으면 컴파일러가
    // 기본생성자를 정의 해둔다.
    // 생성자는 클래스명과 같고 반환형이 없다.
    // 목적: 현재 클래스를 초기화 시키는것이 목적이다.
    // 기본생성자
//    public Ex_Construtor(){
//        
//    }
    private String msg;
    // 멤버의 자원을 초기화 하는 목적 !!!!!!
    // 인자값이 있는 생성자
    
    // 현재클래스에 값을 주입할 수 있는 방법,메서드(setter),생성자 뿐!
    public Ex_Construtor(String msg){
        this.msg = msg;
    } //개발자가 어떠한 종류의 생성자를 하나라도 정의하면
    //즉, 컴파일러는 기본생성자를 만들어주지않는다.*****
    
    public static void main(String[] args) {
        //클래스를 객체로 생성
        Ex_Construtor ref = new Ex_Construtor("하이");// 생성
        ref.test(); // 메서드 호출
        //생성자는 보이지 않지만 있다
        
    }

    private void test() {
        System.out.println("테스트!!");
    }
}
