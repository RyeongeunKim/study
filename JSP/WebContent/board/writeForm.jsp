<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>WebContent/board/writeForm.jsp</h1>
  
  <h2> 게시판 글쓰기 </h2>
  
  <fieldset>
    <form action="writePro.jsp" method="post">
          글쓴이 : <input type="text" name="name"> <br>
          비밀번호 : <input type="password" name="pass"><br>
          제목 : <input type="text" name="subject"><br>
          내용 : <textarea rows="10" cols="30" name="content"></textarea>
      <hr>
          
      <input type="submit" value="글쓰기">
    </form>
  </fieldset>
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 

</body>
</html>