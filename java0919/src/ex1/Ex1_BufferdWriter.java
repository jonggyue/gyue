package ex1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author KOSTA 86�� ������ Document : Ex1_BufferdWriter created on : 2014. 9. 19,
 * ���� 10:38:37
 */
public class Ex1_BufferdWriter {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //���� ��Ʈ���� ����Ʈ ��Ʈ������ ���� �ϱ� ���ؼ���
        // �긴�� ��Ʈ���� �����ؼ� ����ؾ� �Ѵ�.
        // outputStreamWriter(byteStrem,encoding);
        String path = "c:/kosta86/test.txt";
        
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(path),"euc-kr"));
        bw.write("�̰��� �׽�Ʈ�Դϴ�.");
        bw.flush();
        // ���� �� Ȯ��
    }

}
