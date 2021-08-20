<%@page import="model.MemberDAO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<%
	request.setCharacterEncoding("utf-8");
	
	//취미 부분은 별도로 읽어서 다시 빈클래스에 저장
	String[] hobby = request.getParameterValues("hobby");
	//배열에 있는 내용을 하나의 스트링으로 저장
	String texthobby="";
	
	for(int i=0; i<hobby.length; i++){
		texthobby += hobby[i] + " ";
	}
%>

	<!-- useBean을 이용하여 한꺼번에 데이터를 받아옴 -->
	<jsp:useBean id="mbean" class="model.MemberBean">
		<jsp:setProperty name="mbean" property="*"/><!-- 맵핑 시키시오 -->
	</jsp:useBean>
	
<%
	mbean.setHobby(texthobby); //기존 취미는 주소번지가 저장되기에 위에 배열의 내용을 하나의 스트링으로 저장한 변수를 다시입력
	
	//데이터베이스 클래스 객체 생성
	MemberDAO mdao = new MemberDAO();
	mdao.insertMember(mbean);
	
	//회원 가입이 되었다면 회원 정보를 보여주는 페이지로 이동시킴
	response.sendRedirect("MemberList.jsp");
%>




	
	

</body>
</html>