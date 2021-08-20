<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>이 페이지는 로그인 정보가 넘어오는 페이지 입니다</h2>
	<% 
		request.setCharacterEncoding("EUC-KR");//post 방식 한글 처리 
		
		String id = request.getParameter("id");//request객체에 담겨진 사용자 정보중 id 추출 
		
		//response.sendRedirect("ResponseRedirect.jsp?id="+id);//흐름 제어
	%>
	
	<jsp:forward page = "ResponseRedirect.jsp">
			<jsp:param value="mmmm" name="id">
			<jsp:param value="1234" name="phone">
	</jsp:forward>
	
	
	<h3>아이디는 : <%=id %></h3>
	
</body>
</html>