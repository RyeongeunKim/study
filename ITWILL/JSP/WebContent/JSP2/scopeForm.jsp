<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

  <h1>WebContent/JSP2/scopeForm.jsp</h1>
  <%
    //p209 - 영역객체(Scope) / 속성(Attribute)
    
    // *내장 객체중 page(pageContext),request,session,application
    //  특수한 기능이 있음 => 각각의 범위를 사용하며, 그 범위안에서 데이터를 공유가능
    //  공유가능한 범위 : Scope, 공유되는 데이터 : Attribute
    
    
    // [ 영역 - Scope ]   -  [ 영역 객체 ]      -  [ 속성의 유효 범위 ] 
    // page	영역				pageContext			해당페이지
    // request 영역			reqeust				요청이 처리되는 페이지
    // session 영역			session				세션이 유지되는 동안 모든 페이지
    // application 영역		application			서버 실행후 프로그램의 모든 페이지
    
    
    // * pageContext : jsp 페이지 정보를 저장객체 
    //  - 다른 내장객체 호출, 페이지 흐름제어, 에러데이터 추출...
    
    // * request : 페이지 요청시 정보를 저장하는 객체 
    //  - 페이지 이동시 정보 가지고 이동
    	
    // * session : 하나의 웹 브라우저당 하나씩 생성, 정보를 유지 객체 
    
    // * application : 웹 애플리케이션 (프로젝트)정보를 저장하는 객체 
    //  - 서버 자체의 정보, 서버 이벤트 로그...
    //  - 프로젝트당 1개만 생성
    
    
  %>
  
  
  <form action="scopePro.jsp" method="get">
    
    아이디 : <input type="text" name="id">
    <input type="submit" value="전송하기">    
  
  </form>
  
  
  
  
  
  
  
  
  
  
  
  
  

</body>
</html>