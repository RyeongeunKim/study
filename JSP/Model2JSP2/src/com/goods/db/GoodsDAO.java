package com.goods.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.admin.goods.db.GoodsDTO;

public class GoodsDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private String sql = "";

	private Connection getConnection() {
		try {
			// Context 객체를 생성 (프로젝트 정보를 가지고있는객체)
			Context initCTX = new InitialContext();
			// DB연동 정보를 불러오기(context.xml)
			DataSource ds = (DataSource) initCTX.lookup("java:comp/env/jdbc/model2DB");

			conn = ds.getConnection();

			System.out.println(" 드라이버 로드, 디비연결 성공! ");
			System.out.println(conn);

		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}
	// getConnection() - 디비연결 끝

	// 자원해제코드 - finally 구문에서 사용
	public void closeDB() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// getGoodsList()
	public List getGoodsList() {
        List goodsList = new ArrayList();
        try {
        	conn = getConnection();
        	sql = "select * from itwill_goods";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				GoodsDTO dto = new GoodsDTO();
				dto.setAmount(rs.getInt("amount"));
				dto.setBest(rs.getInt("best"));
				dto.setCategory(rs.getString("category"));
				dto.setColor(rs.getString("color"));
				dto.setContent(rs.getString("content"));
				dto.setDate(rs.getString("date"));
				dto.setImage(rs.getString("image"));
				dto.setName(rs.getString("name"));
				dto.setNum(rs.getInt("num"));
				dto.setPrice(rs.getInt("price"));
				dto.setSize(rs.getString("size"));
				
				// 리스트 한칸에 상품 1개를 저장
				goodsList.add(dto);			
				
			}// while
			
			System.out.println("DAO : 상품 정보 저장 완료(일반사용자 상품 목록)");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
		return goodsList;
	}
	// getGoodsList()
	
	// getGoodsList(item)
	public List getGoodsList(String item) {
		// item에 따라서 다른 결과를 처리 
		// item - all/best/그외 카테고리
        List goodsList = new ArrayList();
        
        StringBuffer SQL = new StringBuffer();
        
        try {
        	conn = getConnection();
        	
        	//sql = "select * from itwill_goods";
        	
        	SQL.append("select * from itwill_goods");
        	
        	if(item.equals("all")){
        	}else if(item.equals("best")){
        		SQL.append(" where best=?");
        	}else{
        		SQL.append(" where category=?");
        	}
        	
        	//pstmt = conn.prepareStatement(sql);
        	pstmt = conn.prepareStatement(SQL+"");
        	
        	// ?
        	if(item.equals("all")){
        	}else if(item.equals("best")){
        		pstmt.setInt(1, 1); // 인기상품-1, 일반상품-0
        	}else{
        		pstmt.setString(1, item);
        	}       	
        	
			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				GoodsDTO dto = new GoodsDTO();
				dto.setAmount(rs.getInt("amount"));
				dto.setBest(rs.getInt("best"));
				dto.setCategory(rs.getString("category"));
				dto.setColor(rs.getString("color"));
				dto.setContent(rs.getString("content"));
				dto.setDate(rs.getString("date"));
				dto.setImage(rs.getString("image"));
				dto.setName(rs.getString("name"));
				dto.setNum(rs.getInt("num"));
				dto.setPrice(rs.getInt("price"));
				dto.setSize(rs.getString("size"));
				
				// 리스트 한칸에 상품 1개를 저장
				goodsList.add(dto);			
				
			}// while
			
			System.out.println("DAO : 상품 정보 저장 완료(일반사용자 상품 목록)");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
		return goodsList;
	}
	// getGoodsList(item)
	
	// getGoods(num)
	public GoodsDTO getGoods(int num){
		GoodsDTO goods = null;
		try {
			conn = getConnection();
			sql = "select * from itwill_goods where num=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				goods = new GoodsDTO();
				
				goods.setAmount(rs.getInt("amount"));
				goods.setBest(rs.getInt("best"));
				goods.setCategory(rs.getString("category"));
				goods.setColor(rs.getString("color"));
				goods.setContent(rs.getString("content"));
				goods.setDate(rs.getString("date"));
				goods.setImage(rs.getString("image"));
				goods.setName(rs.getString("name"));
				goods.setNum(rs.getInt("num"));
				goods.setPrice(rs.getInt("price"));
				goods.setSize(rs.getString("size"));				
				
			} // if
			
			System.out.println("DAO : 상품 1개 정보 저장 완료(Detail)");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
		
		return goods;
	}
	// getGoods(num)
	
	
	
	
	
	
	
	
	
	
	
	
	

}
