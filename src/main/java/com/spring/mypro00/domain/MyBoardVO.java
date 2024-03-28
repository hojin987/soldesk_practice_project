package com.spring.mypro00.domain;

import java.sql.Timestamp;
import java.util.Date;

public class MyBoardVO {
	private long bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private int bviewsCnt;
	private int breplyCnt;
	private int bdelFlag;
	private Date bregDate;
	private Timestamp bmodDate;
	
	public MyBoardVO() {}

	public MyBoardVO(long bno, String btitle, String bcontent, String bwriter, int bviewsCnt, int breplyCnt,
			int bdelFlag, Date bregDate, Timestamp bmodDate) {
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwriter = bwriter;
		this.bviewsCnt = bviewsCnt;
		this.breplyCnt = breplyCnt;
		this.bdelFlag = bdelFlag;
		this.bregDate = bregDate;
		this.bmodDate = bmodDate;
	}

	public long getBno() {
		return bno;
	}

	public void setBno(long bno) {
		this.bno = bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getBwriter() {
		return bwriter;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public int getBviewsCnt() {
		return bviewsCnt;
	}

	public void setBviewsCnt(int bviewsCnt) {
		this.bviewsCnt = bviewsCnt;
	}

	public int getBreplyCnt() {
		return breplyCnt;
	}

	public void setBreplyCnt(int breplyCnt) {
		this.breplyCnt = breplyCnt;
	}

	public int getBdelFlag() {
		return bdelFlag;
	}

	public void setBdelFlag(int bdelFlag) {
		this.bdelFlag = bdelFlag;
	}

	public Date getBregDate() {
		return bregDate;
	}

	public void setBregDate(Date bregDate) {
		this.bregDate = bregDate;
	}

	public Timestamp getBmodDate() {
		return bmodDate;
	}

	public void setBmodDate(Timestamp bmodDate) {
		this.bmodDate = bmodDate;
	}
	
	
	
	
	
}
