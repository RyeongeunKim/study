<%@page import="java.sql.ResultSet"%>
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
	<h1>WebContent/JSP5/select.jsp</h1>
	<%
		// 모든 회원의 정보를 출력 => 테이블 생성

		final String DRIVER = "com.mysql.jdbc.Driver";
		final String DBURL = "jdbc:mysql://localhost:3306/jspdb";
		final String DBID = "root";
		final String DBPW = "1234";
		
		// 1 드라이버 로드
		Class.forName(DRIVER);
		// 2 디비연결 
		Connection con =
		DriverManager.getConnection(DBURL, DBID, DBPW);
		
		// 3 sql 생성 & pstmt 객체 생성
		String sql ="select * from itwill_member";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		// 4  sql 실행
		ResultSet rs = pstmt.executeQuery();
				
	%>
	
	<table border="1">
	   <tr>
	     <td>id</td>
	     <td>pw</td>
	     <td>name</td>
	     <td>gender</td>
	     <td>email</td>
	   </tr>
	  <%
	    // 5 데이터 처리 
	   while(rs.next()){
		   %>
		   <tr>
		     <td><%=rs.getString("id") %></td>
		     <td><%=rs.getString("pw") %></td>
		     <td><%=rs.getString("name") %></td>
		     <td><%=rs.getString("gender") %></td>
		     <td><%=rs.getString("email") %></td>
		   </tr>
		   <%
	   }
	  %>
	</table>









</body>
</html>