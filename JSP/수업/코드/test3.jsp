<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
  
  <h1>WebContent/JSP1/test3.jsp</h1>
  
  <%
	new Date();
  
    // p177~
    // ���尴ü : JSP ��ü������ ����Ǿ��ִ� ��ü
    // => ������ ��ü �������� ��밡��(import�� �����̵� ��밡��)
    // => ���尴ü�� JSP�������� ����Ŭ������ ��ȯ�� �� _jspService()�޼��� �ȿ���
    //    ���� ���� �����.
    
  /*
  	=> 9���� ���� ��ü �ܿ���!
  	
   	[javax.servlet ��Ű��] - 8��
   	 request : Ŭ���̾�Ʈ ��û������ �����ϴ� ��ü(HTTP��û, �Ķ����)
   	 response : ��û������ ���� ���������� ó���ϴ� ��ü
   	 session : Ŭ���̾�Ʈ�� ���������� �����ϴ� ��ü
   	 pageContext : �������� ������ �� �� �ʿ��� ������ �����ϴ� ��ü (������Ʈ)
   	 out : ���� ������ ������ ���� ��� ��Ʈ�� ��ü(�����)
   	 application : �ش� ���ø����̼��� ���ؽ�Ʈ ������ ������ ��ü(���ؽ�Ʈ: ���� ������Ʈ, pageContext���� ū ����)
   	 config : �ش� �������� ���� ���� ���尴ü
   	 page : �ش� ������ ���� ��ü (�ν��Ͻ�)
   	
    [java.lang ��Ű��] - 1��  	
     exeception : ���� ó�� ��ü
   			
  */
  
  %>
  
  <h3> request ���尴ü </h3>
  <!-- ��û�ϴ� ���� ��� ������ ������ �ִ� ��ü -->
  
  ���� �����θ� : <%=request.getServerName() %><br>
  ���� ��Ʈ��ȣ : <%=request.getServerPort() %><br>
 URL : <%=request.getRequestURL() %><br> <!-- ������Ʈ��+������+��Ʈ��ȣ -->
 URI : <%=request.getRequestURI() %><br> <!-- ���� �� �� ������ ��ġ -->
 
 Ŭ���̾�Ʈ ȣ��Ʈ�� : <%=request.getRemoteHost() %><br>
 Ŭ���̾�Ʈ IP : <%=request.getRemoteAddr() %><br>
  
 �������� �� <%=request.getProtocol() %><br>
 
 ������ ��û(����)��� : <%=request.getMethod() %><br>
 ������Ʈ ��� (���ؽ�Ʈ ���) : <%=request.getContextPath() %><br>
 ������ ��� : <%=request.getRealPath("/") %><br>
 
 <hr>
 http �ش�(user-agent) : <%=request.getHeader("user-agent") %><br>
 http �ش�(accept-language) : <%=request.getHeader("accept-language") %><br>
 hrrp �ش�(host) : <%=request.getHeader("host") %><br>
 http �ش�(connection) : <%=request.getHeader("connection") %><br>
 
 <h3> response ���尴ü </h3>
 <%
  //response.setHeader("�ش��̸�", ��);
  //response.addCookie("��Ű��");
  //response.sendRedirect("URL�ּ�");
  //response.setContentType("MIME Ÿ��");
 
 %>
 <h3>session ���尴ü </h3>
 
 ���� ID�� : <%=session.getId() %><br>
 ���ǻ����ð� : <%=session.getCreationTime() %><br>
 �����������ӽð� : <%=session.getLastAccessedTime() %><br>
 ���������ð�(1800��,30��) : <%=session.getMaxInactiveInterval() %><br>
 
 <%
   // ���������ð� ���� 30��->60��
   session.setMaxInactiveInterval(3600);
 %>
 ���������ð�(3600��,60��) : <%=session.getMaxInactiveInterval() %><br>
 
 <h3> application ���尴ü </h3>
 ���� ���� : <%=application.getServerInfo() %><br>
 ��������� : <%=application.getRealPath("/") %><br>
   

</body>
</html>