package com.itwillbs.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class MySqlConectTest {
	
	private static final String DRIVER="com.mysql.jdbc.Driver";
	// 8.0		"com.mysql.cj.jdbc.Driver"
	private static final String DBURL="jdbc:mysql://localhost:3306/springdb?useSSL=false";
	// 8.0		"jdbc:mysql://localhost:3306/springdb?useSSL=false&serverTimezone=Asia/Seoul"
	private static final String DBID="root";
	private static final String DBPW="1234";
	
	//Junit 사용 테스트
	@Test
	public void testCon() {
		
		try {
			// 1. 드라이버 로드
			Class.forName(DRIVER);
			// 2. 디비연결
			Connection con = DriverManager.getConnection(DBURL,DBID,DBPW);
			System.out.println("디비 연결 : "+con);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
