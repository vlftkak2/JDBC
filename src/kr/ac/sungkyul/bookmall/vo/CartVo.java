package kr.ac.sungkyul.bookmall.vo;

public class CartVo {
	
	private Long BookNo;
	private Long CustomerNo;
	private int count;
	private int price;
	private String title;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getBookNo() {
		return BookNo;
	}
	public void setBookNo(Long bookNo) {
		BookNo = bookNo;
	}
	public Long getCustomerNo() {
		return CustomerNo;
	}
	public void setCustomerNo(Long customerNo) {
		CustomerNo = customerNo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "책 제목 : "+title+" 수량 : "+count+"개"+", 가격  : "+price+"원";
	}
	
	

}
