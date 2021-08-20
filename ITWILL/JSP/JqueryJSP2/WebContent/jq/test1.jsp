<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- 직접 Jquery 파일을 추가해서 사용(준비) -->
<!-- <script src="../js/jquery-3.6.0.js"></script> -->

<!-- 외부 서버(페이지) CDN에서 파일을 전달받아서 사용(준비) -->
<!-- 
Jquery CDN
https://code.jquery.com/jquery/
Google CDN
https://developers.google.com/speed/libraries#jquery
Microsoft CDN
https://docs.microsoft.com/en-us/aspnet/ajax/cdn/overview#jQuery_Releases_on_the_CDN_0
CDNJS CDN
https://cdnjs.com/libraries/jquery
jsDelivr CDN
https://www.jsdelivr.com/package/npm/jquery

 -->
<!-- <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
 -->
<!-- 
  * 한번에 여러개의 Jquery를 사용가능하나, 가능하면 중복 사용을 자제
   => 여러개의 버전충돌 가능성이 있음.
   => Jquery 추가는 한곳에서 정리 
 -->
 <!-- JQUERY는  자바스크립트의 라이브러리 입니다.(기능을 모아놓은 형태) -->
 <!-- 1. 라이브러리 추가 (파일/CDN)-->
 <script src="../js/jquery-3.6.0.js"></script>
 
 <!-- 2. jquery 사용준비 -->
 <script type="text/javascript">
    alert("자바스크립트!");
    //$(document).ready(function(){엔터});
    // => html-body 생성후 호출
    // * 실행순서 : java(jsp)->javascript==html->Jquery
    $(document).ready(function(){
    	alert('Jquery 실행1 !');
    });
    
    //$(function(){});
    $(function(){
    	alert('Jquery 실행2 !');
    });
    
    //jQuery(document).ready(function(){});
    jQuery(document).ready(function(){
    	alert("Jquery 실행3 !");
    });
    
    // jQuery(function(){});
    jQuery(function(){
    	alert('Jquery 실행4 !');
    });
    
    
 
 </script>

</head>
<body>
   <h1>WebContent/jq/test1.jsp</h1>
   
   
   
    <script type="text/javascript">
      alert("자바스크립트(body)");    
    </script>
   
   
</body>
</html>