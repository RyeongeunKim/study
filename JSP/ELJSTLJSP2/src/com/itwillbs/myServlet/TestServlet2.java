package com.itwillbs.myServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out.println("get방식 호출");
		
		// request 객체에 정보 저장
		
		String[] subjects = {"java","jsp","python","DB","WEB"};
		request.setAttribute("subjects", subjects);
		
		// 
		ArrayList<String> movie = new ArrayList<String>();
		movie.add("어벤져스");
		movie.add("겨울왕국");
		movie.add("아이언멘");
		movie.add("토르");
		movie.add("헐크");
		
		request.setAttribute("movie", movie);		
		
		
		// foward방식으로 페이지 처리
		// "array_collection.jsp" 페이지 이동
		RequestDispatcher dis 
		= request.getRequestDispatcher("/el/array_collection.jsp");
		
		dis.forward(request, response);
	
	}
	

}
