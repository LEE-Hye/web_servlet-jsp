package com.smhrd.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;


public class DAO {

	private SqlSessionFactory sqlSessionFactory = com.smhrd.db.SqlSessionManager.getSqlSessionFactory();
	
	public int join(WebMember vo) {
		
		// 1. sqlSession 열어주기
		SqlSession sqlSession =  sqlSessionFactory.openSession(true);
	
		// 2. sqlsession 활용해서 sql구문 실행하기
		int row = sqlSession.insert("com.smhrd.model.DAO.join", vo);
		
		// 3. 결과값 반환하기
		return row;
	}
}
