package com.admin.goods.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin.goods.db.AdminGoodsDAO;
import com.admin.goods.db.GoodsDTO;

public class AdminGoodsModifyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("M : AdminGoodsModifyAction_execute() 호출");
		
		// 전달된 정보가 있는지(폼태그 제외), 인코딩
		
		//  한글처리 
		request.setCharacterEncoding("UTF-8");
		
		// 전달된 수정할 정보를 저장(DTO)
		// 폼태그에서 전달되는 정보
		// num,category,name,price,color,amount,size,content,best
		GoodsDTO gdto = new GoodsDTO();
		gdto.setNum(Integer.parseInt(request.getParameter("num")));
		gdto.setCategory(request.getParameter("category"));
		gdto.setName(request.getParameter("name"));
		gdto.setPrice(Integer.parseInt(request.getParameter("price")));
		gdto.setColor(request.getParameter("color"));
		gdto.setAmount(Integer.parseInt(request.getParameter("amount")));
		gdto.setSize(request.getParameter("size"));
		gdto.setContent(request.getParameter("content"));
		gdto.setBest(Integer.parseInt(request.getParameter("best")));
		
		// DAO 객체 -> modifyGoods(DTO);
		AdminGoodsDAO agdao = new AdminGoodsDAO();
		agdao.modifyGoods(gdto);
		
		// 페이지 이동(./AdminGoodsList.ag)	
		ActionForward forward = new ActionForward();
		forward.setPath("./AdminGoodsList.ag");
		forward.setRedirect(true);			
		return forward;
	}

}
