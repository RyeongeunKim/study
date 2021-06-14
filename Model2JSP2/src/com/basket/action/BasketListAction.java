package com.basket.action;

import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.basket.db.BasketDAO;


public class BasketListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("M : BasketListAction_execute() 호출");
		
		// 세션 제어
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		
		ActionForward forward = new ActionForward();
		if(id == null){
			forward.setPath("./MemberLogin.me");
			forward.setRedirect(true);
			return forward;
		}
		
		// DAO 객체 생성
		BasketDAO bkDAO = new BasketDAO();
		// getBasketList(id)
		Vector totalList = bkDAO.getBasketList(id);
		//System.out.println("M : "+totalList);
		
		// 데이터 저장(request 영역)
		//request.setAttribute("totalList", totalList); (x)
		
		// view 페이지에서 바로 데이터를 사용할 수 있도록 처리
		// vector [ 0 : basketList, 1:goodsList ]
		request.setAttribute("basketList", totalList.get(0));
		request.setAttribute("goodsList", totalList.get(1));
		
		// 페이지 이동(./basket/goods_basket_list.jsp)
		forward.setPath("./basket/goods_basket_list.jsp");
		forward.setRedirect(false);
		return forward;
	}

}
