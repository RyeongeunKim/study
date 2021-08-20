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
	<h1>WebContent/JSP5/dbConnectTest.jsp</h1>

	<h2>JDBC(Java DataBase Connectivity) API</h2>
	-> 자바랑 DB(mysql)를 연결하도록 도와주는 프로그램(라이브러리)

	<%
		//0 단계  - 해당 라이브러리 설치 (WEB-INF/lib/파일 추가) 1회
		//1 단계  - 라이브러리에서 필요한 드라이버를 로드 

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(" 드라이버 로드 성공! ");

		// 2단계 - 드라이버로드 정보를 활용해서 디비연결 
		
		Connection conn 
		 = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspdb", "root", "1234");
		System.out.println(" 디비 연결 성공! ");
		
		System.out.println(conn);
		
		
	%>







</body>
</html>