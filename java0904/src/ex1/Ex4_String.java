package ex1;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Ex4_String created on : 2014. 9. 4, 오전 11:26:27
 */
public class Ex4_String {
    public static void main(String[] args) {
        String str = "AB";
        str+= "C";
        str+= "D";
        str+= "E";
        System.out.println(str);
        String msg1 = "Test";
        String msg2 = "Test";
        System.out.println(msg1==msg2);//주소값 비교
        //msg1에서 객체를 생성했을때 상수풀(static임)에 생성되어 힙영역으로 가지고옴 호출
        //따라서 msg1과 msg2는 같은 주소값을 가짐
        System.out.println(msg1.equals(msg2));
    }

}
