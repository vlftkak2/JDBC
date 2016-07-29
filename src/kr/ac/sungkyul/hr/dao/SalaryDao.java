package kr.ac.sungkyul.hr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.ac.sungkyul.hr.vo.EmployeeVo;
import kr.ac.sungkyul.hr.vo.SalaryVo;

public class SalaryDao {

	public List<SalaryVo> getList(int minSalary, int maxSalary) {

		List<SalaryVo> list = new ArrayList<SalaryVo>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");

			// Sql문에 변수가 들어간다. -> preparedStatement사용
			String sql = "select first_name,"
					+ "salary from employees "
					+ "where salary>= ? "
					+ "and salary<= ? order by salary";

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, minSalary);
			pstmt.setInt(2, maxSalary);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String firstname = rs.getString(1);
				Integer salary = rs.getInt(2);

				SalaryVo vo = new SalaryVo();
				vo.setFirstName(firstname);
				vo.setSalary(salary);

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
