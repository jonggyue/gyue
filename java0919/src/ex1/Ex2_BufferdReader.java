package ex1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 *
 * @author KOSTA 86기 김종규 Document : Ex2_BufferdReader created on : 2014. 9. 19,
 * 오전 10:48:55
 */
public class Ex2_BufferdReader {

    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader br = null;
        try {
            //1차스트림
            br = new BufferedReader(
                    //1차와 2차 스트림을 연결하기 위해 브릿지스트림을 사용
                    new InputStreamReader(
                            // 2차스트림
                            new FileInputStream("c:/kosta86/test.txt")));
            String line = null;
            //한줄 단위로 읽을때 true일때 출력;
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
