package com.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.member.db.MemberDAO;
import com.member.db.MemberDTO;

public class MemberInfoAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("M : MemberInfoAction_execute() 호출");
		
		// 세션정보 제어
		HttpSession session = request.getSession();
		
		String id = (String) session.getAttribute("id");
		ActionForward forward = new ActionForward();
		if(id == null){
			forward.setPath("./MemberLogin.me");
			forward.setRedirect(true);
			return forward;						
		}
		// DAO 객체 생성 -> getMember(id) => 회원정보 가져오기
		MemberDAO mdao = new MemberDAO();
		
		MemberDTO mdto = mdao.getMember(id);		
		// DB에서 전달받은 정보를 저장(request 영역)
		request.setAttribute("mdto", mdto);
		
		
		//request.setAttribute("mdto", mdao.getMember(id));
		
		
		// 페이지 이동 -> view페이지 (./member/info.jsp)	
		forward.setPath("./member/info.jsp");
		forward.setRedirect(false);
		return forward;
	}

}
