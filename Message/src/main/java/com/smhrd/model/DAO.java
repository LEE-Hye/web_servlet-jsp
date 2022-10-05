package com.smhrd.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;


public class DAO {

	// sql도와줄 도구인 factory를 생성해줘야 한다.
	private SqlSessionFactory sqlSessionFactory = com.smhrd.db.SqlSessionManager.getSqlSessionFactory();
	
	public int join(WebMember vo) {
		
		// 1. sqlSession 열어주기
		// true일 때 데이터를 담아줄 수 있어
		SqlSession sqlSession =  sqlSessionFactory.openSession(true);
	
		// 2. sqlsession 활용해서 sql구문 실행하기
		int row = sqlSession.insert("com.smhrd.model.DAO.join", vo);
		
		// 3. 결과값 반환하기
		return row;
	}
	
	public WebMember login(WebMember vo) {
		
		// 1. sqlSession 생성하기
		SqlSession sqlSession =  sqlSessionFactory.openSession(true);
		
		// 2. 쿼리문 실행하기
		// ("mapper식별자(namespace).sql문 id값", 매퍼에 보내줄 데이터);
		WebMember resultVO = sqlSession.selectOne("com.smhrd.model.DAO.login", vo);
		
		// 3. 결과값 반환하기
		return resultVO;
	}
	
	public List<WebMember> selectAll() {
		
		// 1. sqlsession 만들기
		SqlSession sqlSession =  sqlSessionFactory.openSession(true);
		
		// 2. 실행하기
		List<WebMember> list = sqlSession.selectList("com.smhrd.model.DAO.selectAll");
		
		// 3. 결과값 반환
		return list;
		
		
	}
}
