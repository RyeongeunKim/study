<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

	<h2>이 페이지는 로그인 정보가 넘어오는 페이지입니다.</h2>
	
	<%
		request.setCharacterEncoding("UTF-8"); //post 방식 한글처리
	
		String id = request.getParameter("id"); //request객체에 담겨진 사용자 정보 중 id만 추출
		 
		response.sendRedirect("ResponseRedirect.jsp"); //흐름제어

	%>
	
	<jsp:forward page="ResponseRedirect.jsp">
		<jsp:param value="mmmm" name="id"/>
	</jsp:forward>
	
	<!-- 흐름제어 -->
	
	<h3>아이디 = <%=id %></h3>

</body>
</html>