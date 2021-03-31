
/*
	클래스 내부의 멤버변수 초기화 방법(멤버변수에 값을 저장하는 방법)
	1. 명시적 초기화(개발자가 직접 코드를 작성해서 저장 int a = 10; static int b = 100;)
	2. 객체 생성 시 생성자를 호출해 초기화(new A(10);)
	3. 초기화 블럭을 이용
	   1> 클래스 변수의 값을 초기화 시키는 (클래스변수 초기화 블럭)
	      static{
	      
	      }
	   2> 인스턴스 변수의 값을 초기화 시키는 (인스턴스변수 초기화 블럭)
	      {
	      
	      }
*/

public class Test74 {
	
	//1. 명시적 초기화
	int door = 4;
	
	//2. 생성자를 이용한 초기화
	public Test74() {
		System.out.println("생성자를 이용한 변수값 초기화");
	}
	
	//3. 초기화 블럭을 이용한 변수의 값 초기화
	//1>클래스 초기화 블럭이용
	static {
		System.out.println("호출순서알아보기");
		System.out.println("static{클래스초기화블럭사용}");
	}
	//2>인스턴스 초기화 블럭이용
	{
		System.out.println("{인스턴스초기화블럭사용}");
	}
	
	public static void main(String[] args) {
		System.out.println("main메소드로 진입하여! Test74 test74 = new Test74();객체생성");
		Test74 test74 = new Test74();
		
		System.out.println("main메소드로 진입하여! Test74 test75 = new Test74();객체생성");
		Test74 test75 = new Test74();
	}
	
	/*
		Test74.class파일을 JVM이 실행하면서 JVM메모리에 로딩될 때 호출 순서
		순서1) static{ } 클래스변수 초기화블럭
		순서2) static main() 메소드가 호출됨
		순서3) { }인스턴스변수 초기화블럭
		순서4) 객체 생성시 호출되는 생성자 실행!
		
		실행결과로 알 수 있는 것
		=> 클래스 변수 초기화 블럭은 처음 JVM메모리에 로딩될 때 한번만 수행되었지만,
		   인스턴스 초기화 블럭은 인스턴스가 생성될 때 마다 수행된다.

	*/
}
