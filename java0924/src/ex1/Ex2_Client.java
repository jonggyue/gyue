package ex1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author KOSTA 86�� ������ Document : Ex2_Client created on : 2014. 9. 24, ����
 * 11:03:04
 */
public class Ex2_Client {

    private Socket s;

    public Ex2_Client() {
        try {
           // while (true) {
                s = new Socket("192.168.7.11", 9999);
                InputStream is = s.getInputStream();
                OutputStream os = s.getOutputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                PrintWriter out = new PrintWriter(new BufferedOutputStream(os), true);
                //Ŭ���̾�Ʈ�� �����ο�û�� ������ �۾�
                out.println("���ɽð�");
                String msg = br.readLine();
                System.out.println(msg);
                
           // }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        new Ex2_Client();
    }

}
