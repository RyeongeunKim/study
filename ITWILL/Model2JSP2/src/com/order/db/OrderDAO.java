package com.order.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.admin.goods.db.GoodsDTO;
import com.basket.db.BasketDTO;

public class OrderDAO {
	
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
	
	// addOrder(orDTO,basketList,goodsList)
	public void addOrder(OrderDTO orDTO,List<BasketDTO> basketList,List<GoodsDTO> goodsList){
	
		int o_num = 0; // 주문테이블 번호
		int trade_num = 0; // 상품 주문번호
		
		//날짜정보 
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		
		try {
			conn = getConnection();
			sql ="select max(o_num) from itwill_order";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()){
				//o_num = rs.getInt(1)+1;
				o_num = rs.getInt("max(o_num)")+1;
			}
			// 주문번호 
			trade_num = o_num;
			
			System.out.println("DAO : o_num(주문테이블 번호) >> "+o_num);
			
			
			// 주문등록
			for(int i=0;i<basketList.size();i++){
				BasketDTO bkDTO = basketList.get(i);
				GoodsDTO gDTO = goodsList.get(i);
				
				// sql 생성(주문등록)
				sql = "insert into itwill_order values"
						+ "(?,?,?,?,?,"
						+ "?,?,?,?,?,"
						+ "?,?,?,?,?,"
						+ "?,now(),?,now(),?)";
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setInt(1, o_num);
				pstmt.setString(2, sdf.format(cal.getTime())+"-"+trade_num); // 주문번호 생성   20210611-1
				pstmt.setInt(3, bkDTO.getB_g_num());
				pstmt.setString(4, gDTO.getName());
				pstmt.setInt(5, bkDTO.getB_g_amount());
				pstmt.setString(6, bkDTO.getB_g_size());
				pstmt.setString(7, bkDTO.getB_g_color());
				
				pstmt.setString(8, orDTO.getO_m_id());
				pstmt.setString(9, orDTO.getO_receive_name());
				pstmt.setString(10, orDTO.getO_receive_addr1());
				pstmt.setString(11, orDTO.getO_receive_addr2());
				pstmt.setString(12, orDTO.getO_receive_phone());
				pstmt.setString(13, orDTO.getO_receive_msg());
				
				// 상품 금액 = 상품 수량 * 상품가격
				pstmt.setInt(14, bkDTO.getB_g_amount()*gDTO.getPrice());
				pstmt.setString(15, orDTO.getO_trade_type());
				pstmt.setString(16, orDTO.getO_trade_payer());
				pstmt.setString(17, "운송장번호 예정");
				pstmt.setInt(18, 0); // 주문상태
				
				pstmt.executeUpdate();
				
				// 주문테이블 번호 1씩 증가
				o_num++;				
			}// for
			
			System.out.println("DAO : 주문정보 저장완료! ");			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
	}	
	// addOrder(orDTO,basketList,goodsList)
	
	// getOrderList(id)
	public List getOrderList(String id){
		
		List orderList = new ArrayList();
		
		
		try {
			conn = getConnection();
			
			sql="select o_trade_num,o_g_name,o_g_amount,o_g_size,o_g_color,"
					+ "sum(o_sum_money) as o_sum_money,o_trans_num,o_date,"
					+ "o_status,o_trade_type from itwill_order where o_m_id=? "
					+ "group by o_trade_num order by o_trade_num desc";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				OrderDTO orDTO = new OrderDTO();
				orDTO.setO_date(rs.getDate("o_date"));
				orDTO.setO_g_amount(rs.getInt("o_g_amount"));
				orDTO.setO_g_color(rs.getString("o_g_color"));
				orDTO.setO_g_name(rs.getString("o_g_name"));
				orDTO.setO_g_size(rs.getString("o_g_size"));
				orDTO.setO_trade_num(rs.getString("o_trade_num"));
				orDTO.setO_trans_num(rs.getString("o_trans_num"));
				orDTO.setO_sum_money(rs.getInt("o_sum_money"));
				orDTO.setO_status(rs.getInt("o_status"));
				orDTO.setO_trade_type(rs.getString("o_trade_type"));
				
				// 리스트 한칸에 주문정보 객체 1개를 저장
				orderList.add(orDTO);
			}// while
			
			System.out.println("DAO : 회원 주문정보 저장완료! ");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
		return orderList;
	}
	// getOrderList(id)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
