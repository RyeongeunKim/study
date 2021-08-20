package method;

//사용자 정의 메소드 만들기 연습
public class Test51 {
	
	//메소드 이름 : hiEveryone
	//매개변수 X, 리턴값 X
	//기능 : "출근 start!" 출력
	
	public static void hiEveryone() {
		System.out.println("출근 start!");
	}
	
	//메소드 이름 : hiEveryoneend
	//매개변수 X, 리턴값 X
	//기능 : "동료와 마주쳤습니다" 출력
	
	public static void hiEveryoneend() {
		System.out.println("동료와 마주쳤습니다");
	}
	
	//메소드 이름 : hiEveryone
	//매개변수 O -> 정수형(4) age
	//기능
	//"좋은 아침입니다"
	//"제 나이는 13세 입니다"
	//"잘 부탁드립니다" 출력
	
	public static void hiEveryone(int age) {
		System.out.println("좋은 아침입니다");
		System.out.println("제 나이는 " + age + "세 입니다");
		System.out.println("잘 부탁드립니다");
	}
	
	//메소드 이름 : byEveryone
	//매개변수 X
	//기능
	//"오늘 수고 많으셨습니다" 출력
	//리턴할값 O -> "다음에 뵙겠습니다"
	
	public static String byEveryone() {
		System.out.println("오늘 수고 많으셨습니다.");
		return "다음에 뵙겠습니다";
	}
	

	public static void main(String[] args) {
		/*
			출력결과
			출근 Start!
			동료와 마주쳤습니다.
			좋은 아침입니다.
			제 나이는 13세 입니다.
			잘 부탁드립니다.
			오늘 수고 많으셨습니다.
			다음에 뵙겠습니다.

		*/
		
		hiEveryone();
		hiEveryoneend();
		hiEveryone(13); //메소드 오버로딩: 매개변수를 달리 해서 똑같은 이름의 메소드를 여러 개 만들 수 있다
		
		//System.out.println(byEveryone());
		String value = byEveryone(); // byEveryone메소드를 호출하면 
									 // 1. 오늘도 수고 많으셨습니다 출력
									 // 2. 다음에 뵙겠습니다 리턴(반환, 되돌려줌)받아 value변수에 저장
		System.out.println(value);
		
		
	}

}
