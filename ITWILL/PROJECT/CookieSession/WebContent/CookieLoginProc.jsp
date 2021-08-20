<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<%
	request.setCharacterEncoding("utf-8");

	//아이디 저장 체크 박스가 체크되었는지 판단여부
	String save = request.getParameter("save");
	//아이디 값을 저장
	String id = request.getParameter("id");
	
	//체크되었는지 비교 판단
	if(save != null){//아이디 저장이 체크됨
		
		//쿠키를 사용하려면 쿠키클래스를 생성해주어야 함
		Cookie cookie = new Cookie("id", id); //1번째 String 키값, 2번째는  value값
		//쿠키 유효시간 설정
		cookie.setMaxAge(60*3); //10분간 유효
		//사용자에게 쿠키 값을 넘겨줌
		response.addCookie(cookie);
		
		out.write("쿠키 생성완료");
	}
	


%>

</body>
</html>