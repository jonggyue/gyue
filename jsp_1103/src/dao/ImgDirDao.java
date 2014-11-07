package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.ConnUtil;
import vo.ImgDriVO;

public class ImgDirDao {
	// 현재 ImgDirDao객체는 서블릿이나 JSP에서 Model1방식으로 설계 되었다.
	// Thread가 접근할 자원이기 때문에 동기화(synchronized) 처리가 되어야 하고
	// 자원이 한정된 Connection을 받아서 사용해야 하기 때문에 싱글톤 디자인 패턴을 사용해서
	// 처음에 생성시 static영역에 하나만 생성시켜놓고 그 후에는 이미 생성된 주소로 사용하도록 한다.
	// 안드로이드에서 GridView일 때 이미 여러분은 싱글톤의 경험이 있어요 알겠죠? 
	private static ImgDirDao dao;

	public synchronized static ImgDirDao getDao() {
		if(dao == null) dao = new ImgDirDao();
		return dao;
	}
	// 재사용성에 입각한 SQL문을 관리하는 메서드를 만들어 보자.
	// add
	public void addImg(ImgDriVO vo){
		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuffer sql = new StringBuffer();
	    	sql.append("insert into imgdir values(imgdir_seq.nextVal,");
	    	sql.append("?,?,0,?,sysdate)");
		try {
			con = ConnUtil.getDs();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2, vo.getImgpath());
			pstmt.setString(3, vo.getReip());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
