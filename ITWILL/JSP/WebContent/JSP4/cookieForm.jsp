<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>WebContent/JSP4/cookieForm.jsp</h1>
   
   <%
     String lang = "";
     // 쿠키값 가져오기
     Cookie[] cookieArr = request.getCookies();
   
     // "lang" 쿠키이름을 가진 값을 가져와서 비교 -> 결과출력
     if(cookieArr != null){
    	 for(int i=0;i<cookieArr.length;i++){
    		 if(cookieArr[i].getName().equals("lang")){
    			 lang = cookieArr[i].getValue();
    		 }    		 
    	 }
     }
     
     // 쿠키값에 따른 비교후 출력
   
   %>
   " 안녕하세요. 쿠키연습! " or " Hello, Cookie Test! " 출력<br>
   <hr>
   <%
      if(lang.equals("kor")){
    	  %>
    	  <h3> 결과 데이터 :  안녕하세요. 쿠키연습!</h3>
    	  <%
      }else{
    	  %>
    	  <h3> 결과 데이터 :  Hello, Cookie Test!</h3>
    	  <%
      }
   %>
   
   <hr>
   
   <form action="cookiePro.jsp" method="get">
	   <input type="radio" name="language" value="kor" 
	     <%
	       if(lang.equals("kor")){
	    	   %>
	    	     checked
	           <%
	       }
	     %>
	   > 한국어
	   <input type="radio" name="language" value="eng"
	      <% if(lang.equals("eng")){ %>  checked  <%    }   %>
	       > 영어
	   <hr>
	   <input type="submit" value="전송">
   </form>
   
   
   
   
   
   
   
   
   
   
   
   
</body>
</html>