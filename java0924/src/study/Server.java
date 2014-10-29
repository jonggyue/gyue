package study;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author KOSTA 86기 김종규 Document : Server created on : 2014. 9. 24, 오후 7:13:23
 */
public class Server {

    private ServerSocket ss;

    public Server() {
        while (true) {
            try {
                ss = new ServerSocket(9999);
                Socket s = ss.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                PrintWriter pw = new PrintWriter(new BufferedOutputStream(s.getOutputStream()),true);
                
                String msg = br.readLine();
                System.out.println(msg);
                
                
                
                
                
            } catch (Exception e) {

            }

        }
    }
    public static void main(String[] args) {
        new Server();
    }

}
