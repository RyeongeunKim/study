package com.admin.goods.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import com.goods.db.GoodsDTO;

public class AdminGoodsDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private String sql = "";
	
	
	//-----------DB 드라이버 정보--------------------
	/*final String DRIVER = "com.mysql.jdbc.Driver";
	final String DBURL = "jdbc:mysql://localhost:3306/cosshopping";
	final String DBID = "root";
	final String DBPW = "1234";*/
	
	
	private Connection getConnection() {
		// 커넥션 풀 (Connection pool) : 미리 연결정보(connection)을 생성해서 저장 후 사용(pool) -> 사용 후 반납
		// Context 객체를 생성 (현재 프로젝트 정보를 가지고 있는 객체)
		try {
			Context initCTX = new InitialContext();	 //얘는 인터페이스(부모)!인데 객체 생성(자식)-> 업캐스팅(상속)
			
			// DB 연동 정보를 불러오기 (context.xml)
			DataSource ds = (DataSource) initCTX.lookup("java:comp/env/jdbc/cosShopping");	// 다운캐스팅
			
			conn = ds.getConnection();
			
			System.out.println("드라이버 로드, 디비 연결 성공!");
			System.out.println(conn);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return conn;
	}
	
	
	// 자원 해제 코드
	public void closeDB() {
		// 자원 해제
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// insertGoods(gdto)
	public void insertGoods(GoodsDTO gdto){
		int cosNum = 0;
		try {
			conn = getConnection();
			// 1. 상품 번호 계산
			sql = "select max(cosNum) from coslist";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				cosNum = rs.getInt(1)+1;
			}
			System.out.println("DAO : 상품번호 - "+cosNum);
			
			// 2. 상품등록
			sql = "insert into coslist(cosNum,cosName,cosPrice,cosBrand,cosCategory,"
					+ "cosSkinType,cosTrouble,cosAmount,cosVolumn,madeCompany,"
					+ "ingredient,cosMethod,cosWarning,cosImage,cosWriteDate) "
					+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,now())";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, cosNum);
			pstmt.setString(2, gdto.getCosName());
			pstmt.setInt(3, gdto.getCosPrice());
			pstmt.setString(4, gdto.getCosBrand());
			pstmt.setString(5, gdto.getCosCategory());
			pstmt.setString(6, gdto.getCosSkinType());
			pstmt.setString(7, gdto.getCosTrouble());
			pstmt.setInt(8, gdto.getCosAmount());
			pstmt.setInt(9, gdto.getCosVolumn());
			pstmt.setString(10, gdto.getMadeCompany());
			pstmt.setString(11, gdto.getIngredient());
			pstmt.setString(12, gdto.getCosMethod());
			pstmt.setString(13, gdto.getCosWarning());
			pstmt.setString(14, gdto.getCosImage());
			
			pstmt.executeUpdate();
			
			System.out.println("DAO : 관리자 상품 등록 완료!");
			
		} catch (Exception e) {
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
			conn = getConnection();
			sql = "select * from coslist";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				GoodsDTO dto = new GoodsDTO();
				dto.setCosAmount(rs.getInt("cosAmount"));
				dto.setCosBrand(rs.getString("cosBrand"));
				dto.setCosCategory(rs.getString("cosCategory"));
				dto.setCosImage(rs.getString("cosImage"));
				dto.setCosName(rs.getString("cosName"));
				dto.setCosNum(rs.getInt("cosNum"));
				dto.setCosPrice(rs.getInt("cosPrice"));
				dto.setCosSkinType(rs.getString("cosSkinType"));
				dto.setCosTrouble(rs.getString("cosTrouble"));
				dto.setCosVolumn(rs.getInt("cosVolumn"));
				dto.setCosWriteDate(rs.getDate("cosWriteDate"));
				
				goodsList.add(dto);
				
			}//while
			System.out.println("DAO : 관리자 상품리스트 저장 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
		return goodsList;
		
	}
	// getGoodsList()
	
	// getGoods(cosNum)
	public GoodsDTO getGoods(int cosNum){
		GoodsDTO dto = null;
		
		try {
			conn = getConnection();
			sql = "select * from coslist where cosNum=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, cosNum);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				dto = new GoodsDTO();
				
				dto.setCosAmount(rs.getInt("cosAmount"));
				dto.setCosBrand(rs.getString("cosBrand"));
				dto.setCosCategory(rs.getString("cosCategory"));
				dto.setCosImage(rs.getString("cosImage"));
				dto.setCosName(rs.getString("cosName"));
				dto.setCosNum(rs.getInt("cosNum"));
				dto.setCosPrice(rs.getInt("cosPrice"));
				dto.setCosSkinType(rs.getString("cosSkinType"));
				dto.setCosTrouble(rs.getString("cosTrouble"));
				dto.setCosVolumn(rs.getInt("cosVolumn"));
				dto.setCosWriteDate(rs.getDate("cosWriteDate"));				
			}//if
			System.out.println("DAO : 수정할 상품정보 저장완료!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
		return dto;
	}
	
	// getGoods(cosNum)
	
	// modifyGoods(gdto)
	public void modifyGoods(GoodsDTO gdto){
		
	}
	
	// modifyGoods(gdto)
	
}



























