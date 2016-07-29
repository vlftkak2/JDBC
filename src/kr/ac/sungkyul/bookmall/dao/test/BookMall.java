package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;

import kr.ac.sungkyul.bookmall.dao.AuthorDAO;
import kr.ac.sungkyul.bookmall.dao.BookDAO;
import kr.ac.sungkyul.bookmall.vo.AuthorVo;
import kr.ac.sungkyul.bookmall.vo.BookVo;

public class BookMall {

	public static void main(String[] args) {

		// testAuthorDaoGetList();
		// testAuthorDaoGetInsert();
		//testBookDaoGetList();
		// testBookDaoGetInsert();
	}

	public static void testAuthorDaoGetList() {
		AuthorDAO dao = new AuthorDAO();
		List<AuthorVo> list = dao.getList();

		for (AuthorVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void testAuthorDaoGetInsert() {
		AuthorVo vo = new AuthorVo();
		vo.setName("플라톤");
		vo.setDescription("");

		AuthorDAO dao = new AuthorDAO();
		dao.insert(vo);
	}

	public static void testBookDaoGetList() {
		BookDAO dao = new BookDAO();
		List<BookVo> list = dao.getList();

		for (BookVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void testBookDaoGetInsert() {
		BookVo vo = new BookVo();
		vo.setTitle("그리스로마신화");
		vo.setRate(5);
		vo.setAuthorNo(4L);
		
		BookDAO dao=new BookDAO();
		dao.insert(vo);

	}

}
