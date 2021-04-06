<%@page import="java.sql.Statement"%>
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
    <h1>WebContent/JSP5/insertTest.jsp</h1>
    
    <%
      String name="itwill";
      String gender="남";
      int age = 30;
      String jumin="900101-123131";
    
      final String DRIVER= "com.mysql.jdbc.Driver";
      final String DBURL = "jdbc:mysql://localhost:3306/jspdb";
      final String DBID = "root";
      final String DBPW = "1234";
    
     // 1단계 드라이버 로드
     Class.forName(DRIVER);
     
     System.out.println(" 드라이버 로드 성공! ");
     // 2단계 디비 연결
     
     Connection conn 
         = DriverManager.getConnection(DBURL, DBID, DBPW);
     
     System.out.println(" 디비연결 성공! "+conn);
     
     System.out.println(" 디비연결 완료 SQL쿼리 사용전 준비 상태 ");
     
     //3단계 sql 구문 작성 
     //          & statement 객체 생성(->preparedstatement 변경예정)
     
//      String sql 
//      ="insert into itwill_member (name,gender,age,jumin) values('테스트','남',10,'900110-1111111')";
     String sql 
     ="insert into itwill_member (name,gender,age,jumin) values('"+name+"','"+gender+"',"+age+",'"+jumin+"')";
     // Statement : SQL 구문을 실행하는 객체 
     Statement stmt = conn.createStatement();
     
     // 4단계 SQL 구문을 실행
     stmt.executeUpdate(sql);
     
     System.out.println(" 디비 정보 저장완료! ");  
     
    
    %>
    
    
    
    
    
    
    
    
    
    
    
    
    

</body>
</html>