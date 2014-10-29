package ex1;

import java.util.HashSet;
import java.util.Iterator;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author KOSTA 86기 김종규 Document : Ex1_HashSet created on : 2014. 9. 17, 오전
 * 10:20:53
 */
// 중복을 허용하지 않는 구조이다.
public class Ex1_HashSet {

    public static void main(String[] args) {
        String[] str = {"Java", "Beans", "Java", "JSON"};

        HashSet<String> hs1 = new HashSet<>();
        for (String n : str) {
            hs1.add(n);
        }
        System.out.println("크기 : " + hs1.size()+", 배열의 크기 : "+str.length);
        for (String e : hs1) {
            System.out.println(e);
        }
        System.out.println("hs1 지움");
        hs1.removeAll(hs1);
        System.out.println("크기 : " + hs1.size());
        System.out.println("======================");
        HashSet<Integer> hs2 = new HashSet<>();
        int[] numr = {5,3,2,1,8,9,7,5,};
        for(int e : numr){
            hs2.add(e);
        }
        System.out.println("크기 : " +hs2.size()+", 배열의 크기 : "+numr.length);
        // 정렬도됨;
        Iterator<Integer> it = hs2.iterator();
        while(it.hasNext()){
            Integer integer = it.next();
            System.out.println(integer);
        }
    }
    
}
