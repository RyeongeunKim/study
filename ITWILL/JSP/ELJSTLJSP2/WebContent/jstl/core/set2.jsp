<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>WebContent/jstl/set2.jsp</h1>
<%--    <%
     // set1.jsp 페이지에서 전달한 정보 저장 출력
     // model,name,price
     String model = (String)request.getAttribute("model");
     String name = (String)request.getAttribute("name");
     int price = Integer.parseInt((String)request.getAttribute("price"));
   %>
   <%=model%>
   <%=name %>
   <%=price %> --%>
   <hr>
   <!-- p513 -->
   <h2> el표현식으로 속성(attribute)값을 바로 꺼내서 사용가능 </h2>
   <h2> 기본적으로 해당타입으로 형변환 </h2>
   ${model } 
   ${name } 
   ${price }
   ${price +10000 } <!-- 형변환 -->
   <hr>
   <h3> 영역객체의 접근은 생략 가능하다 </h3>
   ${requestScope.model }
   ${model } 
   ${pageScope.model } 
   
   <hr>
   <!-- jstl 코드 사용해서 특정 영역의 속성을 삭제  -->
   <!-- 속성명은 동일한 이름 사용X, 삭제/선언시 항상 영역을 명시  -->
   <c:remove var="model" scope="request"/>
   ${model } 
   
    <hr> <hr>
    <h2>java 페이지에서 전달된 정보 확인</h2>
    
    ${tel }
    
    <hr>
    <h2> 전달되는 객체 정보 확인 </h2>
    
    ${requestScope.userInfo }<br>
    ${requestScope.userInfo.userName}<br>
    ${userInfo.userGender}<br>
    ${userInfo.userEmail}<br>
    <hr>
    <c:set var="m" value="${requestScope.userInfo }"/>
    ${m.userName }<br>
    <hr>
    <c:set var="mName" value="${requestScope.userInfo.userName }"/>
    ${mName }<br>
     <hr> <hr> <hr>
     
     <h2>java 코드에서 전달된 리스트 정보 출력</h2>
     
     ${requestScope.memberList[0].userName }<br>
     ${memberList[0].userName }<br>
     <c:set var="mName" value="${requestScope.memberList[0].userName  }"/>
     <c:set var="mName1" value="${requestScope.memberList[0]  }"/>
     
     
     
     
    
    
    
   
   
   
   
   
   
   
   
   
   
   
</body>
</html>