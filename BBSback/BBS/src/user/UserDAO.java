package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO(){
		try {
			String dbURL = "jdbc:mysql://localhost:3306/BBS";
			String dbID = "root";
			String dbPassword = "1234";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public int login(String userID, String userPassword){
		String SQL = "select userPassword from user where userID=?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			rs = pstmt.executeQuery();
			if(rs.next()){
				if(rs.getString(1).equals(userPassword)){
					return 1; //로그인 성공
				}
				else
					return 0; //비밀번호 불일치
			}
			return -1; //아이디가 없음
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -2; //데이터베이스 오류
	}
	
	public int join(User user){
		String SQL = "insert into user values(?, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, user.getUserID());
			pstmt.setString(2, user.getUserPassword());
			pstmt.setString(3, user.getUserName());
			pstmt.setString(4, user.getUserAddress());
			pstmt.setString(5, user.getUserEmail());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; //데이터베이스 오류
	}
	
	// idCheck(id)
	public int idCheck(String userID){
		int result =0;
		String SQL = "select * from user where userID=?";
		try {
			pstmt = conn.prepareStatement(SQL);	
			pstmt.setString(1, userID);
			rs = pstmt.executeQuery();

			if(rs.next()){
				result = 1; //회원이 있음 -> 해당아이디 X
			}else{
				result = 0; //회원이 없음 -> 해당아이디 O
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return result;
	}
	
	public User getUser(String userID){
		User user = new User();
		String SQL = "select * from user where userID = ?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			rs = pstmt.executeQuery();
			if(rs.next()){ 
				user.setUserID(userID);
				user.setUserPassword(rs.getString("userPassword"));
				user.setUserName(rs.getString("userName"));
				user.setUserAddress(rs.getString("userAddress"));
				user.setUserEmail(rs.getString("userEmail"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try{
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		return user; 
		
	}
	
	public int update(User user){
		String SQL = "update user set userPassword=?, userName=?, userAddress=?, userEmail=? where userID=?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, user.getUserPassword());
			pstmt.setString(2, user.getUserName());
			pstmt.setString(3, user.getUserAddress());
			pstmt.setString(4, user.getUserEmail());
			pstmt.setString(5, user.getUserID());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; //데이터베이스 오류
	}
	
	public int delete(User user){
		String SQL = "delete from user where userID=?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, user.getUserID());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; //데이터베이스 오류
	}
	
	public int joinIdCheck(String userID){
		int result = -1;
		
		try {
			String SQL = "select userID from user where userID=?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			
			//실행 -> select -> rs저장
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				result = 0;
			}else{
				result = 1;
			}
			
			System.out.println("아이디 중복체크결과 : "+result);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try{
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		return result;

	}
	
}
