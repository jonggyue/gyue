package ex2;

import ex2.vo.MemberVO;
import java.util.Scanner;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex2_Main1 created on : 2014. 9. 11, ���� 1:51:04
 */
public class Ex2_Main1 {
    public static void main(String[] args) {
        // UI
        Scanner sc = new Scanner(System.in);
        System.out.print("��ȣ �Է� : ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.print("�̸� �Է� : ");
        String name = sc.nextLine();
        System.out.print("���� �Է� : ");
        String age = sc.nextLine();
        System.out.print("���� �Է� : ");
        String gender = sc.nextLine();
        System.out.print("��ȭ��ȣ �Է� : ");
        String tel = sc.nextLine();
        
        // VO��ü�� �����Ѵ�,
        // ������� ���� ������ �� �� Ex2_CallByReference1��
        // info �� ���� �� ���̱� ������ ..
        MemberVO v = new MemberVO();
        v.setNum(num);
        v.setName(name);
        v.setAge(age);
        v.setGender(gender);
        v.setTel(tel);
        Ex2_CallByReference1 ref = new Ex2_CallByReference1();
        ref.info(v);
        // ���
        System.out.println("�Է��Ͻ� ����");
        System.out.println("��ȣ : "+ref.getVo().getNum());
        System.out.println("�̸� : "+ref.getVo().getName());
        System.out.println("���� : "+ref.getVo().getAge());
        System.out.println("���� : "+ref.getVo().getGender());
        System.out.println("��ȭ��ȣ : "+ref.getVo().getTel());
    }

}
