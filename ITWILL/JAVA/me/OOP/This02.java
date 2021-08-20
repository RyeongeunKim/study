package oop;

	/*
	 	this() 메소드
	 	- 같은 클래스의 다른 생성자 호출 시 사용
	 	- 같은 클래스 내부의 다른 형태의 생성자를 호출하는 this()메소드 알아보기
	 */

class date{
	
	//데이터 은닉변수 연도(year), 월(mont), 일(day)
	private int year;
	private int month;
	private int day;
	
	// 객체변수의 year, month, day의 값을 저장할 생성자
	date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//객체변수의 year, month의 값을 전달받는 생성자
	date(int year, int month){
		//다른 생성자 호출 -> 값을 3개 전달하면 매개변수가 3개인 생성자 호출
		this(year, month, 1);
	}

	//객체변수 year의 값을 전달받는 생성자
	date(int year) {
		//다른 생성자 호출
		this(year, 1, 1);
	}
	
	//기본생성자
	date(){
		//다른 생성자 호출
		this(2016, 1, 1);
	}
	
	//위 객체 변수(인스턴스 변수)의 값들을 출력하는 기능의 메소드
	void print() {
		System.out.println(this.year + "/" + month + "/" + this.day);
	}

}


public class This02 {

	public static void main(String[] args) {
		//1. 객체 생성과 동시에 생성자 호출 시
		//   1988, 8, 30 매개변수로 전달해 객체변수들에 각각 저장
		date d = new date(1988, 8, 30);
		d.print();
		
		//2. 객체 생성과 동시에 생성자 호출 시
		//   1988, 8 매개변수로 전달해 객체변수들에 각각 저장
		date d2 = new date(1988, 8);
		d2.print();
		
		//3. 객체 생성과 동시에 생성자 호출 시
		//   1988을 매개변수로 전달에 객체변수들에 각각 저장
		date d3 = new date(1988);
		d3.print();
		
		date d4 = new date();
		d4.print();

		
		
	}

}
