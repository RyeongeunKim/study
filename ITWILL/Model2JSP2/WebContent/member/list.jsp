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
	<h1>WebContent/member/list.jsp</h1>
	<h2>회원목록을 확인 (관리자) (model2)</h2>
	<%
	  // request.setAttribute("memberList", memberList);
	  List memberList = (List)request.getAttribute("memberList");
	%>
    <table border="1">
      <tr>
        <td>아이디</td>
        <td>이름</td>
        <td>비밀번호</td>
        <td>나이</td>
        <td>성별</td>
        <td>이메일</td>
        <td>가입일</td>
      </tr>
      
      <%for(int i=0;i<memberList.size();i++){
    	    MemberDTO dto = (MemberDTO) memberList.get(i);
    	  %>
	      <tr>
	        <td><%=dto.getId() %></td>
	        <td><%=dto.getName() %></td>
	        <td><%=dto.getPass() %></td>
	        <td><%=dto.getAge() %></td>
	        <td><%=dto.getGender() %></td>
	        <td><%=dto.getEmail() %></td>
	        <td><%=dto.getReg_date() %></td>
	      </tr>
      <%} %>
    </table>
    
    <h2><a href="./Main.me">메인페이지로...</a></h2>
    


</body>
</html>