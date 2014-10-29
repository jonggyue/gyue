package ex2;

import ex1.ServerThread;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author KOSTA 86기 김종규 Document : DrawServer created on : 2014. 9. 25, 오후
 * 3:10:13
 */
public class DrawServer {

    // 서버소켓
    private ServerSocket ss;
    // 접속된 클라이언트의 소켓
    private Socket s;
    //접속자의 ip
    private String reip;
    // 클라이언트 소켓을 저장항 Collection
    private ArrayList<SThread> clientList;
    // 현재 접속자 대화명을 저장할 ArrayList, 지금은 안썼음
    private ArrayList<String> conClientList;

    public DrawServer() {
        try {
            ss = new ServerSocket(9999);
            System.out.println("서버 스타트");
            clientList = new ArrayList<SThread>();
            conClientList = new ArrayList<>();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excute() {
        try {
            while (true) {
                s = ss.accept();
                reip = s.getInetAddress().getHostAddress();
                System.out.println("Client Connectead : [" + reip + " ]");
                // Thread 객체 생성한후 readLine을 위임한 상태!!!
                SThread ct = new SThread(s, this);
                clientList.add(ct);
                System.out.println("Current number of clients : " + clientList.size());

            }
        } catch (Exception e) {
                e.printStackTrace();
        }

    }

}
