package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;

import kr.ac.sungkyul.bookmall.dao.MemberDAO;
import kr.ac.sungkyul.bookmall.vo.MemberVo;

public class MemberDAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTest();

	}
	
	public static void MemberTest(){
		
		MemberDAO dao=new MemberDAO();
		
		List<MemberVo> list=dao.getList();
		for(MemberVo vo : list){
			System.out.println(vo);
		}
		
		
	}

}
