package ex2;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex2_CallByReference created on : 2014. 9. 11, ���� 11:23:42
 */
public class Ex2_CallByReference {
    // �������� : ���� Ŭ������ ��ȭ�� �������� ���� Ŭ������ ���谡 �Ǿ� �ִ�.
    // info�� �޼��忡�� �ڿ��� �߰��ؼ� ����ϱ� ���ؼ�
    // �޼����� ���ڰ��� �ÿ��� �ϰ�, ����ʵ� �� setter/getter�� �÷��� �Ѵ�.
    // private boolean agree�� �߰��ؼ� ����غ��� �˰���
    //POJO, CallByReference �� ������ ����ϸ� �ذ��
    
    // �ѻ���� ������ ���-��ȣ,�̸�,����,����,����
     private int num;
    private String name, age, gender, tel;
    
    public void info(int num, String name, String age, String gender, String tel){
    // this : ���簴ü�� �ּҰ� - ���������� ����ʵ尡
        // �̸��� ������ ���������� �켱������ �ֽ��ϴ�.***
        //�̷��� �����ϱ� ���ؼ� �̸��� �޸� �ְų�, this�� Ű���带
        //�ٿ��ָ�ȴ�. �������� ��ü�� �ּ�. ����ڿ�(this.num)�� ���·� ����
          this.num = num;
          this.name = name;
          this.age = age;
          this.gender = gender;
          this.tel = tel;
//        System.out.println("�Է��Ͻ� ���� :");
//        System.out.println("��ȣ : "+num);
//        System.out.println("�̸� : "+name);
//        System.out.println("���� : "+age);
//        System.out.println("���� : "+gender);
//        System.out.println("��ȭ��ȣ : "+tel);
        
    }

    // �޼��� �������� alt + insert Ű
    //
    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getTel() {
        return tel;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
}
