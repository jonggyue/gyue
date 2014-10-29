package ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author KOSTA 86�� ������ Document : Ex3_Map created on : 2014. 9. 17, ����
 * 11:55:52
 */
// HashMap : ����ȭ�� �������� �ʰ� null���
public class Ex3_Map {
    
    public static void main(String[] args) {
        String[] msg = {"Test1", "Test2", "test3"};
        // key, value : key�� set���� �̱� ������ �ߺ��� ������� ����
        HashMap<Integer, String> map = new HashMap<>();
        int size = msg.length;
        for (int i = 0; i < size; i++) {
            map.put(i, msg[i]);
        }
        System.out.println("Map�� ������ : " + map.size());
        // �ʿ��� ���
        // Key���� ���� �� ���
        Set<Integer> keys = map.keySet();
        for (Integer e : keys) {
            // �ʿ��� get(key)�� ����ؼ� value�� Ȯ��
            System.out.println(map.get(e));
        }
        // Entry : Ű�� ������ ��ü�� ������ ������ ���� ���ڵ�
        for(Map.Entry e : map.entrySet()){
            System.out.println(e.getKey()+", "+e.getValue());
        }
    }
    
}
