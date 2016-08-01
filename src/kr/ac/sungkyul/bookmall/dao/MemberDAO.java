package kr.ac.sungkyul.bookmall.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.ac.sungkyul.bookmall.vo.BookVo;
import kr.ac.sungkyul.bookmall.vo.MemberVo;

public class MemberDAO {
	
	public List<MemberVo> getList() {
		List<MemberVo> list = new ArrayList<MemberVo>();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 연결 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "skudb", "skudb");

			// 3. statement 생성
			stmt = conn.createStatement();

			// 4. SQL문 실행
			String sql = "select no,name,PHONENUMBER,email,password from CUSTOMER";
			rs = stmt.executeQuery(sql);
			
			

			// 5. 결과 처리
			while (rs.next()) {
				Long no = rs.getLong(1);
				String name=rs.getString(2);
				String phonenumber=rs.getString(3);
				String email=rs.getString(4);
				String password=rs.getString(5);

				MemberVo vo = new MemberVo();
				vo.setNo(no);
				vo.setName(name);
				vo.setPhoneNumber(phonenumber);
				vo.setEmail(email);
				vo.setPassword(password);

				list.add(vo);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 :" + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				// 6. 자원정리
				if (rs != null) {
					rs.close();
				}

				if (stmt != null) {
					stmt.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
		}

		return list;

	}

}
