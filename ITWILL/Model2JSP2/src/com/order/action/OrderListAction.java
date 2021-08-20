package com.order.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.order.db.OrderDAO;

public class OrderListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("M : OrderListAction_execute() 호출");
		
		// 세션정보 처리
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		ActionForward forward = new ActionForward();
		if(id==null){
			forward.setPath("./MemberLogin.me");
			forward.setRedirect(true);
			return forward;
		}
		
		// OrderDAO 객체 생성
		//  getOrderList(id)
		OrderDAO orDAO =new OrderDAO();
		List orderList = orDAO.getOrderList(id);
		
		// 주문목록 저장(request)
		request.setAttribute("orderList", orderList);
		
		// 페이지 이동		
		forward.setPath("./goods_order/order_list.jsp");
		forward.setRedirect(false);
		
		return forward;
	}

}
