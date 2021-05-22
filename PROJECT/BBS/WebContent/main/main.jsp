<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<link rel="stylesheet" href="../css/bootstrap.css">
<link rel="stylesheet" href="../css/custom.css">
<title>드림오피스</title>
	<style type="text/css">
		.jumbotron{
			background-image: url("../images/main3.jpg");
			background-size: cover;
			text-shadow: black 0.2em 0.2em 0.2em;
			color: white;
		}
	</style>
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
			<a class="navbar-brand" href="main.jsp">드림오피스</a>
		</div>
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li class="active"><a href="main.jsp">메인</a></li>
				<li><a href="../bbs/bbs.jsp">예약</a></li>
				<li><a href="../map/map.jsp">위치</a></li>
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
	<div class="container">
		<div class="jumbotron">
	<div class="jumbotron">
				<h1 class="text-center">드림 오피스를 소개합니다.</h1>
				<p class="text-center">드림 오피스는 효과적인 협업을 위한 공유공간을 제공합니다</p>
				<p class="text-center"><a class="btn btn-primary btn-lg" href="../bbs/bbs.jsp" role="button">상담 예약하기</a></p>
			</div>
		</div>
	</div>
	<div class="container">
		<div id="myCarousel" class="carousel slide" data-ride="darousel">
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
				<li data-target="#myCarousel" data-slide-to="3"></li>
			</ol>
			<div class="carousel-inner">
				<div class="item">
					<img src="../images/main1.jpg">
				</div>
				<div class="item">
					<img src="../images/main2.jpg">
				</div>
				<div class="item">
					<img src="../images/lounge1.jpg">
				</div>
				<div class="item active">
					<img src="../images/private.jpg">
				</div>
			</div>
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span>
			</a>
			<a class="right carousel-control" href="#myCarousel" data-slide="next">
				<span class="glyphicon glyphicon-chevron-right"></span>
			</a>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="../js/bootstrap.js"></script>
</body>
</html>