package com.itwillbs.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDAO {
	// Data Access Object : DB 데이터 처리 객체
	// => DB에 관련된 모든 동작을 수행하는 객체
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private String sql = "";
	
	// 디비연결 필요정보 
	String DRIVER = "com.mysql.jdbc.Driver";
	String DBURL = "jdbc:mysql://localhost:3306/jspdb";
	String DBID = "root";
	String DBPW = "1234";
	
	
	// 글쓰기 동작 => 메서드 insertBoard(BoardBean bb)
	public void insertBoard(BoardBean bb){
		try {
			// 1 드라이버 로드
			Class.forName(DRIVER);
			// 2 디비 연결
			conn = DriverManager.getConnection(DBURL, DBID, DBPW);
			// 3 sql 작성 (insert) & pstmt 객체 생성
			sql = "insert into itwill_board "
					+ "values(?,?,?,?,?,?,?,?,?,now(),?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			// ?
			pstmt.setInt(1, 1);
			pstmt.setString(2, bb.getName());
			pstmt.setString(3, bb.getPass());
			pstmt.setString(4, bb.getSubject());
			pstmt.setString(5, bb.getContent());
			pstmt.setInt(6, bb.getReadcount());
			pstmt.setInt(7, bb.getRe_ref());
			pstmt.setInt(8, bb.getRe_lev());
			pstmt.setInt(9, bb.getRe_seq());
			pstmt.setString(10, bb.getIp());
			pstmt.setString(11, bb.getFile());
			
			// 4 sql 실행	
			
			pstmt.executeUpdate();
			
			System.out.println(" sql 구문 실행완료  : 글쓰기 완료! ");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패!!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("디비 연결 실패!!");
			e.printStackTrace();
		}
		
	}
	// 글쓰기 동작 => 메서드 insertBoard(BoardBean bb)
	
	

}
