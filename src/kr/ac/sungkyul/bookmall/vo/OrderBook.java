package kr.ac.sungkyul.bookmall.vo;

public class OrderBook {
	
	private Long orderNo;
	private Long bookNo;
	private int count;
	private int price;
	private String booktitle;
	
	
	public Long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}
	public Long getBookNo() {
		return bookNo;
	}
	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
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
	
	
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	
	@Override
	public String toString() {
		return  "책 번호 : " + bookNo +"번"+ ", 책 제목  : " + booktitle + ", 수량 : " + count+"개";
	}
	
	

}
