<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>WebContent/board/deleteForm.jsp</h1>
    
    <%
      // 전달된 파라미터값 저장
      int num = Integer.parseInt(request.getParameter("num"));
      String pageNum = request.getParameter("pageNum");
    %>
    
    <form action="deletePro.jsp?pageNum=<%=pageNum %>" method="post">
     <input type="hidden" name="num" value="<%=num%>">
         비밀번호  : <input type="password" name="pass">
     <hr>
     <input type="submit" value="삭제하기">    
    </form>
    
    
    
    
    

</body>
</html>