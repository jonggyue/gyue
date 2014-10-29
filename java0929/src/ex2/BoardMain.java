package ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : BoardMain created on : 2014. 9. 29, ���� 3:58:23
 */
public class BoardMain {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        PreparedStatement pstm = null;
        int num=1;
        String  sub, writer, rcontent = null;
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("����̹� �ε� ����!");
            String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
            String user = "kosta86";
            String pass = "new14";
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("connectionȹ��!"+con);
            
            System.out.println(num);
            System.out.print("sub : ");
            sub = sc.nextLine();
            System.out.print("writer : ");
            writer = sc.nextLine();
            System.out.print("rcontent : ");
            rcontent = sc.nextLine();
           
            StringBuffer sql = new StringBuffer();
            sql.append("insert into board values(");
            sql.append("board_seq.nextVal, ?, ?, ?, sysdate)");
            pstm  = con.prepareStatement(sql.toString());
            pstm.setString(1, sub);
            pstm.setString(2, writer);
            pstm.setString(3, rcontent);
            pstm.executeUpdate();
            num++;
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("����̹� �ε� ����!");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("����Ŭ����");
            ex.printStackTrace();
        }finally{
            pstm.close();
        }
        
        
    }
}
