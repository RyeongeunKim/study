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
		<h2> ��Ű �α��� </h2>
		<form action ="SessionLoginProc.jsp" method="post">
			<table width="400" border = "1">
				<tr height="50">
					<td width="150">���̵�</td>
					<td width="150"><input type = "text" name = "id"></td>		
				</tr>
				
				<tr height="50">
					<td width="150">�н�����</td>
					<td width="150"><input type = "password" name = "pass"></td>		
				</tr>
				
				<tr height="50">
					<td colspan ="2" align ="center"><input type ="submit" value = "�α��� "></td>		
				</tr>
		
			</table>
		</form>
	</center>
</body>
</html>