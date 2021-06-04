<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

  <!-- model2 실행페이지 -->
  <%
    //index.jsp페이지
    //response.sendRedirect("./MemberJoin.me");
    //response.sendRedirect("./MemberLogin.me");
    
    // 메인페이지 이동
    response.sendRedirect("./Main.me");
    
    // 쇼핑몰-상품등록/관리/주문/장바구니...
    // 관리자 - 상품등록
    //response.sendRedirect("./GoodsAdd.ag");
    // 관리자 - 상품리스트
    //response.sendRedirect("./AdminGoodsList.ag");
    
     
  
  %>
  
  

</body>
</html>