package com.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.member.db.MemberDAO;
import com.member.db.MemberDTO;

public class MemberUpdateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("M : MemberUpdateAction_execute() 호출 ");
		
		// 세션제어 
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		
		ActionForward forward = new ActionForward();
		if(id == null){
			forward.setPath("./MemberLogin.me");
			forward.setRedirect(true);
			return forward;
		}
		
		// DAO 객체 생성 - getMember(id)
		MemberDAO mdao = new MemberDAO();
		MemberDTO mdto = mdao.getMember(id);
		
		// DB에서 가져온정보를 request 영역에 저장
		request.setAttribute("mdto", mdto);
		
		// view 페이지로 이동(./member/updateForm.jsp)		
		forward.setRedirect(false);	
		forward.setPath("./member/updateForm.jsp");
		
		return forward;
	}

}
