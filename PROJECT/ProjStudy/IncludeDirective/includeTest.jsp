<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- include 디렉티브

	[ 포함될 페이지 ]
	
	top.jsp    ->	포함할	-> 한 페이지로 병합 -> 한 페이지로 인식 및 변환 후 컴파일
	bottom.jsp ->	페이지

 -->

</head>

<body>

	<center>
	<table width=600 border="1">
	<!-- Top -->
	<tr height="150">
		<td width="600" align="center">
		<%@ include file="Top.jsp" %>
		</td>
	</tr>

	<!-- Center -->
	<tr height="400">
		<td width="600" align="center">
		<img src="camera.png" alt="" width="400" height="300">
		</td>
	</tr>
	
	<!-- Bottom -->
	<tr height="100">
		<td width="600" align="center">
		<%@ include file="Bottom.jsp" %>
		</td>
	</tr>
	</table>
	</center>

</body>
</html>