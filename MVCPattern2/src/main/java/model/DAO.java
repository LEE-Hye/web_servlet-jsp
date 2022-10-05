package model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import database.SqlSessionManager;

public class DAO {

	// 1) SqlSessionFactory 만들기
	// ----> sqlSession만들어줌!
	// ----> sqlSession? (sql구문 실행, 종료할 수 있게끔 해주는 도구)
	
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSessionFactory();
	
	
	// 2) 데이터베이스에 수행하고 싶은 기능 정의하기
	public int join(AiMember vo) {
		// 3) SqlSession 만들어주기
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		// openSession(true) ----> auto commit(insert, delete, update)
		
		// 4) session을 활용해서 mapper안에 있는 기능을 수행
		// sqlSession.insert(mapper 식별자.sql문 id값, mapper파일에 보내줄 데이터
		int row = sqlSession.insert("model.DAO.join", vo);
		
		return row;
	}
	
	public AiMember login(AiMember vo) {
		
		// 1) sqlsession 만들기
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		// 2) mapper 쿼리문 실행
		// 하나의 값만 조회 : selectOne(mapper식별자, 매개변수),
		// 여러개의 값 조회 : selectList(mapper식별자, 매개변수(생략가능))
		AiMember resultVo = sqlSession.selectOne("model.DAO.login", vo);
		
		// 3) 결과값 반환
		return resultVo;
		
	}
}
