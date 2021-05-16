<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 세션을 이용한 로그인 처리 -->
<%
	String id = (String)session.getAttribute("id");

	//로그인이 되어있지 않다면
	if(id==null){
		id="GUEST";
	}

%>

	<table width="1000">
	<tr height="70">
		<td colspan="4">	
			<a href="RentMain.jsp"><img alt="logo" src="img/logo.png" height="65"></a>
		</td>
		<td align="center" width="200">
			<font size="3"><a href="RentMain.jsp" style="text-decoration:none">HOME</a></font>
		</td>
		<td align="center" width="200">
			<font size="3"><a href="#" style="text-decoration:none">회사소개</a></font>
		</td>
		<td align="center" width="200">
			<font size="3"><a href="RentMain.jsp?center=Office.jsp" style="text-decoration:none">오피스</a></font>
		</td>
		<td align="center" width="200">
			<font size="3"><a href="RentMain.jsp?center=Reserve.jsp" style="text-decoration:none">예약하기</a></font>
		</td>
		<td align="center" width="200">
			<font size="3"><a href="#" style="text-decoration:none">고객센터</a></font>
		</td>
		<td align="center" width="200">
 			<%=id %> 
		</td>
	</tr>
	</table>

</body>
</html>