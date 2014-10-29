package ex1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author KOSTA 86기 김종규 Document : StudentRecord created on : 2014. 9. 18, 오후
 * 5:13:15
 */
public class StudentRecord {

    public static void main(String[] args) {
        int studentNo = 20011601;
        char grade = 'C';
        float score = (float) 72.9;
        short rank = 65;

        saveScore(studentNo, grade, score, rank);
        printScore(studentNo);
    }

    private static void saveScore(int studentNo, char grade, float score, short rank) {
        File dataFile = new File("record_" + studentNo + ".dat");
        OutputStream fos = null;
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(fos = new FileOutputStream(dataFile));
            dos.writeInt(studentNo);
            dos.writeChar(grade);
            dos.writeFloat(score);
            dos.writeShort(rank);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (dos != null) {
                    dos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    private static void printScore(int studentNo){
        File dataFile = new File("record_"+studentNo+".dat");
        if(!dataFile.exists()){
            System.out.println("a record file is not exist.");
        }
        InputStream fis = null;
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(fis = new FileInputStream(dataFile));
            System.out.println("studentoNo : "+dis.readInt());
            System.out.println("grade      : "+dis.readChar());
            System.out.println("score      : "+dis.readFloat());
            System.out.println("rank       : "+dis.readShort());
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(dis != null) dis.close();
                if(fis != null) fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
