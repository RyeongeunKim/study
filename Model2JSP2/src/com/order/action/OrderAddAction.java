package com.order.action;

import java.util.List;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.admin.goods.db.GoodsDTO;
import com.basket.db.BasketDAO;
import com.basket.db.BasketDTO;
import com.goods.db.GoodsDAO;
import com.order.db.OrderDAO;
import com.order.db.OrderDTO;

public class OrderAddAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("M : OrderAddAction_execute() 호출 ");
		
		// 세션제어
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		
		ActionForward forward = new ActionForward();
		if(id == null){
			forward.setPath("./MamberLogin.me");
			forward.setRedirect(true);
			return forward;
		}
		
		// 한글 처리 
		request.setCharacterEncoding("utf-8");
		// 전달된 파라미터 저장
		// (사용자ID,배송정보,결제정보)
		
		OrderDTO orDTO = new OrderDTO();
		
		orDTO.setO_m_id(id);
		orDTO.setO_receive_addr1(request.getParameter("o_receive_addr1"));
		orDTO.setO_receive_addr2(request.getParameter("o_receive_addr2"));
		orDTO.setO_receive_msg(request.getParameter("o_receive_msg"));
		orDTO.setO_receive_name(request.getParameter("o_receive_name"));
		orDTO.setO_receive_phone(request.getParameter("o_receive_phone"));
		orDTO.setO_trade_payer(request.getParameter("o_trade_payer"));
		orDTO.setO_trade_type(request.getParameter("o_trade_type"));
		
		// 구매 정보 
		BasketDAO bkDAO = new BasketDAO();
		Vector totalList = bkDAO.getBasketList(id);
		
		List<BasketDTO> basketList = (List<BasketDTO>)totalList.get(0);
		
		List<GoodsDTO> goodsList = (List<GoodsDTO>)totalList.get(1);
		
		// 주문정보 저장 (OrderDTO/OrderDAO/itwill_order 테이블)
		
		// 결제 모듈 연결 (카카오페이, 유플러스 결제모듈, 아임포트)
		
		// DB에 결제정보 저장
		OrderDAO orDAO = new OrderDAO();
		orDAO.addOrder(orDTO,basketList,goodsList);
		
		// 메일, 문자, push 메세지 => Thread
		
		// 상품 재고관리 -> 구매 수량 변경
		GoodsDAO gDAO = new GoodsDAO();
		gDAO.updateAmount(basketList);
		
		// 장바구니 비우기
		bkDAO.basketDelete(id);
		
		// 페이지 이동(./OrderList.or)
		forward.setPath("./OrderList.or");
		forward.setRedirect(true);
		
		return forward;
		
	}

}
