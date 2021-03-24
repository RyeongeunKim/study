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
  
  <h2> JSP 기본요소 </h2>
  <h3>1. 주석문</h3>
  <h3>2. JSP 지시어</h3>
  <h3>3. 스크립트 요소</h3>
  <h3>4. 액션태그</h3>
  
  <!-- HTML 주석 -->
  <%-- JSP 주석 --%> <%--HTML과 JSP를 같이 사용할 땐 JSP 주석으로 묶기 --%>
  <script type="text/javascript">
    // JS 주석
    /* JS 주석2 */  
  
  </script>
  <%
   // java 주석
   /* java 주석2 */
   /* java 주석3 */
  %>
  
  <%
    // JSP 지시어(Directive) p150~
    //< %@ ~ % > <%@ include ~ % > < %@ taglib ~ % >
    // => 해당 파일에서 JSP코드를 실행시 어떤 방식으로 실행할껀지 설명
    
    // MIME 타입 (웹에서 파일의 확장자는 별 의미가 없다?)
    // https://developer.mozilla.org/ko/docs/Web/HTTP/Basics_of_HTTP/MIME_types
    
    //3. 스크립트 요소 (p160~)
    // => JSP 코드 안에 java 코드를 사용가능하는 요소
    // 3-1. 선언문(DeClaration) : 멤버 변수, 멤버 메서드 선언 
    // 3-2. 스트립틀릿(Scriptlet)
    // 3-3. 표현식(Expression)
    
  %>
  
  <h3> JSP - 선언문</h3>
  <%! 
   // 선언문 : 멤버변수, 멤버메서드 선언 => jsp 페이지 어디서든 사용가능한 변수, 메서드
   String name = "홍길동";
   public void method(){
	   System.out.println("출력");
   }
   
   // method1(); 메서드 선언 O, 메서드 호출 X (선언문 안)
  
  
  %>
  <%!
    int age = 20; // 멤버변수(!있음)
  %>
  
  <h3> jsp - 스크립틀릿 </h3>
  
  <%
  	// java 코드를 작성
  	int num = 30; // 지역변수(!없음)
  	method(); // 메서드 호출 가능
  	
  	/* public void method2(){
             메서드 선언 불가
  	} */
   
  %>
  
  <h3> jsp - 표현식 </h3> 
  <!-- 내가 선언한 동작(메서드의 리턴, 변수, 리터럴 값을 사용
       java 코드를 html 화면에 출력 -->
  
  <%=1000 %>
  <%=num %>

</body>
</html>