<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../css/bootstrap.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Droid+Sans:400,700" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.8.1/baguetteBox.min.css">
<link rel="stylesheet" href="../css/gallery-grid.css">
<link rel="stylesheet" href="../css/custom.css">

<title>Gallery</title>

</head>
<body>
	<%
		String userID = null;
		if(session.getAttribute("userID") != null){
			userID = (String) session.getAttribute("userID");
		}
	%>
	<nav class="navbar navbar-default">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target='#bs-example-navbar-collapse-1'
				aria-expanded="false">
				<!-- 줄였을 때 나오는 작대기(span 1개가 작대기 하나) -->
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>	
			</button>
			<a class="navbar-brand" href="../main/main.jsp">드림오피스</a>
		</div>
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li class="active"><a href="../main/main.jsp">메인</a></li>
				<li><a href="../bbs/bbs.jsp">방문예약</a></li>
				<li><a href="../map/map.jsp">위치</a></li>
				<li><a href="../images/gallery.html">시설안내</a></li>
			</ul>
			<%
				if(userID == null){
			%>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
					<a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">접속하기<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="../member/login.jsp">로그인</a></li>
						<li><a href="../member/join.jsp">회원가입</a></li>
					</ul>
				</li>
			</ul>
			<% 		
				} else {
			%>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
					<a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">회원관리<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="../member/userInfo.jsp">회원정보</a></li>
						<li><a href="../member/logoutAction.jsp">로그아웃</a></li>
					</ul>
				</li>
			</ul>
			<% 
			}
			%>
		</div>
	</nav>
	
	<div class="container gallery-container">
	
	    <h1>Gallery</h1>
	
	    <p class="page-description text-center">시설 둘러보기</p>
	    
	    <div class="tz-gallery">
	
	        <div class="row">
	            <div class="col-sm-6 col-md-4">
	                <a class="lightbox" href="main1.jpg">
	                    <img src="main1.jpg" alt="사무실">
	                </a>
	            </div>
	            <div class="col-sm-6 col-md-4">
	                <a class="lightbox" href="main2.jpg">
	                    <img src="main2.jpg" alt="사무실">
	                </a>
	            </div>
	            <div class="col-sm-12 col-md-4">
	                <a class="lightbox" href="cafeteria1.jpg">
	                    <img src="cafeteria1.jpg" alt="카페테리아">
	                </a>
	            </div>
	            <div class="col-sm-6 col-md-4">
	                <a class="lightbox" href="lounge1.jpg">
	                    <img src="lounge1.jpg" alt="라운지">
	                </a>
	            </div>
	            <div class="col-sm-6 col-md-4">
	                <a class="lightbox" href="lounge2.jpg">
	                    <img src="lounge2.jpg" alt="라운지">
	                </a>
	            </div>
	            <div class="col-sm-6 col-md-4">
	                <a class="lightbox" href="office1.jpg">
	                    <img src="office1.jpg" alt="사무실">
	                </a>
	            </div>
	            <div class="col-sm-6 col-md-4">
	                <a class="lightbox" href="office4.jpg">
	                    <img src="office4.jpg" alt="사무실">
	                </a>
	            </div>
	            <div class="col-sm-6 col-md-4">
	                <a class="lightbox" href="meeting1.jpg">
	                    <img src="meeting1.jpg" alt="사무실">
	                </a>
	            </div>
	            <div class="col-sm-6 col-md-4">
	                <a class="lightbox" href="public.jpg">
	                    <img src="public.jpg" alt="공용공간">
	                </a>
	            </div>
	        </div>
	
	    </div>
	
	</div>	
	
	
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="../js/bootstrap.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.8.1/baguetteBox.min.js"></script>
	<script>
	    baguetteBox.run('.tz-gallery');
	</script>
</body>
</html>