package com.member.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 개발에서 사용되는 중요 개념 => 도메인

// 컨트롤러 -> 서블릿
public class MemberFrontController extends HttpServlet {

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("MemberFrontController_doProcess() 호출!\n\n\n");

		// 주소를 비교해서 주소에 따른 페이지 처리

		/******************* 1.페이지 주소 파싱 ********************************/
		// String requestURL = request.getRequestURL()+"";
		// System.out.println(requestURL);

		// 가상주소 가져오기
		String requestURI = request.getRequestURI();
		System.out.println("1 : requestURI:" + requestURI);
		// 프로젝트명(컨텍스트명)
		String contextPath = request.getContextPath();
		System.out.println("1 : contextPath : " + contextPath);
		// 프로젝트명을 제외한 가상주소
		String command = requestURI.substring(contextPath.length());
		System.out.println("1 : command : " + command);

		/******************* 1.페이지 주소 파싱 ********************************/

		/******************* 2.페이지 주소 매핑(연결) ********************************/
		// DB 사용여부에 따라서 페이지 구성
		ActionForward forward = null;
		Action action = null;

		// http://localhost:8088/Model2JSP2/MemberJoin.me
		if (command.equals("/MemberJoin.me")) {
			// 회원가입 페이지 -> view 페이지
			// 1. response 이동 (주소o,페이지o 변경)
			// response.sendRedirect("주소");

			// 2. forward 이동 (주소x, 페이지o 변경)
			// RequestDispatcher dis
			// = request.getRequestDispatcher("주소");
			// dis.forward(request, response);

			System.out.println("2 :  /MemberJoin.me 주소 호출");

			forward = new ActionForward();
			forward.setPath("./member/insertForm.jsp");
			forward.setRedirect(false);
		}
		// ./MemberJoinAction.me(x)
		else if (command.equals("/MemberJoinAction.me")) {
			System.out.println("2: /MemberJoinAction.me 호출");
			// 회원가입 처리 -> 별도의 객체를 생성-> 동작실행
			// MemberJoinAction() 객체 생성
			try {
				// 호출가능하지만, 가비지 생성코드 (사용x)
				//new MemberJoinAction().execute(request, response);
				
				// MemberJoinAction mja = new MemberJoinAction();
				// mja.execute(request, response);
				//  Action페이지에서 처리(DB)후 페이지 이동정보 리턴
				action = new MemberJoinAction();				
				forward = action.execute(request, response);				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.equals("/MemberLogin.me")){
			System.out.println("C : /MemberLogin.me 호출");
			// 화면을 보여주기=> view페이지로 이동
			
			forward = new ActionForward();
			forward.setPath("./member/loginForm.jsp");
			forward.setRedirect(false);
		}
		else if(command.equals("/MemberLoginAction.me")){
			System.out.println("C : /MemberLoginAction.me 호출");
			// DB 사용 => MemberLoginAction() 객체를 생성해야함.
			action = new MemberLoginAction();
			System.out.println("C : 로그인처리 메소드 호출");
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(command.equals("/Main.me")){
			System.out.println("C : /Main.me 호출");
			
			forward = new ActionForward();
			forward.setPath("./main/main.jsp");
			forward.setRedirect(false);
		}
		
		
		
		/******************* 2.페이지 주소 매핑(연결) ********************************/

		/******************* 3.페이지 주소 이동 ********************************/

		if (forward != null) {
			// forward 객체 있음 => 페이지 이동정보가 있음
			if (forward.isRedirect()) { // true
				System.out.println("3 : @@@@@@@@ sendRedirect() 이동 \n\n\n");
				response.sendRedirect(forward.getPath());
			} else {// false
				System.out.println("3 : @@@@@@@@ forward() 이동 \n\n\n");
				RequestDispatcher dis = request.getRequestDispatcher(forward.getPath());
				dis.forward(request, response);
			}
		}
		/******************* 3.페이지 주소 이동 ********************************/

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("MemberFrontController_doGet() 호출!");
		doProcess(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("MemberFrontController_doPost() 호출!");
		doProcess(request, response);
	}

}
