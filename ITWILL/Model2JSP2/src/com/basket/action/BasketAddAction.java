package com.basket.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.basket.db.BasketDAO;
import com.basket.db.BasketDTO;

public class BasketAddAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("M : BasketAddAction_execute() 호출");
		
		// 세션 제어
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		
		ActionForward forward = new ActionForward();
		if(id == null){
			forward.setPath("./MemberLogin.me");
			forward.setRedirect(true);
			return forward;
		}
		
		// 장바구니 동작
		// 한글처리 
		request.setCharacterEncoding("UTF-8");
		// 전달된 정보 저장(num,amount,size,color)
		// DTO객체안에 저장
		BasketDTO bkDTO = new BasketDTO();
		bkDTO.setB_g_num(Integer.parseInt(request.getParameter("num")));
		bkDTO.setB_g_amount(Integer.parseInt(request.getParameter("amount")));
		bkDTO.setB_g_size(request.getParameter("size"));
		bkDTO.setB_g_color(request.getParameter("color"));
		bkDTO.setB_m_id(id);
		
		System.out.println("M: "+bkDTO);
		
		
		// DAO 객체 생성
		BasketDAO bkDAO = new BasketDAO();
		// 기존의 상품을 중복 체크해서 있을경우 수량변경
		// checkGoods(DTO)
		int result = bkDAO.checkGoods(bkDTO);
		//             "       없을경우 상품을 장바구니에 추가
		if(result != 1){
			bkDAO.basketAdd(bkDTO);
		}
		
		// 페이지 이동(./BasketList.ba)		
		forward.setPath("./BasketList.ba");
		forward.setRedirect(true);		
		return forward;
	}

}
