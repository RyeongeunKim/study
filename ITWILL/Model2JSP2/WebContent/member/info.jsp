<%@page import="com.member.db.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>WebContent/member/info.jsp</h1>
  
  <h2> 회원정보 조회 (model2) </h2>
  <%
    //DB에서 전달받은 정보를 저장(request 영역)
	//request.setAttribute("mdto", mdto);
    MemberDTO mdto = (MemberDTO)request.getAttribute("mdto");
  %>
  
  
  <table border="1">
    <tr>
      <td>아이디</td>
      <td><%=mdto.getId() %></td>
    </tr>
    <tr>
      <td>비밀번호</td>
      <td><%=mdto.getPass() %></td>
    </tr>
    <tr>
      <td>이름</td>
      <td><%=mdto.getName() %></td>
    </tr>
    <tr>
      <td>나이</td>
      <td><%=mdto.getAge() %></td>
    </tr>
    <tr>
      <td>성별</td>
      <td>${requestScope.mdto.gender }</td>
    </tr>
    <tr>
      <td>이메일</td>
      <td>${mdto.email }</td>
    </tr>
   <tr>
      <td>가입일자</td>
      <td>${mdto.reg_date }</td>
    </tr>
  </table>
  
  <h3><a href="./Main.me">메인페이지로</a></h3>  


</body>
</html>