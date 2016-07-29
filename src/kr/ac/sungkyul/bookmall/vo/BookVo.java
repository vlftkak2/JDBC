package kr.ac.sungkyul.bookmall.vo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookVo {
	

	private Long no;
	private String title;
	private Integer rate;
	private Integer status;
	private Long authorNo;
	private String authorName;
	
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	//private String authorName;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public Long getAuthorNo() {
		return authorNo;
	}
	public void setAuthorNo(Long authorNo) {
		this.authorNo = authorNo;
	}
	
	@Override
	public String toString() {
		String str = status == 0 ? "재고있음" : "대여중";
		return "넘버 : " + no + " 책 제목 : " + title + " 평가 : " + rate + " 대여 유무 : " + str + " 저자 번호 : "
				+ authorNo + " 저자 이름 : " + authorName;
	}

	
	

}
