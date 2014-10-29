package ex1;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : FileCopy created on : 2014. 9. 18, ���� 1:43:53
 */
public class FileCopy2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // ��� ���� �о�ͼ� Ư�� �ٸ� ���丮�� �����ϴ� �۾�
        // �о���� ���� ��Ʈ�� - FileInputStream
        // �ۼ��ϱ� ���� ��Ʈ�� - FileOutputStream
        // ���� ���
        String path = "C:\\kosta86\\javaStudy\\util\\han.zip";
        // �纻 ���
        String path2 = "C:\\kosta86\\javaStudy\\tmp\\han3.zip";
        //FileInputStream fis = null; // ����
        //FileOutputStream fos = null;
        // 2�� ��Ʈ���� ���(���۱���� �����..)
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //fis = new FileInputStream(path);
            //fos = new FileOutputStream(path2);
            // 1�� ��Ʈ���� �ּҷ� �����ؼ� ����
            // ������ �뷮�� �������� ������ 8192byte�� ũ��� ������!
            bis = new BufferedInputStream(new FileInputStream(path));
            bos = new BufferedOutputStream(new FileOutputStream(path2));
            int rv = 0;
            while((rv = bis.read()) != -1){
                // �ѹ���Ʈ�� ���� ������ �ѹ���Ʈ�� �ۼ�
                bos.write(rv);
               
                
            }
             bos.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("������ ���׿�.");
            ex.printStackTrace();
        }catch(IOException ex){
            System.out.println("�о� ���� �� ������ �߻��߽��ϴ�.");
            ex.printStackTrace();
        }finally{
            try {
                if(bis != null) bis.close();
                if(bos != null) bos.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            long end = System.currentTimeMillis();
            System.out.println("�ð�"+(end-start));
        }
                
    }
}
