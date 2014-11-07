package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KOSTA 86�� ������ Document : ConnUtil created on : 2014. 10. 30, ����
 * 4:02:59
 */
public class ConnUtil {

    static {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (ClassNotFoundException ex) {
            System.out.println("����̹� �ε�����");
            ex.printStackTrace();

        }
    }

    public static Connection getConnection() {
        Connection con = null;
        String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
        String user = "myman";
        String pass = "new09";
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(ConnUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("����̹� �ε� ����");

        return con;

    }

}
