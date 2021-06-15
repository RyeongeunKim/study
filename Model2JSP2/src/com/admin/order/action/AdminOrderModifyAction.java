package com.admin.order.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin.order.db.AdminOrderDAO;
import com.order.db.OrderDTO;

public class AdminOrderModifyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("M : AdminOrderModifyAction_execute() 호출");
		
		// 관리자 세션제어
		
		// 한글처리
		request.setCharacterEncoding("UTF-8");
		// 전달정보 저장 (trade_num,status,trans_num)
		// => OrderDTO에 저장
		OrderDTO orderDTO = new OrderDTO();
		
		orderDTO.setO_trade_num(request.getParameter("trade_num"));
		orderDTO.setO_status(Integer.parseInt(request.getParameter("status")));
		orderDTO.setO_trans_num(request.getParameter("trans_num"));
		
		// AdminOrderDAO 객체 생성 - 상태 & 운송장번호 수정 메서드
		AdminOrderDAO aoDAO = new AdminOrderDAO();
		aoDAO.updateOrder(orderDTO);
		
		// 페이지이동
		ActionForward forward= new ActionForward();
		forward.setRedirect(true);
		forward.setPath("./AdminOrderList.ao");
		return forward;
	}

}
