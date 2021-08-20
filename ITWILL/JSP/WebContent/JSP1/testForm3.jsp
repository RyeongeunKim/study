<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>WebContent/JSP1/testForm3.jsp</h1>
  
  <h2> 사용자 정보를 입력받아서 testPro3.jsp페이지로 전달 (출력)</h2>
  <!-- 이름,나이, 성별(radio)-2개,강의장(select)-7개,취미(checkbox)-3개 -->
  
  <form action="testPro3.jsp" method="get">
	    이름 : <input type="text" name="name"> <br>
	    나이 : <input type="text" name="age"> <br>
	    성별 : <input type="radio" name="gender" value="남"> 남 
	        <input type="radio" name="gender" value="여"> 여 <br>
	    강의장 : <select name="classNum">
	           <option value="">강의장을 선택하시오</option>
	           <option value="1">1강의장</option>
	           <option value="2">2강의장</option>
	           <option value="3">3강의장</option>
	           <option value="4">4강의장</option>
	           <option value="5">5강의장</option>
	           <option value="6">6강의장</option>
	           <option value="7">7강의장</option>
	         </select><br>
	         
	    취미 : <input type="checkbox" name="hobby" value="게임">게임
	    	<input type="checkbox" name="hobby" value="요리">요리
	    	<input type="checkbox" name="hobby" value="운동">운동
	         <br><br>
	    
	  <input type="submit" value="전송하기">  
	    
  </form>
  
  
  
  
  
  
  
  
  
  
  

</body>
</html>