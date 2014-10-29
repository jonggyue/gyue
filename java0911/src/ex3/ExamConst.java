package ex3;

import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author KOSTA 86기 김종규
 * Document   : ExamConst created on : 2014. 9. 11, 오후 3:59:10
 */
public class ExamConst {
    private String name;
    private int age;
    private String date; // 현재날짜...

    // 생성자를 사용해서 값을 초기화 하기
    // 두개 따로 만든 이유 : 생성자의 오버로딩; 다양한 형태의 초기값을
    // 같는 객체를 생성하기 위함
    public ExamConst(String name) {
        this.name = name;
        age = 19;
        // 익명으로 객체를 생성해서 사용하는 방법의 예
        date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
//        원래는 이렇게 지만 한번만 쓰고 버릴 것들은 익명으로
//        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
//        Date d = new Date();
//        date = f.format(d);
    }
    public ExamConst(int age) {
        this.age = age;
        name = "Guest";
    }

    public ExamConst(String name, int age) {
        this.name = name;
        this.age = age;
        date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }
    
    
    
    // 재사용이 가능하도록 설계 해보고, 모든 값은 생성자를
    // 통해서 값을 초기화 시켜 보자.
    public boolean insert(){
        if(age > 19){
            System.out.println(name+"님 통과");
            return true;
        }else{
            System.out.println(name+"님 접근금지!");
            return false;
        }
    }

}
