<%@page import="com.admin.goods.db.GoodsDTO"%>
<%@page import="com.basket.db.BasketDTO"%>
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

   <h1>WebContent/basket/goods_basket_list.jsp</h1>
   
   <%
   // 전달된 정보를 저장
   //request.setAttribute("basketList", totalList.get(0));
   //request.setAttribute("goodsList", totalList.get(1));
   List basketList = (List)request.getAttribute("basketList");
   List goodsList = (List)request.getAttribute("goodsList");
   
   // 장바구니 정보 출력
   // (장바구니 번호, 상품이미지,상품명,사이즈,색상,구매수량,가격, 제거)
   %>
   
   <h2> 장바구니 목록 </h2>
   
   <table border="1">
     <tr>
       <td>번호</td>
       <td>이미지</td>
       <td>이름</td>
       <td>크기</td>
       <td>색상</td>
       <td>구매수량</td>
       <td>가격</td>
       <td>제거</td>
     </tr>
     
     <%for(int i=0;i<basketList.size();i++){
    	 BasketDTO bkDTO =(BasketDTO) basketList.get(i);
    	 GoodsDTO gDTO = (GoodsDTO) goodsList.get(i);
    	 %>
	     <tr>
	       <td><%=bkDTO.getB_num() %></td>
	       <td>
	         <img src="./upload/<%=gDTO.getImage().split(",")[0]%>"
	              width="50" height="50">
	       </td>
	       <td><%=gDTO.getName() %></td>
	       <td><%=bkDTO.getB_g_size() %></td>
	       <td><%=bkDTO.getB_g_color() %></td>
	       <td><%=bkDTO.getB_g_amount() %></td>
	       <td><%=gDTO.getPrice() %></td>
	       <td>
	       	<a href="./BasketDelete.ba?b_num=<%=bkDTO.getB_num()%>">제거</a>
	       </td>
	     </tr>
     <%} %>
   
   </table>
   
   
   <a href="./OrderStart.or">[구매하기]</a>
   <a href="./GoodsList.go">[계속 쇼핑하기]</a>
   
   
   
   
   
   
   
   
   
   
   
   
   
   

</body>
</html>