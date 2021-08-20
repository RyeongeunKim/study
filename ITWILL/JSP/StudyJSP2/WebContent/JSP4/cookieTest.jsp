<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

  <h1>WebContent/JSP4/cookieTest.jsp</h1>
  
     쿠키 (p279~ )<br>
      클라이언트 쪽에서 사용(관리)되는 데이터, 생존기간동안 계속해서 유지,
      하드디스크에 저장 => 보안위협
     <hr>
    - 이름, 값, 유효기간, 도메인, 경로..... 생성됨
    - 쿠키의 이름은 알파벳+숫자, 쿠키값 - 일반적인 데이터(공백,괄호,세미콜론.. 추가 인코딩)
    
    서버가 해야하는 일
    1) 쿠키를 생성 (객체)
    2) 쿠키안에 필요한 설정을 저장 
       (쿠키유효기간, 설명, 도메인,...)
    3) 웹 브라우저에 생성된 쿠키를 전달
    
    클라이언트가 사용할때 처리되는 동작
    1) 웹 페이지 요청정보에서 쿠키값을 가져옴    
    2) 쿠키 생성 =>  (이름,값) 쌍으로 생성된 배열의 형태로 리턴         
    3) 쿠키 설정값 지정    
    4) 웹 페이지에 응답정보를 사용해서 쿠키를 전달    
    5) 쿠키이름을 사용해서 쿠키의 값을 꺼내서 사용
   
   <%
   //  크롬 쿠키가 저장되는 HDD 공간
   // C:/Users/ITWILL/AppData/Local
   //   /Google/Chrome/User Data/Default/Cache
   %>
   <hr>
   
     <%
     
       // 쿠키값 사용하기 (받아오기)
       Cookie[] cookies = request.getCookies();
     
       String name = "";
       String value = "";
       // 쿠키 배열이 값이 있을때
       if( cookies != null ){
    	   // 배열의 처음부터 끝까지 돌면서 체크
    	   for(int i=0;i<cookies.length;i++){
    		   // 특정 쿠키정보를 가져오기 => 쿠키의 이름만 비교해서 값을 사용
    			if(cookies[i].getName().equals("CookName")){
    				name = cookies[i].getName();
    				value = cookies[i].getValue();
    			}
    		   
    	   }
       }
     %>
   
    <h2>쿠키이름 : <%=name %> , 쿠키값 : <%=value %> </h2>
   
   <hr>  
   
   <h2> 클라이언트 </h2>
   <input type="button" value="쿠키값 생성(저장)" 
          onclick="location.href='cookieSet.jsp'"
   > <br>
   
   <input type="button" value="쿠키값 삭제(제거)" 
          onclick="location.href='cookieDel.jsp'"
   > <br>
      
     
     
     
      
     
  
  
  
  
  
  
  
  
  
  
  
  
  

</body>
</html>