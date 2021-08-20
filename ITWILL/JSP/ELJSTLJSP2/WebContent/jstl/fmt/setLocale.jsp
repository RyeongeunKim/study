<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>WebContent/fmt/setLocale.jsp</h1>
  
  <c:set var="date" value="<%=new Date()%>" />
  
  <hr>
  el표현식 : ${date }<br>
  
  <hr>
  <h2>우리나라</h2>
  <fmt:setLocale value="ko_kr"/>
    날짜 : <fmt:formatDate value="${date }" dateStyle="full"/><br>
    금액 : <fmt:formatNumber value="1000000000000" type="currency"/><br> 
    
  <hr>
  <h2>미국</h2>
  <fmt:setLocale value="en_us"/>
    날짜 : <fmt:formatDate value="${date }" dateStyle="full"/><br>
    금액 : <fmt:formatNumber value="1000000000000" type="currency"/><br> 
    
   <hr>
  <h2>일본</h2>
  <fmt:setLocale value="ja_jp"/>
    날짜 : <fmt:formatDate value="${date }" dateStyle="full"/><br>
    금액 : <fmt:formatNumber value="1000000000000" type="currency"/><br> 
  
  
  
  
  
  
  
  
  
  
</body>
</html>