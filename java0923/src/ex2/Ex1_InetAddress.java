package ex2;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Ex1_InetAddress created on : 2014. 9. 23, 오후 1:54:34
 */
public class Ex1_InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress iaddr = InetAddress.getLocalHost();
        System.out.println("호스트 이름 : "+iaddr.getHostName());
        System.out.println("호스트  IP  : "+ iaddr.getHostAddress());
        
        InetAddress iaddr2 = InetAddress.getByName("www.kosta.or.kr");
        System.out.println("호스트 이름 : "+iaddr2.getHostName());
        System.out.println("호스트  IP  : "+iaddr2.getHostAddress());
    }

}
