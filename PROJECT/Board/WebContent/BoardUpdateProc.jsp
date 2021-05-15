<%@page import="model.BoardDAO"%>
<%@page import="model.BoardBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<%
	request.setCharacterEncoding("utf-8");
%>

<!-- 사용자데이터를 읽어들이는 빈클래스 설정 -->
<jsp:useBean id="boardbean" class="model.BoardBean">
	<jsp:setProperty name="boardbean" property="*"/>
</jsp:useBean>


<%
	//데이터 베이스에 연결
	BoardDAO bdao = new BoardDAO();
	//해당 게시글의 패스워드값을 얻어옴
	String pass = bdao.getPass(boardbean.getNum());
	
	//기존 패스워드값과 update시 작성했던 password값이 같은지 비교
	if(pass.equals(boardbean.getPassword())){
		
		//데이터 수정하는 메소드 호출
		bdao.updateBoard(boardbean);
		//수정이 완료되면 전체 게시글 보기
		response.sendRedirect("BoardList.jsp");
		
	}else{//패스워드가 틀리다면
%>		
	<script type="text/javascript">
		alert("패스워드가 일치하지 않습니다. 다시 확인 후 수정해주세요");
		history.go(-1);
	</script>
		
	
		
	<%}%>

</body>
</html>