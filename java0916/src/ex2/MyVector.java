package ex2;

import java.util.Vector;

/**
 *
 * @author KOSTA 86기 김종규 Document : MyVector created on : 2014. 9. 16, 오후
 * 12:13:38
 */
public class MyVector {

    public static void main(String[] args) {
        // 컬렉션은 자료구조이고, 객체만 저장이 됨!
        Vector v = new Vector();
        v.add(new String("Test"));
        v.add(10); // Integer
        v.add('A');
        v.add(true);
        v.add(3.14f); //Float
        v.add(100L); //Long
        System.out.println("벡터의 크기 : " + v.size());

        for (Object e : v) {
            // Vector에 저장된 각 객체의 자료형과 동일한 이름으로 출력하기
            if (e instanceof String) {
                System.out.println("String : " + e);
            } else if (e instanceof Character) {
                System.out.println("Character : " + e);
            } else if (e instanceof Integer) {
                System.out.println("Integer : " + e);
            } else if (e instanceof Float) {
                System.out.println("Float : " + e);
            } else if (e instanceof Double) {
                System.out.println("Double : " + e);
            } else if (e instanceof Long) {
                System.out.println("Long : " + e);
            } else if (e instanceof Short) {
                System.out.println("Short : " + e);
            }

            //System.out.println(e);
        }

    }

}
