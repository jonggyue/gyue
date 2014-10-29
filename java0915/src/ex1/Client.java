package ex1;

/**
 *
 * @author KOSTA 86기 김종규 Document : Client created on : 2014. 9. 15, 오전 9:25:19
 */
public class Client {

    public static void main(String[] args) {
//        Animal animal;
//        animal = new Bird();
//        animal.cry();
//        
//        animal = new Cat();
//        animal.cry();
//
//        animal = new Dog();
//        animal.cry();
        // 배열 사용한 다형성 처리
        // 배열은 객체
        // - 일반자료형 배열, 참조자료형 배열
        // - 일차원 배열과 다차원 배열
        // - 배열은 생성시 반드시 크기가 결정되어야 한다.

        Animal[] ar = new Animal[3];
        ar[0] = new Bird();
        ar[1] = new Dog();
        ar[2] = new Cat();
        int size = ar.length;
        System.out.println("배열의 크기 : " + size);

        for (int i = 0; i < size; i++) {
            // 효율적인 코드를 사용하는 방법
            // i < ar.length를 쓰면 안되는이유
            // 배열은 그나마 괜찮은데 반복문이 진행하면서 계속 배열크기 계산
            // 메모리 낭비
            ar[i].cry();
        }
        System.out.println("=====================");
        // jdk5부터 향상된 for문을 제공
        // for(배열/컬렉션의객체 지역변수 : (in의 의미)변수명){
        for (Animal e : ar) {
            e.cry();
        }
    }

}
