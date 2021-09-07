package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class DriverTest {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db01?serverTimezone=UTC",
					"root", "9990");
			// System.out.println(conn);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			int result = 0;
			switch (num) {
			case 1:
				pstmt = conn.prepareStatement("insert into table01 values('요요', 40, 5000)");
				result = pstmt.executeUpdate();
				if(result > 0) {
					System.out.println("삽입 성공");
				} else {
					System.out.println("삽입 실패");
				}
				pstmt.close();
				conn.close();
				rs.close();
				break;
			case 2:
				pstmt = conn.prepareStatement("select * from table01");
				rs = pstmt.executeQuery();
				while(rs.next()) {
					String fullName = rs.getString("FullName");
					int age = rs.getInt("Age");
					int salary = rs.getInt("Salary");
					
					System.out.println(fullName + " " + age + " " + salary);
				}
				pstmt.close();
				conn.close();
				rs.close();
				break;
			case 3:
				pstmt = conn.prepareStatement("update table01 set Salary = 9999 where FullName='코끼리'");
				result = pstmt.executeUpdate();
				if(result > 0) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}
				pstmt.close();
				conn.close();
				rs.close();
				break;				
			case 4:
				pstmt = conn.prepareStatement("delete from table01 where FullName='요요'");
				result = pstmt.executeUpdate();
				if(result > 0) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				pstmt.close();
				conn.close();
				rs.close();
				break;
			}		
		} catch(SQLException e) {
			System.out.println("SQLException" + e);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception" + e);
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
