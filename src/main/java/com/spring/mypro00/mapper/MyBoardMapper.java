package com.spring.mypro00.mapper;

import java.util.List;

import com.spring.mypro00.domain.MyBoardVO;

public interface MyBoardMapper {
	//게시물 목록조회
	public List<MyBoardVO> selectMyBoardList();
	
	//게시물 등록 - selectKey 이용
	public Integer insertMyBoard(MyBoardVO myboard);
	
	//특정 게시물 조회
	public MyBoardVO selectMyBoard(Long bno);
	
	//특정 게시물 삭제 요청
	public int updateBdelFlag(Long bno);
	
	//특정 게시물 삭제 - 실제 삭제
	public int deleteMyBoard(Long bno);
	
	//게시물 삭제(관리자)
	
	//특정 게시물 수정
	public int updateMyBoard(MyBoardVO myBoard);
	
	//특정 게시물 조회수 증가
	public void updateBviewCnt(Long bno);

}
