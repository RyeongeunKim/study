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
	<h1>WebContent/member/deletePro.jsp</h1>

	<%
		// 세션제어 
		String id = (String) session.getAttribute("id");
		if (id == null) {
			response.sendRedirect("loginForm.jsp");
		}
		// 한글처리 
		request.setCharacterEncoding("UTF-8");

		// 전달되는 정보 저장
	%>
	<jsp:useBean id="mb" class="com.itwillbs.member.MemberBean" />
	<jsp:setProperty property="*" name="mb" />

	<%
		System.out.println("삭제 회원정보 : " + mb);
		// update 처리 로직을 참고하여 회원정보 삭제기능 구현하기

		// 디비연결 필요정보 
		String DRIVER = "com.mysql.jdbc.Driver";
		String DBURL = "jdbc:mysql://localhost:3306/jspdb";
		String DBID = "root";
		String DBPW = "1234";

		// 1 드라이버 로드
		Class.forName(DRIVER);
		// 2 디비 연결
		Connection conn = 
		DriverManager.getConnection(DBURL, DBID, DBPW);
		// 3 sql구문 작성(select) & pstmt 객체
		String sql = "select pw from itwill_member where id=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, mb.getId());
		
		// 4 sql 구문실행
		ResultSet rs = pstmt.executeQuery();
		// 5 데이터 처리 
		if(rs.next()){
			if(mb.getPw().equals(rs.getString("pw"))){
				//3 본인일때 sql구문 작성 (delete)& pstmt 객체 생성
				sql = "delete from itwill_member where id=?";
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, mb.getId());
				//4 sql 실행
				pstmt.executeUpdate();
				
				// 세션정보 초기화 
				session.invalidate();
				
				// 메인페이지로 이동
				response.sendRedirect("main.jsp");
				
			}else{
			// 비밀번호 다름 => 오류 (페이지 뒤로이동)
			   %>
			    <script type="text/javascript">
			      alert(" 비밀번호 오류! ");
			      history.back();
			    </script>			   
			   <%
			}
		}else{
			// 아이디가 없음 => 오류 (페이지 뒤로이동)
		   %>
		    <script type="text/javascript">
		      alert(" 아이디 없음! ");
		      history.back();
		    </script>			   
		   <%
		}
	%>













</body>
</html>