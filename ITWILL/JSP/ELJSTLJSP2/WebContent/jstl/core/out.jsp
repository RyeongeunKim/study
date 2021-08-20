<%@page import="java.lang.reflect.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jsp 디렉티브를 사용해서 JSTL을 설정(필수) -->
<!-- 해당 라이브러리를 사용하기 위해서 접두사(prefix)를 c 지정 ,
     => core의 약자 c를 사용(다른 접두사 사용가능) 
     해당 라이브러리 접근하기위한 주소(uri)를 [~/jsp/jstl/core]지정
 -->
 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>WebContent/jstl/out.jsp</h1>
   
  <!-- 액션태그 : 태그로 JSP동작처리 -->
  <%--  <jsp:useBean id=""/> --%>
  
  html:안녕하세요<br>
  <%
     out.println("jsp:안녕하세요<br>");
  %>
  JSP표현식 : <%="안녕하세요" %><br>
  <c:out value="core : 안녕하세요."/> 1234
  
  <hr>
  * JSP표현식을 대신해서 사용
  EL 표현식 : ${"안녕하세요" }
  <hr>
  <!--  2 * 3의 결과를 출력하시오. -->
  
  html: 2*3 <br>
  <%
   double result = 2*3;
  // JSP
   out.println("JSP : "+(2*3)+"<br>");
  %>
  JSP표현식 : <%=2*3 %> <%=result %> <br>
  core : <c:out value="2*3"></c:out> <br>
  el표현식 : ${2*3 } ${result }<br>
  core+el : <c:out value="${2*3 }"/><br>
  core+JSP표현식 : <c:out value="<%=2*3 %>"/><br>
  
  <hr>
  
   <%--  <%=member.getName()%> --%>
  <%--  <%
     Member member = null;
   %>
   <%=member.getName() %> --%>
   
   <c:out value="member.getName()"/> <br>
   <!-- core+el은 null값을 공백으로 출력 -->
   <c:out value="${member.getName() }" /><br>
   <!-- core+jsp는 null 에러 -->
   <%-- <c:out value="<%=member.getName() %>" /><br> --%>
   <!-- 
     core+el 표현식으로 null값을 공백으로 출력
       => default 속성을 사용하면 원하는 값으로 출력가능
    -->
   <c:out value="${member.getName() }" default="문제 발생" /><br>
   
   <!-- (x) -->
   <%-- <c:out value="${member.getName() }" default="<%=result %>" /><br> --%>
   <!-- (o) -->
   <c:out value="${member.getName() }" default="${'문제 발생'}" /><br>
   
   <hr><hr>
   
   <!-- <abc>는 abc태그 입니다.<br> -->
   
   <!-- el표현식 사용해서 [<] 태그 변경 -->
   &lt; abc> 는 abc태그 입니다.<br>
  <!-- JSTL을 사용해서 일반 태그를 출력 -->
  <c:out value="<abc>는 abc태그 입니다."></c:out>
  
   
  
  
  
   
   
   
   
   
   
   
</body>
</html>