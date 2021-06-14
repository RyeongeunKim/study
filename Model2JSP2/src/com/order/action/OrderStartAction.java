package com.order.action;

import java.util.List;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.basket.db.BasketDAO;
import com.member.db.MemberDAO;
import com.member.db.MemberDTO;

public class OrderStartAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("M : OrderStartAction_execute()");
		
		// 세션제어
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		
		ActionForward forward = new ActionForward();
		if(id == null){
			forward.setPath("./MamberLogin.me");
			forward.setRedirect(true);
			return forward;
		}
		
		// 장바구니에 있는 개인의 구매 정보 가져오기
		// (+구매상품정보-상품명,이미지,가격....)
		
		BasketDAO bkDAO = new BasketDAO();
		
		Vector totalList = bkDAO.getBasketList(id);
		// vector [ 0 : basketList, 1:goodsList ]
		
		// 장바구니 정보
		List basketList = (List) totalList.get(0);
		System.out.println(basketList.size());
		
		// 상품정보
		List goodsList = (List) totalList.get(1);
		System.out.println(goodsList.size());
		
		// 주문자 정보(회원정보)
		MemberDAO mdao = new MemberDAO();
		MemberDTO mDTO = mdao.getMember(id); 
		
		// 주문에 필요한 정보를 영역에 저장
		request.setAttribute("basketList", basketList);
		request.setAttribute("goodsList", goodsList);
		request.setAttribute("memberDTO", mDTO);
		
		// 페이지 이동 (./goods_order/goods_buy.jsp)
		forward.setPath("./goods_order/goods_buy.jsp");
		forward.setRedirect(false);
		return forward;
	}

}
