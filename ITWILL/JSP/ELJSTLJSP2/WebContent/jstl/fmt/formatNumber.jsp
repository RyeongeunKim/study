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
  <h1>WebContent/jstl/fmt/formatNumber.jsp</h1>
  
  <h2> fmt 라이브러리 (Formatting)</h2>
  
  <c:set var="data" value="1230000000000000"/>
  ${data }
  <hr>
  3자리 마다 , 구분해보기 (groupingUsed = 기본값 true)<br>
  <fmt:formatNumber value="${data }" /><br>
  <fmt:formatNumber value="${data }" groupingUsed="false"/><br>
  <hr>
  
  # : 자리수가 있을때 해당길이만큼 표시 <br>
  3.123123123 소수점 데이터를 소수점 2째 자리까지 표현<br>
  <fmt:formatNumber value="3.123123123" pattern="#.#####"/><br>
  
  0 : 자리수가 없을때 해당 자리를 표시 <br> 
  10.5 소수점데이터 -> 10.50 출력 <br>
  <fmt:formatNumber value="10.5" pattern="##.00"/><br>
  
  <hr>
    백분율 계산하기(퍼센트 계산) <br>
   <fmt:formatNumber value="0.12313" type="percent"/><br>
    
   <fmt:formatNumber value="100000" type="currency"/><br> 
  
   <fmt:formatNumber value="100000" type="currency" 
          currencySymbol="★"/><br> 
  
  
  
  
  
</body>
</html>