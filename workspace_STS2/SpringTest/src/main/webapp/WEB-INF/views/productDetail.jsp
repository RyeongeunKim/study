<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
  <h1>WEB-INF/views/productDetail.jsp</h1>
  
  ��Ʈ�ѷ����� ���޵� ��ü ����<br>
  
  <h2>${test }</h2>
  
  <hr>
  <h2>��ǰ ��ü</h2>
  <h3>${vo }</h3>
  
  <h4> ��ǰ�� : ${vo.name }</h4>
  <h4> ���� : ${vo.price }</h4>
  
  <hr>
  
  <h1> ���޵Ǵ� �Ӽ��� key���� ���� ��� Ŭ�������� ù���ڸ� �ҹ��ڷ� ���� </h1>
  
  <h2>${productVO }</h2>
  <h4> ��ǰ�� : ${productVO.name }</h4>
  <h4> ���� : ${productVO.price }</h4>
  

</body>
</html>