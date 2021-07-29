package com.spring.catchmind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	// 로그인 창
	@RequestMapping("/loginform.do")
	public String loginForm() {
		return "member/login";
	}
	
	// 회원가입 창
	@RequestMapping("/joinform.do")
	public String joinForm() {
		return "member/joinform";
	}
}
