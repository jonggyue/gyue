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
 * @author KOSTA 86기 김종규
 * Document   : BoardMain created on : 2014. 9. 29, 오후 3:58:23
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
            System.out.println("드라이버 로딩 성공!");
            String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
            String user = "kosta86";
            String pass = "new14";
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("connection획득!"+con);
            
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
            System.out.println("드라이버 로딩 실패!");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("오라클에러");
            ex.printStackTrace();
        }finally{
            pstm.close();
        }
        
        
    }
}
