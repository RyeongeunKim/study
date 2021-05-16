<%@page import="com.itwillbs.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>WebContent/board/updatePro.jsp</h1>
   <%
      // 한글처리 
      request.setCharacterEncoding("utf-8");
   
      // 주소줄에 전달되는 pageNum값 저장
      String pageNum = request.getParameter("pageNum");
      
      // 이전 페이지에서 전달된 데이터 저장(파라미터)
      // => 액션태그
   %>
     <jsp:useBean id="bb" class="com.itwillbs.board.BoardBean" />
     <jsp:setProperty property="*" name="bb"/>
   <%
     System.out.println("수정할 정보 : "+bb); 
   
     // DB 처리객체 BoardDAO 생성
     BoardDAO bdao = new BoardDAO();
     // 해당 글정보를 사용해서 글내용 수정
     int check = bdao.updateBoard(bb);
     
     System.out.println("check : "+check);
     
     // 페이지 이동   (자바스크립트 사용)
     // check =>1 , 0 , -1
     
     // 1 (정상적으로 수정완료)
     if(check == 1){
    	 %>
    	 <script type="text/javascript">
    	    alert("정보 수정완료! ");
    	    location.href="list.jsp?pageNum=<%=pageNum%>";
    	 </script>
    	 <%
     }
     // 0 (비밀번호 오류 - 수정실패)
     else if(check == 0){
    	 %>
    	 <script type="text/javascript">
    	   alert(" 비밀번호 오류 ! ");
    	   history.back();
    	 </script>
    	 <%
     }
     // -1 (없는글 접근 - 수정실패)
     else{
    	 %>
    	 <script type="text/javascript">
    	   alert(" 해당 글 없음 ! ");
    	   history.back();
    	 </script>
    	 <%
     }
     
     
   %>  
   
   
   
   
   
   
   
   

</body>
</html>