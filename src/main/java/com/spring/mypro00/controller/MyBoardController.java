package com.spring.mypro00.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.mypro00.service.MyBoardService;

@Controller
public class MyBoardController {
	
	private MyBoardService myBoardService;
	
	public MyBoardController(MyBoardService myBoardService) {
		this.myBoardService = myBoardService;
	}
	
//	목록 조회 GET /myboard/list 
	@GetMapping("/list")
	public void showBoardList(Model model) {
		model.addAttribute("boardList", myBoardService.getBoardList());
	}
	
//	등록 페이지 호출 GET /myboard/register 목록 페이지  등록 페이지로 이동 
//	등록 처리 POST /myboard/register 등록 처리(서버 저장) 후  목록페이지로 이동 
//	특정 게시물 조회 GET /myboard/detail 목록 페이지  조회 페이지 호출(내용 표시 및 조회수 1 증가) 
//	특정 게시물 수정삭제 페이지 호출 GET /myboard/modify 조회 페이지  수정-삭제 페이지 이동 
//	특정 게시물 수정 POST /myboard/modify 수정 처리(서버 저장) 후  조회 페이지 이동 
//	특정 게시물 삭제의뢰 POST /myboard/delete 삭제의뢰 처리(서버 저장) 후  목록 페이지 이동 
//	특정 게시물 삭제 POST /myboard/remove 
	
}
