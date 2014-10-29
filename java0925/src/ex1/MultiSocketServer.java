package ex1;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author KOSTA 86�� ������ Document : MultiSocketServer created on : 2014. 9. 25,
 * ���� 9:39:32
 */
public class MultiSocketServer {

    // ��������
    private ServerSocket ss;
    // ���ӵ� Ŭ���̾�Ʈ�� ����
    private Socket s;
    // Ŭ���̾�Ʈ ������ ������ Collection
    private ArrayList<ServerThread> clientList;
    // ���� ������ ��ȭ���� ������ ArrayList, ������ �Ƚ���
    private ArrayList<String> conClientList;
    //�������� ip
    private String reip;

    public MultiSocketServer() {
        try {
            ss = new ServerSocket(8888);
            System.out.println("** Server Start **");
            // Socket�� �ּҸ� ������, Thread�� �����ϱ� ���� ArrayList
            // �ּҸ����� ������ ArrayList ����
            clientList = new ArrayList<ServerThread>();
            conClientList = new ArrayList<>();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    // ���� �޼���
    public void excute() {
        // ������ �׻� ������..
        while(true){
            try {
                s = ss.accept();
                reip = s.getInetAddress().getHostAddress();
                System.out.println("Client Connectead : ["+reip+" ]");
                // Thread ��ü ���� ���� readLine�� ������ ����********
                ServerThread ct = new ServerThread(s, this);
                // �����尡 ������ �� ���� ArrayList�� ���
                clientList.add(ct);
                System.out.println("Current number of clients : " + clientList.size());
            } catch (Exception e) {
            }
        }
    }
    
    public void sendMsg(String str1, ServerThread aThis){
        String type1 = str1;
        String str = "";
        // ArrayLists�� ��ϵ� ��� client�� �о�ͼ� �ϳ��� ������ ���Ͽ� ����
        // ��Ʈ���� ���� str�޼����� �����Ѵ�.
        str = "["+aThis.getSocket().getInetAddress().getHostAddress()+"]"+type1;
        System.out.println("msg : "+str);
        // ��� �������� �ϼ��� str�� ȣ��
        for(ServerThread c : clientList){
            c.getPw().println(str);
        }
    }
    public static void main(String[] args) {
        MultiSocketServer mss = new MultiSocketServer();
        mss.excute();
    }

}
