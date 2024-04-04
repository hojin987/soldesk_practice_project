package com.spring.mypro00.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.mypro00.domain.MyBoardVO;
import com.spring.mypro00.mapper.MyBoardMapper;

@Service
public class MyBoardServiceImpl implements MyBoardService {
	
	//매퍼 인터페이스 주입
	private MyBoardMapper myBoardMapper;
	
	public MyBoardServiceImpl(MyBoardMapper myBoardMapper) {
		this.myBoardMapper = myBoardMapper;
	}
	
	//게시물 목록 조회 서비스
	@Override
	public List<MyBoardVO> getBoardList() {
		System.out.println("MyBoardService.getBoardList() 실행");
		return myBoardMapper.selectMyBoardList();
	}
	
	//게시물 등록: selectKey사용
	@Override
	public long registerBoard(MyBoardVO myBoard) {
		System.out.println("MyBoardService.registerBoard()에 전달된 MyBoardVO" + myBoard);
		
		myBoardMapper.insertMyBoard(myBoard);
		
		return myBoard.getBno();
	}
	
	//게시물 조회
	@Override
	public MyBoardVO getBoard(long bno) {
		System.out.println("전달된 bno" + bno);
		
		myBoardMapper.updateBviewCnt(bno);
		return myBoardMapper.selectMyBoard(bno);
	}
	
	//게시물 수정 처리
	@Override
	public boolean modifyBoard(MyBoardVO myBoard) {
		
		return myBoardMapper.updateMyBoard(myBoard) == 1;
	}
	
	//게시물 삭제 - bdelFlag만 1로수정
	@Override
	public boolean setBoardDeleted(long bno) {
		
		return myBoardMapper.updateBdelFlag(bno) == 1;
	}

	@Override
	public boolean removeBoard(long bno) {
		return myBoardMapper.deleteMyBoard(bno) == 1;
	}
	
}
