<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>WebContent/el/array_collection.jsp</h1>
  <!-- 전달된 배열정보를 출력 -->
  <h3>el 표현식 사용</h3>
  ${requestScope.subjects[0] }
  ${requestScope.subjects[1] }
  ${requestScope.subjects[2] }
  ${requestScope.subjects[3] }
  ${requestScope.subjects[4] }
  
  <hr>
  
  <c:forEach var="sub" items="${requestScope.subjects }">
         ${sub }<br>
  </c:forEach>
  
  <hr>
  
  영화 : 
  ${requestScope.movie[0] }<br>
  
  <c:forEach var="mov" items="${requestScope.movie }">
         ${mov }<br>
  </c:forEach> 
  
  
  
  
  
  
  
  
  
  
  
  
</body>
</html>