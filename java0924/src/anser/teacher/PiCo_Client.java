package exam;
/**
 * @author kosta 
 * Document   : PiCo_Client Created on : 2014. 9. 24, ¿ÀÈÄ 1:28:42
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class PiCo_Client {

    private Socket s;
    private PrintWriter out;
    private BufferedReader in;

    public PiCo_Client() {
        try {
            s = new Socket("192.168.7.149", 5555);
            out = new PrintWriter(s.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public String send(String msg){
        out.println(msg);
        String str=null;
        try {
            str = in.readLine();
            //System.out.println(str);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }
}
