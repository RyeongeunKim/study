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
  $(document).ready(function(){
	  //h2 태그 글자색 변경
	  $('h2').css('color','orange');
	 
	  //h2태그의 글자색을 가져오기
	  var c = $('h2').css('color');
	  alert(c); // rgb(0,0,0)-검정
	  
	  $('h2').css('background','black');
	  
	  //체이닝 기법 : 여러가지 속성을 [. 연산자를 사용해서] 여러개 사용
	  $('h2').css('color','red').css('background','black');
	  
	  // 한번에 여러개의 속성을 적용시키는 방법
	  $('h2').css({
		  color:'yellow',
		  background:'green'
	  });
	  
	  // 각 태그의 글자별로 색상을 변경
	  var col = ['red','orange','yellow'];
	  
	  // 요소의 index 번호를 계산
	  $('h2').css('color',function(index){
		  //alert("index : "+index);	
		  return col[index];
	  });
	  
	  // h2 여러개의 속성 사용
	  // 1)배열을 사용해서 배경색을 변경 2) 글자색 -black 변경
	  $('h2').css({
		  color:'black',
		  background:function(idx){
			  return col[idx];
		  }
	  });
	  
	  
	  $('h2').css({
		  color:function(i){
			  return col[i];
		  },
		  background:function(idx){
			  return col[idx];
		  }
	  });
	  
  });
</script>
</head>
<body>
	<h1>WebContent/jq/test3.jsp</h1>
	
	<h2> head-0 </h2>
	<h2> head-1 </h2>
	<h2> head-2 </h2>
	<h2> head-3 </h2>












</body>
</html>