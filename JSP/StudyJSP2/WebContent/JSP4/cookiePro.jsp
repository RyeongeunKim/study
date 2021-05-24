<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

    <h1>WebContent/JSP4/cookiePro.jsp</h1>
    
    <%
      String lang = request.getParameter("language");
    
      // 쿠키값 생성
      Cookie cookie = 
         //new Cookie("lang",lang);
         new Cookie("lang",request.getParameter("language"));
      
      // 쿠키 설정
      cookie.setMaxAge(3600);
      
      // 쿠키를 응답객체에 저장
      response.addCookie(cookie);
    
    %>
    <script type="text/javascript">
         alert("언어 쿠키값 생성! ");
         location.href="cookieForm.jsp";    
    </script>
    
    
    
    
    
    
    
    

</body>
</html>