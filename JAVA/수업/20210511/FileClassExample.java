import java.io.File;

/*
	File클래스 
	- java.io.File
	
	- File클래스는 물리적으로 존재하는 파일을 삭제, 디렉터리 생성등 파일 관리 작업을 지원하는 클래스 
	
	- 파일을 읽고 쓰는 작업을 하는 스트림통로 역할의 클래스는?
	  FileInputStream,
	  FileOutputStream,
	  FileReader,
	  FileWriter
	  등의 파일 입출력 스트림을 이용하고 File클래스는 이들 스트림객체를 생성할때
	  파일이 있는 경로를 전달 하기 위해 사용하는 클래스이다.	

   실습 순서
   순서1)  C:\\Temp폴더 임의로 만들기
   순서2)  C:\\Temp폴더 내부에  ReadMe.txt파일과 FileInfo.txt파일 만들기 

*/
public class FileClassExample {

	public static void main(String[] args) {
		
		try {
			//C:\\Temp폴더 내부에 있는 ReadMe.txt파일에 접근하여 조작하기 위해 File객체 생성
			File f = new File("C:\\Temp", "ReadMe.txt");
			
			//File객체를 통해 파일명을 얻어와 출력
			System.out.println( f.getName() ); //ReadMe.txt
			
			//File객체를 통해 C:\\Temp폴더내부에 파일이 하나라도 존재하는지 묻는 메소드 호출
			//파일이 존재하면 true반환, 존재하지 않으면 false반환
			System.out.println( f.exists() ); //true
			
			//File객체를 통해 접근 하는 ReadMe.txt파일의 경로를 알려주는 메소드 호출
			System.out.println( f.getPath() ); //C:\Temp\ReadMe.txt
			
			//File객체를 통해 접근 하는 ReadMe.txt파일의 크기를 알려주는 메소드 호출
			System.out.println( f.length()  ); //0
			
			//현재 운영체에서 사용하는 경로를 구분하는 경로 구분자를 알려주는 상수 호출
			//윈도우 운영체제의 구분자는  \    
			//유닉스 운영체제 계열의 구분자는 /
			System.out.println( f.separator  ); //    \
			
			//C:\\Temp폴더내부에 존재하지 않는 aaa폴더 생성하는 메소드 호출
			//폴더 생성에 성공하면 true반환 하고 실패하면 false반환 하는 메소드 이다.
			boolean b = new File("C:\\Temp\\aaa").mkdir();
			//System.out.println(b);
			
			//C:\\Temp폴더내부에 있는 FileInfo.txt파일 삭제 시키는 메소드 호출 
			//파일 삭제에 성공하면 true반환 하고 실패하면 false반환 하는 메소드 이다.
			boolean b2 = new File("C:\\Temp", "FileInfo.txt").delete();
			//System.out.println(b2);
			
			//C:\\Temp폴더내부에 있는~ 파일 및 폴더 정보들을 문자열 배열에 담아 반환 하는 메소드 호출
			String[] list = new File("C:\\Temp").list();
			
			//for반복문을 이용하여 C:\\Temp폴더 내부에 존재하는 파일 및 폴더 정보를 
			//위 String배열에서 꺼내와서 출력
			for(int i=0; i<list.length; i++) {
				
				System.out.println("Temp폴더내부의 정보 : " + list[i]);
//				Temp폴더내부의 정보 : aaa
//				Temp폴더내부의 정보 : ReadMe.txt
				
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}







