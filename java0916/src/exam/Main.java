package exam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KOSTA 86�� ������ Document : Main created on : 2014. 9. 16, ���� 4:17:44
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<MemberVO> str = new ArrayList<>(); // ArrayList����
        // Reference �� �����°� ����
        MemberReference ref = new MemberReference(); // ���۷����� �����Ͽ� ��ü����
        Scanner sc = new Scanner(System.in); 
        int i; // 1,2,3 select

        while (true) {

            System.out.print("1.ȸ�������Է�  2.ȸ������Ʈ���  3.���� : ");
            i = Integer.parseInt(sc.nextLine()); // ���Է�

            if (i == 1) {
                MemberVO vo = new MemberVO(); //VO�� �����Ͽ� ����
                System.out.print("ȸ����ȣ : ");
                vo.setNum(Integer.parseInt(sc.nextLine()));
                System.out.print("ȸ���̸� : ");
                vo.setName(sc.nextLine());
                System.out.print("ȸ���� ������ : ");
                vo.setWeight(Float.parseFloat(sc.nextLine()));
                System.out.print("ȸ���� ���ǿ��� : ");
                vo.setAgree(Boolean.parseBoolean(sc.nextLine()));
                System.out.print("ȸ���� �̸��� : ");
                vo.setEmail(sc.nextLine());
                System.out.print("���� : ");
                vo.setAge(Integer.parseInt(sc.nextLine()));
                if (vo.getAge() < 19) {
                    System.out.println("[�̼�����] /  ����  ");
                } else {
                    System.out.println(" �̼�����  / [����] ");
                }
                ref.info(vo); // ���۷����� info()�� VO�� this.vo = vo; ����

                str.add(vo); // nextLine()���� ���� ������ ArrayList�� ����

            }
            if (i == 2) {
                MemberVO vo = new MemberVO();
                for (MemberVO e : str) {
                    System.out.print("ȸ����ȣ : ");
                    System.out.println(e.getNum());
                    System.out.print("ȸ���̸� : ");
                    System.out.println(e.getName());
                    System.out.print("ȸ��? ������ : ");
                    System.out.println(e.getWeight());
                    System.out.print("ȸ���� ���ǿ��� : ");
                    System.out.println(e.isAgree());
                    System.out.print("ȸ���� �̸��� : ");
                    System.out.println(e.getEmail());
                    System.out.print("ȸ������ : ");
                    System.out.println(e.getAge());
                    if (vo.getAge() < 19) {
                        System.out.println("[�̼�����] /  ����  ");
                    } else {
                        System.out.println(" �̼�����  / [����] ");
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
