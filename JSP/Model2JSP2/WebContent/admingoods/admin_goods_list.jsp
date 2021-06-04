<%@page import="com.admin.goods.db.GoodsDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>WebContent/admingoods/admin_goods_list.jsp</h1>
  
  <h2> 등록 상품 목록 </h2>
  
  <h3><a href="./GoodsAdd.ag">상품 등록하기</a></h3>
  
  <%
    // 전달된 정보(공유된속성)
    // request.setAttribute("goodsList", goodsList);
    
    List goodsList = (List)request.getAttribute("goodsList");
  
  %>
  <table border="1">
     <tr>
       <td>번호</td>
       <td>카테고리</td>
       <td>사진</td>
       <td>상품명</td>
       <td>가격</td>
       <td>수량</td>
       <td>등록일자</td>
       <td>수정/삭제</td>
     </tr>
     
     <% for(int i=0;i<goodsList.size();i++){ 
              GoodsDTO dto = (GoodsDTO)goodsList.get(i);
     %>
	     <tr>
	       <td><%=dto.getNum() %></td>
	       <td><%=dto.getCategory() %></td>
	       <td>
	         <img src="./upload/<%=dto.getImage().split(",")[0]%>"
	             width="100" height="100" >
	       </td>
	       <td><%=dto.getName() %></td>
	       <td><%=dto.getPrice() %></td>
	       <td><%=dto.getAmount() %></td>
	       <td><%=dto.getDate() %></td>
	       <td>
	                <a href="./AdminGoodsModify.ag?num=<%=dto.getNum()%>">수정</a>
	                /
	                <a href="./AdminGoodsDelete.ag?num=<%=dto.getNum()%>">삭제</a>
	       </td>
	     </tr>
     <% }%>
     
  
  </table>
  
  
  
  
  
  
  
  

</body>
</html>