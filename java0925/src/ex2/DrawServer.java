package ex2;

import ex1.ServerThread;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author KOSTA 86�� ������ Document : DrawServer created on : 2014. 9. 25, ����
 * 3:10:13
 */
public class DrawServer {

    // ��������
    private ServerSocket ss;
    // ���ӵ� Ŭ���̾�Ʈ�� ����
    private Socket s;
    //�������� ip
    private String reip;
    // Ŭ���̾�Ʈ ������ ������ Collection
    private ArrayList<SThread> clientList;
    // ���� ������ ��ȭ���� ������ ArrayList, ������ �Ƚ���
    private ArrayList<String> conClientList;

    public DrawServer() {
        try {
            ss = new ServerSocket(9999);
            System.out.println("���� ��ŸƮ");
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
                // Thread ��ü �������� readLine�� ������ ����!!!
                SThread ct = new SThread(s, this);
                clientList.add(ct);
                System.out.println("Current number of clients : " + clientList.size());

            }
        } catch (Exception e) {
                e.printStackTrace();
        }

    }

}
