<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		request.setCharacterEncoding("UTF-8");
		
		//아이디 저장체크 박스가 체크 되었는지 판단 여부
		String save = request.getParameter("save");
		//아이디 값을 저장
		String id  = request.getParameter("id");
		//out.write("아이디 저장 =" + request.getParameter("save"));
		
		//체크 되었는지 비교 판단 
		if(save != null){//아이디 저장 눌렀다면
			//쿠키를 사용하려면-쿠키 클래스를 생성해주어야함
			Cookie cookie = new Cookie("id",id);//1번째 String 키값을 적어줌 , 2번째는 value값을 넣어줌 
			
			//쿠키 유효시간 설정 
			cookie.setMaxAge(60*10);//10분간 유효
			
			//사용자에게 쿠키 값을 넘겨줌 
			response.addCookie(cookie);
			
			out.write("쿠키 생성 완료");
		 }	
	%>	
	
	
	
</body>
</html>