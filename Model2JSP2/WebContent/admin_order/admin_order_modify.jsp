<%@page import="com.order.db.OrderDTO"%>
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
   <h1>WebContent/admin_order/admin_order_modify.jsp</h1>
   
   <h2> 주문 상세내역 (관리자페이지) </h2>
   <%
   //request.setAttribute("adminOrderDetail", aoDAO.getAdminORderDetail(trade_num));
    List aodList = (List)request.getAttribute("adminOrderDetail");
    
	OrderDTO orderInfo = (OrderDTO) aodList.get(0);
   %>
   
   <table border="1">
      
      <tr>
         <td colspan="6"> <h3>구매 내역</h3> </td>      
      </tr>
      <tr>
          <td>상품명</td>
          <td>구매수량</td>
          <td>색상</td>
          <td>크기</td>
          <td>가격</td>
      </tr>
      
      <%for(int i=0;i<aodList.size();i++){ 
           OrderDTO orDTO = (OrderDTO) aodList.get(i);
      %>
	      <tr>
	          <td><%=orDTO.getO_g_name() %></td>
	          <td><%=orDTO.getO_g_amount() %></td>
	          <td><%=orDTO.getO_g_color() %></td>
	          <td><%=orDTO.getO_g_size() %></td>
	          <td><%=orDTO.getO_sum_money() %></td>
	      </tr>
      <%} %>
      
      <tr>
        <td colspan="6"> <h3>배송지 정보</h3>  </td>      
      </tr>
       <tr>
        <td colspan="6"> 
          	받는 사람 : <input type="text" name="o_receive_name" value="<%=orderInfo.getO_receive_name()%>"> <hr>
          	연락처 : <input type="text" name="o_receive_phone" value="<%=orderInfo.getO_receive_phone()%>"> <hr>
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
                 입금자명 : <input type="text" name="o_trade_payer" value=""><br>
         <input type="radio" name="o_trade_type" value="온라인 입금"> 온라인 입금
         <input type="radio" name="o_trade_type" value="신용카드"> 신용카드
         <input type="radio" name="o_trade_type" value="카카오페이"> 카카오페이
         <input type="radio" name="o_trade_type" value="네이버 페이"> 네이버 페이
         <input type="radio" name="o_trade_type" value="삼성 페이"> 삼성 페이                      
        </td>      
      </tr>
      
      <form action="./AdminOrderModify.ao" method="get">
       <input type="hidden" name="trade_num" value="<%=orderInfo.getO_trade_num()%>">
      <tr>
        <td colspan="6">
                    주문상태 : 
             <select name="status">
               <option value=""> 주문상태 </option>
               <option value="0"> 대기중 </option>
               <option value="1"> 발송준비 </option>
               <option value="2"> 발송완료 </option>
               <option value="3"> 배송중 </option>
               <option value="4"> 배송완료 </option>
               <option value="5"> 주문취소 </option>
             </select><br>
                  운송장번호 : <input type="text" name="trans_num" ><br>          
        </td>       
      </tr>      
      <tr>
        <td colspan="3">  <input type="submit" value="주문정보 변경하기">  </td>      
        <td colspan="3">  <input type="reset" value="취소하기"> </td>      
      </tr>
      </form>
      
   </table>
   
   
   
   
   
   
   
   
</body>
</html>