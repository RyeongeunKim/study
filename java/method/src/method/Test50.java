package method;


//메소드 호출 예제
public class Test50 {
	
	// 주제 : 두개의 데이터를 매개변수로 전달받아 사칙연산을 수행하는 메소드들 만들기
	
	// 1. 메소드 이름 : addPrint
	//    매개 변수 : long a, long b
	//    기능 : 매개변수로 전달 받은 두 데이터의 합의 연산결과를 바로 출력
	
	public static void addPrint(long a, long b) {
		System.out.println(a + b);
	}
	
	// 2. 메소드 이름 : add
	//    매개 변수 : long a, long b
	//    기능 : 매개변수로 전달 받은 두 데이터의 합의 연산결과값(long데이터)를 메소드를 호출한 장소로 리턴
	
	public static long add(long a, long b) {
		return a + b;
	}
	
	// 3. 메소드 이름 : subPrint
	//    매개 변수 : long a, long b
	//    기능 : 매개변수로 전달 받은 두 데이터의 차의 연산결과를 바로 출력
	
	public static void subPrint(long a, long b) {
		System.out.println(a - b);
	}
	
	// 4. 메소드 이름 : sub
	//    매개 변수 : long a, long b
	//    기능 : 매개변수로 전달 받은 두 데이터의 차의 연산결과값(long데이터)을 메소드를 호출할 장소로 리턴
	
	public static long sub(long a, long b) {
		return a - b;
	}
	
	// 5. 메소드 이름 : multiPrint
	//    매개 변수 : long a, long b
	//    기능 : 매개변수로 전달 받은 두 데이터의 곱의 연산결과값을 바로 출력
	
	public static void multiPrint(long a, long b) {
		System.out.println(a * b);
	}
	
	// 6. 메소드 이름 : multi
	//    매개 변수 : long a, long b
	//    기능 : 매개변수로 전달 받은 두 데이터의 곱의 연산결과값(long데이터)을 메소드를 호출한 장소로 리턴
	
	public static long multi(long a, long b) {
		return a * b;
	}
	
	// 7. 메소드 이름 : divPrint
	//    매개 변수 : long a, long b
	//    기능 : 매개변수로 전달 받은 두 데이터의 나눗셈 연산결과값을 바로 출력
	
	public static void divPrint(long a, long b) {
		long result = a / b;
		System.out.println(result);
	}
	
	// 8. 메소드 이름 : div
	//    매개 변수 : long a, long b
	//    기능 : 매개변수로 전달 받은 두 데이터의 나눗셈 연산결과값(long데이터)을 메소드를 호출한 장소로 리턴
	
	public static long div(long a, long b) {
		long result = a / b;
		return result;
	}

	public static void main(String[] args) {
		// add메소드 호출 시..long데이터로 6과 3을 순서대로 전달 하여 
		// add메소드 내부의 연산 결과를 리턴 받아 출력
		
		//System.out.println(add(6,3); //int형은 long형 보다 작기에 6, 3 가능
		System.out.println(Test50.add(6L,3L)); 
		
		// addPrint 메소드 호출 시..long데이터로 6과 3을 순서대로 전달 하여
		// addPrint 메소드 내부의 연산 결과를 addPrint메소드 내부에서 바로 출력

		addPrint(6,3);
		
		

	}

}
