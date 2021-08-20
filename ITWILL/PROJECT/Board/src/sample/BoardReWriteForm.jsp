<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h2>답변글 입력하기</h2>
	<% 
		//게시글 읽기에서 답변글쓰기를 클릭하면 넘겨주는 데이터들을 받아줌
		int num = Integer.parseInt(request.getParameter("num"));
		int ref = Integer.parseInt(request.getParameter("ref"));
		int re_stop = Integer.parseInt(request.getParameter("re_stop"));
		int re_level = Integer.parseInt(request.getParameter("re_level"));
	%>

	<form action="BoardReWriteProc.jsp" method="post">
		<table width="600" border="1" bordercolor="gray" bgcolor="skyblue">
			<tr height = "40">
				<td width="150" align="center"> 작성자</td>
				<td width="450"><input type ="text" name="write" size ="60"></td>
			</tr>
			
			<tr height = "40">
				<td width="150" align="center">제목</td>
				<td width="450"><input type ="text" name="subject"  value ="[답변]" size ="60"></td>
			</tr>
			
			<tr height = "40">
				<td width="150" align="center">이메일</td>
				<td width="450"><input type ="email" name="email" size ="60"></td>
			</tr>
			
			<tr height = "40">
				<td width="150" align="center">비밀 번호</td>
				<td width="450"><input type ="password" name="password" size ="60"></td>
			</tr>
		
			<tr height = "40">
				<td width="150" align="center">글 내용</td>
				<td width="450"><textarea rows="10" cols="60" name="content"></textarea></td>
			</tr>
			
			<!--form에서 사용자로부터 입력바지 않고 데이터를 넘김 -->
			<tr height ="40">
				<td align ="center" colspan="2">
					<input type="hidden" name ="ref" value="<%=ref%>">
					<input type="hidden" name ="re_stop" value="<%=re_stop%>">
					<input type="hidden" name ="re_level" value="<%=re_level%>">
					<input type="submit" value="답글 쓰기 완료">&nbsp;&nbsp;
					<input type="reset" value="취소">
					<input type="button" onclick="location.href='BoardList.jsp'" value="전체글보기">
				</td>
			</tr>
		</table>
	</form>
	</center>
</body>
</html>