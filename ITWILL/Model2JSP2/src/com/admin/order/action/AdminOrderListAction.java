package com.admin.order.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin.order.db.AdminOrderDAO;

import sun.misc.FpUtils;

public class AdminOrderListAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("M : AdminOrderListAction_execute() 호출");
		
		// 관리자 세션제어
		
		// AdminOrderDAO 객체생성
		//  getAdminOrderList()
		AdminOrderDAO aoDAO = new AdminOrderDAO();
		List adminOrderList = aoDAO.getAdminOrderList();
		
		// 주문목록 저장
		request.setAttribute("adminOrderList", adminOrderList);
		
		// 페이지이동 (./admin_order/admin_order_list.jsp)
		ActionForward forward = new ActionForward();
		
		forward.setPath("./admin_order/admin_order_list.jsp");
		forward.setRedirect(false);
		
		return forward;
	}
}
