package conn;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : MockTest created on : 2014. 10. 31, ���� 3:20:59
 */
public class MockTest {
    public static void main(String[] args) {
        try {
            Connection con = ConnUtils.getConn();
            System.out.println("Test:"+con);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
