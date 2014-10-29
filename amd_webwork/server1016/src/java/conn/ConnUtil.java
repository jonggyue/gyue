package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
  
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : ConnUtil created on : 2014. 10. 15, 오후 4:00:42
 */
public class ConnUtil {
    // 잊어버리지 말자 : 스태틱초기화 =메인메서드보다 먼저
    // JVM이 실행해준다.
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
