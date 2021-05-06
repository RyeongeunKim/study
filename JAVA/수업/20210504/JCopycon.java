import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//주제 : 키보드로부터 입력받아서... 그내용을 파일을 생성해서 저장하는
//      JCopycon프로그램(JCopycon.class) 만들기

public class JCopycon {
	public static void main(String[] args) throws IOException {
		
		//키보드로 부터 입력 받은 내용을 읽어 들여서 
		//바이트단위로 파일에 출력(쓰기,내보기)할 출력 스트림 통로 객체 생성
		FileOutputStream fos = new FileOutputStream(args[0]);

		//inputStream통로를 통해서 한번씩 읽어 들인 바이트 데이터를 저장할 변수
		int i;
		
		System.out.println("문자열 입력 :");
		
		do {	
			//키보드로 부터 입력받은 데이터중 1바이트씩 읽어와 i변수에 저장
			i = System.in.read();
		
			//키보드로 부터 입력 받아 읽어 들인 데이터(i변수에 저장된 값)를 
			//위 FileOutPutStream 출력스트림 통로를 통해  파일에 내보내기(출력하기, 쓰기)
			fos.write(i);
			
		}while(i != -1);//키보드로 부터 입력 받은 전체 데이터중.. 계속 읽어 들인 값이 존재할동안 반복
			
		//스트림 통로 자원해제
		fos.close();	
	}//main
}//클래스 



