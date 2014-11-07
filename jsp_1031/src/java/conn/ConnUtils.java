package conn;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author KOSTA 86�� ������ Document : ConnUtils created on : 2014. 10. 31, ����
 * 3:13:18
 */
public class ConnUtils {

    // Connection Pool ���� Connection�� ȹ���ؿ��� ��ü
    private static DataSource ds;

    static {
        try {
            // context.xml�� ������ JNDI�� �о� ���� ���� ��ü
            InitialContext ctx = new InitialContext();
            // ctx�� Context�� ��η� Resource�� ȹ�� (java:comp/env/....)
            ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myora");
        } catch (NamingException ex) {
            ex.printStackTrace();
        }
    }

    // ����� Resource���� Connection�� ȹ���ؼ� ����

    public static Connection getConn() throws SQLException {
        return ds.getConnection();
    }
}
