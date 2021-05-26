<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<link rel="stylesheet" href="../css/bootstrap.css">
<link rel="stylesheet" href="../css/custom.css">
<title>드림오피스</title>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="../js/bootstrap.js"></script>
</head>
<body>
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
				<li><a href="../main/main.jsp">메인</a></li>
				<li><a href="../bbs/bbs.jsp">방문예약</a></li>
				<li><a href="../map/map.jsp">위치</a></li>
				<li><a href="../images/gallery.jsp">시설안내</a></li>	
				<li><a href="../mail/mailForm.jsp">고객지원</a></li>			
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
					<a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">접속하기<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="login.jsp">로그인</a></li>
						<li class="active"><a href="join.jsp">회원가입</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</nav>
	<div class="container">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<div class="jumbotron" style="padding-top: 20px;">
				<form method="post" action="joinAction.jsp" name="fr">
					<h2 style="text-align: center;">회원가입</h2><br>
					<div class="d-flex justify-content-end" align="right">
						<button class="btn btn-primary" onclick="winopen();" type="button" >중복체크</button>
						<input type="text" class="form-control" placeholder="아이디" name="userID" maxlength="20">	
					</div><br>
					<div class="form-group">
						<input type="password" class="form-control" placeholder="비밀번호" name="userPassword" maxlength="20">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="이름" name="userName" maxlength="20">
					</div>	
					<div class="d-flex justify-content-end" align="right">
						<button type=button class="btn btn-primary" onclick="goPopup();">주소검색</button>
					</div>	
						<input type="text" class="form-control" placeholder="주소" name="userAddress" id="address" required readonly><br>
					<div class="form-group">
						<input type="email" class="form-control" placeholder="이메일" name="userEmail">
					</div>							
					<input type="submit" class="btn btn-primary form-control" value="회원가입">			
				</form>
			</div>
		</div>
		<div class="col-lg-4"></div>
	</div>
<script>

	// 아이디중복체크
	function winopen(){
		//새창을 열어서 페이지 오픈 후 아이디 정보를 가지고 중복체크
		//아이디가 없으면 알림창과 진행 x
		if(document.fr.userID.value == "" || document.fr.userID.value.length < 0){
			alert("아이디를 먼저 입력해주세요")
			document.fr.userID.focus();
		}else{
			window.open("joinIDCheck.jsp?id="+document.fr.userID.value,"",
					"width=300,height=50,left=120, top=120, location=no");
		}
	}
	
	function goPopup(){
		// 주소검색을 수행할 팝업 페이지를 호출
		var pop = window.open("jusoPopup.jsp","pop","width=570,height=420, scrollbars=yes, resizable=yes"); 
	}
	
	
	function jusoCallBack(roadFullAddr){
			var addressEI = document.querySelector("#address");
			addressEI.value = roadFullAddr;
	}

</script>
</body>
</html>