package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
  
/**
 *
 * @author KOSTA 86�� ������
 * Document   : ConnUtil created on : 2014. 10. 15, ���� 4:00:42
 */
public class ConnUtil {
    // �ؾ������ ���� : ����ƽ�ʱ�ȭ =���θ޼��庸�� ����
    // JVM�� �������ش�.
    static{
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }
    public static Connection getConn() throws SQLException{
        String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
        String user = "myman";
        String pass = "new09";
        return DriverManager.getConnection(url, user, pass);
    }
    
}
