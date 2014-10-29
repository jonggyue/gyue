
package exam;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Client created on : 2014. 9. 15, 오후 12:15:11
 */
public class Client{

    public static void main(String[] args) {
        Animal[] ar = new Animal[3];
        ar[0] = new Bird();
        ar[1] = new Cat();
        ar[2] = new Dog();
        // instanceof : 왼쪽의 객체가 오른쪽에 명시한 클래스로 부터
        // 생성된 객체(가족관계를 가지는 객체인지를) 인지를 비교해주는 예약어
        System.out.println(ar[0] instanceof Cat);
        
        for(Animal e : ar){
            e.cry();
        }
        Bird ref1 = new Bird();
        Animal2 ref2 = new Dog();
        Cat ref3 = new Cat();
        
        
    }
}
