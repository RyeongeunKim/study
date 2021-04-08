<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>WebContent/JSP5/deleteTest.jsp</h1>
  
  <%
    // idx = 11번 사람의 정보를 삭제 
    int del_idx = 11;
 
  final String DRIVER = "com.mysql.jdbc.Driver";
  final String DBURL = "jdbc:mysql://localhost:3306/jspdb";
  final String DBID = "root";
  final String DBPW = "1234";
  
    // 1) 드라이버 로드
	Class.forName(DRIVER);
    
    System.out.println(" 드라이버 로드 성공 ! ");
    // 2) 디비 연결
	Connection con =
    DriverManager.getConnection(DBURL, DBID, DBPW);
    
	System.out.println(" 디비 연결 성공 ! "+con);
    // 3) sql 작성 & pstmt 객체 생성
	String sql 
	="delete from itwill_member where idx=?";
    
    PreparedStatement pstmt 
      = con.prepareStatement(sql);

    //     ? 추가
	pstmt.setInt(1, del_idx);    		
    //    (sql - delete 구문,특정 회원만 삭제(11번))		
    // 4) sql 실행
 	pstmt.executeUpdate();
    
    System.out.println("회원정보 삭제 완료! ");
  %>
  
  
  
  
  
  
  
  
  
  
  
  
  

</body>
</html>