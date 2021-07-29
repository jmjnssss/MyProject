package com.spring.catchmind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

	@RequestMapping("/boardlist.do")
	public String board() {
		return "board/boardlist";
	}
	
	
}
