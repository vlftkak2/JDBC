package kr.ac.sungkyul.hr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.ac.sungkyul.hr.vo.EmployeeVo;

public class EmployeeDao {

	public List<EmployeeVo> getList(String name) {
		List<EmployeeVo> list = new ArrayList<EmployeeVo>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");

			// Sql문에 변수가 들어간다. -> preparedStatement사용
			String sql = "select first_name, last_name ," + "email," + "PHONE_NUMBER,"
					+ "to_char(hire_date,'yyyy-mm-dd') " + "from EMPLOYEES "
					+ "where FIRST_NAme like ? or last_name like ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, "%" + name + "%");
			pstmt.setString(2, "%" + name + "%");

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String firstname = rs.getString(1);
				String lastNmae = rs.getString(2);
				String email = rs.getString(3);
				String phoneNumber = rs.getString(4);
				String hireDate = rs.getString(5);

				EmployeeVo vo = new EmployeeVo();
				vo.setFirstName(firstname);
				vo.setLastName(lastNmae);
				vo.setEmail(email);
				vo.setPhoneNumber(phoneNumber);
				vo.setHireDate(hireDate);

				list.add(vo);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("로딩할 수 없음 : " + e);
		} catch (SQLException e) {
			System.out.println("error : " + e);
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {
				System.out.println("error : " + e);
			}
		}

		return list;

	}

}
