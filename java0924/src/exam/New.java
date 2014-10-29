package exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author KOSTA 86기 김종규
 * Document   : New created on : 2014. 9. 24, 오후 2:23:23
 */
public class New {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "C:\\kosta86\\javaStudy\\workspace\\java0924\\exam\\test.properties";
        FileInputStream fis = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(fis);
        System.out.println(prop.get("배고파"));
        
    }

}
