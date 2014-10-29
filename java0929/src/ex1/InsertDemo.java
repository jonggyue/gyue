package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author KOSTA 86기 김종규 Document : InsertDemo created on : 2014. 9. 29, 오후
 * 2:14:41
 */
public class InsertDemo {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            // 1 ojdbc로 부터 Driver 로딩.
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로딩 성공!");
            // 2 Connection획득
            // <host>:<port>/<servicename> 
            String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
            String user = "kosta86";
            String pass = "new14";
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("connection획득!" + con);
            // 3 SQL문 작성!
//            StringBuffer sql = new StringBuffer();
//            // num -> member_seq.nextVal -시퀀스 테이블의 번호 증가
//            // 바인딩 걸 대상 rid.rpwd.rname.BIRTH.EMAIL -5개
//            // RDATE ->sysdate 자동으로 현재날짜
//            // insert 작업시 변수값잉 바인딩될 것 까지 포함해서
//            // 값을 지정할 수 있다.
//            sql.append("insert into member values(");
//            sql.append("member_seq.nextVal,?,?,?,?,?,sysdate)");
//            
//            // 4 PreparedStatement 객체를 사용해서 쿼리를 전송
//            pstm = con.prepareStatement(sql.toString());
//            // 5 바인딩사용해서 전송된 쿼리에게 값을 전송
//            pstm.setString(1, "xman");
//            pstm.setString(2, "xman00");
//            pstm.setString(3, "김길동");
//            pstm.setString(4, "20000909");
//            pstm.setString(5, "aa@a.com");
//            pstm.executeUpdate();

        } catch (ClassNotFoundException ex) {
            System.out.println("드라이버 로딩 실패!");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("오라클 에러:");
            ex.printStackTrace();
        }

    }

}
