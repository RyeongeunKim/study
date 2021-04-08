<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>WebContent/JSP5/updateForm.jsp</h1>
  <%
    // 회원 정보 수정 처리 방법
    // 1. 기존의 정보 상관없이 덮어쓰기(수정)
    // 2. 기존의 정보를 확인후 덮어쓰기 (수정)
  %>
  
  <form action="updatePro.jsp" method="post">
        아이디 : <input type="text" name="id"><br>
        비밀번호 : <input type="password" name="pw"><br>
        수정된 이메일 : <input type="text" name="email"><br>
        <input type="submit" value="수정하기">   
  </form>
  
  
  
  
  
  
  
  
  
  
</body>
</html>