package ex2;

import java.io.Serializable;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : MemberVO created on : 2014. 9. 19, ���� 11:22:43
 */
public class MemberVO implements Serializable{
    private String name;
    // ����ȭ�� ���ܽ��Ѷ�~
    transient private String addr;
    private int age;
    private boolean flag;
    private long time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flas) {
        this.flag = flas;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
    

}
