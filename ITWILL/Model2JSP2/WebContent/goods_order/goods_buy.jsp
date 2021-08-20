<%@page import="com.admin.goods.db.GoodsDTO"%>
<%@page import="com.basket.db.BasketDTO"%>
<%@page import="com.member.db.MemberDTO"%>
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
   <h1>WebContent/goods_order/goods_buy.jsp</h1>
   
   <h2> 주문 상세내역 </h2>
   <%
   	// 주문에 필요한 정보를 영역에 저장
   	// 	request.setAttribute("basketList", basketList);
   	// 	request.setAttribute("goodsList", goodsList);
   	// 	request.setAttribute("memberDTO", mDTO);
   	
   	List basketList = (List)request.getAttribute("basketList");
   	List goodsList = (List)request.getAttribute("goodsList");
   	MemberDTO mdto = (MemberDTO) request.getAttribute("memberDTO");
   	
   	
   	
   %>
   
   <form action="./OrderAdd.or" method="post">
   <table border="1">
      
      <tr>
         <td colspan="6"> <h3>구매 내역</h3> </td>      
      </tr>
      <tr>
          <td>이미지</td>
          <td>상품명</td>
          <td>구매수량</td>
          <td>색상</td>
          <td>크기</td>
          <td>가격</td>
      </tr>
      
      <%for(int i=0;i<basketList.size();i++){
    	     BasketDTO bkDTO = (BasketDTO) basketList.get(i);
    	     GoodsDTO gDTO = (GoodsDTO) goodsList.get(i);
    	  %>
	      <tr>
	          <td>
	            <img src="./upload/<%=gDTO.getImage().split(",")[0]%>" width="50" height="50">
	          </td>
	          <td><%=gDTO.getName() %></td>
	          <td><%=bkDTO.getB_g_amount() %></td>
	          <td><%=bkDTO.getB_g_color() %></td>
	          <td><%=bkDTO.getB_g_size() %></td>
	          <td><%=gDTO.getPrice() %></td>
	      </tr>
      <%} %>
      
      <tr>
        <td colspan="6"> <h3>구매자 정보</h3>  </td>      
      </tr>
      <tr>
         <td colspan="6">
                       이름 : <%=mdto.getName() %><br>
                       전화번호 : <br>
                       이메일주소 : <%=mdto.getEmail() %><br> 
         </td>        
      </tr>
      <tr>
        <td colspan="6"> <h3>배송지 정보</h3>  </td>      
      </tr>
       <tr>
        <td colspan="6"> 
          	받는 사람 : <input type="text" name="o_receive_name" value="<%=mdto.getName()%>"> <hr>
          	연락처 : <input type="text" name="o_receive_phone"> <hr>
          	배송지 주소 : <input type="text" name="o_receive_addr1"> <br>
          	배송지 상세주소 : <input type="text" name="o_receive_addr2"><hr>
          	기타 요구사항 :  <input type="text" name="o_receive_msg">        	
        </td>      
      </tr>
      <tr>
        <td colspan="6"> <h3>결제 정보</h3>  </td>      
      </tr>
      <tr>
        <td colspan="6"> 
                 입금자명 : <input type="text" name="o_trade_payer" value="<%=mdto.getName()%>"><br>
         <input type="radio" name="o_trade_type" value="온라인 입금"> 온라인 입금
         <input type="radio" name="o_trade_type" value="신용카드"> 신용카드
         <input type="radio" name="o_trade_type" value="카카오페이"> 카카오페이
         <input type="radio" name="o_trade_type" value="네이버 페이"> 네이버 페이
         <input type="radio" name="o_trade_type" value="삼성 페이"> 삼성 페이                      
        </td>      
      </tr>
      <tr>
        <td colspan="3">  <input type="submit" value="주문하기">  </td>      
        <td colspan="3">  <input type="reset" value="취소하기"> </td>      
      </tr>
      
      
   </table>
   
   </form>
   
   
   
   
   
   
   
</body>
</html>