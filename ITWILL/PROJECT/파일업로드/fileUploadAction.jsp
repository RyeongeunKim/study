<%@page import="java.io.File"%>
<%@page import="file.FileDAO"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//Application 내장객체는 전체 프로젝트에 대한 자원을 관리하는 객체입니다.
	//서버의 실제 프로젝트 경로에서 자원을 찾을때 가장 많이 사용합니다.
	String directory = application.getRealPath("/upload/"); //업로드할 실제 서버 경로 얻기 
	System.out.println(directory);//D:\workspace_jsp\FileUpload\WebContent  upload\


	int maxSize = 1024 * 1024 * 1024;
	
	String encoding = "UTF-8";
	//업로드하기
	MultipartRequest multipartRequest = new MultipartRequest(request, directory, maxSize, encoding, new DefaultFileRenamePolicy());
	
	//서버에 업로드할 파일의 원본 파일명 얻기
	String fileName = multipartRequest.getOriginalFileName("file");
	//실제 서버에 업로드되어 올라가는 실제 파일명 얻기
	String fileRealName = multipartRequest.getFilesystemName("file");
	
	//업로드한 파일의 원본이름 과 업로드한 파일의 실제이름을 DB에  INSERT
	new FileDAO().upload(fileName, fileRealName);
	
	out.write("업로드한 원본 파일명 : " + fileName + "<br>");
	out.write("업로드한 실제 파일명 : " + fileRealName + "<br>");
	

/*	
	//업로드할 파일의 확장자가 .doc .hwp .pdf  .xls 가 아니라면?
	//위 MultipartRequest객체를 통해 업로드한 다른 확장자명을 가진 파일들은 삭제하자!
	//즉 위 4가지 파일만 업로드 가능 하게 하기 
	if(!fileName.endsWith(".doc") && 
	   !fileName.endsWith(".hwp") && 
	   !fileName.endsWith(".pdf") &&
	   !fileName.endsWith(".xls")){
	
	   File file = new File(directory + fileRealName);
	   file.delete();//파일삭제
	   out.write("업로드할 수 없는 확장자의 파일입니다.");
	}else{
		//업로드한 파일의 원본이름 과 업로드한 파일의 실제이름을 DB에  INSERT
		new FileDAO().upload(fileName, fileRealName);
		
		out.write("업로드한 원본 파일명 : " + fileName + "<br>");
		out.write("업로드한 실제 파일명 : " + fileRealName + "<br>");
	}
*/	
	


%>
</body>
</html>