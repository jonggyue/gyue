package ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author KOSTA 86기 김종규 Document : Ex3_Map created on : 2014. 9. 17, 오전
 * 11:55:52
 */
// HashMap : 동기화를 지우하지 않고 null허용
public class Ex3_Map {
    
    public static void main(String[] args) {
        String[] msg = {"Test1", "Test2", "test3"};
        // key, value : key는 set구조 이기 때문에 중복을 허용하지 않음
        HashMap<Integer, String> map = new HashMap<>();
        int size = msg.length;
        for (int i = 0; i < size; i++) {
            map.put(i, msg[i]);
        }
        System.out.println("Map의 사이즈 : " + map.size());
        // 맵에서 출력
        // Key값을 저장 후 출력
        Set<Integer> keys = map.keySet();
        for (Integer e : keys) {
            // 맵에서 get(key)를 사용해서 value를 확득
            System.out.println(map.get(e));
        }
        // Entry : 키와 값으로 객체의 순서를 쌍으로 가진 레코드
        for(Map.Entry e : map.entrySet()){
            System.out.println(e.getKey()+", "+e.getValue());
        }
    }
    
}
