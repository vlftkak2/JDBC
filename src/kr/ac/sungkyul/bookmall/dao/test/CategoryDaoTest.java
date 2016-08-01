package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;

import kr.ac.sungkyul.bookmall.dao.CategoryDAO;
import kr.ac.sungkyul.bookmall.vo.CategoryVo;

public class CategoryDaoTest {

	public static void main(String[] args) {
		
		CategoryTest();
		
	}
	
public static void CategoryTest(){
		
		CategoryDAO dao=new CategoryDAO();
		
		List<CategoryVo> list=dao.getList();
		for(CategoryVo vo : list){
			System.out.println(vo);
		}
		
		
	}

}
