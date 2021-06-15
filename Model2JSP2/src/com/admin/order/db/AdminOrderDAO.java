package com.admin.order.db;

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

import com.order.db.OrderDTO;

public class AdminOrderDAO {
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
	
	// getAdminOrderList()
	public List getAdminOrderList(){
		
		List adminOrderList= new ArrayList();
		
		
		try {
			conn = getConnection();
			
			sql="select o_trade_num,o_g_name,o_g_amount,o_g_size,o_g_color,"
					+ "sum(o_sum_money) as o_sum_money,o_trans_num,o_date,"
					+ "o_status,o_trade_type,o_m_id from itwill_order "
					+ "group by o_trade_num order by o_trade_num desc";
			pstmt = conn.prepareStatement(sql);
			
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
				orDTO.setO_m_id(rs.getString("o_m_id"));
				
				// 리스트 한칸에 주문정보 객체 1개를 저장
				adminOrderList.add(orDTO);
			}// while
			
			System.out.println("DAO : 관리자 주문목록 확인");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeDB();
		}
		return adminOrderList;		
	}
	
	// getAdminOrderList()
	
	// getAdminORderDetail(trade_num)
	public List getAdminORderDetail(String trade_num){
		List adminOrderDetail = new ArrayList();
		
		try {
			conn = getConnection();
			
			sql = "select * from itwill_order where o_trade_num=?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, trade_num);
			
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
				orDTO.setO_m_id(rs.getString("o_m_id"));
				
				//배송지 정보추가
				orDTO.setO_receive_name(rs.getString("o_receive_name"));
				
				// 리스트 한칸에 주문정보 객체 1개를 저장
				adminOrderDetail.add(orDTO);
			}// while

			System.out.println("DAO : 주문번호에 해당하는 상품 모두 저장완료");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
		return adminOrderDetail;
	}	
	// getAdminORderDetail(trade_num)
	
	// updateOrder(orderDTO)
	public void updateOrder(OrderDTO orderDTO){
		
		try {
			conn = getConnection();
			// 주문번호에 해당하는 상품의 상태, 운송장번호를 수정
			sql = "update itwill_order set o_status=?, o_trans_num=? where o_trade_num=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, orderDTO.getO_status());
			pstmt.setString(2, orderDTO.getO_trans_num());
			pstmt.setString(3, orderDTO.getO_trade_num());
			
			pstmt.executeUpdate();
			
			System.out.println("DAO : 주문상태, 운송장 번호 수정 완료");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
		
	}
	// updateOrder(orderDTO)
	
	
	
	
	
	
	
	
}
