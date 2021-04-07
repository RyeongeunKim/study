/*
	super키워드  -  super,  super()
	- 상속관계의 부모객체를 의미 한다.
	- 상속관계의 자식클래스에서 부모클래스의 구성요소를 명시적으로 호출할때 사용.
	
	super키워드를 사용하는 2가지 경우
	1. 부모클래스의 멤버와 자식클래스의 멤버가 같은 이름을 가질경우 
	   -> 부모클래스의 멤버를 사용할때  "super.부모멤버이름" 사용
	2. 자식클래스에서 명시적으로 부모클래스의 생성자를 호출할 경우 
	   -> super(매개변수) 형식으로 사용한다.
	   -> 주의점 : 반드시 자식클래스의 생성자를 정의 할때..
	   			  super(매개변수)는 첫번째 행에서 부모생성자를 호출 해야함.
*/

class Person{//사람클래스 -> 부모클래스의 역할
	int age = 20;
	String name;
	
	public Person(String name) {
		this.name = name;
	}
}

class Man extends Person{
	
	int age = 40;//Person부모클래스의 인스턴스변수 age와 
				 //Man자식클래스의 인스턴스변수 age 이름이 같다.
	
	//생성자
	public Man(String name) {
		//2.Person(부모)생성자는 상속이 안되므로
		//  Man생성자의 첫번째 행에서 Person(부모)생성자->super(값)으로 호출!
		super(name);
		//명시적으로 부모생성자를 호출하는 이유?
		// -> Man(자식)객체 생성시.. 자식객체의 생성자가 호출되어...
		//	  Person(부모)객체가 먼저 생성되어야 한다.
		//    그러므로 자식객체의 생성자를 호출한후...
		//    명시적으로 부모객체의 생성자를 호출하면서 name값을 전달 하여
		//    부모클래스에서 name변수의 값을 직접 저장 해야한다.
		//    직접저장한 후.. Man에서 Person으로부터 name을 상속받아 사용한다
		//-> 인스턴스변수 name이 Man클래스가 아닌 Person(부모)클래스에 선언된 인스턴스변수이기때문에
		//   변수가 선언된 곳에서 변수초기화 작업을 해줘야 하기 때문이다.
		
	}
	
	//메소드
	public void getInfo() {
		System.out.println(this.age); //자식클래스 자신의 age변수 나이값 출력
	
		//1.Person클래스의 변수 age와 Man클래스의 변수 age가 이름이 같다.
		// 이때 부모Person객체의 멤버를 사용하고 싶을때..
		System.out.println(super.age);
	}	
	
	public void getInfo2() {
		System.out.println("Person클래스의 name변수의 값을 상속받아서 출력");
		System.out.println("->" + name);
	}
}

public class Test89 {

	public static void main(String[] args) {
		
		//자식 Man객체 생성시.. 생성자를 호출해 "홍길동" 전달 후 변수값 초기화
		Man m = new Man("홍길동");
		
		//Man(자식)객체의 age변수 정보와..
		//Person(부모)객체의 age변수 정보를 얻어 출력하는 메소드 호출!
		m.getInfo();
		
		//Person클래스에 저장된 name변수의 값을 상속받아서 얻어 출력하는 메소드 호출!
		m.getInfo2();
		
	
	}

}





