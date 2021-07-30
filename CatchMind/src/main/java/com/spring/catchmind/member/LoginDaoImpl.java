package com.spring.catchmind.member;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginDaoImpl implements LoginDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	@Override
	public MemberDto login(MemberDto dto) {
		
		MemberDto res = null;
		
		
		return res;
	}

	@Override
	public int join(MemberDto dto) {
		
		int res = 0;
		
		return res;
	}

}
