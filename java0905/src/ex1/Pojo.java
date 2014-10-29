package ex1;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Pojo created on : 2014. 9. 5, 오전 11:46:44
 */
// POJO (순수한 값만을 가지는 객체)
// 상속 등 어디에도 귀속되지 않는 클래스
//기본생성자로 생성되는 클래스
//맴버필드는 은닉화 되고, 접근은 setter/getter로 캡슐화 시킨 클래스
public class Pojo {
    private int num;
    private String name;
    private boolean flag;
    // boolean만 geter가 isXX형식임 ***
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
