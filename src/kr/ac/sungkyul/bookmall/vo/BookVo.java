package kr.ac.sungkyul.bookmall.vo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookVo {
	
	
	
	private Long no;
	private String title;
	private Integer rate;
	private Long authorNo;
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
		return "BookVo [no=" + no + ", title=" + title + ", rate=" + rate + ", authorNo=" + authorNo + "]";
	}
	
	

}
