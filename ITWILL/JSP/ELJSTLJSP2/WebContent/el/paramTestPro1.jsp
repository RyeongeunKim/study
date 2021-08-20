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
	<h1>WebContent/el/paramTestPro1.jsp</h1>
	<%
		// ID,PW 값을 저장 출력
		request.setCharacterEncoding("UTF-8");

		String ID = request.getParameter("id");
		String PW = request.getParameter("pw");
	%>
	아이디 :
	<%=ID%><br> 비밀번호 :
	<%=PW%><br> 아이디 : ${param.id }
	<br> 비밀번호 : ${param.pw }
	<br>

	<%
		// 좋아하는 음식 2개 저장후 출력
		String food1 = request.getParameter("food");
		String food2 = request.getParameter("food");
		
		String[] foods = request.getParameterValues("food");
		
		// 취미 3개 출력		
	%>
    음식 1 : <%=food1 %><br>
    음식 2 : <%=food2 %><br>
    음식 1 : <%=foods[0] %><br>
    음식 2 : <%=foods[1] %><br>

  <hr>
  취미1 : ${param.hobby }<br>
  취미2 : ${param.hobby }<br>
  취미3 : ${param.hobby }<br>
  
  취미1 : ${paramValues.hobby[0] }<br>
  취미2 : ${paramValues.hobby[1] }<br>
  취미3 : ${paramValues.hobby[2] }<br>
 <hr>
 <!-- jsp + el 반복문(x) -->
<%--  <% for(int i=0;i<3;i++){ %>
   취미1 : ${paramValues.hobby[i] }<br>
 <% } %>
  --%>
  <hr>
  <!-- jstl + el 반복문 사용 -->
  
  <%-- <c:forEach var="i" begin="0" end="2" step="1">
     ${paramValues.hobby[${i}] }
  </c:forEach> --%>
  <hr><hr>
  
  <c:forEach var="i" begin="0" end="2" step="1">
     ${paramValues.hobby[i] }
  </c:forEach>
  
  
  <hr><hr>
  <!--
     items속성에 배열의 형태를 전달, 각각의 요소만큼 반복
       해당요소는 var 변수에 저장 -> el표현식으로 반복문에서 사용가능
   -->
  <c:forEach var="hb" items="${paramValues.hobby }">
    ${hb }<br>
  </c:forEach>
  
  <!-- jstl + jsp표현식 사용하기
      * items ""->'' 변경
   -->
  <c:forEach var="hb" 
        items='<%=request.getParameterValues("hobby") %>'>
    ${hb }<br>
  </c:forEach>
  
  
  
  
  
  




</body>
</html>