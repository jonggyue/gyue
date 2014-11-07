package dao;

import org.apache.ibatis.session.SqlSession;

import service.FactoryService1;

import vo.MemberVO;

public class JoinDao {
	private static JoinDao dao;

	public static synchronized JoinDao getDao() {
		if (dao == null)
			dao = new JoinDao();
		return dao;
	}

	// insert 작업을 정의한 메서드
	public void MemberAdd(MemberVO v) {
		SqlSession ss = FactoryService1.getFactory().openSession();
		ss.insert("member.member_in", v);
		ss.commit();
		ss.close();
	}
}