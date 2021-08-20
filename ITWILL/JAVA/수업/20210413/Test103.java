
/*
  	추상클래스의 추상메소드를 자식클래스 내부에 재구현(오버라이딩) 하지 않으려면?
  	-> 자식클래스 역시 추상클래스로 선언되어야함
  	   하지만 최종적으로 자식객체를 생성하려면 추상메소드를 강제로 반드시 오버라이딩 해야함
 */

//추상클래스
abstract class AbstractSuper{ //부모클래스
	//추상메소드 : 실질적인 구현이 없는 메소드
	abstract void Method01();
	//일반메소드
	void Method02() {
		System.out.println("Method02:추상클래스AbstractSuper에서 구현된 일반메소드");
	}
}

//위 Method01추상메소드를 오버라이딩 하지않으려면
//MiddleClass자식클래스를 추상클래스로 만들어야함.
abstract class MiddleClass extends AbstractSuper{ //자식클래스
	
	//추상클래스 된 Middleclass의 일반메소드
	void Method03() {
		System.out.println("Method03:추상클래스 MiddleClass에서 구현된 일반메소드");
	}
}

//위 추상클래스 MiddleClass를 상속받는 자식 Sub클래스 만들기
class Sub extends MiddleClass{
	//하지만 추상클래스는 객체생성이 되지 않으므로 객체를 생성하려면
	//Sub클래스에서 반드시 추상클래스의 메소드를 상속받아 사용하지 않고
	//강제로 메소드 오버라이딩 (메소드 재구현) 해서 사용해야함
	@Override
	void Method01() {
		System.out.println("Method01: 추상클래스 MiddleClass로부터 오버라이딩된 메소드");
	}
	
}

public class Test103 {

	public static void main(String[] args) {
		
		Sub sub = new Sub();
		
		//추상클래스 MiddleClass로 부터 오버라이딩된 메소드 호출 가능
		sub.Method01();
		//추상클래스 AbStractSuper로 부터 상속받은 일반메소드 호출 가능
		sub.Method02();
		//추상클래스 MiddleClass로 부터 상속받은 일반메소드 호출 가능
		sub.Method03();

	}

}
