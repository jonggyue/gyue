package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author KOSTA 86�� ������ Document : InsertDemo created on : 2014. 9. 29, ����
 * 2:14:41
 */
public class InsertDemo {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            // 1 ojdbc�� ���� Driver �ε�.
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("����̹� �ε� ����!");
            // 2 Connectionȹ��
            // <host>:<port>/<servicename> 
            String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
            String user = "kosta86";
            String pass = "new14";
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("connectionȹ��!" + con);
            // 3 SQL�� �ۼ�!
//            StringBuffer sql = new StringBuffer();
//            // num -> member_seq.nextVal -������ ���̺��� ��ȣ ����
//            // ���ε� �� ��� rid.rpwd.rname.BIRTH.EMAIL -5��
//            // RDATE ->sysdate �ڵ����� ���糯¥
//            // insert �۾��� �������� ���ε��� �� ���� �����ؼ�
//            // ���� ������ �� �ִ�.
//            sql.append("insert into member values(");
//            sql.append("member_seq.nextVal,?,?,?,?,?,sysdate)");
//            
//            // 4 PreparedStatement ��ü�� ����ؼ� ������ ����
//            pstm = con.prepareStatement(sql.toString());
//            // 5 ���ε�����ؼ� ���۵� �������� ���� ����
//            pstm.setString(1, "xman");
//            pstm.setString(2, "xman00");
//            pstm.setString(3, "��浿");
//            pstm.setString(4, "20000909");
//            pstm.setString(5, "aa@a.com");
//            pstm.executeUpdate();

        } catch (ClassNotFoundException ex) {
            System.out.println("����̹� �ε� ����!");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("����Ŭ ����:");
            ex.printStackTrace();
        }

    }

}
