<%@page import="fbbs.BoardBean"%>
<%@page import="fbbs.BoardDAO"%>
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
	<h1>WebContent/board/content.jsp</h1>
	<%
   // 한글처리 
   request.setCharacterEncoding("UTF-8");
   // 전달되는 파라미터값 저장(name,subject,filename,oFileName)
   String name = request.getParameter("name");
   String subject = request.getParameter("subject");
   String filename = request.getParameter("filename");
  %>
	<%
		// 페이지 이동시 전달정보가 있으면(파라미터) 항상 가장먼저 저장
		// num,pageNum
// 		int num = 0;
// 		try{
// 			num = Integer.parseInt(request.getParameter("num"));
// 		}catch(Exception e){
// 			System.out.println("존재하지 않는 글번호를 정수로 변환할수 없다.");
// 			num=1;
// 		}
		
		int num = Integer.parseInt(request.getParameter("num"));
		String pageNum = request.getParameter("pageNum");
		
	    // BoardDAO 객체 생성
	    BoardDAO bdao = new BoardDAO();
		
		// DB에서 글번호(num)에 해당하 글정보를 모두 가져와서 출력	
		BoardBean bb = bdao.getBoard(num); 
	%> 

    <table border="1">
      <tr>
        <td>글번호</td>
        <td><%=bb.getNum() %></td>
      </tr>
      <tr>
        <td>글쓴이</td>
        <td><%=bb.getName() %></td>
      </tr>
      <tr>
        <td>글 제목</td>
        <td colspan="3"><%=bb.getSubject() %></td>
      </tr>
      <tr>
        <td>첨부파일</td>
        <td colspan="3">
          <a href="file_down.jsp?filename=<%=bb.getFilename()%>"><%=bb.getFilename() %></a> 

        </td>
      </tr>
      <tr>
        <td>글내용</td>
        <td colspan="3"><%=bb.getContent() %></td>
      </tr>
      
      <tr>
        <td colspan="4">
          <input type="button" value="수정하기" 
                 onclick="location.href='updateForm.jsp?num=<%=bb.getNum() %>&pageNum=<%=pageNum %>';"
          >
          <input type="button" value="삭제하기" 
                onclick=" location.href='deleteForm.jsp?num=<%=bb.getNum() %>&pageNum=<%=pageNum %>';"
          >
          
          <input type="button" value="답글쓰기" 
                onclick="location.href='reWriteForm.jsp?num=<%=bb.getNum() %>&re_ref=<%=bb.getRe_ref() %>&re_lev=<%=bb.getRe_lev() %>&re_seq=<%=bb.getRe_seq() %>';"
          >
          
          <input type="button" value="목록으로" 
                 onclick="location.href='list.jsp?pageNum=<%=pageNum %>';" >        
        </td>
      </tr>
      
    
    </table>












</body>
</html>