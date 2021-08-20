package com.spring.catchmind.member;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

public class LoginBizImpl implements LoginBiz {

	@Override
	public MemberDto login(MemberDto dto) {
		return null;
	}

	@Override
	public MemberDto snslogin(String member_email) {
		return null;
	}

	@Override
	public int join(MemberDto dto) {
		return 0;
	}

	@Override
	public int updatePw(MemberDto dto) {
		return 0;
	}

	@Override
	public int leaveAccount(MemberDto dto) {
		return 0;
	}

	@Override
	public int idCheck(MemberDto dto) {
		return 0;
	}

	@Override
	public int emailCheck(MemberDto dto) {
		return 0;
	}

	@Override
	public MemberDto findId(MemberDto dto) {
		return null;
	}

	@Override
	public int tokenchk(String member_email) {
		return 0;
	}

	@Override
	public void findPw(HttpServletResponse response, MemberDto dto) {
		
	}

	@Override
	public String getPw(Map<String, Object> paramMap) {
		return null;
	}

}
