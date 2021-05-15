<%@page import="model.BoardBean"%>
<%@page import="model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2> 게시글 수정 </h2>
<%
	//해당 게시글번호를 통하여 게시글을 수정
	int num = Integer.parseInt(request.getParameter("num").trim());

	//하나의 게시글에 대한 정보를 리턴
	BoardDAO bdao = new BoardDAO();
	BoardBean bean = bdao.getOneUpdateBoard(num);
%>
<form action="BoardUpdateProc.jsp" method="post">
<table width="600" border="1" bgcolor="silver">
	<tr height="40">
		<td width="120" align="center">작성자</td>
		<td width="180" align="center"><%=bean.getWriter() %></td>
		<td width="120" align="center">작성일</td>
		<td width="180" align="center"><%=bean.getReg_date() %></td>
	</tr>
	<tr height="40">
		<td width="120" align="center">제목</td>
		<td width="480" colspan="3"> &nbsp; <input type="text" name="subject" value="<%=bean.getSubject() %>"></td>
	</tr>
	<tr height="40">
		<td width="120" align="center">패스워드</td>
		<td width="480" colspan="3"> &nbsp; <input type="password" name="password"></td>
	</tr>
	<tr height="40">
		<td width="120" align="center">글내용</td>
		<td width="480" colspan="3"><textarea rows="10" cols="60" name="content"><%=bean.getContent() %></textarea></td>
	</tr>
	<tr height="40">
		<td colspan="4" align="center">
			<input type="hidden" name="num" value="<%=bean.getNum() %>">
			<input type="submit" value="글수정"> &nbsp;
			<input type="button" onclick="location.href='BoardList.jsp'" value="전체글보기">
		</td>
	</tr>
</table>
</form>
</body>
</html>