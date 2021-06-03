package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("")
public class Addme extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
				
		String x_ = request.getParameter("x");
		String y_ = request.getParameter("y");
				
		int x = 0;
		int y = 0;
		
		if(x_ != null && !x_.equals(""))
			x = Integer.parseInt(x_);
		
		if(y_ != null && !y_.equals(""))
			y = Integer.parseInt(y_);
		
		out.print("덧셈 결과 : " + (x+y));
		
		
		
	}
	
}
