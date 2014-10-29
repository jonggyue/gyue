package ex1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Ex2_URL created on : 2014. 9. 23, 오후 3:02:33
 */
// Uniform Resource Locator
// 인터넷에서 접근 가능한 자원*Resqurce)의 주소를 표현할 수 있는 형식***
public class Ex1_URLConnection {
    public static void main(String[] args) throws MalformedURLException, IOException {
        String path = "http://edu.kosta.or.kr/clazzregister/clazzRegister_findClazzWithContents?clazz.clazzId=1656";
        String path2 = "http://www.daum.net/";
        
        URL url = new URL(path2);
        

// URLConnection 객체는 반드시 URL클래스를 생성한 후
        // 반환받아서 사용한다.*****
        URLConnection urlCon = url.openConnection();
        // URLConnection의 완성
        urlCon.connect(); // 객체가 완성이됨
        // Type을보고 글짜가 안 깨지게끔 해야함
        System.out.println("ContentType : "+ urlCon.getContentType());
        // 해더 필드의 content-length에 대한 value를 반환
        System.out.println("Length : "+ urlCon.getContentLength());

//        OutputStream os = urlCon.getOutputStream(); //서버에 줄때
//        os.write('A');
//        os.flush();
        //System.out.println("ContentEncoding : "+urlCon.getContentEncoding());
        
        System.out.println(url.getPath());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getProtocol());
        System.out.println(url.getContent());
        System.out.println(url.getRef());
        InputStream is  = url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        String res = null;
        while((res=br.readLine()) != null){
            System.out.println((String)res);
            
                    
        }
//        int res = 0;
//        while((res = is.read()) != -1){
//            System.out.print((char)res);
//        }
        
        //연습문제 : 사용자가 입력한 url의 소스를
        //jTexArea에 출력하고 save버튼을 누르면
        //사용자가 지정한 경로에 파일 이름으로 저장하는 기능을 구현하시오
        
    }
}
