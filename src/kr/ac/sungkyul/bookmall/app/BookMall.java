package kr.ac.sungkyul.bookmall.app;

import java.util.List;

import kr.ac.sungkyul.bookmall.dao.BookDAO;
import kr.ac.sungkyul.bookmall.dao.CartDAO;
import kr.ac.sungkyul.bookmall.dao.CategoryDAO;
import kr.ac.sungkyul.bookmall.dao.MemberDAO;
import kr.ac.sungkyul.bookmall.dao.OrderBookDAO;
import kr.ac.sungkyul.bookmall.dao.OrderDAO;
import kr.ac.sungkyul.bookmall.vo.BookVo;
import kr.ac.sungkyul.bookmall.vo.CartVo;
import kr.ac.sungkyul.bookmall.vo.CategoryVo;
import kr.ac.sungkyul.bookmall.vo.MemberVo;
import kr.ac.sungkyul.bookmall.vo.OrderBook;
import kr.ac.sungkyul.bookmall.vo.OrderVo;

public class BookMall {

	public static void main(String[] args) {
		
		displayCustomerInfo();
		displayCategoryInfo();
		displayShopInfo();
		displayCartInfo();
		displayOrderInfo();
		displayOrderBookInfo();

//		Scanner key = new Scanner(System.in);
//		System.out.print("대여 하고 싶은 책의 번호를 입력하세요:");
//		int num = key.nextInt();
//		BookDAO dao = new BookDAO();
//		dao.updateStauts(num, 1);
//
//		System.out.println("*****도서 정보 출력하기******");
//		displayBookInfo();

	}

	public static void displayBookInfo() {
		System.out.println("책 리스트 ");
		BookDAO dao = new BookDAO();

		BookVo vo = new BookVo();
		List<BookVo> list = dao.getList();

		System.out.println("================");
		for (BookVo a : list) {
			
			System.out.println(a);
		}
	}
	
	public static void displayCustomerInfo(){
		System.out.println("회원 리스트");
		MemberDAO dao=new MemberDAO();
		List<MemberVo> list =dao.getList();
		
		for(MemberVo vo : list){
			System.out.println(vo);
		}
	}
	
	public static void displayCategoryInfo(){
		System.out.println("카테고리 리스트");
		CategoryDAO dao=new CategoryDAO();
		List<CategoryVo> list=dao.getList();
		
		for(CategoryVo vo : list){
			System.out.println(vo);
		}
		
	}
	
	public static void displayShopInfo(){
		System.out.println("상품 리스트");
		BookDAO dao=new BookDAO();
		List<BookVo> list=dao.getList();
		
		for(BookVo vo : list){
			System.out.println(vo);
		}
	}
	
	public static void displayCartInfo(){
		System.out.println("카트 리스트");
		
		CartDAO dao=new CartDAO();
		List<CartVo> list=dao.getList();
		
		for(CartVo vo : list){
			System.out.println(vo);
		}
	}
	
	public static void displayOrderInfo(){
		System.out.println("주문 리스트");
		
		OrderDAO dao=new OrderDAO();
		List<OrderVo> list=dao.getList();
		
		for(OrderVo vo : list){
			System.out.println(vo);
		}
	}
	
	public static void displayOrderBookInfo(){
		
		System.out.println("주문도서 리스트");
		
		OrderBookDAO dao=new OrderBookDAO();
		
		List<OrderBook> list=dao.getList();
		
		for(OrderBook vo : list){
			System.out.println(vo);
		}
	}

}
