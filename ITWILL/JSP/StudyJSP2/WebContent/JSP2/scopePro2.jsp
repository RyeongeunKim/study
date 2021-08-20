<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>  
    <h1>WebContent/JSP2/scopePro2.jsp</h1>
    
    아이디 : <%=request.getParameter("id")%> <br>   
    비밀번호 : <%=request.getParameter("pw") %><br>
  <hr>  
  pageContext 내장객체 공유데이터(속성) : <%=pageContext.getAttribute("page") %><br>
  request 내장객체 공유데이터(속성) : <%=request.getAttribute("req") %><br>
  session 내장객체 공유데이터(속성) : <%=session.getAttribute("ses") %><br>
  application 내장객체 공유데이터(속성) :<%=application.getAttribute("app") %> <br>
    
    
    
    
    
    
    
    

</body>
</html>