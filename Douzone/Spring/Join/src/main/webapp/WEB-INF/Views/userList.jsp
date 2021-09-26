<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원정보</h1>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>패스워드</th>	
			<th>이름</th>	
			<th>나이</th>	
		</tr>
		<c:forEach var="i" items="${ userList }">	
			<c:if test="${i.id != null}">
				<tr>
					<td>${i.id}</td>
					<td>${i.pw}</td>					
					<td>${i.name}</td>					
					<td>${i.age}</td>		
				</tr>
			</c:if>
		</c:forEach>	
	</table>
	<p><a href="main">메인페이지로 가기</a></p>
</body>
</html>