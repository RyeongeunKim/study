<%@page import="fbbs.BoardDAO"%>
<%@page import="fbbs.BoardBean"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>WebContent/board/fWritePro.jsp</h1>

    <%
	   // 파일 업로드 전 준비
	   // 0) 해당 라이브러리 설치 (cos.jar)
	   // 1) 파일이 저장될 위치 지정
	   String path = request.getRealPath("/upload");
	   
	   System.out.println("파일저장되는 실제 경로 : "+path);
	   
	   // 2) 파일의 크기를 지정 -> 10MB
	   int maxSize = 10 * 1024 * 1024;
	   
	   // 파일 업로드 => Multipart객체를 생성
	   MultipartRequest multi 
	      = new MultipartRequest(
	    		  request,
	    		  path,
	    		  maxSize,
	    		  "UTF-8",
	    		  new DefaultFileRenamePolicy()
	    		  );	
	   
	   System.out.println(" 파일 업로드 완료! ");
   
	   // 이전페이지에서 전달해준 정보를 출력
	
	   String subject = multi.getParameter("subject");
	   String name = multi.getParameter("name");
	   String content = multi.getParameter("content");
	   String pass = multi.getParameter("pass");
	   // -> 서버에 올라가는 파일의 이름(중복 처리)
	   String filename = multi.getFilesystemName("filename");

	   BoardBean bb = new BoardBean();
	   bb.setSubject(subject);
	   bb.setName(name);
	   bb.setContent(content);
	   bb.setFilename(filename);
	   bb.setPass(pass);

	   
	   // 한글처리 
	   request.setCharacterEncoding("utf-8");
	
	   // DB에 대한 처리를 하는 객체를 생성
	   BoardDAO bdao = new BoardDAO();
	   
	   // 글쓰기 기능을 사용
	   bdao.insertBoard(bb);
	   
	   //페이지 이동
	   response.sendRedirect("list.jsp"); 
   
   
  %>

  
  
  
  
  
  
  
  
  
  
  
</body>
</html>