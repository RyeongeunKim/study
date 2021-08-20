package com.basket.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.basket.db.BasketDAO;

public class BasketDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("M : BasketDeleteAction_execute() 호출");

		// 세션 제어
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");

		ActionForward forward = new ActionForward();
		if (id == null) {
			forward.setPath("./MemberLogin.me");
			forward.setRedirect(true);
			return forward;
		}

		// 전달된 파라미터값 저장 (b_num)
		int b_num = Integer.parseInt(request.getParameter("b_num"));

		// DAO 객체 생성 - basketDelete(b_num)
		BasketDAO bkdao = new BasketDAO();
		
		bkdao.basketDelete(b_num);

		// 페이지 이동 (./BasketList.ba)
		forward.setPath("./BasketList.ba");
		forward.setRedirect(true);

		return forward;
	}

}
