package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author KOSTA 86기 김종규
 * Document   : BufferedRWDemo created on : 2014. 9. 18, 오후 3:04:02
 */
public class BufferedRWDemo {
    public static void main(String[] args) throws IOException {
        // 작성 후 읽어 내는 형태로 사용
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 내용 : ");
        String content = sc.nextLine();
        // 작성하기 위한 스트림 생성
        BufferedWriter bw = null;
        BufferedReader br = null;
        String path = "c:\\kosta86\\mytext.txt";
        try {
            // 작성
            // new FileWriter("c:\\kosta86\\mytext.txt",true)
            // 첫번째 인자는 경로, 두번째인자는 append Mode
            bw = new BufferedWriter(new FileWriter(path,true));
            bw.write(content+"\r\n");

            bw.flush();
            System.out.println("작성하기 완료!");
            // 읽기
            System.out.println("=============");
            br = new BufferedReader(new FileReader(path));
            String rv = null;
            while((rv = br.readLine()) != null){
                System.out.println(rv);
            }
            System.out.println("읽기 완료!");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(bw != null) bw.close();
                if(br != null) br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
}
