package exam;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author KOSTA 86�� ������ Document : LottoApp created on : 2014. 9. 17, ����
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
        // *���� StringŬ������ �Һ��� Ư¡?����
        // �޸��� ������ ���� ��ų �� �ֱ� ������
        // ���ڿ��� �������� �����ϴ� ����
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
