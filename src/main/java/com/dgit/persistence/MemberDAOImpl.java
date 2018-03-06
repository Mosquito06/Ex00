package com.dgit.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.dgit.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	private static final String namespace = "com.dgit.persistence.MemberDAO"; // Mapper.xml에 등록한 namespace와 동일해야함
	
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public String getTime() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".getTime");
	}

	@Override
	public void insertMember(MemberVO vo) throws Exception {
		sqlSession.insert(namespace + ".insertMember", vo); 

	}

	@Override
	public MemberVO readMember(String userid) throws Exception {
		return sqlSession.selectOne(namespace + ".readMember", userid);
	}

	@Override
	public MemberVO readWithPW(String userid, String userpw) throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("userid", userid);
		map.put("userpw", userpw);
		
		return sqlSession.selectOne(namespace + ".readWithPW", map);
	}

	@Override
	public List<MemberVO> listAll() throws Exception {
		return sqlSession.selectList(namespace + ".listAll");
	}

	@Override
	public void update(MemberVO vo) throws Exception {
		sqlSession.update(namespace + ".update", vo);
		
	}

	@Override
	public void delete(MemberVO vo) throws Exception {
		sqlSession.delete(namespace + ".delete", vo);
		
	}

}
