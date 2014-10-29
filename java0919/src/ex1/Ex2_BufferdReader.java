package ex1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 *
 * @author KOSTA 86�� ������ Document : Ex2_BufferdReader created on : 2014. 9. 19,
 * ���� 10:48:55
 */
public class Ex2_BufferdReader {

    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader br = null;
        try {
            //1����Ʈ��
            br = new BufferedReader(
                    //1���� 2�� ��Ʈ���� �����ϱ� ���� �긴����Ʈ���� ���
                    new InputStreamReader(
                            // 2����Ʈ��
                            new FileInputStream("c:/kosta86/test.txt")));
            String line = null;
            //���� ������ ������ true�϶� ���;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
