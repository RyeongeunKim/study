<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>드림오피스</title>
</head>
<body>
	<%
		session.invalidate();
	%>
	<script>
		location.href = '../main/main.jsp';
	</script>
</body>
</html>