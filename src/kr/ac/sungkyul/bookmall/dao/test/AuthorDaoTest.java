package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;

import kr.ac.sungkyul.bookmall.dao.AuthorDAO;
import kr.ac.sungkyul.bookmall.vo.AuthorVo;

public class AuthorDaoTest {

	public static void main(String[] args) {
		testAuthorDaoGetList();
		//testAuthorDaoUpdate();
		 testAuthorDaoGetInsert();
		// testAuthorDaoDelete();
		testAuthorDaoGetList();
	};

	public static void testAuthorDaoGetList() {
		AuthorDAO dao = new AuthorDAO();
		List<AuthorVo> list = dao.getList();

		for (AuthorVo vo : list) {
			System.out.println(vo);
		}
	}

	public static void testAuthorDaoGetInsert() {
		AuthorDAO dao = new AuthorDAO();
		AuthorVo vo = new AuthorVo();
		vo.setName("스테파니메이어");
		vo.setDescription("");
		dao.insert(vo);

		vo.setName("조정래");
		vo.setDescription("");
		dao.insert(vo);
		
		vo.setName("김동인");
		vo.setDescription("");
		dao.insert(vo);
		
		vo.setName("천상병");
		vo.setDescription("");
		dao.insert(vo);
		
		vo.setName("조정래");
		vo.setDescription("");
		dao.insert(vo);
		
		vo.setName("원수연");
		vo.setDescription("");
		dao.insert(vo);
	}

	public static void testAuthorDaoDelete() {

		AuthorDAO dao = new AuthorDAO();
		int count = dao.delete(12L);
		System.out.println("삭제된 row 수 " + count);
	}

	public static void testAuthorDaoUpdate() {
		AuthorDAO dao = new AuthorDAO();

		AuthorVo vo = new AuthorVo();
		vo.setNo(1L);
		vo.setName("최형민");
		vo.setDescription("Im hyungmin");
		int count = dao.update(vo);
		System.out.println("업데이트된 row 수 " + count);
	}

	public static void testAuthorDaoDeleteAll() {

		AuthorDAO dao = new AuthorDAO();
		int count = dao.delete();
		System.out.println("전체 삭제된 row 수 " + count);
	}

}
