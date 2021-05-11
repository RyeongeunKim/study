<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  //WebContent/jq2/json3.jsp
  
  // 1. 드라이버 로드
  Class.forName("com.mysql.jdbc.Driver");
  
  // 2. 디비연결
  Connection con =
     DriverManager.getConnection("jdbc:mysql://localhost:3306/jspdb", "root", "1234");
  
  // 3. sql 작성 & pstmt 객체 생성
  String sql = "select id,name,email from itwill_member";
  
  PreparedStatement pstmt = con.prepareStatement(sql);
  
  // 4. sql 실행
  ResultSet rs = pstmt.executeQuery();
  
  // 5. 데이터 처리 (디비 데이터 -> JSON변경)
  
  // JSON 배열 객체 생성 => JSONArray()
  JSONArray memberList= new JSONArray();
  
  // DB데이터(반복-rs.next()) -> Object(자바빈) -> Array
  while(rs.next()){
	  // 데이터 있을때 JSONObject() 객체 생성
	  JSONObject memberBean = new JSONObject();
	  
	  memberBean.put("id", rs.getString("id"));
	  memberBean.put("name",rs.getString("name"));
	  memberBean.put("email",rs.getString("email"));
	  
	  // 배열의 한칸에 객체 하나씩 저장
	  memberList.add(memberBean);
  }

%> 
<%=memberList %>




   