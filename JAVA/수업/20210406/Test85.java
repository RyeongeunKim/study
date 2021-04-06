
//주제 : 자식클래스와 부모클래스의 생성자의 조합

//상속관계의 자식클래스의 인스턴스가 생성되면...
//1. 자식클래스의 생성자 중 하나가 실행되고
//2. 부모클래스의 생성자 중 하나가 실행된다.

//자식클래스의 여러개의 생성자들 중에서 어떤 생성자와
//부모클래스의 여러개의 생성자들 중에서 어떤 생성자와 조합을 이루느냐?
//-> 컴파일러는 자식클래스의 생성자를 기준으로한 부모클래스의 생성자와 조합을 이룬다.

//조합 4가지
//조합 1번	자식클래스의 기본생성자가 호출되면 자동으로 부모클래스의 기본생성자가 호출됨
class A2{//부모클래스
	//기본 생성자
	public A2() {
		System.out.println("기본생성자A2");
	}
	//매개변수 1개가 존재하는 생성자
	public A2(int x) {
		System.out.println("x값을 전달받는 생성자A2");
	}
	
}
class B2 extends A2{ //자식클래스B2
	//기본 생성자
	public B2() {
		System.out.println("기본생성자B2");
	}
	//매개변수 1개가 존재하는 생성자
	public B2(int x) {
		System.out.println("x값을 전달 받는 생성자 B2");
	}
}


public class Test85 {
	public static void main(String[] args) {
		
		B2 b2 = new B2();
		

	}

}
