
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>WebContent/Me/insertPro.jsp</h1>
	
	<%
	  // 회원가입정보를 전달받아서 저장 -> DB저장 (회원)
		
	  // 한글 처리
	  request.setCharacterEncoding("UTF-8");
	%>
	<!-- 자바빈 객체 생성 -->
	<jsp:useBean id="me" class="com.hello.me.MeBean"/>
	<!-- 전달되는 파라미터값 저장 -->
	<jsp:setProperty property="*" name="me"/>
	<%
	  System.out.println("객체 정보 : "+me);
	  // 추가적인 회원가입 날짜 저장
	  me.setRegdate(new Timestamp(System.currentTimeMillis()));
	  
	  System.out.println("객체 정보 : "+me);
	  
	 /////////////////////////////////////////////////
	 // 해당 정보를 사용해서 DB로 이동 저장
	 // 디비연결 필요정보
     String DRIVER = "com.mysql.jdbc.Driver";
     String DBURL = "jdbc:mysql://localhost:3306/jspdb";
     String DBID ="root";
     String DBPW ="1234";
     
     // 1 드라이버로드
     Class.forName(DRIVER);
     System.out.println(" 드라이버 로드 성공 ! ");
     
     // 2 디비연결
     Connection conn =
       DriverManager.getConnection(DBURL, DBID, DBPW);
     
     // 3 sql구문 작성 & pstmt 객체 생성
     String sql
     ="insert into itwill_member values (?,?,?,?,?,?,?)";
    
     PreparedStatement pstmt = conn.prepareStatement(sql);
     
     // 4 ? 값을 가져와서 세팅하기
     pstmt.setString(1, me.getId());
     pstmt.setString(2, me.getPw());
     pstmt.setString(3, me.getName());
     pstmt.setInt(4, me.getAge());
     pstmt.setString(5, me.getGender());
     pstmt.setString(6, me.getEmail());
     pstmt.setTimestamp(7, me.getRegdate());
     
     // 5 sql 실행
     pstmt.executeUpdate();
     
     System.out.println("회원 가입 성공!");
     
     // 로그인페이지로 이동 (loginForm.jsp)
     // 자바스크립트 사용 이동     
     
	%>
	
	<script type="text/javascript">
	  alert("회원가입 성공!");
	  location.href="loginForm.jsp";
	</script>
	
	
	
	
	
</body>
</html>