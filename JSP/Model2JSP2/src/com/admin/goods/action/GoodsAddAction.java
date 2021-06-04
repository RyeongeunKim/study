package com.admin.goods.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin.goods.db.AdminGoodsDAO;
import com.admin.goods.db.GoodsDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class GoodsAddAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("M : GoodsAddAction_execute() 호출");
		
		// 파일업로드 
		// upload 폴더 생성
		//request.getRealPath("/upload");
		ServletContext ctx = request.getServletContext();
		String realpath = ctx.getRealPath("/upload");
		
		int maxSize = 5 * 1024 * 1024;
		
		MultipartRequest multi 
		  = new MultipartRequest(
				  request,
				  realpath,
				  maxSize,
				  "UTF-8",
				  new DefaultFileRenamePolicy()				
				);
		
		System.out.println("M : 파일 업로드 완료!");		
		
		// 나머지 전달정보를 DB에 저장
		
		// GoodsDTO 객체를 생성후 전달된 정보를 저장
		GoodsDTO gdto = new GoodsDTO();
		gdto.setAmount(Integer.parseInt(multi.getParameter("amount")));
		gdto.setBest(0); // 0-일반상품,1-인기상품
		gdto.setCategory(multi.getParameter("category"));
		gdto.setColor(multi.getParameter("color"));
		gdto.setContent(multi.getParameter("content"));
		gdto.setName(multi.getParameter("name"));
		gdto.setPrice(Integer.parseInt(multi.getParameter("price")));
		gdto.setSize(multi.getParameter("size"));
		
		String image 
		 = multi.getFilesystemName("file1")+","
		  +multi.getFilesystemName("file2")+","
		  +multi.getFilesystemName("file3")+","
		  +multi.getFilesystemName("file4");	
		gdto.setImage(image);
		
		System.out.println("M - 이미지 정보 :"+image);
		
		// AdminGoodsDAO 객체 생성
		AdminGoodsDAO agdao = new AdminGoodsDAO();
		agdao.insertGoods(gdto);
		
		// 페이지 이동	
		ActionForward forward = new ActionForward();
		forward.setPath("./AdminGoodsList.ag");
		forward.setRedirect(true);
		
		return forward;
	}

}
