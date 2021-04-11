/*
 	super()
 	- 상속관계의 부모객체를 의미
 	- 자식클래스 -> 부모클래스의 구성요소를 호출할 때 사용
 	
 	사용하는 경우
 	1. 부모클래스의 멤버와 자식클래스의 멤버의 이름이 같을 경우
 	  -> 부모클래스의 멤버 사용시 "super.부모멤버이름" 사용
 	2. 자식클래스에서 부모클래스의 생성자를 호출할 경우
 	  -> super(매개변수) 형식으로 사용
 	  -> 주의점 : 반드시 자식클래스의 생성자를 정의할 때 
 	  			 super(매개변수)는 첫번째 행에서 부모생성자를 호출해야함
 */

class P{
	
	int age = 20;
	String name;
	
	public P(String name) {
		this.name = name;
	}
}

class C extends P{
	
	int age = 40; //부모클래스의 인스턴스변수 age와 이름이 같다
	
	public C(String name){
		
		//부모생성자는 상속이 안되므로 첫번째 행에서 super(값)으로 호출
		super(name);
//		호출 이유
//		- 인스턴스변수 name이 자식클래스가 아닌 부모클래스에 선언된 변수이기 때문에
//		  변수가 선언된 곳에서 변수초기화를 해야한다.
//		- 자식객체 생성시 자식객체의 생성자가 호출되어 
//		  첫줄에 super를 작성하여 부모생성자가 먼저 호출되도록 한다.
		
	}
	
	//메소드
	public void getInfo() {
		System.out.println(this.age);
		System.out.println(super.age); //P의 age 사용
	}
	
	public void getInfo2() {
		System.out.println("P클래스의 name변수의 값을 상속받음 : " + name);
	}
}

public class Test89 {

	public static void main(String[] args) {
		
		C c = new C("요요");
		
		c.getInfo();
		c.getInfo2();

	
	}

}





