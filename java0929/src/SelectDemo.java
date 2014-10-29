package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author kosta Document : SelectDemo Created on : 2014. 9. 29, ���� 5:15:20
 */
public class SelectDemo {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;// Oracle�� Select�� Cursor�� �ޱ� ���� ��ü
        try {
            // �ڷḦ ����
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
            String user = "myman";
            String pass = "new09";
            con = DriverManager.getConnection(url, user, pass);
            // select * from table: * �÷��� ��ȸ�ϴ� ����� �־ ����
            StringBuffer sql = new StringBuffer();
            sql.append("select num,rname,rid,email,birth,");
            sql.append(" rdate from member");
            // �������� desc 1 - num // �ֽ�ȸ��, B�� ���� ���� - �������� asc
            sql.append(" order by 1 desc"); 
            // ���� ����
            pstmt = con.prepareStatement(sql.toString());
            // Cursor�� �����ޱ��� �޼��带 ȣ��
            rs = pstmt.executeQuery();
            // �������� Ŀ���� ����ؼ� ������ ���
            // rs.next() Ŀ���� ���� ��� true
            while (rs.next()) {                
                // rs.getXX("�÷���ȣ||�÷���");
                System.out.println("��ȣ :"+rs.getInt("num"));
                System.out.println("���̵� :"+rs.getString("rid"));
                System.out.println("�̸� :"+rs.getString("rname"));
                System.out.println("�̸��� :"+rs.getString("email"));
                System.out.println("������ :"+rs.getString("rdate"));
                System.out.println("-------------------------------");
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            try {
                if(rs != null)rs.close();
                if(pstmt != null)pstmt.close();
                if(con != null)con.close();
            } catch (SQLException ex) {
            }
        }
    }
}
