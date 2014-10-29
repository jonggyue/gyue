package ex1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : FileCopy created on : 2014. 9. 18, ���� 1:43:53
 */
public class FileCopy {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // ��� ���� �о�ͼ� Ư�� �ٸ� ���丮�� �����ϴ� �۾�
        // �о���� ���� ��Ʈ�� - FileInputStream
        // �ۼ��ϱ� ���� ��Ʈ�� - FileOutputStream
        // ���� ���
        String path = "C:\\kosta86\\javaStudy\\util\\han.zip";
        // �纻 ���
        String path2 = "C:\\kosta86\\javaStudy\\tmp\\han2.zip";
        FileInputStream fis = null; // ����
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(path);
            fos = new FileOutputStream(path2);
            int rv = 0;
            while((rv = fis.read()) != -1){
                // �ѹ���Ʈ�� ���� ������ �ѹ���Ʈ�� �ۼ�
                fos.write(rv);
                
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("������ ���׿�.");
            ex.printStackTrace();
        }catch(IOException ex){
            System.out.println("�о� ���� �� ������ �߻��߽��ϴ�.");
            ex.printStackTrace();
        }finally{
            try {
                if(fis != null) fis.close();
                if(fos != null) fos.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
            long end = System.currentTimeMillis();
            System.out.println("�ð�"+(end-start));
        }
                
    }
}
