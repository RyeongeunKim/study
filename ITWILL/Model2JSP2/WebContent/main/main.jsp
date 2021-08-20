<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>WebContent/member/main.jsp</h1>
	
	<%
	  // 사용자가 로그인을 했을때만 main페이지 확인
	  // 로그인 안한경우 로그인 페이지로 이동
	  
	  // 세션객체의 정보를 가져와서 확인
	  String id = (String) session.getAttribute("id");
	
	  if(id == null){
		  // 로그인 x
		  System.out.println("[main.jsp] : 아이디없음 -> 로그인페이지 이동");
		  response.sendRedirect("./MemberLogin.me");
	  }
	  
	%>
	<h2><%=id %>님 환영합니다~!</h2>
	<h2>${sessionScope.id }</h2>
	
	<input type="button" value="로그아웃!" 
	   onclick=" location.href='./MemberLogout.me'; "
	>
	<hr>
	
	<h3><a href="./MemberInfo.me">회원 정보 조회</a></h3>
	
	
	<h3><a href="./MemberUpdate.me">회원 정보 수정</a></h3>
	
	
	<h3><a href="./MemberDelete.me">회원 정보 탈퇴(삭제)</a></h3>
	
	<hr>
	
	<h3><a href="./GoodsList.go">쇼핑몰 메인페이지(사용자)</a></h3>
	
	<hr>
	
	<h3><a href="./BasketList.ba">쇼핑몰 장바구니(사용자)</a></h3>
	
	<hr>
	
	<h3><a href="./OrderList.or">쇼핑몰 주문목록(사용자)</a></h3>
	
	<hr>
	<!-- 관리자만 사용가능한 메뉴 생성 -->
	<%
		 // 참조형데이터 값 비교시 항상 null값을 먼저 비교후 데이터 비교 
		if(id !=null && id.equals("admin") ){
		%>
	   <h3><a href="./MemberList.me">회원 목록보기</a></h3>
	  
	   <h3><a href="./AdminGoodsList.ag">상품 목록보기(관리자)</a></h3>
	   
	   <h3><a href="./AdminOrderList.ao">주문 목록보기(관리자)</a></h3>
	
	<%
	   }
	%>
	
	
	
	
	
	
	

</body>
</html>