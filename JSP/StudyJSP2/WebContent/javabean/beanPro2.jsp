<%@page import="com.itwillbs.beantest.Javabean2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>WebContent/javabean/beanPro2.jsp</h1>

	<%
	  //한글처리 
	  request.setCharacterEncoding("utf-8");
	
	  //전달받은 파라미터값 저장
	  String id = request.getParameter("id");
	  String pw = request.getParameter("pw");
	  int age = Integer.parseInt(request.getParameter("age"));
	  
	  //출력
		
	%>
	<h2> id : <%=id %></h2>
	<h2> pw : <%=pw %></h2>
	<h2> age : <%=age %></h2>
	
	<hr>
	<h2> 자바빈 객체 만 사용해서 정보 저장후 출력 </h2>
	
	<%
	  // 자바빈객체 생성
	  Javabean2 jb2 = new Javabean2();
	  // 객체안에 전달된 정보 저장 (파라미터값)
	  jb2.setId(id);
	  jb2.setPw(pw);
	  jb2.setAge(age);
	  
	  // 객체안에 정보 출력
	%>
	<%=jb2.getId() %><br>
	<%=jb2.getPw() %><br>
	<%=jb2.getAge() %><br>
	
	<h2> 액션태그+자바빈 객체 </h2>
	
	<jsp:useBean id="usejb"
	    class="com.itwillbs.beantest.Javabean2" />
	
<%-- 	<jsp:setProperty property="id" name="usejb"/>
	<jsp:setProperty property="pw" name="usejb"/>
	<jsp:setProperty property="age" name="usejb"/> --%>
	
	<!-- 전달된 파라미터의 모든 값을  자바빈 객체에 모두 저장 -->
	<jsp:setProperty property="*" name="usejb"/>
	
	<jsp:getProperty property="id" name="usejb"/>
	<jsp:getProperty property="pw" name="usejb"/>
	<jsp:getProperty property="age" name="usejb"/>














</body>
</html>