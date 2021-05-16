<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String center = request.getParameter("center");
		//처음 실행시에는 center값이 넘어오지 않기에
		if(center==null){
			center = "Center.jsp"; //디폴트 center값을 부여
		}
	%>
		<table width="1000" >
		<!--Top 부분 -->
			<tr height="70" align="center">
				<td align="center" width="1000"><jsp:include page="../inc/Top.jsp"/></td>
			</tr>
		</table>
		
		<!--Center 부분 -->
		<table>
			<tr height="470" align="center">
				<td align="center" width="1000"><jsp:include page="<%=center%>"/></td>
			</tr>
		</table>
		
		<!-- Bottom 부분 -->
		<table>
			<tr height="100" align="center">
				<td align="center" width="1000"><jsp:include page="../inc/Bottom.jsp"/></td>
			</tr>
		</table>

</body>
</html>