package method;

//사용자 정의 메소드 만들기 연습
public class Test48 {

//메소드를 만들어 보자.
//메소드를 만드는건 main영역 밖에 만들고 사용하는건 안에서 호출하면 된다.

	// 메소드이름 : javaSpeak
	// 기능 : "쉬운 자바!" 출력하는 기능

	public static void javaSpeak() {
		System.out.println("쉬운 자바!");
	}

	// 메소드이름 : absTest
	// 기능 : "절대값을 구하는 메소드" 출력하는 기능

	public static void absTest() {
		System.out.println("절대값을 구하는 메소드");
	}

	// 메소드이름 : move
	// 기능 : "이동하라!" 출력 하는 기능

	public static void move() {
		System.out.println("이동하라!");
	}

	public static void main(String[] args) {

		// 위에 만들어 놓은 javaSpeak메소드 호출하여 그 기능이 실행되도록 하기
		//클래스명.메소드명으로 호출
		Test48.javaSpeak(); //앞에 static이 붙어있을 경우 클래스명 생략가능

		// absTest메소드, move메소드 각각 호출하여 그 기능이 실행되도록 하기
		// 메소드명으로 호출
		absTest();
		move();

	}

}
