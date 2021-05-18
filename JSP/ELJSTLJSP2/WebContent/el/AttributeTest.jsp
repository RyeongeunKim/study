<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>WebContent/el/AttributeTest.jsp</h1>
  <%
    // 전달된 정보 출력(cnt)
    int cnt = (Integer)request.getAttribute("cnt");
  
    // 전달된 session객체정보 출력
    int cnt2 =(Integer) session.getAttribute("cnt");
  
    out.print(" 전달된 cnt : "+cnt+"<br>");
    out.print(" 전달된 cnt2 : "+cnt2+"<br>");
  %>
  
  jsp표현식( 변수 ) : <%=cnt %><br>
  jsp표현식 : <%=cnt2 %><br>
  
  <h2> el 표현식 </h2>
  전달된 cnt(el) ( 속성 ) : ${cnt }<br> 
  전달된 cnt(el) : ${requestScope.cnt }<br> 
  
  <h3>
    EL 내장객체 중에서 (영역객체) 순차적으로 해당영역을 검색 
    해당 데이터 있을경우 다음 영역의 검색 X
  </h3>
  <!-- 
      page		request		session		application
  
  				cnt=100		cnt=200
  
   $ {cnt} : 영역이 없을경우 처음부터 순차적 검색
   $ {sessionScope.cnt} : 해당 영역만 접근해서 검색
   -->
  
  
  
  
  
  
  
</body>
</html>