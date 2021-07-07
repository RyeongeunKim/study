<%@page import="com.member.db.MemberDTO"%>
<%@page import="com.admin.goods.db.AdminGoodsDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <meta name="description" content="Yoga Studio Template">
    <meta name="keywords" content="Yoga, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">


    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:100,200,300,400,500,600,700,800,900&display=swap"
          rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="./css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="./css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="./css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="./css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="./css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="./css/magnific-popup.css" type="text/css">
    <link rel="stylesheet" href="./css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="./css/style.css" type="text/css">

    <link rel="stylesheet" href="//unpkg.com/bootstrap@4/dist/css/bootstrap.min.css">
    <script src='//unpkg.com/jquery@3/dist/jquery.min.js'></script>
    <script src='//unpkg.com/popper.js@1/dist/umd/popper.min.js'></script>
    <script src='//unpkg.com/bootstrap@4/dist/js/bootstrap.min.js'></script>
    
<title>회원 정보 목록</title>
</head>
<body>
<!-- Header Section Begin -->
<jsp:include page="/header/header.jsp"/>
<!-- Header Section End -->

    <!-- Page Add Section Begin -->
    <section class="page-add">
        <div class="container">
        </div>
    </section>
    <!-- Page Add Section End -->
    
	<!-- container 시작 -->	
	<div class="container-fluid">	
	
	<div class="row">
		<div class="col-0 text-center">
		<!-- left -->
		</div>
		
		<div class="col-12 text-center">
			
    <!-- admin member list Begin -->

   	<%
   	List memberList = (List)request.getAttribute("memberList"); 
	// AdminGoodsDAO 객체 생성
	AdminGoodsDAO adao = new AdminGoodsDAO();
	
	// 디비에 글의 수를 계산하는 메서드 생성 -> 호출
	int cnt = adao.getGoodsCount();

	// 한페이지당 보여줄 상품의 개수
	int pageSize = 10;
	
	// 현페이지가 몇페이지인지 확인
	String pageNum = request.getParameter("pageNum");
	if(pageNum == null){
		pageNum = "1";
	}
	
	// 페이지별 시작행 계산하기
	int currentPage = Integer.parseInt(pageNum);
	int startRow = (currentPage-1)*pageSize+1;
	
	// 끝행 계산하기
	int endRow = currentPage*pageSize;
	
	// 디비에 저장된 모든 글중에서 원하는 만큼만 가져오기(페이지 사이즈)
	ArrayList<MemberDTO> getMemberList = adao.getMemberList(startRow,pageSize);
	%>
    
    <section class="admin_member_list">
        <div class="container">
	        <table>
		    <tr>
		    <td>
			    <nav class="navbar navbar-expand-lg navbar-light bg-light">
				  <div class="collapse navbar-collapse">
				    <ul class="navbar-nav">
				      <li class="nav-item">
				        <a class="nav-link" href="./AdminGoodsList.ag"><b>상품목록</b></a>
				      </li>
				      <li class="nav-item">
				        <a class="nav-link" href="./GoodsAdd.ag"><b>상품등록</b></a>
				      </li>
				      <li class="nav-item">
				        <a class="nav-link" href="./AdminOrderList.ag"><b>주문목록</b></a>
				      </li>
				      <li class="nav-item">
				        <a class="nav-link active" href="./AdminMemberList.ag"><b>회원목록</b></a>
				      </li>
				      <li class="nav-item">
				        <a class="nav-link" href="./AdminCouponList.ag"><b>쿠폰목록</b></a>
				      </li>			      
				    </ul>
				  </div>
				</nav>
		    </td>
		    </tr>
		    </table><br>
			<br>
			<table class="table table-active" style="text-align: center; background-color: white;">
				<thead>
					<tr>
						<th colspan="12" style="text-align: center;"><b>회원 리스트</b></th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th width="6%">아이디</th>
						<th width="8%">이름</th>
						<th width="11%">이메일</th>
						<th width="18%">주소</th>
						<th width="15%">전화번호</th>
						<th width="6%">성별</th>
						<th width="9%">피부타입</th>
						<th width="8%">피부고민</th>
						<th width="8%">회원등급</th>
					</tr>
					
					<c:forEach var="i" items="${ memberList }">

					<tr>
						<td>${i.userId }</td>
						<td>${i.userName }</td>
						<td>${i.userEmail }</td>
						<td>${i.userAddr }</td>
						<td>${i.userTel }</td>
						<td>${i.userGender }</td>
						<td>${i.userSkinType }</td>
						<td>${i.userTrouble }</td>
						<td>${i.userLevel }</td>
					</tr>     
					</c:forEach>	          
				</tbody>
			</table>	
        </div>
    </section>
    
	  <hr>
    <!-- 페이징 처리 -->
    <div style="margin-left: 45%;">
	  <ul class="pagination">
    
 	  <%
	    if(cnt != 0){// 글이있을때 표시

			int pageCount = cnt/pageSize+(cnt % pageSize == 0? 0:1);

			int pageBlock = 2;

	        int startPage = ((currentPage-1)/pageBlock) * pageBlock + 1;

			int endPage = startPage+pageBlock-1;
			
			if(endPage > pageCount){
				endPage = pageCount;
			}
	    	
	    	// 이전 (해당 페이지블럭의 첫번째 페이지 호출)
	    	if(startPage > pageBlock){
	    		%>
	    		<li class="page-item">
		    		<a class="page-link" href="./AdminMemberList.ag?pageNum=<%=startPage-pageBlock%>" aria-label="Previous">
		    		<span aria-hidden="true">&laquo;</span>
		    		</a>
		    		</span>
	    		</li>
	    		<%
	    	}   	
	    	
	    	// 숫자  1....5
	    	for(int i=startPage;i<=endPage;i++){
	    		%>
	    		<li class="page-item">
	    			<a class="page-link" href="./AdminMemberList.ag?pageNum=<%=i%>"><%=i %></a>
	    		</li>
	    		<%    		
	    	}
	    	
	    	// 다음 (기존의 페이지 블럭보다 페이지의 수가 많을때)
	    	if(endPage < pageCount){
	    		%>
	    		<li class="page-item">
	    			<a class="page-link" href="./AdminMemberList.ag?pageNum=<%=startPage+pageBlock%>" aria-label="Next">
	    		<span aria-hidden="true">&raquo;</span>
	    		<%
	    	}
	    }
	  %>
	  </a></li>
	  </ul>
	  </div>
	  <!-- 페이징 처리 -->
    <!-- admin member list End -->
			
		</div>
		<div class="col-0">	
		<!-- right -->
		</div>
	</div>
	
	
	
	</div>
	<!-- container 끝 -->	

    
    <!-- Page Add Section Begin -->
    <section class="page-add">
        <div class="container">
        </div>
    </section>
    <!-- Page Add Section End -->

	
<!-- Footer Section Begin -->
<jsp:include page="/footer/footer.jsp"/>
<!-- Footer Section End -->

</body>
</html>