<%@page import="com.goods.db.GoodsDTO"%>
<%@page import="com.basket.db.BasketDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<body>

	<%
		// 전달된 정보를 저장
		List basketList = (List) request.getAttribute("basketList");
		List goodsList = (List) request.getAttribute("goodsList");
		
		
		// 장바구니 정보 출력
		// (장바구니 번호, 상품이미지, 상품명, 사이즈, 색상, 수량, 가격, 제거)
	%>
	
	

		<table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
			<thead>
				<tr>
					<th colspan="12" style="background-color: #b0bcc2; text-align: center; color: white;"><b>장바구니 리스트</b></th>
				</tr>
				<tr>
					<td><input type="checkbox" name="allCheck" id="allCheck"/><label for="allCheck">모두 선택</label>
					
					<script>
					$("#allCheck").click(function(){
						var chk = $("#allCheck").prop("checked");
						if(chk){
							$(".chBox").prop("checked", true);
						} else {
							$(".chBox").prop("checked", false);
						}
					});
					
					
					</script>
					</td>
				</tr>	
				<tr>
					<td><button type="button" class="selectDelete_btn">선택 삭제</button></td>
				</tr>		
			</thead>		
			<tbody>
				<tr>
					<td>선택</td>
					<td>이미지</td>
					<td>이름</td>
					<td>수량</td>
					<td>가격</td>
					<td>삭제</td>
				</tr>
				
				<%for(int i=0;i<basketList.size();i++){
					BasketDTO bkDTO = (BasketDTO) basketList.get(i);
					GoodsDTO gDTO = (GoodsDTO) goodsList.get(i);
				%>
				<tr>
					<td>
						<input type="checkbox" name="chBox" class="chBox" value="<%=bkDTO.getBasketNum() %>"/>
						<script type="text/javascript">
							$(".chBox").click(function(){
								$("#allCheck").prop("checked",false);
							});
						</script>
					
					</td>
					<td>
						<img src="./admingoods/upload/<%=gDTO.getCosImage().split(",")[0] %>"
						width="50" height="50">
					</td>
					<td><%=gDTO.getCosName() %></td>
					<td>
						<input type="number" min="1" max="<%=gDTO.getCosAmount() %>" value="<%=bkDTO.getBasketCosAmount() %>">
					</td>
					<td><%=gDTO.getCosPrice() %></td>
					<td>
						<a href="./BasketDelete.ba?basketNum=<%=bkDTO.getBasketNum() %>">삭제</a>
					</td>
				</tr>
				<%} %>
			</tbody>
		</table>

		<a href="#">[구매하기]</a>
		<a href="./GoodsList.cos">[계속 쇼핑하기]</a>

	

</body>
</html>