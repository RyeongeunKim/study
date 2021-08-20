package com.basket.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.admin.goods.db.GoodsDTO;

public class BasketDAO {
	
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
	
	// checkGoods(bkDTO)
	public int checkGoods(BasketDTO bkDTO){
		int result = 0;
		try {
			conn = getConnection();
			// 전달받은 옵션값들 (b_g_num,b_g_color,b_g_size,b_m_id) 사용하여
			// 기존의 추가된 상품이 있는지 체크 => 상품이 있을때 1리턴 + 상품의 수량만 update
			//                         => 상품이 없을때 0리턴
			sql ="select * from itwill_basket where b_g_num=? and b_g_color=? and "
					+ " b_g_size=? and b_m_id=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, bkDTO.getB_g_num());
			pstmt.setString(2, bkDTO.getB_g_color());
			pstmt.setString(3, bkDTO.getB_g_size());
			pstmt.setString(4, bkDTO.getB_m_id());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				//result = 1;
				
				// 장바구니 상품의 정보(수량)를 수정
				sql = "update itwill_basket set b_g_amount = b_g_amount + ? "
						+ "where b_m_id=? and b_g_num=? and b_g_color=? and b_g_size=?";
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setInt(1, bkDTO.getB_g_amount());
				pstmt.setString(2, bkDTO.getB_m_id());
				pstmt.setInt(3, bkDTO.getB_g_num());
				pstmt.setString(4, bkDTO.getB_g_color());
				pstmt.setString(5, bkDTO.getB_g_size());
				
				result = pstmt.executeUpdate();				
				
			}
			
			System.out.println("DAO : 장바구니 상품 체크 완료! -> "+result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
		return result;
	}
	// checkGoods(bkDTO)
	
	
	// basketAdd(bkDTO)
	public void basketAdd(BasketDTO bkDTO){
		// 장바구니 번호
		int b_num = 0;
		
		try {
			conn = getConnection();
			
			// 상품번호 계산 : 기존의 장바구니가 있으면 해당번호 + 1
			sql = "select max(b_num) from itwill_basket";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				b_num = rs.getInt(1)+1;
			}
			System.out.println("DAO : 장바구니 번호 "+b_num);
			
			// 상품 장바구니에 추가
			sql = "insert into itwill_basket values(?,?,?,?,?,?,now())";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, b_num);
			pstmt.setString(2, bkDTO.getB_m_id());
			pstmt.setInt(3, bkDTO.getB_g_num());
			pstmt.setInt(4, bkDTO.getB_g_amount());
			pstmt.setString(5, bkDTO.getB_g_size());
			pstmt.setString(6, bkDTO.getB_g_color());
			
			pstmt.executeUpdate();
			
			System.out.println("DAO : 장바구니 추가 완료");			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
	}
	// basketAdd(bkDTO)
	
	
	// getBasketList(id)
	public Vector getBasketList(String id){
		
		//장바구니 정보(List) + 상품정보(상품이름,가격,이미지....)(List)
		Vector totalList = new Vector();
		List basketList = new ArrayList();
		List goodsList = new ArrayList();
		
		
		try {
			// id에 해당하는 장바구니 정보 저장
			conn = getConnection();
			
			sql="select * from itwill_basket where b_m_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			// * 장바구니가 있을때마다 장바구니의 상품정보를 추가적으로 저장
			while(rs.next()){
				BasketDTO bkDTO = new BasketDTO();
				bkDTO.setB_date(rs.getDate("b_date"));
				bkDTO.setB_g_amount(rs.getInt("b_g_amount"));
				bkDTO.setB_g_color(rs.getString("b_g_color"));
				bkDTO.setB_g_num(rs.getInt("b_g_num"));
				bkDTO.setB_g_size(rs.getString("b_g_size"));
				bkDTO.setB_m_id(rs.getString("b_m_id"));
				bkDTO.setB_num(rs.getInt("b_num"));
				
				// 장바구니 List 한칸에 저장
				basketList.add(bkDTO);
				
				// 장바구니 상품에 해당하는 정보 저장 (이름,가격,이미지...)
				// * 기존의 데이터를 사용하는데 문제 없이 쓰기 위해서
				//  pstmt2, rs2 객체를 생성
				sql ="select * from itwill_goods where num=?";
				PreparedStatement pstmt2 = conn.prepareStatement(sql);
				pstmt2.setInt(1, bkDTO.getB_g_num());
				
				ResultSet rs2 = pstmt2.executeQuery();
				if(rs2.next()){
					// 상품정보있을때 
					GoodsDTO gdto = new GoodsDTO();
					
					gdto.setName(rs2.getString("name"));
					gdto.setPrice(rs2.getInt("price"));
					gdto.setImage(rs2.getString("image"));
					// 추가정보 필요시 저장
					
					// 상품 리스트 한칸에 저장
					goodsList.add(gdto);
				}
				
				System.out.println("DAO : 상품정보 저장완료!");
				
				
			}// while
			
			totalList.add(basketList);
			totalList.add(goodsList);
			System.out.println("DAO : 장바구니정보 + 상품정보 저장완료!");			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
		return totalList;
	}	
	// getBasketList(id)
	
	
	// basketDelete(b_num)
	public void basketDelete(int b_num){
		
		try {
			conn = getConnection();
			sql = "delete from itwill_basket where b_num=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, b_num);
			
			pstmt.executeUpdate();
			
			System.out.println("DAO : 회원장바구니 정보 삭제 완료~!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
		
		
	}
	// basketDelete(b_num)
	
	
	// basketDelete(id)-구매후 장바구니 전체 제거
	public void basketDelete(String id){
		
		try {
			conn = getConnection();
			// 구매후 아이디에 해당하는 모든 장보구니 초기화
			sql = "delete from itwill_basket where b_m_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			pstmt.executeUpdate();
			
			System.out.println("DAO : 구매후 장바구니 제거");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
	}	
	// basketDelete(id)-구매후 장바구니 전체 제거
	
	
	
	
	
	
	
	
	
	
	

}
