package com.javaex.dao;

import java.util.List;

import com.javaex.vo.guestbookVo;

public class guestbookTest {

	public static void main(String[] args) {
		guestbookDao guestdao = new guestbookDao();
		guestbookVo bookVo = new guestbookVo();
	
		//System.out.println(plist.get(0).getPw());

		/*
		//데이터 입력하기
		guestbookVo vo = new guestbookVo("유병재","12342424","as안녕하세요");
		guestdao.personInsert(vo);
		
		
		//데이터 삭제하기
		guestdao.personDelete(4,"12342424");
		
		//데이터 출력하기
			List<guestbookVo> plist = guestdao.getPersonList();
		System.out.println(plist.toString());*/
	}

}
