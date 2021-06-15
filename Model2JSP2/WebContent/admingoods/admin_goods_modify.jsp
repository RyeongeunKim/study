<%@page import="com.admin.goods.db.GoodsDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>WebContent/admingoods/admin_goods_modify.jsp</h1>
   
   <%
    // 저장
    //request.setAttribute("dto", dto);
    GoodsDTO dto = (GoodsDTO) request.getAttribute("dto");
   %>
   
   <fieldset>
     <legend> 관리자 상품수정 하기</legend>
     <form action="./AdminGoodsModifyAction.ag" method="post">
       <!-- 상품번호 저장 -->
       <input type="hidden" name="num" value="<%=dto.getNum() %>">            
       <table border="1">
         <tr>
           <td>카테고리</td>
           <td>		
             <select name="category">
               <option value="outwear" 
                 <%if(dto.getCategory().equals("outwear")){ %>                
                  selected
                 <%} %>
               >외투</option>
               <option value="fulldress"
                 <%if(dto.getCategory().equals("fulldress")){ %>                
                  selected
                 <%} %>
               >정장/신사복</option>
               <option value="Tshirts"
                 <%if(dto.getCategory().equals("Tshirts")){ %>                
                  selected
                 <%} %>
               >티셔츠</option>
               <option value="shirts" 
                  <%if(dto.getCategory().equals("shirts")){ %>                
                  selected
                 <%} %>
               >와이셔츠</option>
               <option value="pants" 
                   <%if(dto.getCategory().equals("pants")){ %>                
                  selected
                 <%} %>
               >바지</option>
               <option value="shoes" 
                 <%if(dto.getCategory().equals("shoes")){ %>                
                  selected
                 <%} %>
               >신발</option>
             </select>
           </td>
         </tr>
         
         <tr>
           <td>상품이름</td>
           <td>
             <input type="text" name="name" value="<%=dto.getName() %>">
           </td>           
         </tr>
         <tr>
           <td>판매가격</td>
           <td>
             <input type="text" name="price" value="<%=dto.getPrice()%>">
           </td>
         </tr>
         <tr>
           <td>색상</td>
           <td>
             <input type="text" name="color" value="<%=dto.getColor()%>">
           </td>
         </tr>
         <tr>
           <td>수량</td>
           <td>
             <input type="text" name="amount" value="<%=dto.getAmount()%>">
           </td>
         </tr>
         <tr>
           <td>크기</td>
           <td>
             <input type="text" name="size" value="<%=dto.getSize()%>">
           </td>
         </tr>
         <tr>
           <td>제품정보</td>
           <td>
              <input type="text" name="content" value="<%=dto.getContent()%>">
           </td>
         </tr>
         <tr>
           <td>인기상품</td>
           <td>
              <input type="radio" name="best" value="1" 
                <%if(dto.getBest()==1){ %>
                 checked
                <%} %>
              >예 
              <input type="radio" name="best" value="0"
                 <%if(dto.getBest()==0){ %>
                 checked
                <%} %>
              >아니요
           </td>
         </tr>
       
        <tr>
          <td colspan="2">
            <input type="submit" value="상품수정">
            <input type="reset" value="상품초기화">
          </td>
        </tr>
       </table>     
     </form>   
   </fieldset>
   
   
   
   
   
   
   
   
   
   
   
   
   
</body>
</html>