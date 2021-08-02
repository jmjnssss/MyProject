package com.spring.catchmind.Board;

import java.sql.Date;

public class BoardDto {

	private int post_id;
	private int board_id;
	private int post_no;
	private String post_category;
	private String post_writer;
	private String post_title;
	private String post_content;
	private Date post_regdate;
	private int post_hit;
	private int post_comment_count;
	private String post_delflag;
	private String originName;
	private String changeName;
	
	public BoardDto() {
	}
	
}
