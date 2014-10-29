package ex2.vo;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : MemberVO created on : 2014. 9. 11, 오후 12:15:33
 */
// 레퍼런스1번이랑
// POJO : 순수한 값만을 가지는 객체를 생성 Value Object 
public class MemberVO {
    private int num;
    private String name, age, gender, tel;
    private boolean agree;

    //getter/setter
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public boolean isAgree() {
        return agree;
    }

    public void setAgree(boolean agree) {
        this.agree = agree;
    }
    
    
}
