//package ex2;
//
//import java.util.Scanner;
//
///**
// *
// * @author KOSTA 86기 김종규
// * Document   : Ex2_Main created on : 2014. 9. 11, 오전 11:29:04
// */
//public class Ex2_Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("번호 입력 : ");
//        int num = Integer.parseInt(sc.nextLine());
//        System.out.print("이름 입력 : ");
//        String name = sc.nextLine();
//        System.out.print("나이 입력 : ");
//        String age = sc.nextLine();
//        System.out.print("성별 입력 : ");
//        String gender = sc.nextLine();
//        System.out.print("전화번호 입력 : ");
//        String tel = sc.nextLine();
//        // 사용클래스생성
//        
//        Ex2_CallByReference1 ref = new Ex2_CallByReference1();
//        ref.info(num, name, age, gender, tel);
//
//        System.out.println("입력하신 정보 :");
//        System.out.println("번호 : "+ref.getNum());
//        System.out.println("이름 : "+ref.getName());
//        System.out.println("나이 : "+ref.getAge());
//        System.out.println("성별 : "+ref.getGender());
//        System.out.println("전화번호 : "+ref.getTel());
//    }
//}
