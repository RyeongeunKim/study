package method;
/*
	
	JVM 메모리 구조
	
	Test52.java 
	-> Test52.class 자바프로그램 
	-> JVM가상머신이 실행 시? 
	-> JVM메모리는 운영체제에 의해 필요한 메모리를 할당 받음
	
	JVM 메모리 영역 3가지
	1. 메소드 영역 : .class파일 실행 시 JVM이 읽어서 .class파일이 저장되는 영역
	2. 호출스택 영역 : 호출되는 메소드들이 계속 쌓이는 영역
					순서1. 메소드 호출 시 큰 메모리 할당(메소드 내의 연산결과들이 저장되는 곳)
					순서2. 메소드 작업 후 할당된 메모리 공간을 JVM에 의해 사라짐
	3. 힙 영역 : 클래스 -> 객체메모리 생성하면 객체메모리가 올라가는 공간

*/

// 메소드 호출 시 JVM 메모리 순서 알아보기
public class Test52 {
	
	//프로그램을 가동시키는 역할을 하는 main메소드
	public static void main(String[] args) {
		System.out.println("main(String[] args)메소드가 호출되어 시작됨");
		firstMethod();	
		System.out.println("main(String[] args)메소드의 모든 코드를 실행 후 끝났음");
	}
	
	public static void firstMethod() {
		System.out.println("firstMethod()메소드가 호출되어 시작됨");
		secondMethod();
		System.out.println("firstMethod()메소드의 코드 실행 후 끝났음");
	}
	
	public static void secondMethod() {
		System.out.println("secondMethod()메소드가 호출되어 시작됨");
		System.out.println("secondMethod()메소드의 코드 실행 후 끝났음");
	}


}
