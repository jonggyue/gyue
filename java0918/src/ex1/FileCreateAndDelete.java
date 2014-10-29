package ex1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author KOSTA 86기 김종규
 * Document   : FileCreateAndDelete created on : 2014. 9. 18, 오후 12:11:39
 */
public class FileCreateAndDelete {
    public static void main(String[] args) throws IOException {
        File file = new File("newFile.txet");
        
        // create a new file
        boolean isCreated = file.createNewFile();
        System.out.println("new file is created : "+isCreated);
    }

}
