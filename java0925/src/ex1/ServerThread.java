package ex1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author KOSTA 86기 김종규 Document : ServerThread created on : 2014. 9. 25, 오전
 * 9:50:29
 */
public class ServerThread {

    // 서버로부터 위임받은 소켓
    private Socket socket;
    // 서버로부터 받은 서버의 주소
    private MultiSocketServer server;
    // 소켓으로부터 연결된 두 스트림
    private PrintWriter pw;
    private BufferedReader in;
    // 닉네임
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

        // Thread를 내부클래스로 정의
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    in = new BufferedReader(
                            new InputStreamReader(
                                    ServerThread.this.socket.getInputStream()));
                    while (true) {
                        // 소켓으로 부터 입력을 받기 위해 대기하는 메서드
                        String msg = in.readLine();
                        transMsg(msg);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        // 메세지 토큰 후 서버의 sendMsg 호출담당
            private void transMsg(String msg) {
                // 서버의 sendMsg()를 호출할때 메세지를 전달
                ServerThread.this.server.sendMsg(msg, ServerThread.this);
            }
        });

    // Thread를 start해서 스케줄러에게 일을 요청한다.
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
