<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
  <h1>WebContent/JSP1/test1.jsp</h1>
  
  <h2> JSP �⺻��� </h2>
  <h3>1. �ּ���</h3>
  <h3>2. JSP ���þ�</h3>
  <h3>3. ��ũ��Ʈ ���</h3>
  <h3>4. �׼��±�</h3>
  
  <!-- HTML �ּ� -->
  <%-- JSP �ּ� --%> <%--HTML�� JSP�� ���� ����� �� JSP �ּ����� ���� --%>
  <script type="text/javascript">
    // JS �ּ�
    /* JS �ּ�2 */  
  
  </script>
  <%
   // java �ּ�
   /* java �ּ�2 */
   /* java �ּ�3 */
  %>
  
  <%
    // JSP ���þ�(Directive) p150~
    //< %@ ~ % > <%@ include ~ % > < %@ taglib ~ % >
    // => �ش� ���Ͽ��� JSP�ڵ带 ����� � ������� �����Ҳ��� ����
    
    // MIME Ÿ�� (������ ������ Ȯ���ڴ� �� �ǹ̰� ����?)
    // https://developer.mozilla.org/ko/docs/Web/HTTP/Basics_of_HTTP/MIME_types
    
    //3. ��ũ��Ʈ ��� (p160~)
    // => JSP �ڵ� �ȿ� java �ڵ带 ��밡���ϴ� ���
    // 3-1. ����(DeClaration) : ��� ����, ��� �޼��� ���� 
    // 3-2. ��Ʈ��Ʋ��(Scriptlet)
    // 3-3. ǥ����(Expression)
    
  %>
  
  <h3> JSP - ����</h3>
  <%! 
   // ���� : �������, ����޼��� ���� => jsp ������ ��𼭵� ��밡���� ����, �޼���
   String name = "ȫ�浿";
   public void method(){
	   System.out.println("���");
   }
   
   // method1(); �޼��� ���� O, �޼��� ȣ�� X (���� ��)
  
  
  %>
  <%!
    int age = 20; // �������(!����)
  %>
  
  <h3> jsp - ��ũ��Ʋ�� </h3>
  
  <%
  	// java �ڵ带 �ۼ�
  	int num = 30; // ��������(!����)
  	method(); // �޼��� ȣ�� ����
  	
  	/* public void method2(){
             �޼��� ���� �Ұ�
  	} */
   
  %>
  
  <h3> jsp - ǥ���� </h3> 
  <!-- ���� ������ ����(�޼����� ����, ����, ���ͷ� ���� ���
       java �ڵ带 html ȭ�鿡 ��� -->
  
  <%=1000 %>
  <%=num %>

</body>
</html>