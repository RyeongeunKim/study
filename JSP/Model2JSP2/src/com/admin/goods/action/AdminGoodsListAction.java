package com.admin.goods.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin.goods.db.AdminGoodsDAO;

public class AdminGoodsListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("M : AdminGoodsListAction_execute() 호출");
		
		//AdminGoodsDAO 객체 생성
		// getGoodsList()
		AdminGoodsDAO agdao = new AdminGoodsDAO();
		List goodsList = agdao.getGoodsList();
		
		request.setAttribute("goodsList", goodsList);
		
		// 출력정보를 가지고 페이지이동
		ActionForward forward = new ActionForward();
		forward.setPath("./admingoods/admin_goods_list.jsp");
		forward.setRedirect(false);	
		
		return forward;
	}

}
