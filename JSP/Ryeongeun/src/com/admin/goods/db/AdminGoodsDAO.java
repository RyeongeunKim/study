package com.admin.goods.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class AdminGoodsDAO {
	
	private Connection conn = null;
	private PreparedStatement pstmt =null;
	private ResultSet rs = null;
	private String sql = "";
	
	private Connection getConnection(){
		try {
			//Context 객체 생성(프로젝트 정보를 가지고 있는 객체)
			Context initCTX = new InitialContext();
			//DB연동 정보 불러오기
			DataSource ds = (DataSource) initCTX.lookup("java:comp/env/jdbc/cosshopping");
			
			conn = ds.getConnection();
			
			System.out.println("드라이버 로드, 디비연결 성공");
			System.out.println(conn);
		
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	// getConnection() - 디비연결 끝
	
	// 자원해제코드
	public void closeDB(){
		try {
			if (rs != null){
				rs.close();
			}
			if (pstmt != null){
				pstmt.close();
			}
			if (conn != null){
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 자원해제 끝
	
	// insertGoods(gdto)

	
	

}
