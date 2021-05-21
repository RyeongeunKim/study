package com.member.db;

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
			(DataSource) initCTX.lookup("java:comp/env/jdbc/model2DB");
			
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
	
	// insertMember(mdto)
	public void insertMember(MemberDTO mdto){
		
		
		try {
			// 1,2 디비연결
			conn = getConnection();
			// 3 sql 작성 & pstmt 객체
			sql = "insert into itwill_member (id,pass,name,age,gender,email,reg_date) "
					+ " values(?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			// ? 
			pstmt.setString(1, mdto.getId());
			pstmt.setString(2, mdto.getPass());
			pstmt.setString(3, mdto.getName());
			pstmt.setInt(4, mdto.getAge());
			pstmt.setString(5, mdto.getGender());
			pstmt.setString(6, mdto.getEmail());
			pstmt.setTimestamp(7, mdto.getReg_date());

			// 4 sql 실행
			pstmt.executeUpdate();
			
			System.out.println("DAO : 회원가입 완료! ");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
	}
	// insertMember(mdto)
	
	// idCheck(id,pass)
	public int idCheck(String id,String pass){
		int check = -1;
		
		try {
			// 1,2 디비연결
			conn = getConnection();
			// 3 sql 구문 & pstmt 객체생성
			sql = "select pass from itwill_member where id=?";
			pstmt = conn.prepareStatement(sql);
			//?
			pstmt.setString(1, id);
			// 4 sql 실행
			rs = pstmt.executeQuery();
			// 5 데이터 처리 (본인확인)
			if(rs.next()){
				if(pass.equals(rs.getString("pass"))){
					// 본인 
					check = 1;
				}else{
					// 비밀번호 오류
					check = 0;
				}
			}else{
				// 회원정보 x
				check = -1;
			}
			
			System.out.println("DAO : 로그인 처리 결과 "+check);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
		return check;
	}
	// idCheck(id,pass)
	
	
	

}
