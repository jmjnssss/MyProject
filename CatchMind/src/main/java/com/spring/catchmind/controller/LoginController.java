package com.spring.catchmind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	// 로그인 창
	@RequestMapping("/login.do")
	public String loginForm() {
		return "member/login";
	}
	
	// 회원가입 창
	@RequestMapping("/joinform.do")
	public String joinForm() {
		return "member/joinform";
	}
	
	// 아이디 찾기
	@RequestMapping("/findIdForm.do")
	public String findIdForm() {
		return "member/findIdForm";
	}
	
	// 비밀번호 찾기
	@RequestMapping("/findPwForm.do")
	public String findPwForm() {
		return "member/findPwForm";
	}
	
	// 비밀번호 변경
	@RequestMapping("/updatePwForm.do")
	public String updatePwForm() {
		return "member/updatePwForm";
	}
}
