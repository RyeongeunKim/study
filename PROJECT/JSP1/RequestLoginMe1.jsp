<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="display: flex; flex-direction: column;">
<div>dsfsdf</div>
<div>fsdfsd</div>
</div>
	<center style="position: absolute; top:50%; left: 50%; transform: translate(-50%, -50%);">
	   <fieldset>
	    <legend><b>[ 로그인 페이지 ]</b></legend>
	  <form action="RequestLoginMePro.jsp" method="post">
	     <table border="1" width="400">
	      <tr height="60">
	       <td align="center" width="150"><b>아이디</b></td>
	       <td align="left">
	        <input type="text" name="id">
	       </td>
	      </tr>
	      <tr height="60">
	       <td align="center" width="150"><b>패스워드</b></td>
	       <td align="left">
	        <input type="password" name="pw">
	       </td>
	       </tr>
	      <tr height="60">
	       <td colspan="2" align="center">
	        <input type="submit" value="전송">
	      </tr>  
	     </table>
	  </form>
	   </fieldset>
	</center>
</body>
</html>