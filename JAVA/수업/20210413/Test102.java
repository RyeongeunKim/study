/*
	추상클래스란?
	- 객체를 생성할 수 없는 미완성 설계도(클래스)
	- 형식
	  abstract class 추상클래스명{
	  	멤버변수
	  	상수
	  	추상메소드
	  	일반메소드
	  }
	  
	추상클래스 사용목적
	- 상속받은 자식클래스는 부모추상클래스의 추상메소드를 반드시 오버라이딩 시킬 목적.
	- 추상클래스로 다형성의 특징을 제공할 목적.
	
	추상메소드란?
	- 메소드의 선언부만 존재하고 메소드의 구현부분이 없는 메소드
	- 메소드 선언부 앞쪽에 abstract 기술
	- 형식
	   abstract void 추상메소드명();
	   
	추상메소드 사용목적
	- 추상클래스를 상속받는 자식클래스에게 추상메소드의 선언부(틀)형식만 강제로 제공하여
	  추상메소드를 재정의시키기 위한 목적
*/
//주제 : 추상클래스를 상속받는 자식클래스 설계하기

//추상클래스(부모클래스)
abstract class AbstractClass{
	
	//추상메소드 : 실질적인 구현소스는 없고, 메소드 선언부만 존재하는 메소드
	abstract void Method01();
	
	//일반메소드
	void Method02() {
		System.out.println("Method02:추상클래스내부에서 구현된 일반메소드");
	}
}

//위 추상클래스를 상속받는 자식 클래스
class SubClass extends AbstractClass{

	//추상클래스를 부모클래스로 해서 상속받으면
	//추상클래스의 추상메소드는 반드시 (강제로) 오버라이딩 해야함.(재구현)
	@Override
	void Method01() {
		System.out.println("Method01:자식클래스에서 재구현된 추상메소드");
	}
}


public class Test102 {

	public static void main(String[] args) {
		
		//추상클래스는 자생력이 없으므로 객체 생성을 하지 못함
		//AbstractClass abstractClass = new AbstractClass();
		
		//추상클래스를 상속받은 자식클래스를 이용해 객체 생성
		SubClass subClass = new SubClass();
		
		//자식클래스에 오버라이딩된 추상메소드를 호출할 수 있다.
		subClass.Method01();
		//자식클래스에서 상속받은 추상클래스의 메소드를 호출할 수 있다.
		subClass.Method02();
		
		//결론 : 추상클래스 내부의 추상메소드는 자식클래스에서 반드시 오버라이딩해야한다.
		//	   일반메소드는 해도 되고.. 안해도 되고..

	}

}
