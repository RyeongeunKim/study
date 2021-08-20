<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>WebContent/el/paramTest1.jsp</h1>
  
  <form action="paramTestPro1.jsp" method="post">
    ID : <input type="text" name="id"><br>
    PW : <input type="password" name="pw"><br>
  <hr>
    좋아하는 음식1 : <input type="text" name="food"><br>
    좋아하는 음식2 : <input type="text" name="food"><br>
  <hr>
   <input type="checkbox" name="hobby" value="게임"> 게임
   <input type="checkbox" name="hobby" value="요리"> 요리
   <input type="checkbox" name="hobby" value="운동"> 운동
  <hr>
    <input type="submit" value="전송">
  </form>
  
  
  
  
</body>
</html>