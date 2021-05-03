<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

	<center>
	<h2> 회원 가입 </h2>
	<form action="MenberJoinProc.jsp" method="post">
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
	  <input type="password" name="pass" size="40" 
	  placeholder="비밀번호는 영문과 숫자만 넣어주세요">
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
	 <td width=150 align="center">주소</td>
	 <td width=350 align="center">
	  <input type="text" name="address" size="40">
	 </td>
	 </tr>
	<tr height=50>
	 	<td align="center" colspan="2"><input type="submit" value="회원가입"></td>
	 </tr>	 
	 </table>
	 </form>
</center>
</body>
</html>