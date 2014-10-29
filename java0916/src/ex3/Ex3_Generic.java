package ex3;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author KOSTA 86기 김종규 Document : Ex3_Generic created on : 2014. 9. 16, 오후
 * 3:31:29
 */
// jdk 5부터 객체간의 캐스팅 문제를 해결하기 위해서
// 전용컬렉션을 도입
public class Ex3_Generic {

    public static void main(String[] args) {
        // Vector 와 ArrayList 차이는 동기화 지원 여부! 
        // Vector 가 동기화를 지원 하는 기능! 있지만 다른 부분으로 대체가능!
        // Generig -String만 담을 수 있는 ArrayList
        // jdk7부터 변경된 요서;
        // ArrayList<String> str = new ArrayList<String>();
        ArrayList<String> str = new ArrayList<>();

        str.add("ok");
        str.add(String.valueOf(10));
        str.add(String.valueOf(3.14f));
        System.out.println(str.size());

        for (String e : str) {
            System.out.println(e);
        }
        System.out.println("");
        Iterator<String> it = str.iterator();

        while (it.hasNext()) {
            String string = it.next();
            System.out.println(string);
        }
        ArrayList<Integer> num = new ArrayList<>();
        num.add(Integer.parseInt("10"));
        System.out.println(num.get(0));
        
        //과제>ArrayList사용하다 보니까
        // 회원정보를 저장하고 싶어요. 근데 제네릭으로 표현되면
        // 어떻게 각기 다른 자료형들을 넣어서 회원정보에 저장할 수 있을 까요?
        //실행화면
        /* 1-회원정보입력, 2-회원리스트출력, 3-종료 : 1
            회원번호(int):
            회원의이름(String):
            회원의 몸무게 (float) :
            회원의 동의여부 (boolean) :
            회원의 이메일 (String) :
            나이 : 18
            [미성년자] / 성년
        1-회원정보입력, 2-회원리스트출력, 3-종료 : 1
        반복 해서 5명 정도 추가 
        1-회원정보입력, 2-회원리스트출력, 3-종료 : 2
        회원 번호 : 1
        이름 : 홍길동
        몸무게 : 60.5 kg
        동의여부 : false
        이메일 : a@aa.com
        -------------------
        */
        
    }

}
