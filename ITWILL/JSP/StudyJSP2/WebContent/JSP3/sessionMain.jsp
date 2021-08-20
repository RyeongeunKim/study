<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>WebContent/JSP3/sessionMain.jsp</h1>
  
  <%
     // 세션정보를 사용해서 사용자 확인
     String id = (String) session.getAttribute("id");  
  
     // 세션정보(로그인정보)가 없을경우 다시 로그인페이지로 이동
     if(id == null){
    	 response.sendRedirect("sessionLoginForm.jsp");
     }
  
  %>
  
  <h2> <%=id %>님 로그인 성공! </h2>
  
  <input type="button" value="로그아웃"
       onclick=" location.href='sessionLogout.jsp' "
   >
  
  
  
  
  
  
  
  
  
  

</body>
</html>