<%@page import="com.itwillbs.board.BoardDAO"%>
<%@page import="com.itwillbs.board.BoardBean"%>
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
   // upload 폴더 생성(가상경로)
   String realPath = request.getRealPath("/upload");
   System.out.println("실제 저장위치 : "+realPath);
   
   // 파일업로드 크기지정(10mb);
   int maxSize = 10 * 1024 * 1024;
  
   // 1) 파일업로드
   MultipartRequest multi =
            new MultipartRequest(
            		request,
            		realPath,
            		maxSize,
            		"UTF-8",
            		new DefaultFileRenamePolicy()
            		);
   
   // 파일 업로드 완료(서버의 HDD에 저장)
   ///////////////////////////////////////////////////

   // 2) DB에 글쓰기 정보를 저장
   // 전달된 정보를 저장(파라미터값)
   BoardBean bb = new BoardBean();
   
   bb.setName(multi.getParameter("name"));
   bb.setPass(multi.getParameter("pass"));
   bb.setSubject(multi.getParameter("subject"));
   bb.setContent(multi.getParameter("content"));
   
   // 서버에 업로드된 파일 이름을 저장
   bb.setFile(multi.getFilesystemName("filename"));
   bb.setIp(request.getRemoteAddr());
   
   // BoardDAO 객체 생성-파일글쓰기 메서드호출
   BoardDAO bdao = new BoardDAO();
   bdao.insertBoard(bb);

   // 3) 페이지 이동  

   response.sendRedirect("list.jsp");
  
  %>
  
  
  
  
  
  
  
  
  
  
</body>
</html>