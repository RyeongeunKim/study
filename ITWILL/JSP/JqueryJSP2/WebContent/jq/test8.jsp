<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style type="text/css">
   .high_0 {background: yellow;}
   .high_1 {background: orange;}
   .high_2 {background: aqua;}
   .high_3 {background: green;}
   .high_4 {background: purple;}
</style>


<!-- 1. 라이브러리 추가 (파일/CDN)-->
<script src="../js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		// 제이쿼리 css()함수 
		// 		var col=[ 'yellow','orange','blue','green','red' ];
		// 		$('h2').css('background',function(idx){
		// 			return col[idx];
		// 		});
		
		// 각 대상에 접근해서 클래스명을 부여
		// => each()
		
		// h2태그(여러개)에 접근 배경색(여러개)을 변경
		$('h2').each(function(idx){
			// 해당 대상접근 -> 클래스명 부여
			alert("high_"+idx);
			// 대상.addClass(클래스명);
			//$('h2').addClass("high_"+idx); (가장마지막 클래스명 사용)
			$(this).addClass("high_"+idx);			
		}); 
		
		// this : 방문자가 페이지에 방문해서 이벤트를 등록한 요소마다
		//    익명함수에 있는 실행문 호출 
		// => ' 이벤트가 발생한 요소 '를 가리킴



	});
</script>
</head>
<body>
	<h1>WebContent/jq/test8.jsp</h1>
	
<!-- 	<h2 class="high_0">head-0</h2>
	<h2 class="high_1">head-1</h2>
	<h2 class="high_2">head-2</h2>
	<h2 class="high_3">head-3</h2>
	<h2 class="high_4">head-4</h2> -->
	
	<h2>head-0</h2>
	<h2>head-1</h2>
	<h2>head-2</h2>
	<h2>head-3</h2>
	<h2>head-4</h2>
	

</body>
</html>
