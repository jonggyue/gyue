package ex1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author KOSTA 86기 김종규 Document : Ex1_BufferdWriter created on : 2014. 9. 19,
 * 오전 10:38:37
 */
public class Ex1_BufferdWriter {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //문자 스트림을 바이트 스트림으로 연결 하기 위해서는
        // 브릿지 스트림을 연결해서 사용해야 한다.
        // outputStreamWriter(byteStrem,encoding);
        String path = "c:/kosta86/test.txt";
        
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(path),"euc-kr"));
        bw.write("이것은 테스트입니다.");
        bw.flush();
        // 저장 후 확인
    }

}
