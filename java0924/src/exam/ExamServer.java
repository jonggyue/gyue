package exam;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author KOSTA 86기 김종규 Document : ExamServer created on : 2014. 9. 24, 오후
 * 1:58:44
 */
public class ExamServer {

    private ServerSocket ss;

    public ExamServer() {
        try {
            ss = new ServerSocket(9999); //소켓생성
            System.out.println("서버 시작");
            while (true) {
                Socket s = ss.accept();
                InputStream is = s.getInputStream();
                OutputStream os = s.getOutputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                PrintWriter out = new PrintWriter(new BufferedOutputStream(os), true);
                //out.println("점심시간");

                String msg = br.readLine();
 
                System.out.println(msg);

            }
        } catch (Exception e) {
                e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ExamServer();
    }

}
