package com.itwillbs.myServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test3")
public class TestServlet3 extends HttpServlet {

	// alt shift s + v
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("/test3 호출!");
		
		Person kim = new Person();
		kim.setName("김학생");
		
		Dog dog = new Dog(); 
		dog.setDogName("뽀삐");
		
		kim.setDog(dog);

		request.setAttribute("kim", kim);
		
		// forward방식 페이지 이동
		RequestDispatcher dis
		 = request.getRequestDispatcher("/el/BeanTest.jsp");
		dis.forward(request, response);	
	}

}
