<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.UserDAO" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="user" class="user.User" scope="page"/>
<jsp:setProperty property="userID" name="user"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/custom.css">
<title>중복체크</title>
<script src="js/bootstrap.js"></script>
<script type="text/javascript">
	function winclose(){
		window.close();
	}
</script>
</head>
<body>
	


	<%
	  // 사용자가 입력한 ID정보를 가지고 
	  // DB로 이동후 회원인지 아닌지 판단
	  
	  // 전달되는 파라미터 저장(userid)
	  String userID = request.getParameter("userID");
	  
	  // DB 객체 생성 -> 체크 메서드 
	  UserDAO udao = new UserDAO();
	  
	  int result = udao.idCheck(userID);
	
	  if(result==1){
	  %>
	<form action="" method="post" name="ofr">
	  <input type="text" name="userID" value="<%=userID%>">
	  <input type="submit" class="btn btn-primary" value="닫기" onclick="winclose();">
	</form> 이미 사용 중인 아이디입니다.
	  <% 
	  }else{//result ==0
	  %>
	<form action="" method="post" name="ofr">
	  <input type="text" name="userID" value="<%=userID%>">
	  <input type="submit" class="btn btn-primary" value="사용하기" onclick="winclose();">
	</form>	사용가능한 아이디입니다.
	  <%
	  }
	%>

	





</body>
</html>