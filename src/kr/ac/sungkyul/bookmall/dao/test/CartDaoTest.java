package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;

import kr.ac.sungkyul.bookmall.dao.CartDAO;
import kr.ac.sungkyul.bookmall.vo.CartVo;

public class CartDaoTest {

	public static void main(String[] args) {
		
		CartListTest();

	}
	
	public static void CartListTest(){
		
		CartDAO dao=new CartDAO();
		List<CartVo> list=dao.getList();
		
		for(CartVo vo : list){
			System.out.println(vo);
		}

	}
}
