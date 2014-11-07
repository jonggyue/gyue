package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import vo.MjoinVO;
import conn.ConnUtil;


public class JoinDao {
	// 현재 ImgDirDao객체는 서블릿이나 JSP에서 Model1방식으로 설계 되었다.

	// 스레드가 접근할 자원이기 때문에 동기화 처리가 되어야 한고,

	// 자원이 한정된 connection을 받아서 사용해야 하기 때문에 싱글톤 디자인 패턴을 사용해서
	// 처음에 생성시 스태틱 영역에 하나만 생성시켜놓고 그 후엔 이미 생성된 주소로 사용하도록 한다.
	// 안드로이드에서 그리드뷰일때.. 이미 여러분은 싱글톤의 경험이 있어요 네

	private static JoinDao dao;

	public synchronized static JoinDao getDao() {
		if (dao == null)
			dao = new JoinDao();
		return dao;
	}

	// 재사용에 입각한 SQL문을 관리하는 메서드를 만들어보자.
	// insert
	public boolean addJoin(MjoinVO vo) {

		Connection con = null;
		PreparedStatement pstmt = null;
		
		StringBuffer sql = new StringBuffer();
		sql.append("insert into mjoin values(mjoin_seq.nextVal,?,?,?,?, sysdate)");
		try {
			con = ConnUtil.getDs();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getInfo());
			pstmt.executeUpdate();
			return true; //정상적으로 입력완료 true
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return false; //비정상적으로 입력 false
		} finally {

			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

public int login(Map<String, String> info){
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int cnt=0;
		StringBuffer sql = new StringBuffer();
		sql.append("select count(*) cnt from mjoin where id=? and pwd=?");
		try {
			con = ConnUtil.getDs();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, info.get("id"));
			pstmt.setString(2, info.get("pwd"));
			rs = pstmt.executeQuery();
			  if (rs.next()) {
		             cnt=1;
		        }
			rs.close();
			pstmt.close();
			con.close();		
		} catch (SQLException e) {
		}
		return cnt;
}
public int idchina(Map<String, String> info){
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int cnt=0;
		StringBuffer sql = new StringBuffer();
		sql.append("select count(*) cnt from mjoin where id=? and pwd=?");
		try {
			con = ConnUtil.getDs();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, info.get("id"));
			pstmt.setString(2, info.get("pwd"));
			rs = pstmt.executeQuery();
			  if (rs.next()) {
		             cnt=1;
		        }
			rs.close();
			pstmt.close();
			con.close();		
		} catch (SQLException e) {
		}
		return cnt;
}
}
