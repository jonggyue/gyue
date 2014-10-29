package ex1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


/**
 *
 * @author KOSTA 86기 김종규 Document : ServerS created on : 2014. 10. 17, 오전
 * 11:26:13
 */
public class ServerS {

    private ServerSocket ss; // 서버소켓 생성
    private Socket s; // 소켓을 생성-클라이언트와 연결
    private String reip; // 받은 ip주소
    private ArrayList<SocketThread> client; //클라이언트의 ip를 저장하기위해 사용

    public ServerS(int port) {
        try {
            -ss = new ServerSocket(port);
            //ArrayList를 생성
            client = new ArrayList<>();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void exxecute() {
        while (true) {
            try {
                Socket s = ss.accept();
                System.out.println("클라인트접속");
                System.out.println(s.getInetAddress().getHostAddress());
                System.out.println("====================");
                SocketThread st = new SocketThread(s, this);
                //ArrayList에 저장
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
        //Client로 보내기위한 프로토콜을 제작
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
