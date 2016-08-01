package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;

import kr.ac.sungkyul.bookmall.dao.OrderBookDAO;
import kr.ac.sungkyul.bookmall.vo.OrderBook;

public class OrderBookDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderBookListTest();

	}
	
	public static void OrderBookListTest(){
		
		OrderBookDAO dao=new OrderBookDAO();
		
		List<OrderBook> list=dao.getList();
		
		for(OrderBook vo : list){
			System.out.println(vo);
		}
	}

}
