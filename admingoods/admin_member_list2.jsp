<%@page import="com.member.db.MemberDTO"%>
<%@page import="java.util.List"%>
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
		List memberList = (List)request.getAttribute("memberList"); 
	%>
	<table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
		<thead>
			<tr>
				<th colspan="12" style="background-color: #b0bcc2; text-align: center; color: white;">회원 리스트</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>아이디</td>
				<td>이름</td>
				<td>이메일</td>
				<td>주소</td>
				<td>전화번호</td>
				<td>생년월일</td>
				<td>성별</td>
				<td>피부타입</td>
				<td>피부고민</td>
				<td>포인트</td>
				<td>사용금액</td>
				<td>회원등급</td>
			</tr>
			<%for(int i=0;i<memberList.size();i++){
				MemberDTO dto = (MemberDTO) memberList.get(i);
			%>
			<tr>
				<td><%=dto.getUserId() %></td>
				<td><%=dto.getUserName() %></td>
				<td><%=dto.getUserEmail() %></td>
				<td><%=dto.getUserAddr() %></td>
				<td><%=dto.getUserTel() %></td>
				<td><%=dto.getUserBirth() %></td>
				<td><%=dto.getUserGender() %></td>
				<td><%=dto.getUserSkinType() %></td>
				<td><%=dto.getUserTrouble() %></td>
				<td><%=dto.getUserPoint() %></td>
				<td><%=dto.getUserTotal() %></td>
				<td><%=dto.getUserLevel() %></td>
			</tr>
			<%} %>
		</tbody>
	</table>


</body>
</html>