<%@page import="com.goods.db.GoodsDTO"%>
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

	<h2> 등록 상품 목록 </h2>
	
	<h3><a href="./GoodsAdd.ag">상품 등록하기</a></h3>
	
	<%
		List goodsList = (List)request.getAttribute("goodsList");
	%>
	
	<table border="1">
		<tr>
			<td>번호</td>
			<td>이미지</td>
			<td>이름</td>
			<td>가격</td>
			<td>브랜드</td>
			<td>카테고리</td>
			<td>피부타입</td>
			<td>피부고민</td>
			<td>재고</td>
			<td>용량</td>
			<td>등록일</td>
			<td>수정/삭제</td>
		</tr>
		
		<% for(int i=0;i<goodsList.size();i++){
			GoodsDTO dto = (GoodsDTO)goodsList.get(i);
		%>
		
		<tr>
			<td><%=dto.getCosNum() %></td>
			<td>
				<img src="./upload/<%=dto.getCosImage().split(",")[0] %>"
					 width="100" height="100">
			</td>
			<td><%=dto.getCosName() %></td>
			<td><%=dto.getCosPrice() %></td>
			<td><%=dto.getCosBrand() %></td>
			<td><%=dto.getCosCategory() %></td>
			<td><%=dto.getCosSkinType() %></td>
			<td><%=dto.getCosTrouble() %></td>
			<td><%=dto.getCosAmount() %></td>
			<td><%=dto.getCosVolumn() %></td>
			<td><%=dto.getCosWriteDate() %></td>
			<td>
				<a href="./AdminGoodsModify.ag?num=<%=dto.getCosNum()%>">수정</a>
	                /
				<a href="./AdminGoodsDelete.ag?num=<%=dto.getCosNum()%>">삭제</a>
			</td>
		</tr>
		<%} %>
	</table>

</body>
</html>