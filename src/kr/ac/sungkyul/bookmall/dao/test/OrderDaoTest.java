package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;

import kr.ac.sungkyul.bookmall.dao.OrderDAO;
import kr.ac.sungkyul.bookmall.vo.OrderVo;

public class OrderDaoTest {

	public static void main(String[] args) {
		
		OrderListTest();

	}
	
	public static void OrderListTest(){
		
		OrderDAO dao=new OrderDAO();
		List<OrderVo> list=dao.getList();
		
		for(OrderVo vo : list){
			System.out.println(vo);
		}
		
	}

}
