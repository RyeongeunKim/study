package com.itwillbs.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BoardDAO {
	// Data Access Object : DB 데이터 처리 객체
	// => DB에 관련된 모든 동작을 수행하는 객체
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private String sql = "";
	

	
	private Connection getConnection(){
		/*// 디비연결 필요정보 (지역변수)
		String DRIVER = "com.mysql.jdbc.Driver";
		String DBURL = "jdbc:mysql://localhost:3306/jspdb";
		String DBID = "root";
		String DBPW = "1234";
		// 1,2단계 
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(DBURL, DBID, DBPW);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		
		try {
			//Context 객체를 생성 (프로젝트 정보를 가지고있는객체)
			Context initCTX = new InitialContext();
			
			// DB연동 정보를 불러오기(context.xml)
			DataSource ds =
			(DataSource) initCTX.lookup("java:comp/env/jdbc/mysqlDB");
			
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
	
	
	
	
	
	// 글쓰기 동작 => 메서드 insertBoard(BoardBean bb)
/*	public void insertBoard(BoardBean bb){
		try {
			// 1 드라이버 로드
			Class.forName(DRIVER);
			// 2 디비 연결
			conn = DriverManager.getConnection(DBURL, DBID, DBPW);
			// 3 sql 작성 (insert) & pstmt 객체 생성
			sql = "insert into itwill_board "
					+ "values(?,?,?,?,?,?,?,?,?,now(),?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			// ?
			pstmt.setInt(1, 1);
			pstmt.setString(2, bb.getName());
			pstmt.setString(3, bb.getPass());
			pstmt.setString(4, bb.getSubject());
			pstmt.setString(5, bb.getContent());
			pstmt.setInt(6, bb.getReadcount());
			pstmt.setInt(7, bb.getRe_ref());
			pstmt.setInt(8, bb.getRe_lev());
			pstmt.setInt(9, bb.getRe_seq());
			pstmt.setString(10, bb.getIp());
			pstmt.setString(11, bb.getFile());
			
			// 4 sql 실행	
			
			pstmt.executeUpdate();
			
			System.out.println(" sql 구문 실행완료  : 글쓰기 완료! ");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패!!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("디비 연결 실패!!");
			e.printStackTrace();
		}
		
	}*/
	// 글쓰기 동작 => 메서드 insertBoard(BoardBean bb)
	
	// insertBoard
	public void insertBoard(BoardBean bb){
		int num = 0;
		try {
			// 1 드라이버 로드
			// 2 디비 연결
			// => 한번에 처리 하는 메서드로 변경
			conn = getConnection();		
			
			// 3 sql (글번호를 계산하는 구문)
			sql = "select max(num) from itwill_board";
			
			pstmt = conn.prepareStatement(sql);
			
			// 4 sql 실행
			rs = pstmt.executeQuery();
			
			// 5 데이터 처리
			//  max(num) - sql 함수를 실행했을경우 커서이동 가능(데이터여부 상관없음)
			//  num     - sql 컬럼의 경우  커서 이동 불가능
			if(rs.next()){
				//num = rs.getInt("max(num)")+1;
				num = rs.getInt(1)+1;
			}
			
			System.out.println(" 글번호  : "+num);
			
			////////////////////////////////////////////////////
			
			// 3 sql 작성 (insert) & pstmt 객체 생성
			sql = "insert into itwill_board "
					+ "values(?,?,?,?,?,?,?,?,?,now(),?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			// ?
			pstmt.setInt(1, num);
			pstmt.setString(2, bb.getName());
			pstmt.setString(3, bb.getPass());
			pstmt.setString(4, bb.getSubject());
			pstmt.setString(5, bb.getContent());
			pstmt.setInt(6, bb.getReadcount());
			pstmt.setInt(7, num); // re_ref에 글번호 num 저장
			pstmt.setInt(8, bb.getRe_lev());
			pstmt.setInt(9, bb.getRe_seq());
			pstmt.setString(10, bb.getIp());
			pstmt.setString(11, bb.getFile());
			
			// 4 sql 실행	
			
			pstmt.executeUpdate();
			
			System.out.println(" sql 구문 실행완료  : 글쓰기 완료! ");
			
		} catch (SQLException e) {
			System.out.println("디비 연결 실패!!");
			e.printStackTrace();
		} finally{
			// 자원해제 
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
		
	}
	// insertBoard()
	
	// getBoardCount()
	// 디비에 들어있는 글의 개수 계산후 리턴
	public int getBoardCount(){
		
        int cnt = 0;
        
        try {
        	// 1,2 드라이버로드, 디비연결
        	conn = getConnection();
        	
        	// 3 sql 작성(select) & pstmt 객체 생성
        	sql = "select count(*) from itwill_board";
			pstmt = conn.prepareStatement(sql);
			   
	        // 4 sql 실행
			rs = pstmt.executeQuery();
	        
	        // 5 데이터 처리
			if(rs.next()){
				cnt = rs.getInt(1);// "count(*)"
				//cnt = rs.getInt("count(*)");
			}
			
			System.out.println("SQL 구문 실행완료!");
			System.out.println(" 글 개수 : "+cnt+"개");
	        
		} catch (Exception e) {
			System.out.println(" 게시판 글개수_에러 발생!! ");
			e.printStackTrace();
		} finally{
		   // 자원해제
		   closeDB();
		}
		
		return cnt;
	}
	// getBoardCount()
	
	
	// getBoardList()
	public ArrayList getBoardList(){
		// DB데이터 1row 정보를 BoardBean 저장 -> ArrayList 한칸에 저장
		
		// 게시판의 글정보를 모두 저장하는 가변길이 배열
		ArrayList boardListAll = new ArrayList();
		
		// 게시판 글 1개의 정보를 저장하는 객체 
		BoardBean bb = null;
		//BoardBean bb = new BoardBean();
		
		
		try {
			// 1,2 드라이버로드, 디비연결
			conn = getConnection();
			// 3 sql 구문 & pstmt 객체 
			sql= "select * from itwill_board";
			pstmt = conn.prepareStatement(sql);
			
			// 4 sql 실행
			rs = pstmt.executeQuery();
			
			// 5 데이터처리 
			while(rs.next()){
				// 데이터 있을때 bb 객체 생성
				bb = new BoardBean();
				
				// DB정보 -> Bean 저장
				bb.setContent(rs.getString("content"));
				bb.setDate(rs.getDate("date"));
				bb.setFile(rs.getString("file"));
				bb.setIp(rs.getString("ip"));
				bb.setName(rs.getString("name"));
				bb.setNum(rs.getInt("num"));
				bb.setPass(rs.getString("pass"));
				bb.setRe_lev(rs.getInt("re_lev"));
				bb.setRe_ref(rs.getInt("re_ref"));
				bb.setRe_seq(rs.getInt("re_seq"));
				bb.setReadcount(rs.getInt("readcount"));
				bb.setSubject(rs.getString("subject"));
				
				// Bean -> ArrayList 한칸에 저장
				boardListAll.add(bb);
				
			}//while 끝
			
			System.out.println(" 게시판 모든정보 저장완료! ");
			System.out.println(" 총 "+boardListAll.size()+"개");		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeDB();
		}		
		
		return boardListAll;
	}
	// getBoardList()
	
	// getBoardList(startRow,pageSize)
	public ArrayList getBoardList(int startRow,int pageSize){
		// DB데이터 1row 정보를 BoardBean 저장 -> ArrayList 한칸에 저장
		
		// 게시판의 글정보를 원하는만큼 저장하는 가변길이 배열
		ArrayList boardList = new ArrayList();
		
		// 게시판 글 1개의 정보를 저장하는 객체 
		BoardBean bb = null;
		//BoardBean bb = new BoardBean();
		
		
		try {
			// 1,2 드라이버로드, 디비연결
			conn = getConnection();
			// 3 sql 구문 & pstmt 객체 
			//   글 정보 정렬 - order by
			//            - re_ref 값을 최신글 위쪽으로 정렬 (내림차순)
			//            - re_seq 값을 사용 (오름차순)
			//            - limit a,b   (a 시작행-1,b 개수)
			//            ex) 1번글 -> 0번 인덱스			
			
			
			//sql= "select * from itwill_board";
			sql= "select * from itwill_board "
					+ "order by re_ref desc, re_seq asc "
					+ "limit ?,?";			
			
			pstmt = conn.prepareStatement(sql);
			
			// ?
			pstmt.setInt(1, startRow-1);
			pstmt.setInt(2, pageSize);		
			
			// 4 sql 실행
			rs = pstmt.executeQuery();
			
			// 5 데이터처리 
			while(rs.next()){
				// 데이터 있을때 bb 객체 생성
				bb = new BoardBean();
				
				// DB정보 -> Bean 저장
				bb.setContent(rs.getString("content"));
				bb.setDate(rs.getDate("date"));
				bb.setFile(rs.getString("file"));
				bb.setIp(rs.getString("ip"));
				bb.setName(rs.getString("name"));
				bb.setNum(rs.getInt("num"));
				bb.setPass(rs.getString("pass"));
				bb.setRe_lev(rs.getInt("re_lev"));
				bb.setRe_ref(rs.getInt("re_ref"));
				bb.setRe_seq(rs.getInt("re_seq"));
				bb.setReadcount(rs.getInt("readcount"));
				bb.setSubject(rs.getString("subject"));
				
				// Bean -> ArrayList 한칸에 저장
				boardList.add(bb);
				
			}//while 끝
			
			System.out.println(" 게시판 모든정보 저장완료! ");
			System.out.println(" 총 "+boardList.size()+"개");		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeDB();
		}		
		
		return boardList;
	}
	// getBoardList(startRow,pageSize)
	
	// updateReadcount(num)
	public void updateReadcount(int num){
		
		try {
			//1,2 디비연결
			conn = getConnection();
			
			//3 sql 구문 작성(update) & pstmt 객체
			sql = "update itwill_board set readcount=readcount+1 "
					+ "where num=?";
			
			pstmt = conn.prepareStatement(sql);
			
			//?
			pstmt.setInt(1, num);
			
			//4 sql 실행
			pstmt.executeUpdate();
			
			System.out.println(" 글 조회수 증가 완료! ");			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
	}
	// updateReadcount(num)
	
	// getBoard(num)
	public BoardBean getBoard(int num){
		BoardBean bb = null;
		try {
			// 1,2 디비연결
			conn = getConnection();
			// 3 sql 작성(select) & pstmt 객체 
			sql = "select * from itwill_board where num=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			// 4 sql 실행
			rs = pstmt.executeQuery();
			
			// 5 데이터 처리 (bean 저장)
			if(rs.next()){
				bb = new BoardBean();
				
				bb.setContent(rs.getString("content"));
				bb.setDate(rs.getDate("date"));
				bb.setFile(rs.getString("file"));
				bb.setIp(rs.getString("ip"));
				bb.setName(rs.getString("name"));
				bb.setNum(rs.getInt("num"));
				bb.setPass(rs.getString("pass"));
				bb.setRe_lev(rs.getInt("re_lev"));
				bb.setRe_ref(rs.getInt("re_ref"));
				bb.setRe_seq(rs.getInt("re_seq"));
				bb.setReadcount(rs.getInt("readcount"));
				bb.setSubject(rs.getString("subject"));
			}
			
			System.out.println(" 글번호에 해당하는 글정보 저장완료! ");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
		return bb;
	}
	// getBoard(num)
	
	
	
	

}//DAO 끝
