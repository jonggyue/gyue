package exam;
/**
 * @author kosta 
 * Document   : PiCo_Server Created on : 2014. 9. 24, ¿ÀÈÄ 1:28:11
 */
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PiCo_Server {

    private ServerSocket ss;

    public PiCo_Server() {
        try {
            ss = new ServerSocket(5555);
            //-----------------------
            String path ="C:\\kosta86\\javaStudy\\workspace\\java0924_Network\\src\\exam\\msg.properties";
            BufferedReader bread = new BufferedReader(new FileReader(path));
            Properties prop = new Properties();
            prop.load(bread);
            bread.close();
            //--------------------------
            ex:while (true) {
                Socket s = ss.accept();
                System.out.println("Connect IP:"+s.getInetAddress().getHostAddress());
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                PrintWriter out = new PrintWriter(new BufferedOutputStream(s.getOutputStream()),true);
                while (true) {
                    try{
                    String msg = br.readLine();
                    System.out.println("MSG:"+msg);
                    if(prop.get(msg) != null){
                         out.println(prop.get(msg));
                    }else{
                         out.println("¸ô¶ó¿ä");
                    }   
                    }catch(SocketException e){
                        e.printStackTrace();
                        continue ex;
                    }
                }
               
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new PiCo_Server();
    }
}