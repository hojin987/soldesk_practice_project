package com.spring.mypro00.service;

import java.util.List;

import com.spring.mypro00.domain.MyBoardVO;

public interface MyBoardService {
	
	//게시물 목록 조회 서비스
	public List<MyBoardVO> getBoardList();
	
	//게시물 등록: select Key이용
	public long registerBoard(MyBoardVO myBoard);
	
	//게시물 조회: bno + 조회수 증가 고려
	public MyBoardVO getBoard(long bno);
	
	//게시물 수정
	public boolean modifyBoard(MyBoardVO myBoard);
	
	//게시물 삭제 - bdelFlag 컬럼만 1로 수정
	public boolean setBoardDeleted(long bno);
	
	//게시물 삭제 - 실제 삭제 발생
	public boolean removeBoard(long bno);
	

}
