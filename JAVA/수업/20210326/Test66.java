/*
	this()메소드 -> 같은 클래스의 다른 생성자 호출시 사용
	
	주제 : 같은 클래스 내부의 다른 형태의 생성자를 호출하는 this()메소드 알아보기
*/
class MyDate{
	
	private int year;
	private int month;
	private int day;
	
	//객체 생성시..객체변수 year, month, day의 값을 저장할 생성자
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//객체 생성시..객체변수 year, month의 값을 전달받는 생성자
	public MyDate(int year, int month) {
		//다른 생성자 호출
		this(year, month, 1); //값을 3개를 전달하면 매개변수가 3개인 생성자 호출
	}
	
	//객체 생성시..객체변수 year의 값을 전달받는 생성자
	
	public MyDate(int year) {
		//다른 생성자 호출
		this(year, 1, 1);
	}
	//기본생성자
	public MyDate() {
		//다른 생성자 호출
		this(2016, 1, 1);
	}
	
	//위 객체 변수(인스턴스 변수)의 값들을 출력하는 기능의 메소드
	public void print() {
		System.out.println(this.year + "/" + month + "/" + this.day);
	}
	
}
public class Test66 {

	public static void main(String[] args) {
		//1. 객체 생성 동시에..1988, 8, 30을 생성자 호출시 매개변수로 전달해
		//   생성한 객체 내부의 객체변수들에 각각 저장
		MyDate d = new MyDate(1988, 8, 30);
		d.print();
		//2.객체 생성 동시에..1988, 8을 생성자 호출시 매개변수로 전달해
		//  생성한 객체 내부의 객체변수들에 각각 저장
		MyDate d2 = new MyDate(1988, 8);
		d2.print();
		//3.객체 생성 동시에..1988을 생성자 호출시 매개변수로 전달해
		//  생성한 객체 내부의 객체변수(인스턴스변수)들에 각각 저장
		MyDate d3 = new MyDate(1988);
		d3.print();
		//4.객체 생성시 기본생성자 호출하여 각 객체변수의 값들 초기화(저장)
		MyDate d4 = new MyDate();
		d4.print();
		
		/*
			결론 : MyDate클래스를 이용해 객체(인스턴스)를 생성할 때
			      어떠한 형태로 생성하던지(어떠한 생성자를 호출하던지)
			      결국 매개변수 4개가 있는 생성자가 호출됨
			      이유-모든 형태의 생성자들 내부에 this()메소드로 호출하여
			          전달한 값이 매개변수 4개가 있는 생성자를 다시~ 호출하기 때문이다. 
		
		*/

	}

}
