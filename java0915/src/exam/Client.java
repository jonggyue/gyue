
package exam;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : Client created on : 2014. 9. 15, ���� 12:15:11
 */
public class Client{

    public static void main(String[] args) {
        Animal[] ar = new Animal[3];
        ar[0] = new Bird();
        ar[1] = new Cat();
        ar[2] = new Dog();
        // instanceof : ������ ��ü�� �����ʿ� ����� Ŭ������ ����
        // ������ ��ü(�������踦 ������ ��ü������) ������ �����ִ� �����
        System.out.println(ar[0] instanceof Cat);
        
        for(Animal e : ar){
            e.cry();
        }
        Bird ref1 = new Bird();
        Animal2 ref2 = new Dog();
        Cat ref3 = new Cat();
        
        
    }
}
