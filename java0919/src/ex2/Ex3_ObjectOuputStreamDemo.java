package ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex3_ObjectOuputStreamDemo created on : 2014. 9. 19, ���� 11:24:41
 */
public class Ex3_ObjectOuputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        String path = "c:/kosta86/obj.txt";
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //������ ��ü ���� �� ������
        MemberVO v = new MemberVO();
        v.setName("��浿");
        v.setAge(30);
        v.setAddr("����");
        v.setTime(System.currentTimeMillis());
        v.setFlag(true);
        //��Ʈ���� ���ؼ� ��ü�� ���� (������ - ����ȭ)
        oos.writeObject(v);
        
        // ������ȭ�� �о� ����
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        // readObject�޼��带 ȣ���ؼ� �𸶼���(�� ����ȭ)
        MemberVO v1 = (MemberVO) ois.readObject();
        // ������ ��ü�� ���
        System.out.println("Name : "+ v1.getName());
        System.out.println("Age  : "+ v1.getAge());
        System.out.println("Addr : "+ v1.getAddr());
        System.out.println("Flag : "+ v1.isFlag());
        System.out.println("�ҿ�ð� :"+ (System.currentTimeMillis()- v1.getTime()));
        
        
    }

}
