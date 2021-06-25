<%@page import="com.goods.db.GoodsDTO"%>
<%@page import="com.basket.db.BasketDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>장바구니 목록</title>
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
	<link rel="stylesheet" href="./basket.css" />
	<script type="text/javascript" src="./basket/basket.js"></script> 
</head>
<body>

	<%
		// 전달된 정보를 저장
		List basketList = (List) request.getAttribute("basketList");
		List goodsList = (List) request.getAttribute("goodsList");
		System.out.println("바스켓"+basketList);
		System.out.println("굿즈"+goodsList);
		
		// 장바구니 정보 출력
		// (장바구니 번호, 상품이미지, 상품명, 사이즈, 색상, 수량, 가격, 제거)
	%>

		<table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
			<thead>
				<tr>
					<th colspan="12" style="background-color: #b0bcc2; text-align: center; color: white;"><b>장바구니 리스트</b></th>
				</tr>
			</thead>		
			<tbody>
				<tr>
					<th>선택</th>
					<th>이미지</th>
					<th>이름</th>
					<th>가격</th>
					<th>수량</th>
					<th>합계</th>
					<th>삭제</th>
				</tr>
				
				<%for(int i=0;i<basketList.size();i++){
					BasketDTO bkDTO = (BasketDTO) basketList.get(i);
					GoodsDTO gDTO = (GoodsDTO) goodsList.get(i);
				%>
				<tr>
					<td class="check"><input type="checkbox" name="buy" value="260" checked="" onclick="javascript:basket.checkItem();"></td>
					<td>
						<img src="./admingoods/upload/<%=gDTO.getCosImage().split(",")[0] %>"
						width="50" height="50">
					</td>
					<td><%=gDTO.getCosName() %></td>
					<td><input type="text" value="<%=gDTO.getCosPrice() %>" readonly="readonly"></td>
                    <td class="num">
                        <div class="updown">
                            <input type="text" name="p_num<%=i %>" id="p_num<%=i %>" size="2" maxlength="4" class="p_num" value="<%=bkDTO.getBasketCosAmount()%>" onkeyup="javascript:basket.changePNum(<%=i%>);">
                            <span onclick="javascript:basket.changePNum(<%=i%>);"><i class="fas fa-arrow-alt-circle-up up"></i></span>
                            <span onclick="javascript:basket.changePNum(<%=i%>);"><i class="fas fa-arrow-alt-circle-down down"></i></span>
                        </div>
                    </td>
					<td class="sum"><%=gDTO.getCosPrice() * bkDTO.getBasketCosAmount()%></td>
					<td>
						<a href="./BasketDelete.ba?basketNum=<%=bkDTO.getBasketNum() %>">삭제</a>
					</td>
				</tr>
				<%} %>
			</tbody>
		</table>
		

			<div class="right-align basketrowcmd">
				<td><a href="javascript:void(0)" class="abutton" onclick="javascript:basket.delCheckedItem();">선택상품삭제</a></td>
				<td><a href="javascript:void(0)" class="abutton" onclick="javascript:basket.delAllItem();">장바구니비우기</a></td>
			</div>
			<div class="bigtext right-align sumcount" id="sum_p_num">상품갯수: 4개</div>
			<div class="bigtext right-align box blue summoney" id="sum_p_price">합계금액: 74,200원</div>
			<div id="goorder" class="">
				<div class="clear"></div>
				<div class="buttongroup center-align cmd">
                    <a href="javascript:void(0);">선택한 상품 주문</a>
                </div>
                <div class="buttongroup center-align cmd">
                    <a href="./GoodsList.cos">계속 쇼핑하기</a>
                </div>
            </div>



</body>
</html>