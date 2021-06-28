package com.basket.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.basket.db.BasketDAO;
import com.basket.db.BasketDTO;
import com.goods.db.GoodsDTO;

public class BasketModifyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("M : BasketModifyAction_execute() 호출");
		
		//세션 제어
		HttpSession session = request.getSession();
		String userID = (String) session.getAttribute("userId");
		
		ActionForward forward = new ActionForward();
		if(userID == null){
			forward.setPath("./MemberLogin.me");
			forward.setRedirect(true);
			return forward;
		}

		BasketDTO bkdto = new BasketDTO();
		bkdto.setBasketNum(Integer.parseInt(request.getParameter("bkNum")));
		bkdto.setBasketCosAmount(Integer.parseInt(request.getParameter("amount")));
		
		BasketDAO bkdao = new BasketDAO();
		bkdao.modifyBasket(bkdto);
		
		// 페이지 이동
		forward.setPath("./BasketList.ba");
		forward.setRedirect(true);
		return forward;
		
/*		// 전달된 파라미터값 저장
		String[] bNum = request.getParameterValues("bkNum");
		String[] bAmount = request.getParameterValues("amount");

		// DAO 객체 생성 
		BasketDAO bkdao = new BasketDAO();
		int[] basketNum = new int[bNum.length];
		for(int i=0; i<bNum.length; i++){
			basketNum[i] = Integer.parseInt(bNum[i]);
		}
		
		int[] basketCosAmount = new int[bAmount.length];
		for(int i=0; i<bAmount.length; i++){
			basketCosAmount[i] = Integer.parseInt(bAmount[i]);
		}
		
		int result = bkdao.basketModify(basketNum, basketCosAmount);
		
		//페이지 이동
		forward.setPath("./BasketList.ba");
		forward.setRedirect(true);
		
		return forward;	*/	
	}

}
