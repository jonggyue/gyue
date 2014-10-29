package ex1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author KOSTA 86�� ������ Document : ServerThread created on : 2014. 9. 25, ����
 * 9:50:29
 */
public class ServerThread {

    // �����κ��� ���ӹ��� ����
    private Socket socket;
    // �����κ��� ���� ������ �ּ�
    private MultiSocketServer server;
    // �������κ��� ����� �� ��Ʈ��
    private PrintWriter pw;
    private BufferedReader in;
    // �г���
    private String nickName;

    public ServerThread(Socket socket, MultiSocketServer server) {
        this.socket = socket;
        this.server = server;
        try {
            pw = new PrintWriter(
                    new BufferedOutputStream(
                            socket.getOutputStream()), true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Thread�� ����Ŭ������ ����
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    in = new BufferedReader(
                            new InputStreamReader(
                                    ServerThread.this.socket.getInputStream()));
                    while (true) {
                        // �������� ���� �Է��� �ޱ� ���� ����ϴ� �޼���
                        String msg = in.readLine();
                        transMsg(msg);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        // �޼��� ��ū �� ������ sendMsg ȣ����
            private void transMsg(String msg) {
                // ������ sendMsg()�� ȣ���Ҷ� �޼����� ����
                ServerThread.this.server.sendMsg(msg, ServerThread.this);
            }
        });

    // Thread�� start�ؼ� �����ٷ����� ���� ��û�Ѵ�.
        t.start();
    }

    public BufferedReader getIn() {
        return in;
    }

    public PrintWriter getPw() {
        return pw;
    }

    public Socket getSocket() {
        return socket;
    }

}
