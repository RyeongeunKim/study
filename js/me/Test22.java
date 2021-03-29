

// if		if else		조건문 연습문제2
// else if문을 사용안하고 if문을 따로 적을 경우 앞의 조건식이 참이라도 다음 구문을 무조건 실행한다 / 앞이 참이면 else구문은 실행 X
// else if문의 경우 앞의 조건이 참일 경우 다음 구문을 실행하지 않고 빠져나온다

public class Test22 {

	public static void main(String[] args) {
		
		String myJob1 = "홍길동", myJob2 = "이순신", myJob3 = "이성계", myJob4 = "정도전";
		
		if (myJob1 == "홍길동") {
			System.out.println("홍길동은 의적");
		}
		
		if (myJob2 == "이순신") {
			System.out.println("이순신은 장군");
		}
		
		if (myJob3 == "이성계") {
			System.out.println("이성계는 왕");
		}
		
		else {
			System.out.println("정도전 책사");
		}

	}

}
