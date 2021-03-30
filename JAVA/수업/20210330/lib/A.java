package lib; //A클래스는 다음과같이 package lib문을 자동으로 포함하고 있다.
//해석 : 아래의 class A는 lib폴더(패키지)에 포함되어 있다

public class A { //public 을 반드시 붙여야 한다.
				 //이유 :  다른 패키지에서 A클래스에 접근 하기 위함.
	int x,y;
	
	//기본생성자
	public A() {
		System.out.println("lib패키지에 존재하는 A클래스에 접근");
	}
	//객체 생성시 x,y객체변수의 값을 초기화시킬 생성자
	public A(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//객체 변수 x와y에 저장된 값을 출력하는 기능의 메소드
	public void prn() {
		System.out.println(this.x + "," + this.y);
	}
	
}



