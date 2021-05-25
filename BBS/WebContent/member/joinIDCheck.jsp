<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.UserDAO" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="user" class="user.User" scope="page"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<link rel="stylesheet" href="../css/bootstrap.css">
<link rel="stylesheet" href="../css/custom.css">
<title>중복체크</title>
<script src="../js/bootstrap.js"></script>
<script type="text/javascript">
	function winclose(){
		window.close();
	}
</script>
</head>
<body>

	<% //1. 한글처리 & 받아온 파라미터 변수화
		request.setCharacterEncoding("utf-8");
		String userID = request.getParameter("id");
		
	   //2. 객체생성 -> 전달받은 정보 모두 저장
	   UserDAO udao = new UserDAO();
	   
	   //3. joinIDCheck(id) 메서드
	   int result = udao.joinIdCheck(userID);
	   if(result == 1){

		   //5. 아이디 사용하기 버튼 추가
		   %>
		   	<p>
			  사용가능한 아이디입니다.<input type="button" class="btn btn-primary" value="사용하기" onclick="result();">
		   </p>
		   <% 
		   } else if(result == 0) {
			   out.print("중복된 아이디입니다");
		   } else {
			   out.print("에러 발생");
		   }
		   
		   %>
		   
	<!-- 4. 팝업창 구현	 -->	
	
	<form action="joinIDCheck.jsp" method="post" name="wfr">
	  <input type="text" name="id" value="<%=userID%>">
	  <input type="submit" class="btn btn-primary" value="중복확인">
	</form>	
	
	<!-- 선택된 아이디는 중복확인창에서 회원가입 페이지로 정보전달 -->
	<script>
		function result(){
			//팝업창의 아이디정보를 회원가입창에 아이디정보로 전달
			//팝업창은 기존창과 종속관계를 가지고 있으므로 opener를 이용하면 된다.
			
			//회원가입페이지의 userID값에 아이디중복으로 선택된 id값을 대입
			opener.document.fr.userID.value = document.wfr.id.value;
			
			//회원가입창 제어
			opener.document.fr.userID.readOnly=true;
			
			//창닫기
			window.close();
		}
	
	</script>
	
</body>
</html>