package ex1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author KOSTA 86기 김종규
 * Document   : FileCopy created on : 2014. 9. 18, 오후 1:43:53
 */
public class FileCopy {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // 대상 파일 읽어와서 특정 다른 디렉토리에 복사하는 작업
        // 읽어오기 위한 스트림 - FileInputStream
        // 작성하기 위한 스트림 - FileOutputStream
        // 원본 경로
        String path = "C:\\kosta86\\javaStudy\\util\\han.zip";
        // 사본 경로
        String path2 = "C:\\kosta86\\javaStudy\\tmp\\han2.zip";
        FileInputStream fis = null; // 선언
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(path);
            fos = new FileOutputStream(path2);
            int rv = 0;
            while((rv = fis.read()) != -1){
                // 한바이트씩 읽을 때마다 한바이트씩 작성
                fos.write(rv);
                
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("파일이 없네요.");
            ex.printStackTrace();
        }catch(IOException ex){
            System.out.println("읽어 오는 중 문제가 발생했습니다.");
            ex.printStackTrace();
        }finally{
            try {
                if(fis != null) fis.close();
                if(fos != null) fos.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            long end = System.currentTimeMillis();
            System.out.println("시간"+(end-start));
        }
                
    }
}
