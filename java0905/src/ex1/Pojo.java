package ex1;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : Pojo created on : 2014. 9. 5, ���� 11:46:44
 */
// POJO (������ ������ ������ ��ü)
// ��� �� ��𿡵� �ͼӵ��� �ʴ� Ŭ����
//�⺻�����ڷ� �����Ǵ� Ŭ����
//�ɹ��ʵ�� ����ȭ �ǰ�, ������ setter/getter�� ĸ��ȭ ��Ų Ŭ����
public class Pojo {
    private int num;
    private String name;
    private boolean flag;
    // boolean�� geter�� isXX������ ***
    public boolean isFlag(){
        return flag;
    }
    public void setFlag(boolean flag){
        this.flag = flag;
    }
    
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    
     public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
