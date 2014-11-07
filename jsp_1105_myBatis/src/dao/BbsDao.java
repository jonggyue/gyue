package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import service.FactoryService;
import vo.BbsVO;

public class BbsDao {
	private static BbsDao dao;

	public static synchronized BbsDao getDao() {
		if (dao == null)
			dao = new BbsDao();
		return dao;
	}

	// insert 작업을 정의한 메서드
	public void bbsAdd(BbsVO v) {
		SqlSession ss = FactoryService.getFactory().openSession();
		ss.insert("bbs.bbs_in", v);
		ss.commit();
		ss.close();
	}
	// select된 내용을 VO에 담아서 List로 반환해주는 메서드
	public List<BbsVO> getList(){
		SqlSession ss = FactoryService.getFactory().openSession();
		List<BbsVO> list = ss.selectList("bbs.bbs_list");
		ss.close();
		return list;
	}
	// select된 내용을 detail 메서드
	public BbsVO getDetail(int num){
		System.out.println(num);
		SqlSession ss = FactoryService.getFactory().openSession();
		ss.update("bbs.bbs_hit",num);
		BbsVO vo = ss.selectOne("bbs.bbs_detail",num);
		ss.commit();
		ss.close();
		return vo;
	}
	// delete
	public BbsVO delete(int num){
		SqlSession ss = FactoryService.getFactory().openSession();
		BbsVO vo = ss.selectOne("bbs.bbs_delete", num);
		ss.commit();
		ss.close();
		return vo;
	}
	public void update(BbsVO vo){
		SqlSession ss = FactoryService.getFactory().openSession();
		ss.update("bbs.bbs_update", vo);
		ss.commit();
		ss.close();
	}
}
