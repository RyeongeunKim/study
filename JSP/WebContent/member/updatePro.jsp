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
	<h1>WebContent/member/updatePro.jsp</h1>
	<%
		// 로그인세션
		String id = (String) session.getAttribute("id");

		if (id == null) {
			System.out.println("[updatePro.jsp] : 아이디없음 -> 로그인페이지이동");
			response.sendRedirect("loginForm.jsp");
		}

		// 한글처리 
		request.setCharacterEncoding("UTF-8");
		// 전달되는 정보(파라미터)를 저장 => 액션태그 사용 자바빈객체에 저장
		// MemberBean 객체 사용
	%>
	<jsp:useBean id="mb" class="com.itwillbs.member.MemberBean" />

	<jsp:setProperty property="*" name="mb" />
	<%
		System.out.println("전달된 수정할 정보 : " + mb);

		// DB접속후 -> 정보 확인하고나서 해당 데이터 수정
		// 디비연결 필요정보 
		String DRIVER = "com.mysql.jdbc.Driver";
		String DBURL = "jdbc:mysql://localhost:3306/jspdb";
		String DBID = "root";
		String DBPW = "1234";
		
		// 1 드라이버 로드
		Class.forName(DRIVER);
		System.out.println("드라이버 로드 성공!");
		
		// 2 디비연결 
		Connection conn =
		DriverManager.getConnection(DBURL, DBID, DBPW);
		System.out.println("디비연결 성공!");
		
		// 3 sql작성 & pstmt 객체생성
		//   본인여부를 확인후 수정여부를 결정
		String sql = "select pw from itwill_member where id=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		// ?
		//pstmt.setString(1, id);
		pstmt.setString(1, mb.getId());
		
		// 4 sql 실행
		ResultSet rs = pstmt.executeQuery();
		
		// 5 데이터처리
		if(rs.next()){
			// 아이디가 있음
			if(mb.getPw().equals(rs.getString("pw"))){
				// 비밀번호 같음 => 본인 -> 정보 수정
				
				// 3 sql  (update구문) & pstmt 객체
				sql
				= "update itwill_member set name=?,age=?,gender=?,email=? where id=?";
				pstmt = conn.prepareStatement(sql);
				//?
				pstmt.setString(1, mb.getName());
				pstmt.setInt(2, mb.getAge());
				pstmt.setString(3, mb.getGender());
				pstmt.setString(4, mb.getEmail());
				pstmt.setString(5, mb.getId());
				
				// 4 sql실행 
				pstmt.executeUpdate();
				
				System.out.println("회원 정보 수정완료!");
				// 페이지 이동
				response.sendRedirect("main.jsp");
						
			}else{
				// 비밀번호 다름 => 오류 (페이지 뒤로이동)
			}
			
		}else{
			// 아이디가 없음 => 오류 (페이지 뒤로이동)
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

		// 정상적인 수정후 -> main.jsp 페이지 이동
		// 문제 발생시 페이지 뒤로가기
	%>









</body>
</html>