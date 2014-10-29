package ex1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


/**
 *
 * @author KOSTA 86�� ������ Document : ServerS created on : 2014. 10. 17, ����
 * 11:26:13
 */
public class ServerS {

    private ServerSocket ss; // �������� ����
    private Socket s; // ������ ����-Ŭ���̾�Ʈ�� ����
    private String reip; // ���� ip�ּ�
    private ArrayList<SocketThread> client; //Ŭ���̾�Ʈ�� ip�� �����ϱ����� ���

    public ServerS(int port) {
        try {
            -ss = new ServerSocket(port);
            //ArrayList�� ����
            client = new ArrayList<>();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void exxecute() {
        while (true) {
            try {
                Socket s = ss.accept();
                System.out.println("Ŭ����Ʈ����");
                System.out.println(s.getInetAddress().getHostAddress());
                System.out.println("====================");
                SocketThread st = new SocketThread(s, this);
                //ArrayList�� ����
                client.add(st);
                st.start();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }

    void sendMsg(SocketThread s, String ... str) {
        //String type1= str[0];
        StringBuffer strs = new StringBuffer();
        //Client�� ���������� ���������� ����
        int i =0;
        for(String e : str){
            if(str.length>1){
                strs.append(e).append("/");
            }else{
                strs.append(e);
            }
            i++;
        }
        System.out.println("TokenTest:"+strs);
        for(SocketThread e:client){
            e.getPw().println(strs.toString());
        }
    }
    public static void main(String[] args) {
        ServerS s = new ServerS(8888);
        s.exxecute();
    }
}
