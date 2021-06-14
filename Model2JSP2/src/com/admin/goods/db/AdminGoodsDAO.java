package com.admin.goods.db;

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

public class AdminGoodsDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private String sql = "";
	
	
	private Connection getConnection(){
		try {
			//Context 객체를 생성 (프로젝트 정보를 가지고있는객체)
			Context initCTX = new InitialContext();
			// DB연동 정보를 불러오기(context.xml)
			DataSource ds =
			(DataSource) initCTX.lookup("java:comp/env/jdbc/model2DB");
			
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
	public void closeDB(){
		try {
			if(rs != null){ rs.close(); }
			if(pstmt != null){ pstmt.close();}
			if(conn != null){ conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// insertGoods(gdto)
	public void insertGoods(GoodsDTO gdto){
		int num = 0;
		try {
			conn = getConnection();
			// 1. 상품 번호 계산
			sql="select max(num) from itwill_goods";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			//select max(num) from itwill_goods;
			// => 값이 없을 경우 null표시,
			//    내장함수 호출하는경우 항상 커서가 존재함 (rs.next()==true)
			//select num from itwill_goods;
			// => 값이 없을 경우 null표시, 커서는 X(rs.next()==false)
			if(rs.next()){
				num = rs.getInt(1)+1;
				//num = rs.getInt("max(num)")+1;
			}	
			System.out.println("DAO : 상품번호 - "+num);
			
			// 2. 상품등록
			sql = "insert into itwill_goods(num,category,name,content,"
					+ "size,color,amount,price,image,best,date) "
					+ "values(?,?,?,?,?,?,?,?,?,?,now())";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, gdto.getCategory());
			pstmt.setString(3, gdto.getName());
			pstmt.setString(4, gdto.getContent());
			pstmt.setString(5, gdto.getSize());
			pstmt.setString(6, gdto.getColor());
			pstmt.setInt(7, gdto.getAmount());
			pstmt.setInt(8, gdto.getPrice());
			pstmt.setString(9, gdto.getImage());
			pstmt.setInt(10, gdto.getBest());
			
			pstmt.executeUpdate();
			
			System.out.println("DAO : 관리자 상품 등록 완료!");			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
	}	
	// insertGoods(gdto)
	
	// getGoodsList()
	public List getGoodsList(){
		List goodsList = new ArrayList();
		
		try {
			// 1,2 디비연결
			conn = getConnection();
			// 3 sql 생성 & pstmt 객체 
			sql = "select * from itwill_goods";
			pstmt = conn.prepareStatement(sql);
			
			// 4 sql 실행
			rs = pstmt.executeQuery();
			
			// 5 데이터 처리
			while(rs.next()){
				// 데이터 있을때 
				// rs(row)-> DTO 객체 하나에 저장
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
				
				// DTO 객체 1개 -> List 한칸에 저장
				goodsList.add(dto);				
			}// while
			System.out.println("DAO : 관리자 상품리스트 저장 완료");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
		return goodsList;
	}
	// getGoodsList()
	
	// getGoods(num)
	public GoodsDTO getGoods(int num){
		GoodsDTO dto = null;
		try {
			conn = getConnection();
			sql = "select * from itwill_goods where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				dto = new GoodsDTO();
				
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
			}// if
			System.out.println("DAO : 수정할 상품정보 저장완료!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
		return dto;
	}
	// getGoods(num)
	
	
	// modifyGoods(gdto)
	public void modifyGoods(GoodsDTO gdto){
		try {
			conn = getConnection();
			sql = "update itwill_goods set "
					+ "category=?,name=?,price=?,color=?,amount=?,size=?,best=?,content=? "
					+ "where num=?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, gdto.getCategory());
			pstmt.setString(2, gdto.getName());
			pstmt.setInt(3, gdto.getPrice());
			pstmt.setString(4, gdto.getColor());
			pstmt.setInt(5, gdto.getAmount());
			pstmt.setString(6, gdto.getSize());
			pstmt.setInt(7, gdto.getBest());
			pstmt.setString(8, gdto.getContent());
			pstmt.setInt(9, gdto.getNum());
			
			pstmt.executeUpdate();
			
			System.out.println("DAO : 상품정보 수정 완료!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}	
		
	}	
	// modifyGoods(gdto)
	
	/**
	 * @메서드명 : deleteGoods
	 * @메서드 기능 : 삭제정보를 받아서 상품 삭제
	 * @param 상품 정보num
	 * @return 없음
	 */
	// deleteGoods(num)
	public void deleteGoods(int num){
		
		 try {
			 conn = getConnection();
			 sql = "delete from itwill_goods where num=?";
 			 pstmt = conn.prepareStatement(sql);
 			 
 			 pstmt.setInt(1, num);
 			 pstmt.executeUpdate();
 			 
 			 System.out.println("DAO : 관리자 상품정보 삭제 완료!");
 			 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
	}
	// deleteGoods(num)
	
	
	
	
	
	
	

}
