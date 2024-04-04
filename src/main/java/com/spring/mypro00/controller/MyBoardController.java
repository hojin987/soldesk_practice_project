package com.spring.mypro00.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.mypro00.domain.MyBoardVO;
import com.spring.mypro00.service.MyBoardService;

@Controller
@RequestMapping("/myboard")
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
	@GetMapping("/register")
	public void showBoardRegister() {}
	
//	등록 처리 POST /myboard/register 등록 처리(서버 저장) 후  목록페이지로 이동 
	@PostMapping("/register")
	public String registerNewBoard(MyBoardVO myBoard, RedirectAttributes redirectAttr) {
		long bno = myBoardService.registerBoard(myBoard);
		redirectAttr.addFlashAttribute("result", bno);
		
		return "redirect:/myboard/list";
	}
	
//	특정 게시물 조회 GET /myboard/detail 목록 페이지  조회 페이지 호출(내용 표시 및 조회수 1 증가) 
	@GetMapping("/detail")
	public void showBoardDetail(@RequestParam("bno") long bno, Model model) {
		model.addAttribute("board", myBoardService.getBoard(bno));
	}
	
//	특정 게시물 수정삭제 페이지 호출 GET /myboard/modify 조회 페이지  수정-삭제 페이지 이동 
	@GetMapping("/modify")
	public void showBoardModify(@RequestParam("bno") long bno, Model model) {
		model.addAttribute("board", myBoardService.getBoard(bno));
	}
	
//	특정 게시물 수정 POST /myboard/modify 수정 처리(서버 저장) 후  조회 페이지 이동 
	@PostMapping("/modify")
	public String modifyBoard(MyBoardVO myBoard, RedirectAttributes redirectAttr) {
		if(myBoardService.modifyBoard(myBoard)) {
			redirectAttr.addFlashAttribute("result", "successModify");
		}
		return "redirect:/myboard/list";
	}
	
//	특정 게시물 삭제의뢰 POST /myboard/delete 삭제의뢰 처리(서버 저장) 후  목록 페이지 이동 
	@PostMapping("/delete")
	public String setBoardDeleted(@RequestParam("bno") long bno, RedirectAttributes redirectAttr) {
		if(myBoardService.setBoardDeleted(bno)) {
			redirectAttr.addFlashAttribute("result", "successRemove");
		}
		return "redirect:/myboard/list";
	}
	
//	특정 게시물 삭제 POST /myboard/remove 
	@PostMapping("/remove")
	public String removeBoard(@RequestParam("bno") long bno, RedirectAttributes redirectAttr) {
		if(myBoardService.removeBoard(bno)) {
			redirectAttr.addFlashAttribute("result", "successRemove");
		}
		return "redirect:/myboard/list";
	}
	
}
