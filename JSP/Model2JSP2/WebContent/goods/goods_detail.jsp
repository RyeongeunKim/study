<%@page import="com.admin.goods.db.GoodsDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<script type="text/javascript">
	   function isBasket(){
		   //alert("장바구니 동작");
		   if(document.gfr.amount.value == ""){
			   alert(" 구매 수량을 입력하세요. ");
			   document.gfr.amount.focus();
			   return;
		   }
		   if(document.gfr.size.value == ""){
			   alert("크기를 입력하시오.");
			   document.gfr.size.focus();
			   return;
		   }
		   if(document.gfr.color.value ==""){
			   alert("색상을 입력하시오.");
			   document.gfr.color.focus();
			   return;
		   }
		   
		   var result = confirm("장바구니에 저장 하시겠습니까?");
		   
		   if(result){
			   document.gfr.action = "./BasketAdd.ba";
			   document.gfr.submit();
		   }
		   
	   }
	
	</script>


</head>
<body>
   <h1>WebContent/goods/goods_detail.jsp</h1>
   <%
		// DB에서 가져온정보를 저장 (request 영역)
		//request.setAttribute("goods", gdao.getGoods(num));
        GoodsDTO dto = (GoodsDTO) request.getAttribute("goods");   
   %>
   <h2> 상품 상세페이지 </h2>
   
   <form action="" method="post" name="gfr">
     <!-- 다음페이지로 전달하는 값
         num, amount, size, color
      -->
     <%-- <input type="hidden" name="num" value="<%=dto.getNum()%>"> --%>
     <input type="hidden" name="num" value="${goods.num }">     
   
   <table border="1">
      <tr>
        <td width="400">
           <img src="./upload/<%=dto.getImage().split(",")[0]%>"
              width="400" height="400" >
        </td>
        <td width="500">
           	상품명 : <%=dto.getName() %> <br>
           	판매가격 : <%=dto.getPrice() %>원<br>
           	구매수량 : <input type="number" name="amount" value="1"><br>
           	남은수량 : <%=dto.getAmount() %>개<br>
           	<%-- 옵션-크기 : <%=dto.getSize() %><br> --%>
           	
           	옵션-크기 : 
           	<select name="size" >
           	  <option value="">크기를 선택하시오</option>
           	 <c:forTokens var="size" items="${goods.size }" delims=",">
           	   <option value="${size }">${size}</option>  
           	 </c:forTokens>
           	</select>
           	
           	<br>
           <%-- 	옵션-색상 : <%=dto.getColor() %><br> --%>
           	옵션-색상 :
            <select name="color">
           	  <option value="">색상을 선택하시오</option>
           	 <c:forTokens var="color" items="${goods.color }" delims=",">
           	   <option value="${color }">${color}</option>  
           	 </c:forTokens>
           	</select>
           	
           	<hr>
           	<hr>
           	
           	<a href="javascript:isBasket();">[장바구니 담기]</a>
           	<a href="javascript:isBuy();">[주문하기]</a>           	
           
           
        </td>      
      </tr>
      <tr>
        <td colspan="2" height="400">
         <h3> 상세정보 </h3>
         <img src="./upload/<%=dto.getImage().split(",")[1]%>">	
          
        </td>
      </tr>
      <tr>
        <td colspan="2">
          <h2> QnA / 리뷰 </h2>
        </td>
      </tr>
   
   </table>
   
  </form> 
   
   
   
   
   
   
   
   
   
   
</body>
</html>