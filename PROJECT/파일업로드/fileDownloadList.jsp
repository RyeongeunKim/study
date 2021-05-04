<%@page import="file.FileDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="file.FileDAO"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다운로드할 파일 목록 보여주는 화면</title>
</head>
<body>
<%--

Tomcat 8 / tomcat rfc 7230 rfc 3986 오류 


톰캣의 특정 버전부터는 RFC 7230, RFC 3986에 의해 특수문자를 URI에 허용하지 않는다.

따라서 GET으로 던지던 많은 파라미터에서 문제가 생길 수 있다.

회사에서 되던게 집에서는 안되길래 크롬 개발자도구 네트워크 탭을 보니, URL Encoded 된 Query String에서 [ ] 등의 특수문자가 보였다. 400오류가 발생했고, 서버 콘솔에는 rfc 7230 and rfc 3986 관련 메시지가 떠있었다.

파라미터를 encodeURI 해서 던지거나 톰캣의 server.xml 옵션을 수정해주어야 한다.

나는 회사에서 잡은 개발환경에 맞추기 위해 후자를 택했다.


톰캣 conf/server.xml의 Connector에 다음 부분을 relaxedQueryChars 옵션을 추가해주면 된다.


<Connector port="8080" protocol="HTTP/1.1"
           connectionTimeout="20000"
           redirectPort="8443"
           URIEncoding="UTF-8"
           relaxedQueryChars="[,]"/>

 --%>

	<%
		//다운로드(업로드)할 파일이 존재 하는 실제 경로 얻기
		/* String directory = application.getRealPath("/upload/"); */
	
		//DB에 실제 저장된 다운로드할 파일명 검색 해서 얻기
		ArrayList<FileDTO> fileList = new  FileDAO().AllSelect();
		
		
	    for(FileDTO dto : fileList){
	    	String fileName = dto.getFileName();//다운로드할 파일의 원본이름(업로드 당시 선택했던 파일의 원본이름)
	    	String fileRealName = dto.getFileRealName();//다운로드할 파일의 실제 이름
	    	int downloadCount = dto.getDownloadCount();//다운로드된 횟수 
	    	//링크 클릭시 다운로드시킬 파일이 존재 하는 실제 경로 upload , 다운로드시킬 파일명 전달
	    	out.println("<a href='" + request.getContextPath() + "/fileDownloadAction.jsp?directory=upload&file="+URLEncoder.encode(fileRealName,"utf-8") +"'>" 
					+  fileName + " ( 다운로드 횟수 : " + downloadCount + " )"
					+ "</a><br>");
	    }
	
		//다운로드(업로드)할 실제 경로 내부에 존재 하는 파일이름들을 문자열 배열에 담아 얻는다.
		//String files[] = new File(directory).list();
		
		
		//다운로드(업로드)할 실제 경로 내부에 존재 하는 파일이름들을 반복문을 이용해서 얻어 출력
		/*
		for(String file : files){
			out.println("<a href='" + request.getContextPath() + "/downloadAction?file="+URLEncoder.encode(file,"utf-8") +"'>" 
						+ file  
						+ "</a><br>");
		}
		*/
	
	%>
	
	<a></a>



</body>
</html>