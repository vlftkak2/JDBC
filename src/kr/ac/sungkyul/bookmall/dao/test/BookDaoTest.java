package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;

import kr.ac.sungkyul.bookmall.dao.BookDAO;
import kr.ac.sungkyul.bookmall.vo.AuthorVo;
import kr.ac.sungkyul.bookmall.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {
		
		
		//testBookDaoGetInsert();
		testBookDaoGetList();

	}
	
	public static void testBookDaoGetList() {
		BookDAO dao = new BookDAO();
		List<BookVo> list = dao.getList();

		for (BookVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void testBookDaoGetInsert() {
		BookDAO dao=new BookDAO();
		BookVo vo = new BookVo();
		vo.setTitle("트와일라잇");
		vo.setRate(1);
		vo.setStatus(0); //0 :재고 있음 1:대여중
		vo.setAuthorNo(1L);
		dao.insert(vo);
		
		vo.setTitle("뉴문");
		vo.setRate(1);
		vo.setStatus(0);
		vo.setAuthorNo(1L);
		
		dao.insert(vo);
		
		vo.setTitle("이클립스");
		vo.setRate(1);
		vo.setStatus(0);
		vo.setAuthorNo(1L);
		dao.insert(vo);
		
		vo.setTitle("브레이킹던");
		vo.setRate(1);
		vo.setStatus(0);
		vo.setAuthorNo(1L);
		dao.insert(vo);
		
		vo.setTitle("아리랑");
		vo.setRate(1);
		vo.setStatus(0);
		vo.setAuthorNo(5L);
		dao.insert(vo);
		
		vo.setTitle("젊은그들");
		vo.setRate(1);
		vo.setStatus(0);
		vo.setAuthorNo(3L);
		dao.insert(vo);
		
		vo.setTitle("아프니까 청춘이다");
		vo.setRate(1);
		vo.setStatus(0);
		vo.setAuthorNo(3L);
		dao.insert(vo);
		
		vo.setTitle("귀천");
		vo.setRate(5);
		vo.setStatus(0);
		vo.setAuthorNo(4L);
		dao.insert(vo);
		
		vo.setTitle("태백산맥");
		vo.setRate(1);
		vo.setStatus(0);
		vo.setAuthorNo(2L);
		dao.insert(vo);
		
		vo.setTitle("풀하우스");
		vo.setRate(1);
		vo.setStatus(0);
		vo.setAuthorNo(6L);
		dao.insert(vo);
		
	}
	
	public static void testBookDaoUpdate(){
		BookDAO dao = new BookDAO();
		
		BookVo vo = new BookVo();
		vo.setNo(1L);
		vo.setTitle("나의나무가짐");
		vo.setRate(3);
		
		int count=dao.update(vo);
		System.out.println("업데이트된 row 수 : "+count);
	}
	
	public static void testBookDaoDelete(){
		BookDAO dao = new BookDAO();
		int count=dao.delete(3L);
		System.out.println("삭제된 row 수 : "+count);
	}
	
	public static void testBookDaoDeleteAll(){
		BookDAO dao=new BookDAO();
		int count=dao.delete();
		System.out.println("삭제된 row 수 : "+count);
	
	 }
	
	
	
}
