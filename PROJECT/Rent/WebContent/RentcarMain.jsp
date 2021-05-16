<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center>
	<% 
		String Center = request.getParameter("center");
		//처음 실행시에는 center값이 넘어오지 않기에
		if(Center==null){//null 처리해줌
			Center = "Center.jsp";//디폴트 center값을 부여	
		}
	%>
		<table width="1000" >
		<!--Top 부분 -->
			<tr height="140" align="center">
				<td align="center" width="1000"><jsp:include page="Top.jsp"/></td>
			</tr>
		</table>
		
		<!--Center 부분 -->
			<tr height="470" align="center">
				<td align="center" width="1000"><jsp:include page="<%=Center%>"/></td>
			</tr>
		</table>
		
		<!-- Bottom 부분 -->
			<tr height="100" align="center">
				<td align="center" width="1000"><jsp:include page="Bottom.jsp"/></td>
			</tr>
		</table>
	</center>
</body>
</html>