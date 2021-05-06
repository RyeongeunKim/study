package com.itwillbs.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MemberDAO {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private String sql = "";
	
	private Connection getConnection(){
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
	
	// idCheck(id)
	public int idCheck(String id){
		int result = 0;
		try {
		//1,2 디비연결
		conn = getConnection();
		// 3 sql구문 & pstmt객체 생성
		sql = "select * from itwill_member where id=?";
	    pstmt = conn.prepareStatement(sql);
	    
	    pstmt.setString(1, id);
	    // 4 sql 실행
	    rs = pstmt.executeQuery();
	    // 5 데이터처리
	    
	    if(rs.next()){
	    	result = 1; //회원이 있음 -> 해당아이디 X
	    }else{
	    	result = 0; //회원이 없음 -> 해당아이디 O
	    }
	    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	// idCheck(id)
	
	
	

}
