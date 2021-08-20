package com.itwillbs.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test1 extends HttpServlet{
    // alt shift s + v
	@Override
	public void init() throws ServletException {
		System.out.println("init()메서드 실행!");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet() 메서드 실행!");
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost() 메서드 실행!");
        
        // 웹페이지 구성하기
        resp.setContentType("text/html; charset=utf-8");
        
        PrintWriter out = resp.getWriter();
        
        out.print("<html>");
        out.print("<head><title>테스트</title></head>");
        out.print("<body>");
        out.print("<h1>Hello 서블릿! </h1>");
        out.print("</body>");
        out.print("</html>");
        
        out.close();
	}
//	@Override
//	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
//        System.out.println("service() 메서드 실행!");
//	}
	@Override
	public void destroy() {
		System.out.println("destroy() 메서드 실행!!");
	}

	
	

}
