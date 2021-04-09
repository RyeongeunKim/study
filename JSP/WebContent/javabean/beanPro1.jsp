<%@page import="com.itwillbs.beantest.Javabean1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>WebContent/javabean/beanPro1.jsp</h1>
	
	<%
	  // 한글처리 
	  request.setCharacterEncoding("UTF-8");
	  // 전달된 정보 저장(파라미터)
	  String id = request.getParameter("id");
	  
	  ////////////////////////////////////////////////
	  // com.itwillbs.beantest 패키지에 Javabean1 객체 
	  //  id정보를 저장
	  // => 전달된 파라미터를 객체를 사용해서 저장후 출력 
	  
	  Javabean1 jb= new Javabean1();
	  
	  jb.setId(id);
	  //jb.setId(request.getParameter("id")); 가능
	
	  ///////////////////////////////////////////////
	  // JSP 에서는 [액션태그] 사용해서 자바빈 객체를 활용
	  
	%>
	
	<%--
	자바빈 객체 생성
	<jsp:useBean id="" ></jsp:useBean>
	<jsp:useBean id="객체명 (레퍼런스명)" class="클래스의 위치(패키지명)"/> 
	--%>
	<%
	  //Javabean1 jbAction = new Javabean1();
	%>
	<jsp:useBean id="jbAction"
               class="com.itwillbs.beantest.Javabean1" />
               
    <%
       //request.getParameter(arg0) + jbAction.setId(id) 같이 사용하는 역활
       // * 파라미터와 프로퍼티의 값이 동일할경우 파라미터의 정보 생략가능
    %>           
    <%-- <jsp:setProperty property="id" name="jbAction" param="id"/> --%>
    <%-- <jsp:setProperty property="id" name="jbAction"/> --%>
    <jsp:setProperty property="*" name="jbAction"/>              
	

     아이디 : <%=id %><br>
    아이디 (객체 사용 ):<%=jb.getId() %><br>
  <jsp:getProperty property="id" name="jbAction"/> <br>   

















</body>
</html>