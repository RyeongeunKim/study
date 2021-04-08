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
   <h1>WebContent/JSP5/updateTest.jsp</h1>
   
   <%
      int idx = 11;
      String u_name="수정된 이름";
      
      final String DRIVER = "com.mysql.jdbc.Driver";
      final String DBURL = "jdbc:mysql://localhost:3306/jspdb";
      final String DBID = "root";
      final String DBPW = "1234";
      
      // 디비에 연결을해서 위에 정보에 해당하는 대상의 이름을변경(update)
      
      // 1단계  드라이버 로드
      Class.forName(DRIVER);
      out.print(" 드라이버 로드 성공! <br> ");
      // 2단계  디비 연결
      Connection con =
        DriverManager.getConnection(DBURL, DBID, DBPW);
      out.print(" 디비 연결 성공!(접속테스트) <br> ");
      
      out.print(" 디비 연결 성공!(접속유지) :"+ con +"<br>");
      
      //  sql - idx에 해당하는 사람의 이름을 변경
      // 3단계  sql구문 작성 & pstmt 객체 생성
      String sql 
      = "update itwill_member set name=? where idx=?";
      
      PreparedStatement pstmt = con.prepareStatement(sql);
      
      //       ? 추가
      pstmt.setString(1, u_name);
      pstmt.setInt(2, idx);
          		  
      // 4단계  sql구문 실행
      pstmt.executeUpdate();
      
      out.print(" 정보 수정완료! ");  
   
   
   
   %>
   
   
   
   
   
   
   
   
   
   

</body>
</html>