package com.itwillbs.myServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// http://localhost:8088/ELJSTLJSP2/test1
public class TestServlet1 extends HttpServlet {

	// alt shift s + v
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get방식 호출 발생!");
		
		
	   //request 영역에 속성을 저장
		request.setAttribute("cnt", 100);
		//request.setAttribute("cnt", new Integer(100));
		
		// session 영역에 속성을 저장
		HttpSession session = request.getSession();
		session.setAttribute("cnt", 200);
		
		
		// 화면에 표시될 view 페이지 연결-forward 방식(reqeust,session,application)
		
		RequestDispatcher dis
		  = request.getRequestDispatcher("/el/AttributeTest.jsp");
		
		dis.forward(request, response);
		
	}

}
