import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//-----------바이트스트림 방식을 대표로 하는 두가지 최상위 클래스
//1. InputStream 클래스(최고 부모클래스, 추상클래스)
//2. OutputStream 클래스(최고 부모클래스, 추상클래스)

public class Test142 {
	
	//키보드로 부터 입력받은  데이터를  바이트단위로 읽어 들이기 위한 InputStream객체와
	//읽어들인 데이터를 바이트 단위로 출력하기 위한 OutStream객체를 매개변수로 전달 받아 사용하는 메소드 만들기
	public static void streamTest(InputStream is, OutputStream os) {
		try {
			//매개변수로 전달 받은 InputStream통로역할을 하는 객체의 메소드를 이용해서 
			//반복해서 입력받은 데이터를 바이트 단위로 읽어 들이자
			while (true) {//무한반복
				//키보드로 부터 하나의 키를 눌러 읽어 들인 정수(아스키코드값) 얻기
				int i = is.read();
				
				if(i == -1) {//입력한 데이터들중에 더이상 읽어들일 데이터가 없으면?
					break; //while반복문 빠져나가자
				}
				//키보드로 부터 읽어 들인 데이터를 이클립스의 console창에 출력
				//아스키코드값을 문자열로 변환하여 출력 (한글이 깨져서 보일 것임)
				//System.out.print( (char)i );
				
				os.write(i); //한글이 깨지지 않고 출력됨 
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
		
	public static void main(String[] args) {
	
		//streamTest메소드 호출시...
		//System.in : 키보드로 부터 입력받은 데이터를 바이트 단위로 읽어들이기 위해 사용되는 InputStream객체
		//System.out : 읽어들인 데이터를 바이트 단위로 모니터화면에 출력 하기 위해 사용되는 OutputStream객체
		 streamTest(System.in, System.out);

	}

}





