
import java.util.Date; //java폴더내부의 util폴더내부의 Date.java파일의 Date클래스를 
					   //현재 Test67.java내부에서 사용하기 위해 
					   //항상~  import java.util.Date 구문을 작성 해 놓아야 한다.


/*
	메소드 오버로딩 ?
	
	오버로딩? : 이미 존재하는 이름이 동일한 것을 다시 재정의 한다는 의미.

	메소드 오버로딩? : 동일한 이름의 메소드를 클래스 내부에 여러번 정의하는것.
	
	동일한 이름의 메소드를 여러번 정의(메소드 오버로딩) 가능한 이유?
	- 동일한 이름의 메소드가 호출되더라도
	  전달 인자의 자료형이나  개수로 해당 메소드를 구분해서 호출할 수 있기 때문임.
	  
	메소드 오버로딩 규칙
	-> 동일한 이름의 메소드 일지라도....
	   1.메소드의 전달인자의 자료형,
	   2.메소드의 전달인자 개수
	   등이 달라야 한다. 
*/
public class Test67 {
	public static void main(String[] args) {
		//오버로딩되어 있는 메소드들 호출 해보기
		System.out.println(true); //논리값 출력
		System.out.println('A');//문자 출력
		System.out.println(128);//정수 출력
		System.out.println(3.5);//실수 출력
		System.out.println("Hello");//문자열 출력 
		/*
		 결론: 화면 출력을 위한 메소드는 println()하나인데..
		       메소드가 여러 출력 동작을 하고 있습니다.
		       논리값, 문자, 정수,실수, 문자열 등 여러 출력을 합니다. 
		 */
		//println()메소드가 여러 출력할수 있는 이유?????????
		//-> 메소드호출시 전달 받는 인자의 자료형을 달리 하여 메소드를 여러번 정의 해 놓았기 때문
		
		//자바 API Document문서에서
		//java.io.PrintStream.println메소드를 찾아 봅시다.
		//println()
		//println(boolean x)
		//println(char x)
		//....
		//println(int x)
		//등등 메소드들이 PrintStream클래스 내부에 메소드 오버로딩 되어 있음
		//--------------------------------------------------------------
		//쉬어가기~~~
		//System.out.println() 해석
		//1. java.lang패키지는 자바에서 기본으로 제공되는 패키지 이기때문에
		//   자동으로 사용가능하게 import(추가)된다.
		//   정확히 자바 컴파일러가 import문을 추가 해준다.
		//2. System클래스는 java.lang패키지에 속해 있는 클래스 이다.
		//   따라서 import 문을 작성 하지 않고 바로 사용할수 있다.
		//3. java.lang.System클래스 내부에 존재하는
		//    PrintStream클래스타입의 out이라는 참조변수가 static구문으로 선언되어 있다.
		//	  이 out참조변수 내부에는 PrintStream객체의 주소가 저장되어 있다.
		//    그러므로 PrintStream객체가 가지고 있는 println()메소드를 호출 하여 사용하는 것임
		
		
		
		
		
		
		
		
		

	}

}

