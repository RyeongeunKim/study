import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//주제 :  FileInputStream클래스를 이용한 도스의 Type프로그램 만들기 

//도스로 실행하는 방법
//예) DOS명령어 중에서 Type프로그램을 통해서 텍스트 파일의 내용을 읽어들일수 있음
//방법
//순서1) 시작메뉴클릭-> cmd입력후 -> 도스창을 열어 준다.
//순서2) A.txt파일이 존재 하는 위치 D:로 이동 한다.
//순서3) type프로그램을 통해 A.txt파일의 내용을 읽어 들여 도스 창에 출력 한다.
//      소스코드 ->   type 텍스트파일명 [엔터키]
//                  type A.txt [엔터키]
//D:\>type A.txt
//szdfczxczxczx
//czxczxczxczx

//Dos의  Type프로그램과 유사한 JType프로그램 만들어서 사용해보기 
public class JType {
	public static void main(String[] args) throws IOException {
		/*
			주기억장치 : 프로그램은 실제 주기억장치에 존재한다.
					   그러므로 실제  CPU는 주기억장치를 통해서 프로그램에 접근하여 사용함.
			
			보조기억장치(usb,외장하드) :
			CPU가 사용할수 없는 파일이 들어 있는 장치 
			
			결론 : CPU는 보조기억장치에 직접 접근 할수 없으므로
			      보조기억장치에 있는 파일을  주기억장치 메모리에 올려놓기(로드)위해..
			      주기억장치 내부에 파일이 저장될수 있는 메모리 공간 만들기
			      -> FileInputStream클래스에 대한 객체메모리 생성 
		
			주기억 장치에 읽어오기위한 파일을 저장할수 있는 메모리 공간을 마련하기 위해 객체 생성
			어떤? 파일을 주기억장치에 올릴 것인가에 대해서 생성자 매개변수로 전달 할수 있는 방법
			1번. 직접 파일을 불러 올수 있는 주소를 적는 방법
			2번. 명령 인자를 통해 불러 올수 있는 파일을 입력 받는 방법
		 */
		
		//2번. 경우
		//우리가 입력한 파일의 내용을 바이트 단위로 읽어들일 스트림 통로 객체 생성
		FileInputStream fis = new FileInputStream(args[0]);
		
		//파일의 내용을 한바이트씩 읽어 들여 저장할 변수 
		int i;
		
		//한바이트씩 파일의 내용을 읽어 들이기 위해 do While반복문 사용
		do {
			i = fis.read();//한바이트 읽어 들이기 
			
			//만약 읽어 들일 데이터가 존재 한다면?(i변수의 값이 -1과 같지 않다면)
			if(i != -1 ) {
				//읽어 들인 데이터를 바로 콘솔에 출력
				System.out.println((char)i);
			}
		//파일로부터 읽어들일 데이터가 존재할때 까지 반복
		}while(i != -1);
		
		//FileInputStream객체 메모리 자원해제
		fis.close();
		
	}
	
	//참고 : read()메소드의 반환값 -1이란? 
	//      FileInputStream통로를 통해서 더이상 읽어 들일 데이터가 존재 하지 않으면 반환되는 값

}









