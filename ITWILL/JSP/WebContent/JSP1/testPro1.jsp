<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>WebContent/JSP1/testPro1.jsp</h1>
   
   <%
      //JSP코드(java코드) 작성가능
      
      // 요청객체(request)로 부터 전달된 정보를 사용
      
      // 이전페이지에서 전달되는 정보 -> 파라미터
      // request.getParameter("파라미터명");
      // -> 전달된 모든 파라미터는 String타입으로 저장됨.
      
      
      String num = request.getParameter("num");      
   
      // Integer.parseInt("문자열값")
      // => 문자열 숫자  "11"를 실제 정수로 변경
      
      int num2 = Integer.parseInt(request.getParameter("num"));
      
      
      
   %>
   
   전달받은 숫자 : <%=num %> <br>
   전달받은 숫자 +100 : <%=num+100 %> <br>
   전달받은 숫자(정수로 변경) +100 : <%= Integer.parseInt(num) + 100 %> <br>
   
   
   
   
   
   

</body>
</html>