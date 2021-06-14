<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

    var stopBtn = setInterval(function() {
    	location.reload();
    }, 50);
   

</script>

</head>
<body>
<% 
  String[] studends ={
		  "강민구","강민정","강호영","고훈기","구경태",
		  "김나은","김령은","김병한","김시헌","김지원",
		  "김홍주","박경민","박민선","박수환","윤경미",
		  "이도현","이승협","이준혁","정광교","정보람",
		  "최아영(96)","최아영(98)","최준녕"		  
  };
  for(int i=0;i<studends.length;i++){
 	 int r = (int)(Math.random()*studends.length);
 	 
 	 String tmp=studends[i];
 	 studends[i] = studends[r];
 	 studends[r] = tmp;	  
  }
%>
  <%-- <%=Arrays.toString(studends) %> --%>
  <h1> 5/28일 개인프로젝트 발표 순서 </h1>
  
  <%
   for(int i=0;i<studends.length;i++){
	   if(i!=0 && i%5==0){
	  	 out.println("["+(i+1)+"번 : "+studends[i]+"] <hr>");		   
	   }else{
		 out.println("["+ (i+1)+"번 : "+studends[i]+"] " );
	   }
   }  
  %>
  



</body>
</html>