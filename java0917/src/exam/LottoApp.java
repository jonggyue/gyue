package exam;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author KOSTA 86기 김종규 Document : LottoApp created on : 2014. 9. 17, 오전
 * 10:43:39
 */
public class LottoApp {

    private String lotNum;

    public LottoApp() {
        lottoGame();
    }



    private void lottoGame() {
        TreeSet<Integer> it = new TreeSet<>();
        while (it.size() < 6) {
            int num = (int) ((Math.random() * 45) + 1);
            it.add(num);
        }
        Iterator<Integer> ii = it.iterator();
        // *에서 String클래스의 불변적 특징?문에
        // 메모리의 성능을 저하 시킬 수 있기 때문에
        // 문자열을 전용으로 저장하는 버퍼
        StringBuffer sb = new StringBuffer();
        while (ii.hasNext()) {
            Integer lotNumber = ii.next();
            //* lotNum += lotNumbrt +"\t";
            sb.append(lotNumber).append("\t");
        }
        lotNum = sb.toString();
    }

    public String getLotNum() {
        return lotNum;
    }

}
