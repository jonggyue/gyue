package inner;



/**
 *
 * @author KOSTA 86기 김종규
 * Document   : MemberInner created on : 2014. 9. 15, 오후 2:05:23
 */
// 내부클래스 : 특정클래스 안에 또 다른 클래스가 정의 되는 것을 의미한다.
// 종류 : 멤버, 로컬, static, 익명
// 
public class MemberInner {
    private int a = 10;
    private int b;
    private int c;

    public MemberInner() {
        b = 100;
        c = 200;
    }
    // 멤버 내부클래스를 정의
    public class Inner{
        public void printData(){
            System.out.println("외부클래스의 private접근"+a);
            System.out.println("외부클래스의 private접근"+b);
            System.out.println("외부클래스의 private접근"+c);
        }
    }
    
    //내부클래스 생성 및 접근
    public static void main(String[] args) {
        // 외부클래스를 생성한다.
        MemberInner outer = new MemberInner();
        // 외부클래스의 주소를 통해서 내부클래스를 생성 및 접근
        MemberInner.Inner inner = outer.new Inner();
        inner.printData();
        
        
        // 연습문제.. 축약시켜보기 두줄로
        MemberInner.Inner inner2 = new MemberInner().new Inner();
        inner2.printData();
    }

}
