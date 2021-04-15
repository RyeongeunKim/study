<%@page import="com.itwillbs.member.MemberBean"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

  <h1>WebContent/member/updateForm.jsp</h1>
  
  <%
	// 로그인한 사람의 정보를 DB에서 조회해서 
	// jsp화면에 출력

	// 로그인 세션처리 (로그인x->로그인페이지로 이동)
	String id = (String) session.getAttribute("id");

	if (id == null) {
		System.out.println("[info.jsp] : 아이디없음 -> 로그인페이지이동");
		response.sendRedirect("loginForm.jsp");
	}

	// 디비연결후 필요한데이터 조회 -> 출력
	// 디비연결 필요정보 
	String DRIVER = "com.mysql.jdbc.Driver";
	String DBURL = "jdbc:mysql://localhost:3306/jspdb";
	String DBID = "root";
	String DBPW = "1234";

	// 1 드라이버로드
	Class.forName(DRIVER);
	System.out.println(" 드라이버 로드성공! ");
	// 2 디비연결 
	Connection conn =
	DriverManager.getConnection(DBURL, DBID, DBPW);
	// 3 sql구문작성(select)  & pstmt생성
	String sql = "select * from itwill_member where id=?";
	PreparedStatement pstmt = conn.prepareStatement(sql);

	// ? 
	pstmt.setString(1, id);
	// 4 sql객체 실행 -> rs에 저장
	ResultSet rs = pstmt.executeQuery();
	// 5 데이터 처리 (화면에 출력)
	MemberBean mb = null;
	if(rs.next()){
		// rs에 저장된 정보를 꺼내서 화면에 출력
		mb = new MemberBean();
		mb.setId(rs.getString("id"));
		mb.setPw(rs.getString("pw"));
		mb.setName(rs.getString("name"));
		mb.setAge(rs.getInt("age"));
		mb.setGender(rs.getString("gender"));
		mb.setEmail(rs.getString("email"));
		mb.setRegdate(rs.getTimestamp("regdate"));
		
		System.out.println(" SQL구문 실행완료! ");
		System.out.println(" 저장된 회원정보 : "+mb);
	}
	
  
  %>
  
  
  
  
  <h2> 회원정보 수정 </h2>
  
  <fieldset>
    <legend> 아이티윌 회원정보 수정 페이지 </legend>
    
    <% if(mb != null){ %>
    <form action="updatePro.jsp" method="post">
    <!--  input 태그
          readonly 속성 : 값을 변경 x, 데이터 전송(submit) O
          disabled 속성 : 값을 변경 x, 데이터 전송(submit) X
    -->
      아이디 : <input  type="text" name="id" value="<%=mb.getId()%>" readonly><br>
      비밀번호 : <input type="password" name="pw" placeholder="비밀번호를 입력하세요."><br>
   <hr>   
      이름 : <input type="text" name="name" value="<%=mb.getName()%>"><br>
      나이 : <input type="number" name="age" value="<%=mb.getAge()%>"><br>
      성별 : <input type="radio" name="gender" value="남"
        <% 
         if(mb.getGender().equals("남")){
        	 %>
        	 checked="checked"
        	 <%
         }
        %>        
      > 남
      <input type="radio" name="gender" value="여"
         <% 
         if(mb.getGender().equals("여")){
        	 %>
        	 checked
        	 <%
         }
        %> 
      
      > 여  <br>
      이메일 : <input type="email" name="email" value="<%=mb.getEmail()%>"><br>
      <hr>
     <input type="submit" value="정보 수정">           
    
    </form> 
    <%} %>
     
  </fieldset>
  
  
  
  
  
  
  
  
  

</body>
</html>