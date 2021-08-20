<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

  <h1>WebContent/JSP1/test3.jsp</h1>
  <% 
     new Date();
  
    // p177~
    // 내장객체 : JSP 자체적으로 내장되어있는 객체
    // => 별도의 객체 생성없이 사용가능(import문 사용없이도 사용가능)
    // => 내장객체는 JSP페이지가  서블릿클래스로 변환될때 _jspService()메서드 안에서
    //   가장 먼저 선언됨.
    
	/*
	   [javax.servlet 패키지] - 8개
	    request : 클라이언트 요청정보를 저장하는 객체(HTTP요청,파라미터)
	    response : 요청정보에 대한 응답정보를 처리하는 객체
	    session : 클라이언트의 세션정보를 저장하는 객체 
	    pageContext : 페이지에 실행을 할때 필요한 정보를 저장하는 객체 (프로젝트)
	    out : 응답 페이지 전송을 위한 출력 스트림 객체 
	    application : 해당 애플리케이션의 컨텍스트 정보를 저장한 객체
	    config : 해당 페이지의 서블릿 설정 저장객체
	    page : 해당 페이지 서블릿 객체 (인스턴스)
		
	   [java.lang 패키지] - 1개
	    exeception : 예외 처리 객체 
	*/
  %>
  
  <h3> request 내장객체 </h3>
  <!-- 요청하는 거의 모든 정보를 가지고있는 객체 -->
  
  서버 도메인명 : <%=request.getServerName() %> <br>
 서버 포트번호 : <%=request.getServerPort() %><br>
 URL : <%=request.getRequestURL() %><br>
 URI : <%=request.getRequestURI() %><br>
 
 클라이언트 호스트명 : <%=request.getRemoteHost() %><br> 
 클라이언트 IP : <%=request.getRemoteAddr() %><br>
 
 프로토콜 : <%=request.getProtocol() %><br> 
 
 페이지 요청(전송)방식 : <%=request.getMethod() %><br>
 프로젝트 경로 (컨텍스트 경로) : <%=request.getContextPath() %><br>
 물리적 경로 : <%=request.getRealPath("/") %><br> 
 
 <hr>
 http 해더(user-agent) : <%=request.getHeader("user-agent") %><br> 
 http 해더(accept-language) : <%=request.getHeader("accept-language") %><br> 
 http 해더(host) : <%=request.getHeader("host") %> <br>
 http 해더(connection) : <%=request.getHeader("connection") %> <br> 
  
  
  
 <h3> response 내장객체  </h3>
 <%
   //response.setHeader("해더이름", 값);
   //response.addCookie("쿠키값");
   //response.sendRedirect("URL주소");
   //response.setContentType("MIME 타입");
 
 %>
 <h3> session 내장객체 </h3>
 
 세션 ID값 : <%=session.getId() %><br>
 세션생성시간 : <%=session.getCreationTime() %><br>
 세션최종접속시간 : <%=session.getLastAccessedTime() %><br>
 세션유지시간(1800초,30분) : <%=session.getMaxInactiveInterval() %><br>
 
 <%
  // 세션유지시간 변경 30분->60분
  session.setMaxInactiveInterval(3600); 
 %>
  세션유지시간(3600초,60분) : <%=session.getMaxInactiveInterval() %><br>
   
  
 <h3> application 내장객체 </h3>
 서버 정보 : <%=application.getServerInfo() %><br> 
 물리적경로 : <%=application.getRealPath("/") %><br>
  
  
  
  
  
  
  
  
  

</body>
</html>