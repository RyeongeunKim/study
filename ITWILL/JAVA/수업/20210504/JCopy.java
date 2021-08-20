import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//주제 : 파일 복사 프로그램 만들기 
//A파일의 내용을 읽어 들여서  B파일에 A파일의 내용 복사 하기 

public class JCopy {
	public static void main(String[] args) throws IOException {
		//파일의 내용을 읽어 들이기 위한 스트림 객체를 저장할 변수 선언
		FileInputStream fin;
		//파일에 내용을 쓰기 위한 스트림 객체를 저장할 변수 선언
		FileOutputStream fout;
		 
		//cmd명령프롬포터 창에서  명령어를 입력하고 JCopy프로그램을 실행 할때
		//만약 예를 들어 java JCopy 복사할파일.txt	복사당할파일.txt 일 경우....
		//복사할파일.txt를 적어주지 않을수 있으므로..
		//명령 인자에 따른 갯수가 부족할대 .. 예외가 발생할 수 있습니다.
		//그래서 전체를 배열에 관환 예외처리를 해야함.
		try {
			//혹시 읽어 들일 파일이 실제로 존재 하지 않으면 예외 발생 하므로 예외처리 
			try {
				//어떤 특정한 파일의 내용을 읽어들일 스트림 객체 생성
				fin = new FileInputStream(args[0]);	
			}catch (Exception e) {
				System.out.println("파일을 찾을 수 없습니다.");
				return;//파일을 찾을 수 없으니 끝내라 ~
			}
			
			try {
				//어떤 특정한 파일에 데이터를 쓰기(출력)하기 위한 스트림 객체 생성
				fout = new FileOutputStream(args[1]);
			}catch(FileNotFoundException e) {
				System.out.println("파일을 찾을 수 없습니다.");
				return;//파일을 찾을 수 없으니 끝내라~
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("사용법 : java JCopy 원본파일명 복사할파일명");
			//사용법이 틀렸으니 프로그램 종료해라~
			return;
		}
		
		
		//원본 파일의 내용을 읽어 들여서 복사할 파일에 내용 복사
		int i;
		
		try {
			do {
				i = fin.read(); //a.txt파일의 데이터를 한 바이트씩 읽어 들여 저장
				
				//그런데 만약  a.txt파일에 읽어들일 데이터가 존재 하면
				if(i != -1) {
					
					//b.txt파일에 a.txt파일로부터 읽어 들인 데이터를 내보낸다 (출력한다, 쓴다, 저장한다)
					fout.write(i);		
				}			
			}while(i != -1);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//FileInputStream스트림 통로 메모리 자원해제,
			//FileOutputStream스트림 통로 메모리 자원해제 
			//자원해제 이유 : 다른 파일을 열어 볼수 있게 하기 위해
			fin.close();
			fout.close();
			
		}
		
	}//main메소드 

}//JCopy클래스(프로그램)








