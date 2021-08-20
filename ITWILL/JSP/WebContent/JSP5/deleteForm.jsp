<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>WebContent/JSP5/deleteForm.jsp</h1>
  <%
    // ID,PW를 입력받아서 해당 회원을 탈퇴(삭제)
  %>
  
  <form action="deletePro.jsp" method="post">
    아이디 : <input type="text" name="id"><br>
    비밀번호 : <input type="password" name="pw"><br>
    
  <input type="submit" value="삭제하기">
  
  </form>
  
  
  
  
  
  

</body>
</html>