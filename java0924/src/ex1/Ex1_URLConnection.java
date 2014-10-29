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
 * @author KOSTA 86�� ������
 * Document   : Ex2_URL created on : 2014. 9. 23, ���� 3:02:33
 */
// Uniform Resource Locator
// ���ͳݿ��� ���� ������ �ڿ�*Resqurce)�� �ּҸ� ǥ���� �� �ִ� ����***
public class Ex1_URLConnection {
    public static void main(String[] args) throws MalformedURLException, IOException {
        String path = "http://edu.kosta.or.kr/clazzregister/clazzRegister_findClazzWithContents?clazz.clazzId=1656";
        String path2 = "http://www.daum.net/";
        
        URL url = new URL(path2);
        

// URLConnection ��ü�� �ݵ�� URLŬ������ ������ ��
        // ��ȯ�޾Ƽ� ����Ѵ�.*****
        URLConnection urlCon = url.openConnection();
        // URLConnection�� �ϼ�
        urlCon.connect(); // ��ü�� �ϼ��̵�
        // Type������ ��¥�� �� �����Բ� �ؾ���
        System.out.println("ContentType : "+ urlCon.getContentType());
        // �ش� �ʵ��� content-length�� ���� value�� ��ȯ
        System.out.println("Length : "+ urlCon.getContentLength());

//        OutputStream os = urlCon.getOutputStream(); //������ �ٶ�
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
        
        //�������� : ����ڰ� �Է��� url�� �ҽ���
        //jTexArea�� ����ϰ� save��ư�� ������
        //����ڰ� ������ ��ο� ���� �̸����� �����ϴ� ����� �����Ͻÿ�
        
    }
}
