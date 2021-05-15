package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class BoardDAOBack {

	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	//데이터 베이스의 커넥션풀을 사용하도록 설정하는 메소드
	public void getCon(){
		
		try {
			Context initctx = new InitialContext();
			Context envctx = (Context)initctx.lookup("java:comp/env");
			DataSource ds = (DataSource) envctx.lookup("jdbc/mysqlDB");
			//datasource
			con = ds.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//하나의 새로운 게시글이 넘어와서 저장되는 메소드
	public void insertBoard(BoardBean bean){
		
		getCon();
		
		//빈클래스에 넘어오지 않았던 데이터들을 초기화
		int ref=0; //글그룹 의미 = 쿼리를 실행시켜서 가장 큰 ref값을 가져온 후 +1을 더해주면 됨
		int re_step=1; //새글이기에 = 부모글이기에
		int re_level=1;
		
		try {
			//가장 큰 ref값을 읽어오는 쿼리 준비
			String refsql = "select max(ref) from board";
			//쿼리실행 객체
			pstmt = con.prepareStatement(refsql);
			//쿼리실행 후 결과를 리턴
			rs = pstmt.executeQuery();
			if(rs.next()){//결과 값이 있다면
				ref = rs.getInt(1)+1; //최대값에 +1을 더해서 글그룹을 설정
			}
			//실제로 게시글 전체값을 테이블에 저장
			String sql = "insert into board values(?,?,?,?,?,now(),?,?,?,0,?)";
			pstmt = con.prepareStatement(sql);
			//?에 값을 맵핑
			pstmt.setInt(1, bean.getNum());
			pstmt.setString(2, bean.getWriter());
			pstmt.setString(3, bean.getEmail());
			pstmt.setString(4, bean.getSubject());
			pstmt.setString(5, bean.getPassword());
			pstmt.setInt(6, ref);
			pstmt.setInt(7, re_step);
			pstmt.setInt(8, re_level);
			pstmt.setString(9, bean.getContent());
			//쿼리를 실행하시오.
			pstmt.executeUpdate();
			//자원반납
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//BoardInfo하나의 게시글을 리턴하는 메소드
	public BoardBean getOneBoard(int num){
		
		//리턴타입 선언
		BoardBean bean = new BoardBean();
		getCon();
		
		try {
			//조회수 증가쿼리
			String readsql = "update board set readcount = readcount+1 where num=?";
			pstmt = con.prepareStatement(readsql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			
			//쿼리준비
			String sql="select * from board where num=?";
			//쿼리실행객체
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			//쿼리실행 후 결과를 리턴
			rs = pstmt.executeQuery();
			if(rs.next()){
				bean.setNum(rs.getInt(1));
				bean.setWriter(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setSubject(rs.getString(4));
				bean.setPassword(rs.getString(5));
				bean.setReg_date(rs.getDate(6).toString());
				bean.setRef(rs.getInt(7));
				bean.setRe_step(rs.getInt(8));
				bean.setRe_level(rs.getInt(9));
				bean.setReadcount(rs.getInt(10));
				bean.setContent(rs.getString(11));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bean;
	}
	
	//답변글이 저장되는 메소드
	public void reWriteBoard(BoardBean bean){
		//부모글그룹과 글레벨 글스텝을 읽어들임
		int ref = bean.getRef();
		int re_step = bean.getRe_step();
		int re_level = bean.getRe_level();
		
		getCon();
		
		try {
		///////////////핵심 코드 //////////////////
			//부모 글보다 큰  re_level의 값을 전부 1씩 증가시켜줌
			String levelsql = "update board set re_level = re_level+1 where ref=? and re_level > ?";
			//쿼리실행객체 선언
			pstmt = con.prepareStatement(levelsql);
			pstmt.setInt(1, ref);
			pstmt.setInt(2, re_level);
			//쿼리 실행
			pstmt.executeUpdate();
			//답변글 데이터를 저장
			String sql = "insert into board values(?,?,?,?,?,now(),?,?,?,0,?)";
			pstmt = con.prepareStatement(sql);
			//?에 값을 대입
			pstmt.setInt(1, bean.getNum());
			pstmt.setString(2, bean.getWriter());
			pstmt.setString(3, bean.getEmail());
			pstmt.setString(4, bean.getSubject());
			pstmt.setString(5, bean.getPassword());
			pstmt.setInt(6, ref); //부모의 ref값을 넣어줌
			pstmt.setInt(7, re_step+1); //답글이기에 부모 글 re_step에 1을 더해줌
			pstmt.setInt(8, re_level+1);
			pstmt.setString(9, bean.getContent());
			
			pstmt.executeUpdate();
			con.close();
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//boardupdate용 Delete시 하나의 게시글을 리턴
	public BoardBean getOneUpdateBoard(int num){
		
		//리턴타입 선언
		BoardBean bean = new BoardBean();
		getCon();
		
		try {		
			//쿼리준비
			String sql="select * from board where num=?";
			//쿼리실행객체
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			//쿼리실행 후 결과를 리턴
			rs = pstmt.executeQuery();
			if(rs.next()){
				bean.setNum(rs.getInt(1));
				bean.setWriter(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setSubject(rs.getString(4));
				bean.setPassword(rs.getString(5));
				bean.setReg_date(rs.getDate(6).toString());
				bean.setRef(rs.getInt(7));
				bean.setRe_step(rs.getInt(8));
				bean.setRe_level(rs.getInt(9));
				bean.setReadcount(rs.getInt(10));
				bean.setContent(rs.getString(11));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bean;
	}
	
	//update와 delete 시 필요한 패스워드값을 리턴해주는 메소드
	public String getPass(int num){
		//리턴할 변수 객체 선언
		String pass = "";
		getCon();
		
		try {
			//쿼리준비
			String sql = "select password from board where num=?";
			//쿼리실행할 객체 선언
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			//패스워드값을 저장
			if(rs.next()){
				pass = rs.getString(1);
			}
			//자원 반납
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pass;
	}
	
	//하나의 게시글을 수정하는 메소드
	public void updateBoard(BoardBean bean){
		
		getCon();
		
		try {
			//쿼리 준비
			String sql = "update board set subject=?, content=? where num=?";
			pstmt = con.prepareStatement(sql);
			
			//?값을 대입
			pstmt.setString(1, bean.getSubject());
			pstmt.setString(2, bean.getContent());
			pstmt.setInt(3, bean.getNum());
			
			pstmt.executeUpdate();
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//하나의 게시글을 삭제하는 메소드
	public void deleteBoard(int num){
		
		getCon();
		
		try {
			//쿼리준비
			String sql = "delete from board where num=?";
			pstmt = con.prepareStatement(sql);
			//?
			pstmt.setInt(1, num);
			//쿼리 실행
			pstmt.executeUpdate();
			//자원 반납
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//deleteBoard
	
	//전체 글의 갯수를 리턴하는 메소드
	public int getAllCount(){
		
		getCon();
		//게시글 전체 수를 저장하는 변수
		int count = 0;
		
		try {
			//쿼리준비
			String sql = "select count(*) from board";
			//쿼리를 실행할 객체 선언
			pstmt = con.prepareStatement(sql);
			//쿼리 실행 후 결과를 리턴
			rs = pstmt.executeQuery();
			if(rs.next()){
				count = rs.getInt(1); //전체 게시글수
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}//getAllCount
	
	public ArrayList getBoardList(){
		// DB데이터 1row 정보를 BoardBean 저장 -> ArrayList 한칸에 저장
		
		// 게시판의 글정보를 모두 저장하는 가변길이 배열
		ArrayList boardListAll = new ArrayList();
		getCon();
		try {
			// 쿼리준비
			String SQL = "select * from board";
			
			// 쿼리실행 객체
			pstmt = con.prepareStatement(SQL);
			
			// 쿼리를 실행 후 결과를 저장
			rs = pstmt.executeQuery();
			
			// 데이터처리 
			while(rs.next()){	
				// DB정보 -> Bean 저장
				 BoardBean bean = new BoardBean();
				 bean.setNum(rs.getInt("num"));
				 bean.setWriter(rs.getString("writer"));
				 bean.setEmail(rs.getString("email"));
				 bean.setSubject(rs.getString("subject"));
				 bean.setPassword(rs.getString("password"));
				 bean.setReg_date(rs.getString("reg_date"));
				 bean.setRef(rs.getInt("ref"));
				 bean.setRe_step(rs.getInt("re_step"));
				 bean.setRe_level(rs.getInt("re_level"));
				 bean.setReadcount(rs.getInt("readcount"));
				 bean.setContent(rs.getString("content"));
				
				// Bean -> ArrayList 한칸에 저장
				boardListAll.add(bean);
				
			}//while 끝
			
			System.out.println(" 게시판 모든정보 저장완료! ");
			System.out.println(" 총 "+boardListAll.size()+"개");		
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 	
		
		return boardListAll;
	}
	// getBoardList()
	
	// getBoardList(startRow,pageSize)
	public ArrayList<BoardBean> getBoardList(int startRow,int pageSize){
		// DB데이터 1row 정보를 BoardBean 저장 -> ArrayList 한칸에 저장
		
		// 게시판의 글정보를 원하는만큼 저장하는 가변길이 배열
		ArrayList<BoardBean> boardList = new ArrayList<BoardBean>();

		getCon();
	
		try {
			
			//sql= "select * from itwill_board";
			String SQL = "select * from board "
					+ "order by ref desc, re_level asc"
					+ "limit ?,?";			
			
			pstmt = con.prepareStatement(SQL);
			
			// ?
			pstmt.setInt(1, startRow-1);
			pstmt.setInt(2, pageSize);		
			
			// 4 sql 실행
			rs = pstmt.executeQuery();
			
			// 5 데이터처리 
			while(rs.next()){
				
				// DB정보 -> Bean 저장
				 BoardBean bean = new BoardBean();
				 bean.setNum(rs.getInt("num"));
				 bean.setWriter(rs.getString("writer"));
				 bean.setEmail(rs.getString("email"));
				 bean.setSubject(rs.getString("subject"));
				 bean.setPassword(rs.getString("password"));
				 bean.setReg_date(rs.getString("reg_date"));
				 bean.setRef(rs.getInt("ref"));
				 bean.setRe_step(rs.getInt("re_step"));
				 bean.setRe_level(rs.getInt("re_level"));
				 bean.setReadcount(rs.getInt("readcount"));
				 bean.setContent(rs.getString("content"));
				
				// Bean -> ArrayList 한칸에 저장
				boardList.add(bean);
				
			}//while 끝
			
			System.out.println(" 게시판 모든정보 저장완료! ");
			System.out.println(" 총 "+boardList.size()+"개");		
			
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		return boardList;
	}
	// getBoardList(startRow,pageSize)
	

}
