import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
  	[ InputStreamReader 클래스의 단점 ]
  	: 한문자(한글자)씩 데이터를 읽어 들이면 장치와 프로그램 사이의 입출력 횟수가 많아진다.
  	  그러면 프로그램의 성능이 떨어진다.
  	  
  	[ InputStreamReader 클래스의 단점을 보완해서 나온 클래스 ] -> BufferedReader클래스로 다시 포장
  	
  	[ BufferedReader클래스 ]
  	: InputStreamReader 메모리에 읽어들인 데이터를 모아 두었다가 한꺼번에 한번만 데이터를 읽어 들이기 위한 스트림통로
  	: 추가된 주요 메소드
  	  readLine() 메소드 : 한줄씩 데이터를 읽어 들이기 위한 메소드(여러개의 문자를 모아 두었다가 한번에 읽어 들임)
*/

public class CharstreamEx01_1 {

	public static void streamTest(InputStream is) {
		
		//바이트스트림 방식(1바이트씩 데이터를 읽어들이는 방식) -> InputStream객체
		//문자스트림 방식(2바이트씩 데이터를 읽어들이는 방식) -> InStreamReader객체
		//여러개의 문자단위로 읽어들인 데이터들을 내부버퍼공간에 모아 두었다가 한꺼번에 읽어들이는 방식 -> BufferedReader객체
		BufferedReader isr = new BufferedReader(new InputStreamReader(is));
		
		try {
			while(true) {
				//여러개의 문자를 내부버퍼에 보관해 두었다가 한줄씩 읽어 들인다.
				String str = isr.readLine(); //만약 읽어 들일 줄이 없다면 null을 리턴함
				
				if(str == null) {
					break;
				}
				
				System.out.println(str);//키보드로 부터 입력받아 읽어들인 문자열 출력
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		streamTest(System.in);

	}

}
