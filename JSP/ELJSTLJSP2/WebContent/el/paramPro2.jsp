<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>WebContent/el/paramPro2.jsp</h1>
  <!-- el 표현식 사용 -->
  num1 : <%=request.getParameter("num1") %><br>
  num2 : ${param.num2 }<br> 
  
  num1 + num2 = ${ param.num1 + param.num2 }<br>
  
  num1,num2값이 둘다 양수 인지 판별 (t/f)? ${ (param.num1 > 0) && (param.num2 > 0) } <br>
  num1,num2값이 둘다 양수 인지 판별 (t/f)? ${ (param.num1 gt 0) && (param.num2 gt 0) } <br>
   
   
  num1,num2 같은가?  "같다","다르다" ${ (param.num1 == param.num2)? "같다":"다르다" }<br>
  num1,num2 같은가?  "같다","다르다" ${ (param.num1 eq param.num2)? "같다":"다르다" }<br>
  
  <!-- 전달된 ID값이 있는경우 "ㅇㅇㅇ"님 안녕하세요/ 없는경우 "guest"님 안녕하세요 -->
  
  ${empty param.id? "guest":param.id }님 안녕하세요<br>
  
  
 <!-- el 연산자 p516~ -->
 <!-- 
    . 
    []
    ()
    x? a:b
    empty : 값이 null 이거나, 컬렉션의 사이즈가 0인경우  true
    ------------------------------------------
    + - * /(div) %(mod)
    &&(and) ||(or) !(not)
    ------------------------------------------
    == / eq
    != / ne
    <  / lt
    >  / gt
    <= / le
    >= / ge
  -->
 
 
  
  
  
  
  
  
</body>
</html>