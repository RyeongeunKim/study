<%@page import="com.itwillbs.member.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>WebContent/member/joinIDCheck.jsp</h1>

	<%
	  // 사용자가 입력한 ID정보를 가지고 
	  // DB로 이동후 회원인지 아닌지 판단
	  
	  // 전달되는 파라미터 저장(userid)
	  String id = request.getParameter("userid");
	  
	  // DB 객체 생성 -> 체크 메서드 
	  MemberDAO mdao = new MemberDAO();
	  
	  int result = mdao.idCheck(id);
	
	  if(result==1){
		  out.print("이미 사용중인 아이디입니다.");
	  }else{//result ==0
		  out.print("사용가능한 아이디입니다.");
	  }
	%>
	<hr>
	
	<form action="" method="post" name="ofr">
	  <input type="text" name="userid" value="<%=id%>">
	  <input type="submit" value="중복체크">
	</form>
	
	
	
	
	
	
	
	
	



</body>
</html>