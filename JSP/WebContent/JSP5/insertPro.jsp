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
  <h1>WebContent/JSP5/insertPro.jsp</h1>
  
  <%
    // 한글 처리 
    request.setCharacterEncoding("UTF-8");
 
    // 이전페이지에서 전달된 데이터 저장 -> 콘솔 출력
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String email =  request.getParameter("email");
    
    System.out.println("전달 정보 : "+id+"/"+pw+"/"+email);
    
    
	final String DRIVER = "com.mysql.jdbc.Driver";
	final String DBURL = "jdbc:mysql://localhost:3306/jspdb";
	final String DBID = "root";
	final String DBPW = "1234";
    // 전달받은 데이터 DB에 저장
    // 1 드라이버 로드
    Class.forName(DRIVER);
    System.out.println(" 드라이버 로드 성공! ");
    
    // 2 디비 연결
    Connection con =
    DriverManager.getConnection(DBURL, DBID, DBPW);
    System.out.println(" 디비연결 성공! ");
    
    // 3 sql 구문 작성 & pstmt 객체 생성
    String sql 
    ="insert into itwill_member (id,pw,email) values(?,?,?)";
    
    PreparedStatement pstmt = con.prepareStatement(sql);
    //     ? 추가
    pstmt.setString(1, id);
    pstmt.setString(2, pw);
    pstmt.setString(3, email);
    //pstmt.setString(3, request.getParameter("email"));
    		
    // 4 sql 실행
    pstmt.executeUpdate();
    
    System.out.println(" 회원 가입 성공! ");
  %>
  
  
  
  
  
  
  
  
  
  
</body>
</html>