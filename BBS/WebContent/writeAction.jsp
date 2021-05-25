<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bbs.BbsDAO" %>
<%@ page import="java.io.PrintWriter" %>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="bbs" class="bbs.Bbs" scope="page"/>
<jsp:setProperty property="bbsTitle" name="bbs"/>
<jsp:setProperty property="bbsContent" name="bbs"/>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>드림오피스</title>
</head>
<body>
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
   String bbsTitle = multi.getParameter("bbsTitle");
   String bbsContent = multi.getParameter("bbsContent");
   //String filename = multi.getParameter("filename");(x)
   
   // -> 서버에 올라가는 파일의 이름(중복 처리)
   String filename = multi.getFilesystemName("filename");
   // -> 서버에 올라가는 파일이름 X 파일 자체의 이름
   String oFileName = multi.getOriginalFileName("filename");
   
  %>
  
  제목 : <%=bbsTitle %><br>
  내용 : <%=bbsContent %><br>
  파일 : <%=filename %><br>
 파일(원본) : <%=oFileName %><br> 
  
  <hr>
  
  <form name="fr" action="writeAction2.jsp" method="post">
     <input type="hidden" name="bbsTitle" value="<%=bbsTitle %>">
     <input type="hidden" name="bbsContent" value="<%=bbsContent %>">
     <input type="hidden" name="filename" value="<%=filename %>">
     <input type="hidden" name="oFileName" value="<%=oFileName %>">
      
     <<input type="submit" value="전달하기">   
  </form>
  
<!--   <a href="javascript:fr.submit();">뷰로이동</a> -->
</body>
</html>