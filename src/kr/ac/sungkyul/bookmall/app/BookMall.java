package kr.ac.sungkyul.bookmall.app;

import java.util.List;
import java.util.Scanner;

import kr.ac.sungkyul.bookmall.dao.BookDAO;
import kr.ac.sungkyul.bookmall.vo.BookVo;
import kr.ac.sungkyul.hr.vo.EmployeeVo;

public class BookMall {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		System.out.print("대여 하고 싶은 책의 번호를 입력하세요:");
		int num = key.nextInt();

		updateBookInfo();

		System.out.println("*****도서 정보 출력하기******");
		displayBookInfo();

	}

	public static void displayBookInfo() {
		// dao에서 리스트 꺼내서 뿌려준다.
		BookDAO dao = new BookDAO();

		BookVo vo = new BookVo();
		List<BookVo> list = dao.getList();

		System.out.println("================");
		for (BookVo a : list) {
			
			System.out.println(a);
		}
	}

	public static void updateBookInfo() {

		BookDAO dao = new BookDAO();
		int count=dao.updateStauts(3, 1);
//		System.out.println("업데이트된 row 수 : "+count);
	}
}
