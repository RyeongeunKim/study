<%@page import="java.util.ArrayList"%>
<%@page import="model.BoardBean"%>
<%@page import="java.util.Vector"%>
<%@page import="model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 

   // BoardDAO 객체 생성
   BoardDAO bdao = new BoardDAO();
   // 디비에 글의 수를 계산하는 메서드 생성 -> 호출
   // getBoardCount();
   int cnt = bdao.getAllCount();
   
   //////////////////////////////////////////////////////
   // 게시판 페이징 처리 : DB에서 원하는 만큼만 글 가져오기
   
   // 한페이지당 보여줄 글의 개수 
   int pageSize = 10;
   
   // 현페이지가 몇페이지 인지 확인
   String pageNum = request.getParameter("num");
   if(pageNum == null){
	   pageNum = "1";
   }
   
   // 페이지별 시작행 계산하기
   // 1p -> 1번, 2p -> 11번,3p->21번, ....=>일반화
   int currentPage = Integer.parseInt(pageNum);
   int startRow = (currentPage-1)*pageSize+1;
   
   // 끝행 계산하기
   // 1p->10번, 2p->20번, 3p->30번 ....=> 일반화
   int endRow = currentPage*pageSize;
   //////////////////////////////////////////////////////
   //  디비에 저장된 모든 글정보를 가져오기 
   //ArrayList boardListAll = bdao.getBoardList(); 
   
   // 디비에 저장된 모든 글중에서 원하는 만큼만 가져오기(페이지 사이즈)
  ArrayList<BoardBean> boardList = bdao.getAllBoard(startRow,pageSize); 
   
  %>
	
	
	<table width = "700" border = "1" bgcolor="silver">
		<tr height = "40">
			<td align ="right" colspan = "5">
				<input type="button" value="글쓰기" onclick="location.href='BoardWriteForm.jsp'">
			</td>
		</tr>
		
		<tr height = "40">
			<td width = "50" align ="center">번호 </td>
			<td width = "320" align ="center">제목</td>
			<td width = "100" align ="center">작성자 </td>
			<td width = "150" align ="center">작성일 </td>
			<td width = "80" align ="center">조회수</td>
		</tr>
		
    <%
     for(int i=0;i<boardList.size();i++){
    	 //업캐스팅 다운캐스팅 필요 없음 : 
    	 //이유 -> ArrayList배열객체 생성시 제네릭 타입을 BoardBean으로 설정해서 생성했기때문
    	  BoardBean bean = boardList.get(i);
    %>
      <tr>
      <td><%=bean.getNum() %></td>
      <td>
      <%
       // 답글일때만 이미지 보여주기
       int wid = 0;
       if(bean.getRe_step()>0){
    	   wid = 10 * bean.getRe_step();
      %>
       <img src="level.gif" height="15" width="<%=wid%>">
       <img src="re.gif">
      <%
       }
      %>
       <a href="content.jsp?num=<%=bean.getNum()%>&pageNum=<%=pageNum%>"><%=bean.getSubject() %></a>
      </td>
      <td><%=bean.getNum() %></td>
      <td><%=bean.getSubject() %></td>
      <td><%=bean.getWriter() %></td>
      <td><%=bean.getReg_date() %></td>
      <td><%=bean.getReadcount() %></td>
    </tr>
    <%
    }
    %>
    
    
  </table>
  
  <hr>
  <%
    //////////////////////////////////////////////////////
    // 페이징 처리 - 하단부 페이지 링크
    if(cnt != 0){// 글이있을때 표시

    	//전체 페이지수 계산
    	// ex)  총 50개 -> 한페이지당 10개 출력, 5개
		//      총 57개 ->       "        , 6개
		int pageCount = cnt/pageSize+(cnt % pageSize == 0? 0:1);
		
		// 한 화면에 보여줄 페이지 번호의 개수 (페이지 블럭)
		int pageBlock = 2;
		
		// 페이지 블럭의 시작페이지 번호 
		// ex)  1~10 페이지 : 1, 11~20페이지 : 11, 21~30페이지 : 21
        int startPage = ((currentPage-1)/pageBlock) * pageBlock + 1;
		
		// 페이지 블럭의 끝 페이지 번호
		int endPage = startPage+pageBlock-1;
		
		if(endPage > pageCount){
			endPage = pageCount;
		}
    	
    	// 이전 (해당 페이지블럭의 첫번째 페이지 호출)
    	if(startPage > pageBlock){
    		%>
    		<a href="list.jsp?pageNum=<%=startPage-pageBlock%>">[이전]</a>
    		<%
    	}   	
    	
    	// 숫자  1....5
    	for(int i=startPage;i<=endPage;i++){
    		%>
    		    <a href="list.jsp?pageNum=<%=i%>">[<%=i %>]</a> 
    		<%    		
    	}
    	
    	// 다음 (기존의 페이지 블럭보다 페이지의 수가 많을때)
    	if(endPage < pageCount){
    		%>
    		<a href="BoardList.jsp?pageNum=<%=startPage+pageBlock%>">[다음]</a>
    		<%
    	}
    	
    	
    	
    	
    }
    //////////////////////////////////////////////////////
  %>   
    

</body>
</html>