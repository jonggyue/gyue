package ex3;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Main created on : 2014. 9. 11, 오후 4:17:50
 */
public class Main {
    public static void main(String[] args) {
        ExamConst ref = new ExamConst("김길동");
        if(!ref.insert()){
            System.out.println("여기는 성인만 입장합니다.^^");
        }
        ExamConst ref1 = new ExamConst(20);
        if(!ref1.insert()){
            System.out.println("여기는 성인만 입장합니다.^^");
        }else{
            System.out.println("축하합니다. 당신은 입장가능합니다.");
        }
    }

}
