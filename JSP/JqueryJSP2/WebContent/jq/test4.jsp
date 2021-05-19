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
 $(function(){
	 
	 // attr(); 접근하는 태그의 속성을 제어하는 함수
	 var s = $('img').attr('src');
	 alert("경로 : "+s);
	 
	 // img 태그에  테두리 - border속성 : 5
	 $('img').attr('border',5);
	 
	 // img태그 3개마다 각각 다른 크기의 태두리 지정
	 //  5,10,15
// 	 $('img').attr('border',5);
// 	 $('img').attr('border',10);
// 	 $('img').attr('border',15);
	 $('img').attr('border',function(i){
		   //alert("index : "+i);
		   //alert((i+1)*5);
		   return (i+1)*5;
	 });
	 
	 // img 태그/ border-5,width-300,height-100
	 // => 한번에 모든 속성을 변경
	 $('img').attr({
		 'border':5,
		 'width':300,
		 'height':100
	 });
	 
	// img 태그/ border-5,width-(100,200,300),height-100
	// => 한번에 모든 속성을 변경
	 $('img').attr({
		 'border':5,
		 'width':function(idx){
			 //alert(idx+"@@");
			 return (idx+1)*100;
		 },
		 'height':100
	 });
	
	// img 태그의 src 속성을 변경해서 이미지를 변경
	$('img').attr('src','6.jpg'); //jquery
	//window.document.images[1].src = "2.jpg"; //js
	
	$('input').attr('type','file');

 });
 
 </script>

</head>
<body>
  <h1>WebContent/jq/test4.jsp</h1>
  
  <img src="1.jpg">
  <img src="2.jpg">
  <img src="3.jpg">
  <hr>
  <input type="text">
  
  
  

</body>
</html>