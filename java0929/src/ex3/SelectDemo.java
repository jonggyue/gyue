package ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOSTA 86기 김종규 Document : SelectDemo created on : 2014. 9. 29, 오후
 * 5:17:35
 */
public class SelectDemo {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; // oracle의 select된 cursor를 받기 위한 객체
        try {
            // 자료를 검출
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String ulr = "jdbc:oracle:thin:@localhost:1521/pdborcl";
            String user = "myman";
            String pass = "new09";
            con = DriverManager.getConnection(ulr, user, pass);
            // select * from table : *컬럼을 조회하는 기능이 있어서 비추
            StringBuffer sql = new StringBuffer();
            sql.append("select num, rname, rid, email, birth, rdate from member");
            // 내림차순 desc 1 - num // 최신회원, 세현군-오름차순asc
            sql.append(" order by 1 desc");
            //쿼리 전송
            pstmt = con.prepareStatement(sql.toString());
            //Cursor를 돌려받기gks aptjemfmf ghcnf
            rs = pstmt.executeQuery();
            // 돌려받을 커서를 사용하여 데이터 출력
            // rs.next() 커서가 있을 경우 true
            while (rs.next()) {
                // rs.getXX("컬럼번호||컬럼명");
                System.out.println("번호 : " + rs.getInt("num"));
                System.out.println("아이디 :" + rs.getInt("rid"));
                System.out.println("이름 :" + rs.getInt("rname"));
                System.out.println("이메일 :" + rs.getInt("email"));
                System.out.println("가입일 :" + rs.getInt("rdate"));
                System.out.println("=====================");
                
            }

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                if(rs != null)rs.close();
                if(pstmt != null)pstmt.close();
                if(con != null)con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
