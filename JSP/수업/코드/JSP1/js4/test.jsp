<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

</head>
<body>

  <h1>�ȳ��ϼ��� test.jsp </h1>
  

  
  <%
  		// java �ڵ�
  		String id = request.getParameter("id");
  		
  		//����� ������ ���
  		

  		String hobby1 = request.getParameter("hobby");
  		String hobby2 = request.getParameter("hobby");
  		String hobby3 = request.getParameter("hobby");

  		int[] arr = new int[2];
  		String[] hob = request.getParameterValues("hobby");
  		
  		if(hob != null){
  	  		for(int i=0; i<=hob.length; i++){
  	  			out.print(hob[i]);
  	  		}
  		}
  		

   %>

</body>
</html>