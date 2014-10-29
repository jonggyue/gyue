package ex1;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : D_carPhone created on : 2014. 9. 12, 오전 9:45:26
 */
// 상속은 컴파일 단계에서 부모 클래스인 Ex1_Spuer와 결합된다.
// 자바에서 상속은 단일 상속이다.
public class D_carPhone extends Ex1_Super{
    private String pixel; // 화소수
    public D_carPhone(String model, String num, int chord, String pixel){
        this.pixel = pixel;
//        Ex1_Super ref = new Ex1_Super();
//        ref.model = model;
        
        // 부모의 자웡늘 참조 하기 위해서 super란 키워드를 사용
        super.model = model;
        // 부모의 자원이라고 해도 private는 접근이 불가능하다.
        //부모클래스에 정의된 메서드도 자신의 자원처럼 호출가능!
        setNumber(num);
        //this.chord = chord; // this도 부모의 자원을 자기자원으로 사용하지만
                             // 같은 클래스에 같은 이름이 있으면 자신을 것을 나타냄
        super.chord = chord;
    }



    // [연습문제] MP3Phone 클래스를 만들어서 Ex1_Super를 상속받고
    // 멤버필드에는 int size // 저장용량
    // 하나 두고 위와 같이 초기화 시키시오.
    // 즉, Ex1_Spuer는 자식 클래스에 재사용이 되는 부모 클래스로설계 되었다.
    public String getPixel() {
        return pixel;
    }
    
    
}
