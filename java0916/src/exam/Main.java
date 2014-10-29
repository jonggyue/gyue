package exam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KOSTA 86기 김종규 Document : Main created on : 2014. 9. 16, 오후 4:17:44
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<MemberVO> str = new ArrayList<>(); // ArrayList생성
        // Reference 로 보내는게 옳음
        MemberReference ref = new MemberReference(); // 레퍼런스를 참조하여 객체생성
        Scanner sc = new Scanner(System.in); 
        int i; // 1,2,3 select

        while (true) {

            System.out.print("1.회원정보입력  2.회원리스트출력  3.종료 : ");
            i = Integer.parseInt(sc.nextLine()); // 수입력

            if (i == 1) {
                MemberVO vo = new MemberVO(); //VO를 참조하여 생성
                System.out.print("회원번호 : ");
                vo.setNum(Integer.parseInt(sc.nextLine()));
                System.out.print("회원이름 : ");
                vo.setName(sc.nextLine());
                System.out.print("회원의 몸무게 : ");
                vo.setWeight(Float.parseFloat(sc.nextLine()));
                System.out.print("회원의 동의여부 : ");
                vo.setAgree(Boolean.parseBoolean(sc.nextLine()));
                System.out.print("회원의 이메일 : ");
                vo.setEmail(sc.nextLine());
                System.out.print("나이 : ");
                vo.setAge(Integer.parseInt(sc.nextLine()));
                if (vo.getAge() < 19) {
                    System.out.println("[미성년자] /  성년  ");
                } else {
                    System.out.println(" 미성년자  / [성년] ");
                }
                ref.info(vo); // 레퍼런스의 info()는 VO에 this.vo = vo; 저장

                str.add(vo); // nextLine()으로 받은 값들을 ArrayList에 넣음

            }
            if (i == 2) {
                MemberVO vo = new MemberVO();
                for (MemberVO e : str) {
                    System.out.print("회원번호 : ");
                    System.out.println(e.getNum());
                    System.out.print("회원이름 : ");
                    System.out.println(e.getName());
                    System.out.print("회원? 몸무게 : ");
                    System.out.println(e.getWeight());
                    System.out.print("회원의 동의여부 : ");
                    System.out.println(e.isAgree());
                    System.out.print("회원의 이메일 : ");
                    System.out.println(e.getEmail());
                    System.out.print("회원나이 : ");
                    System.out.println(e.getAge());
                    if (vo.getAge() < 19) {
                        System.out.println("[미성년자] /  성년  ");
                    } else {
                        System.out.println(" 미성년자  / [성년] ");
                    }
                    System.out.println("===================");

                }
            }
            if (i == 3) {
                break;
            }

        }
    }

}
