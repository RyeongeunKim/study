package com.admin.order.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin.order.db.AdminOrderDAO;

public class AdminOrderDetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("M : AdminOrderDetailAction_execute() 호출");
		
		// 관리자 세션제어
		
		// 전달되는 파라미터값 trade_num
		String trade_num = request.getParameter("trade_num");
		
		// AdminOrderDAO 객체 생성
		//  - getAdminOrderDetail(trade_num);
		AdminOrderDAO aoDAO = new AdminOrderDAO();
		
		// 정보 저장
		request.setAttribute("adminOrderDetail", aoDAO.getAdminORderDetail(trade_num));
		
		// 페이지 이동 (./admin_order/admin_order_modify.jsp)
		ActionForward forward = new ActionForward();
		forward.setPath("./admin_order/admin_order_modify.jsp");
		forward.setRedirect(false);		
		return forward;
	}

}
