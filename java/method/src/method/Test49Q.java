package method;

// 사용자 정의 메소드 만들기 : 개발자가 필요할 때 마다 새롭게 기능을 추가하여 만드는 메소드

public class Test49Q {

// 방법1. 매개변수가 없고 리턴값이 없는 메소드 만들기
	//메소드 이름 : hello_func
	//기능 "Hello World"<--출력
	

	

		
// 방법2. 매개변수가 있고 리턴할 값이 없는 메소드 만들기
	//메소드 이름 : sum 매개변수 : n
	//기능 : 매개변수로 전달 받은 값 까지의 자연수의 합을 구하는 기능
	//매개변수로 전달 받은 자연수 까지의 합을 저장할 tot변수
	//for반복문의 초기식을 밖으로 빼서 변수 선언
	//숫자 1부터 n매개변수로 전달받은 숫자까지의 합을 tot변수에 누적
	//구해진 누적합 출력
	

	

	
// 방법3. 메소드 호출 시 매개변수와 리턴값이 있는 메소드만들기
	//메소드 이름 : abs 매개변수 : data
	//기능 : 매개변수로 전달 받은 값의 절대값을 구해 절대값을 되돌려주는 기능의 메소드
	//절대값 구하는 기능을 코드로 구현
	//abs메소드를 호출한 장소로 연산한 절대값을 되돌려주기(리턴하기, 반환하기)
	

	
	//메소드를 호출 하는 곳
	public static void main(String[] args) {
		
	//메소드 호출 하기
		
		//요약 : abs메소드 호출 시 -10을 전달하여 연산된 절대값을 반환하여 출력
		

		
		//"Hello World!" 출력하기 위해 hello_func()메소드 호출!

		

		// 요약 : sum메소드 호출 시 5를 전달하여 1 ~ 5까지의 누적 합을 계산하여 출력
		



	}

}
