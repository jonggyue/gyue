package ex3;

import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author KOSTA 86�� ������
 * Document   : ExamConst created on : 2014. 9. 11, ���� 3:59:10
 */
public class ExamConst {
    private String name;
    private int age;
    private String date; // ���糯¥...

    // �����ڸ� ����ؼ� ���� �ʱ�ȭ �ϱ�
    // �ΰ� ���� ���� ���� : �������� �����ε�; �پ��� ������ �ʱⰪ��
    // ���� ��ü�� �����ϱ� ����
    public ExamConst(String name) {
        this.name = name;
        age = 19;
        // �͸����� ��ü�� �����ؼ� ����ϴ� ����� ��
        date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
//        ������ �̷��� ���� �ѹ��� ���� ���� �͵��� �͸�����
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
    
    
    
    // ������ �����ϵ��� ���� �غ���, ��� ���� �����ڸ�
    // ���ؼ� ���� �ʱ�ȭ ���� ����.
    public boolean insert(){
        if(age > 19){
            System.out.println(name+"�� ���");
            return true;
        }else{
            System.out.println(name+"�� ���ٱ���!");
            return false;
        }
    }

}
