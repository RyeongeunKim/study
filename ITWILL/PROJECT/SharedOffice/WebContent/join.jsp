<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width" initial-scale="1">
	<title>코딩 부스터</title>
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/sharedOffice.css">
</head>
<body>
	<body>
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" 
					data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="index.html">코딩 부스터</a>
			</div>
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<!-- 링크달아주기 -->
					<ul class="nav navbar-nav">
						<li class="active"><a href="index.html">소개<span class="sr-only"></span></a></li>
						<li><a href="#">오피스</a></li>
						<li><a href="#">고객센터</a></li>
					</ul>

					<ul class="nav navbar-nav navbar-right">
						<li class="dropdown">
							<a href="#" class="dropdown-togle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">접속하기<span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="login.jsp">로그인</a></li>
								<li><a href="join.jsp">회원가입</a></li>
							</ul>
						</li>

					</ul>
				</div>
			</div>
		</nav>

		<footer style="background-color: #000000; color: #ffffff">
			<div class="container">
				<br>
				<div class="row">
					<div class="col-sm-12" style="text-align: center;"><h5>이용약관<br>사업자 등록번호<br>개인정보처리방침</h5><br></div>
				</div>
			</div>
		</footer>
		<div class="row">
			<div class="modal" id="modal" tabindex="-1">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							코딩 부스터의 특징
							<button class="close" datadismiss="modal">&times;</button>
						</div>
						<div class="modal-body" style="text-align: center;">
							이런 특징이 있습니다<br>
							깔끔한 강의 우수한 강사진<br>
							<img src="images/lounge1.jpg" id="imagepreview" style="width: 256px; height: px;">
						</div>
					</div>
				</div>

			</div>
		</div>
		<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
		<script src="js/bootstrap.js"></script>
	</body>
</body>
</html>