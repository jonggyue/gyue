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
 * @author KOSTA 86�� ������ Document : SelectDemo created on : 2014. 9. 29, ����
 * 5:17:35
 */
public class SelectDemo {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; // oracle�� select�� cursor�� �ޱ� ���� ��ü
        try {
            // �ڷḦ ����
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String ulr = "jdbc:oracle:thin:@localhost:1521/pdborcl";
            String user = "myman";
            String pass = "new09";
            con = DriverManager.getConnection(ulr, user, pass);
            // select * from table : *�÷��� ��ȸ�ϴ� ����� �־ ����
            StringBuffer sql = new StringBuffer();
            sql.append("select num, rname, rid, email, birth, rdate from member");
            // �������� desc 1 - num // �ֽ�ȸ��, ������-��������asc
            sql.append(" order by 1 desc");
            //���� ����
            pstmt = con.prepareStatement(sql.toString());
            //Cursor�� �����ޱ�gks aptjemfmf ghcnf
            rs = pstmt.executeQuery();
            // �������� Ŀ���� ����Ͽ� ������ ���
            // rs.next() Ŀ���� ���� ��� true
            while (rs.next()) {
                // rs.getXX("�÷���ȣ||�÷���");
                System.out.println("��ȣ : " + rs.getInt("num"));
                System.out.println("���̵� :" + rs.getInt("rid"));
                System.out.println("�̸� :" + rs.getInt("rname"));
                System.out.println("�̸��� :" + rs.getInt("email"));
                System.out.println("������ :" + rs.getInt("rdate"));
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
