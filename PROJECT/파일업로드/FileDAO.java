package file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class FileDAO {
	
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public FileDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/FILE";
			String dbID = "root";
			String dbPassowrd = "1234";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassowrd);
			
		}catch (Exception e) {
			System.out.println("DB연결실패");
			e.printStackTrace();
		}
	}
	

	
	public int upload(String fileName, String fileRealName) {
		
		String sql = "INSERT INTO FILE VALUES(?,?,0)";  //마지막 0은 파일업로드시 업로드하는 파일의 다운로드한 횟수를 말함
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, fileName);//서버에 업로드할 파일의 원본 파일명
			pstmt.setString(2, fileRealName); //실제 서버에 업로드되어 올라가는 실제 파일명
			return pstmt.executeUpdate(); //성공하면 1을 반환
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;//실패하면 -1 반환
	}
	
	//사용자가 파일을 다운로드 할때 마다 다운로드한 횟수을 DB에 업데이트 하기 위한 메소드
	public int hit(String fileRealName) {//다운로드할 파일의 실제 이름을 매개변수로 전달 받기
		
		//사용자가 파일을 다운로드 할때 마다 다운로드한 파일의 다운로드횟수 1증가를 DB에 업데이트 시키기
		String sql = "UPDATE FILE SET downloadCount = downloadCount + 1 "
				   + "WHERE fileRealName = ?";  
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, fileRealName);//실제 서버에 업로드되어 올라가 있는 다운로드시킬 실제 파일명
			return pstmt.executeUpdate(); //파일의 다운로드횟수 1증가에 성공하면 1을 반환
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; //파일의 다운로드횟수 1증가에 실패하면 -1 반환
		
	}
	
	
	
	
	public ArrayList<FileDTO>  AllSelect() {
		
		ArrayList<FileDTO> list = new ArrayList<FileDTO>();
		
		String sql = "SELECT * FROM FILE";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				FileDTO dto = new FileDTO(rs.getString("FILENAME"),rs.getString("FILEREALNAME"),rs.getInt("downloadCount"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	

}








