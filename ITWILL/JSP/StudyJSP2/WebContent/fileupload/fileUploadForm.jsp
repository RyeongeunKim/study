<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

  <h1>WebContent/fileupload/fileUploadForm.jsp</h1>
  
  <form action="fileUploadPro.jsp" method="post" enctype="multipart/form-data">
	  <table border="1">
	    <tr>
	       <td>이름</td><td><input type="text" name="name"></td>
	    </tr>
	    <tr>
	       <td>제목</td><td><input type="text" name="subject"></td>
	    </tr>
	    <tr>
	       <td>파일</td><td><input type="file" name="filename"></td>
	    </tr>
	    <tr>
	       <td colspan="2">
	         <input type="submit" value="파일업로드">
	       </td>
	    </tr>  
	    
	  </table>
  </form>
  
  
  
  
  
  


</body>
</html>