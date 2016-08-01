package kr.ac.sungkyul.bookmall.vo;

public class OrderVo {
	
	private Long no;
	private int CustomerNo;;
	private String CustomerName;
	private String email;
	
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private int price;
	private String destination;
	
	
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public int getCustomerNo() {
		return CustomerNo;
	}
	public void setCustomerNo(int customerNo) {
		CustomerNo = customerNo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "주문 번호 : "+no+"번"+", 주문자 이름 : "+CustomerName+", 주문자 이메일 : "+email+", 가격 : "+price+"원";
		
	}
	
	
	
	

}
