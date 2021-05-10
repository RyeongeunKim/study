import java.io.InputStream;
import java.io.InputStreamReader;

/*
	문자스트림 방식으로 입출력
	
	문자스트림 방식의 최고 부모클래스
	- Reader추상클래스
	- Writer추상클래스
	
	문자스트림 방식을 사용하는 이유?
	- 한글 입력시 인코딩 X => 데이터스트림에서는 1바이트씩 처리 -> 한글은 2바이트여서 깨져 보임
	- 문자스트림 방식을 데이터를 주고 받으면 2바이트씩 처리하기 때문에 
	  자유롭게 데이터를 읽어 들이거나 내보내는 과정의 속도가 빠르다.
*/

public class CharstreamEx01 {
	
	//바이트 스트림의 최고 조상 InputStream클래스 타입의 참조변수(매개변수)로 받아야함.
	public static void streamTest(InputStream is) {
		
		//바이트 스트림 방식을 문자스트림 방식으로 바꾸는 이유?
		// -> 1바이트 X, 2바이트(한문자)단위로 데이터를 읽어들이기 위해
		//  장점 : 영문 뿐아니라 한글도 읽어 들일 수 있다.
		
		//InputStream객체를 InputStreamReader 객체 생성 시 생성자로 전달 해 저장(포장)
		InputStreamReader isr = new InputStreamReader(is);
		//InputStream클래스의 주요 메소드
		//int read() : 한문자 씩 데이터를 읽어 들이는 메소드
		
		try {
			//매개변수로 전달받아 포장한 InputStreamReader 스트림 객체를 이용하여 
			//키보드로부터 입력받은 데이터를 한문자(2바이트) 단위로 반복해서 읽어 들여 출력
			while(true) {
				//키보드로 부터 한문자(2바이트)단위로 반복해서 읽어 들이자
				int i = isr.read();
				//만약 키보드로 부터 입력받은 데이터 중 읽어들일 데이터가 존재하지 않으면
				//더 이상 읽어들이지 않고 while반복문을 빠져나감
				if(i == -1) {
					break;
				}
				//키보드로부터 입력받은 한문자(2바이트)단위로 출력
				System.out.print((char)i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		//메소드 호출시 바이트 방식으로 데이터를 주고 받을 수 있게 InputStream 객체 전달
		streamTest(System.in);
		

	}

}
