<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 1. 라이브러리 추가 (파일/CDN)-->
<script src="../js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		// html()/text() - 해당요소의 값을 가져오는 함수
		
		// html() : 해당 요소 중에서 가장 처음만나는 요소의 값을 가져옴(1개) 
		var h = $('h2').html();
		alert("h : "+h);
		
		// text() : 해당 요소 전부의 값을 가져옴
		var t = $('h2').text();
		alert("t : "+t);
		
		$('h2').html("Hello~!");
		$('h2').text("안녕하세요~!");
		
		// div 안에 "아이티윌" 출력
		$('div').text("아이티윌");
		$('div').html("ITWILL");
		
		// 태그가 포함된 글자는 그대로 출력
		$('div').text("<h3>아이티윌</h3>");
		// 태그가 포함된 글자는 태그를 적용후 출력
		$('div').html("<h3>ITWILL</h3>");
		var name="홍길동";
		
		$('div').html("<h3>이름:"+name+"</h3>");
		
		// div - " 이름:홍길동 :: **"
		//                해당요소의 순서, 해당요소의 이전의 값
		$('div').html(function(index,oldHtml){
			  //alert(index+"//"+oldHtml);
			  return oldHtml+" :: **";
		});
		
		var table="<table border='1'>";
		table +="<tr>";
		table +="<td>";
		table +=" hello ";
		table +="</td>";
		table +="</tr>";
		table +="</table>";
		
		//$('body').html(table);
	});
</script>
<script type="text/javascript">
var table="<table border='1'>";
table +="<tr>";
table +="<td>";
table +=" hello ";
table +="</td>";
table +="</tr>";
table +="</table>";

document.write(table);

</script>


</head>
<body>
	<h1>WebContent/jq/test5.jsp</h1>
	
	<h2>head-0</h2>
	<h2>head-1</h2>
	<h2>head-2</h2>
	<hr>
	<div>0</div>
	<div>1</div>
	<div>2</div>
	
	

</body>
</html>