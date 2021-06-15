<%@page import="com.order.db.OrderDTO"%>
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

  <h1>WebContent/admin_order/admin_order_list.jsp</h1>
  
  <h2> 주문목록 </h2>
  
  <%
    //request.setAttribute("adminOrderList", adminOrderList);
    List adminOrderList = (List)request.getAttribute("adminOrderList");
  %>
  
  <table border="1">
     <tr>
       <td>주문번호</td>
       <td>주문자</td>
       <td>상품명</td>
       <td>결재방법</td>
       <td>주문금액</td>
       <td>주문상태</td>
       <td>주문일시</td>
       <td> 수정/삭제 </td>
     </tr>
     
     <%for(int i=0;i<adminOrderList.size();i++){ 
           OrderDTO orDTO = (OrderDTO)adminOrderList.get(i);
     %>
	     <tr>
	       <td>
	         <a href="#"><%=orDTO.getO_trade_num() %></a>
	       </td>
	       <td>
	          <%=orDTO.getO_m_id() %>
	       </td>
	       <td><%=orDTO.getO_g_name() %></td>
	       <td><%=orDTO.getO_trade_type() %></td>
	       <td><%=orDTO.getO_sum_money() %></td>
	       
	       <%
	        // 0 : "대기중", 1 : "발송준비", 2:"발송완료",3:"배송중",4:"배송완료",5:"주문취소"
	        String status="";
	        
	        switch(orDTO.getO_status()){
	        case 0:
	        	status="대기중";
	        	break;
	        case 1:
	        	status="발송준비";
	        	break;
	        case 2:
	        	status="발송완료";
	        	break;
	        case 3:
	        	status="배송중";
	        	break;
	        case 4:
	        	status="배송완료";
	        	break;
	        case 5:
	        	status="주문취소";
	        	break;	        
	        }
	       
	       %>
	       
	       <td><%=status %></td>
	       
	       <td><%=orDTO.getO_date() %></td>
	       
	       <td>
	         	<a href="./AdminOrderDetail.ao?trade_num=<%=orDTO.getO_trade_num()%>">수정</a>
	         	/삭제
	       </td>
	     </tr>
     <%} %>
     
  </table>
  
  
  
  
  
  
  
  
  
  
  

</body>
</html>