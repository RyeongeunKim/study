<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
  <h1>WebContent/JSP1/test2.html</h1>
  
  <%
    // ��ũ��Ʋ�� �ۼ� (���������� ���?)
    // ���ڿ� �迭- 4ĭ
    // "java", "jsp", "web", "DB"
    
    String[] strArr = new String[4];
    strArr[0] = "java";
    strArr[1] = "jsp";
    strArr[2] = "web";
    strArr[3] = "DB";
    
    String strArr2[] = {"java", "JSP", "web", "DB"};
    String strArr3[] = new String[]{"java", "JSP", "web", "DB"};
    
    // strArr �迭�� ��� ����� ���� �ܼ�â(��Ŭ����)�� ���
    
    for(int i=0; i<strArr.length; i++){
    	System.out.println("strArr["+i+"] = "+strArr[i]);
    }
    
    // Ȯ�� for / for-each
    for(String s :strArr){
    	System.out.println(s);
    }
    
    // ȭ�鿡 ��� -> out.print(),out,println() ���
    // * html�ڵ�� �ۼ�(�� �ٲ� �� "<br>" �±�)
    // * put.print(" html �ڵ� �ۼ� ")
    for(int i=0; i<strArr.length; i++){
    	out.println("strArr["+i+"] = "+strArr[i]+"<br>");
    }
    
    
    // ǥ������ ����ؼ� ȭ�����
    
    for(int i=0; i<strArr.length;i++){
    	%>
    	<!-- HTML -->
    	<!-- jsp ǥ������ html �ڵ忡 �ۼ�! -->
    	<hr>
    	strArr[<%=i %>] = <%=strArr[i] %>
    	
    	<%="strArr["+i+"] = "+strArr[i]%>

    	<!-- HTML -->
    	<%
    } 
  
  %>
  
  <hr>
  
  <h3> ���̺� ���� </h3>
   <!-- ��ȣ1~4, �����̸�, ���񳻿� (�����̸�+��ȣ) 
        java�ڵ� : strArr �迭�� ��Ҹ� html ���̺� ���
    -->
    
   <table border="1">
    <tr>
     <th><%=1234 %></th>
     <td><%=strArr[0] %></td>
    </tr>
    
    <tr>
     <td>��ȣ</td>
     <td>�����̸�</td>
     <td>���񳻿�</td>
    </tr>
    
    <% 
      for(int i=0;i<strArr.length;i++){
    %>
    <tr>
     <td><%=i+1 %></td>
     <td><%=strArr[i] %></td>
     <td><%=strArr[i]+i %></td>
    </tr>
    <%
      }
    %>
    
   </table>
   

    
  
  
  
  
</body>
</html>