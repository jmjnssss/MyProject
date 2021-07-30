package com.spring.catchmind.member;

public interface LoginDao {

	String NAMESPACE = "memberMapper.";
	
	// 로그인
	public MemberDto login(MemberDto dto);
	
	// 회원가입
	public int join(MemberDto dto);
}
