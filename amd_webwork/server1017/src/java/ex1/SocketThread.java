package ex1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOSTA 86�� ������ Document : SocketThread created on : 2014. 10. 17, ����
 * 11:28:27
 */
// �����屸�����
// 
public class SocketThread extends Thread {

    private Socket socket; //���ϻ���-Ŭ���̾�Ʈ�� ����
    private ServerS server; // ����main�޾ƿ�
    private PrintWriter pw;
    private BufferedReader in;

    public SocketThread(Socket socket, ServerS server) {
        try {
            this.socket = socket;
            this.server = server;
            pw = new PrintWriter(
                    new BufferedOutputStream(
                            socket.getOutputStream()), true);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            while (true) {
                String msg = in.readLine();
                System.out.println("Client Msg : " + msg);
                trMsg(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public PrintWriter getPw() {
        return pw;
    }

    private void trMsg(String msg) {
        // protocol : msg/msg/msg ....
        StringTokenizer stn = new StringTokenizer(msg, "/");
        String str1 = stn.nextToken();
        String str2 = stn.nextToken();
        String str3 = stn.nextToken();
        String str4 = stn.nextToken();
        String str5 = stn.nextToken();
        String str6 = stn.nextToken();
        String str7 = stn.nextToken();
        String str8 = stn.nextToken();
        server.sendMsg(this,str1,str2,str3,str4,str5,str6,str7,str8);
        System.out.println("�������� ���� ����!");
    }

}
