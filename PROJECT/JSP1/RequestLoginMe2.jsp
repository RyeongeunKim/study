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
   <h2>로그인 페이지</h2>
    <form action="RequestLoginMe2Pro.jsp" method="post">
     <table border="1" width="400">
      <tr height="60">
       <td width="150" align="center">아이디</td>
       <td width="250" align="left">
        <input type="text" name="id">
       </td>
      </tr>
      <tr height="60">
       <td width="150" align="center">패스워드</td>
       <td width="250" align="left">
        <input type="password" name="pw">
       </td>
      </tr>
      <tr height="60">
       <td colspan="2" align="center">
        <input type="submit" value="전송"> 
       </td>
      </tr>
     
     </table>
    </form>
  
  
  </center>

</body>
</html>