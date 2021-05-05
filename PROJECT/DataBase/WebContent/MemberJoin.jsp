<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h2> 회원 가입 </h2>
	<form action="MemberJoinProc.jsp" method="post">
	<table width=500 border="1">
	<tr height=50>
	 <td width=150 align="center">아이디</td>
	 <td width=350 align="center">
	  <input type="text" name="id" size="40" placeholder="id넣으세요">
	 </td>
	</tr>
	<tr height=50>
	 <td width=150 align="center">패스워드</td>
	 <td width=350 align="center">
	  <input type="password" name="pass1" size="40" 
	  placeholder="비밀번호는 영문과 숫자만 넣어주세요">
	 </td>
	</tr>	
	<tr height=50>
	 <td width=150 align="center">패스워드확인</td>
	 <td width=350 align="center">
	  <input type="password" name="pass2" size="40">
	 </td>
	</tr>	
	<tr height=50>
	 <td width=150 align="center">이메일</td>
	 <td width=350 align="center">
	  <input type="email" name="email" size=40>
	 </td>
	</tr>	
	<tr height=50>
	 <td width=150 align="center">전화번호</td>
	 <td width=350 align="center">
	  <input type="tel" name="tel" size="40">
	 </td>
	</tr>
	<tr height=50>
	 <td width=150 align="center">당신의 관심분야</td>
	 <td width=350 align="center">
	  <input type="checkbox" name="hobby" value="캠핑">캠핑
	  <input type="checkbox" name="hobby" value="등산">등산
	  <input type="checkbox" name="hobby" value="영화">영화
	  <input type="checkbox" name="hobby" value="독서">독서
	 </td>
	</tr>
	<tr height=50>
	 <td width=150 align="center">당신의 직업은</td>
	 <td width=350 align="center">
	 <select name="job">
	  <option value="제빵사">제빵사</option>
	  <option value="개발자" selected="selected">개발자</option>
	  <option value="디자이너">디자이너</option>
	  <option value="웹툰작가">웹툰작가</option>
	 </select>
	 </td>
	</tr>	
	<tr height=50>
	 <td width=150 align="center">당신의 연령은</td>
	 <td width=350 align="center">
	  <input type="radio" name="age" value="10대">10대
	  <input type="radio" name="age" value="20대">20대
	  <input type="radio" name="age" value="30대">30대
	  <input type="radio" name="age" value="40대">40대
	 </td>
	</tr>
	<tr height="50">
		<td width="150" align="center">하고 싶은말</td>
		<td width="350" align="center">
		  <textarea rows="5" cols="40" name="info"></textarea>	
		</td>
	</tr>
	<tr height=50>
	 <td colspan="2" align="center">
	 <input type="submit" name="submit" value="회원가입">
	 <input type="reset" name="reset" value="취소">
	 </td>
	</tr>
	</table>
	</form>
	</center>

</body>
</html>