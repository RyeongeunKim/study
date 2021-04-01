<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>WebContent/JSP3/sessionDel.jsp</h1>
   
   <%
      // 세션 삭제 (속성 삭제)-id 속성값 삭제
      session.removeAttribute("id");
      // 페이지이동(JS)
   %>
   
   <script type="text/javascript">
       alert("세션 삭제완료! ");
       location.href="sessionTest.jsp";   
   </script>
   
   
   
   
   

</body>
</html>