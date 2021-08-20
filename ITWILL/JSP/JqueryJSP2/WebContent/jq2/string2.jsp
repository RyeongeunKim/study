<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
   // 전달해준 데이터를 저장 -> 출력
   String name=request.getParameter("name");
   System.out.println("전달된 값 : "+name);
   int age = Integer.parseInt(request.getParameter("age"));
 %>
 <%=name %>-<%=age %>  