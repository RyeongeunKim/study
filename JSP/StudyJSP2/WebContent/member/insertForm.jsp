<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

  <h1>WebContent/member/insertForm.jsp</h1>
  
  <h2> 회원가입 </h2>
  <!-- 아이디,비밀번호, 이름,나이, 성별(라디오버튼),이메일 -->
  
  
  <fieldset>
    <legend> 아이티윌 회원가입 페이지 </legend>
    <form action="insertPro.jsp" method="post">
      아이디 : <input type="text" name="id"><br>
      비밀번호 : <input type="password" name="pw"><br>
      이름 : <input type="text" name="name"><br>
      나이 : <input type="number" name="age"><br>
      성별 : <input type="radio" name="gender" value="남"> 남
      <input type="radio" name="gender" value="여"> 여  <br>
      이메일 : <input type="email" name="email"><br>
      <hr>
     <input type="submit" value="회원가입">           
    
    </form>  
  </fieldset>
  
  
  
  
  
  
  
  
  

</body>
</html>