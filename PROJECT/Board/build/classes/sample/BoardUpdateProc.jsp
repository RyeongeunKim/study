<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="Model.BoardDAO"%>
<%@ page import="Model.BoardBean"%>
<%@ page import ="java.util.Vector"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<% 
		request.setCharacterEncoding("UTF-8");
	%>
	
	<!--데이터를 한번에 받아오는 빈클래스를 사용하도록  -->
	<jsp:useBean id = "boardbean" class= "Model.BoardBean">
		<jsp:setProperty name="boardbean" property = "*" />
	</jsp:useBean>
	
	<% 
		//데이터 베이스에 연결 
		BoardDAO bdao = new BoardDAO();
		
		//해당 게시글의 패스워드 값을 얻어옴
		String pass = bdao.getPass(boardbean.getNum());
		
		//기존 패스워드 값과 update시 작성했던 pass값이 같은지 비교 
		if(pass.equals(boardbean.getPassword())){
			//데이터 수정하는 메소드 호출
			bdao.updateBoard(boardbean);
			//수정이 완료되면 전체 게시글 보기 
			response.sendRedirect("BoardList.jsp");
		}else{//패스워드가 틀리다면 
	%>			
		<script type="text/javascript">	
			alert("패스워드가 일치하지 않습니다. 다시 확인후 수정해 주세요 ");
			history.go(-1);
		</script>
	<% 		
		}
	%>
	
</body>
</html>