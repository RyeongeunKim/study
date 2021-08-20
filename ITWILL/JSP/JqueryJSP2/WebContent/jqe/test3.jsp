<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 1. 라이브러리 추가 (파일/CDN)-->
<script src="../js/jquery-3.6.0.js"></script>
<script type="text/javascript">
   $(document).ready(function(){
	   
	   // 제출 버튼 클릭시(submit이벤트 발생) -> 요소의 값을 입력했는지 체크
	   $("#my_form").submit(function(){
		   
		   if( $("#id").val() == ""){
			   alert("아이디를 입력하시오.");
			   $("#id").focus();
			   return false;
		   }
		   //document.폼태그이름.요소이름.focus();//JS
		   //document.getElementById(아이디).focus();//JS
		   
		   // 비밀번호 입력X 처리
		   if( $("#pw").val() == ""){
			   alert("비밀번호를 입력하시오.");
			   $("#pw").focus();
			   return false;
		   }
		   
	   });
	   
	   
	   
   });
</script>
</head>
<body>
  <h1>WebContent/jqe/test3.jsp</h1>
  <!-- 해당 요소에 ID값 부여!, -->
  <form action="a.jsp" id="my_form" onsubmit="">
    아이디 : <input type="text" name="id" id="id"><br>
    비밀번호 : <input type="password" name="pw" id="pw"><br>
   <input type="submit" value="제출">
  </form>
  


</body>
</html>