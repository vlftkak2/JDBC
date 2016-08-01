package kr.ac.sungkyul.bookmall.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.ac.sungkyul.bookmall.vo.MemberVo;
import kr.ac.sungkyul.bookmall.vo.OrderVo;

public class OrderDAO {
	
	public List<OrderVo> getList() {
		List<OrderVo> list = new ArrayList<OrderVo>();

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
			String sql = "select a.NO,b.NAME,b.EMAIL,a.PRICE,a.DESTINATION from orders a,CUSTOMER b where a.CUSTOMER_NO=b.NO";
			rs = stmt.executeQuery(sql);
			
			

			// 5. 결과 처리
			while (rs.next()) {
				Long no = rs.getLong(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				Integer price=rs.getInt(4);
				String destination=rs.getString(5);

				OrderVo vo = new OrderVo();
				vo.setNo(no);
				vo.setCustomerName(name);
				vo.setEmail(email);
				vo.setPrice(price);
				vo.setDestination(destination);

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
