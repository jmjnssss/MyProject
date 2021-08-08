package com.spring.catchmind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

	// 게시판
	@RequestMapping("/boardlist.do")
	public String board() {
		return "board/boardlist";
	}
	
	// 공지사항
	@RequestMapping("/noticeboardDetail.do")
	public String noticeboardDetail() {
		return "board/noticeboardDetail";
	}
	
	// 공지 작성
	@RequestMapping("/noticeboardInsert.do")
	public String noticeboardInsert() {
		return "board/noticeboardInsert";
	}
	
	// 공지 수정
	@RequestMapping("/noticeboardUpdate.do")
	public String noticeboardUpdate() {
		return "board/noticeboardUpdate";
	}
	
	// 문의게시판 글보기
	@RequestMapping("/qnaboardDetail.do")
	public String qnaboardDetail() {
		return "board/qnaboardDetail";
	}
	
	// 문의 작성
	@RequestMapping("/qnaboardInsert.do")
	public String qnaboardInsert() {
		return "board/qnaboardInsert";
	}
	
	// 문의게시판
	@RequestMapping("/qnaboardList.do")
	public String qnaboardList() {
		return "board/qnaboardList";
	}
	
	// 문의 수정
	@RequestMapping("/qnaboardUpdate.do")
	public String qnaboardUpdate() {
		return "board/qnaboardUpdate";
	}
	
	// 에러페이지
	@RequestMapping("/errorPage.do")
	public String errorPage() {
		return "board/errorPage";
	}
	
	
	
}
