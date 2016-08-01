package kr.ac.sungkyul.bookmall.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.ac.sungkyul.bookmall.vo.CartVo;
import kr.ac.sungkyul.bookmall.vo.CategoryVo;

public class CartDAO {
	
	public List<CartVo> getList() {
		List<CartVo> list = new ArrayList<CartVo>();

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
			String sql = "select b.title,a.COUNT, a.PRICE from cart a, book b where a.BOOKNO=b.NO";
			rs = stmt.executeQuery(sql);
			
			

			// 5. 결과 처리
			while (rs.next()) {
				String title=rs.getString(1);
				Integer count=rs.getInt(2);
				Integer price=rs.getInt(3);
				

				CartVo vo = new CartVo();
				vo.setTitle(title);
				vo.setCount(count);
				vo.setPrice(price);
				

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
