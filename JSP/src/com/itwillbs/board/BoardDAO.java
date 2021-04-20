package com.itwillbs.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BoardDAO {
	// Data Access Object : DB 데이터 처리 객체
	// => DB에 관련된 모든 동작을 수행하는 객체
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private String sql = "";
	

	
	private Connection getConnection(){
		/*// 디비연결 필요정보 (지역변수)
		String DRIVER = "com.mysql.jdbc.Driver";
		String DBURL = "jdbc:mysql://localhost:3306/jspdb";
		String DBID = "root";
		String DBPW = "1234";
		// 1,2단계 
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(DBURL, DBID, DBPW);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		
		try {
			//Context 객체를 생성 (프로젝트 정보를 가지고있는객체)
			Context initCTX = new InitialContext();
			
			// DB연동 정보를 불러오기(context.xml)
			DataSource ds =
			(DataSource) initCTX.lookup("java:comp/env/jdbc/mysqlDB");
			
			conn = ds.getConnection();
			
			System.out.println(" 드라이버 로드, 디비연결 성공! ");
			System.out.println(conn);
			
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	// getConnection() - 디비연결 끝
	
	// 자원해제코드 - finally 구문에서 사용
	public void closeDB(){
		try {
			if(rs != null){ rs.close(); }
			if(pstmt != null){ pstmt.close();}
			if(conn != null){ conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	// 글쓰기 동작 => 메서드 insertBoard(BoardBean bb)
/*	public void insertBoard(BoardBean bb){
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
		
	}*/
	// 글쓰기 동작 => 메서드 insertBoard(BoardBean bb)
	
	// insertBoard
	public void insertBoard(BoardBean bb){
		int num = 0;
		try {
			// 1 드라이버 로드
			// 2 디비 연결
			// => 한번에 처리 하는 메서드로 변경
			conn = getConnection();		
			
			// 3 sql (글번호를 계산하는 구문)
			sql = "select max(num) from itwill_board";
			
			pstmt = conn.prepareStatement(sql);
			
			// 4 sql 실행
			rs = pstmt.executeQuery();
			
			// 5 데이터 처리
			//  max(num) - sql 함수를 실행했을경우 커서이동 가능(데이터여부 상관없음)
			//  num     - sql 컬럼의 경우  커서 이동 불가능
			if(rs.next()){
				//num = rs.getInt("max(num)")+1;
				num = rs.getInt(1)+1;
			}
			
			System.out.println(" 글번호  : "+num);
			
			////////////////////////////////////////////////////
			
			// 3 sql 작성 (insert) & pstmt 객체 생성
			sql = "insert into itwill_board "
					+ "values(?,?,?,?,?,?,?,?,?,now(),?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			// ?
			pstmt.setInt(1, num);
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
			
		} catch (SQLException e) {
			System.out.println("디비 연결 실패!!");
			e.printStackTrace();
		} finally{
			// 자원해제 
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
		
	}
	// insertBoard()
	
	// getBoardCount()
	// 디비에 들어있는 글의 개수 계산후 리턴
	public int getBoardCount(){
		
        int cnt = 0;
        
        try {
        	// 1,2 드라이버로드, 디비연결
        	conn = getConnection();
        	
        	// 3 sql 작성(select) & pstmt 객체 생성
        	sql = "select count(*) from itwill_board";
			pstmt = conn.prepareStatement(sql);
			   
	        // 4 sql 실행
			rs = pstmt.executeQuery();
	        
	        // 5 데이터 처리
			if(rs.next()){
				cnt = rs.getInt(1);// "count(*)"
				//cnt = rs.getInt("count(*)");
			}
			
			System.out.println("SQL 구문 실행완료!");
			System.out.println(" 글 개수 : "+cnt+"개");
	        
		} catch (Exception e) {
			System.out.println(" 게시판 글개수_에러 발생!! ");
			e.printStackTrace();
		} finally{
		   // 자원해제
		   closeDB();
		}
		
		return cnt;
	}
	// getBoardCount()
	
	
	

}
