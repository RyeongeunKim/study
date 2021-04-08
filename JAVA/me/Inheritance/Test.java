
/*
 	7-1
 	
 	1. 자바의 상속에 대한 설명입니다. 맞는 것에 O표, 틀린 것에 X표 하세요.
 	
 	1) 자바는 다중 상속을 허용한다. ( X )
 	2) 부모의 메소드를 자식 클래스에서 재정의(오버라이딩)할 수 있다. ( O )
 	3) 부모의 private 접근 제한을 갖는 필드와 메소드는 상속의 대상이 아니다. ( O )
 	4) protected 멤버는 같은 패키지의 모든 클래스와 다른 패키지의 자식 클래스만 접근할 수 있다. ( X )
 	
 	2. 메소드 재정의(오버라이딩)에 대한 설명입니다. 맞는 것에 O표, 틀린 것에 X표 하세요.
 	
 	1) 부모의 메소드는 숨김 효과가 나타난다. ( O )
 	2) 재정의 시 접근 제한을 더 강하게 할 수 있다. ( X )
 	3) @Overrride를 붙이면 컴파일러가 재정의를 확인한다. ( O )
 	4) 부모 메소드를 호출하고 싶다면 super 키워드를 사용할 수 있다. ( O )
 	
 	3. final 클래스, final 필드, final 메소드에 대한 설명입니다. 맞는 것에 O표, 틀린 것에 X표하세요.
 	
 	1) 모두 상속과 관련이 있다. ( O )
 	2) final 메소드를 가진 클래스는 부모 클래스가 될 수 없다. ( O )
 	3) final 메소드는 재정의를 할 수 없다. ( O )
 	4) final 클래스는 final 필드가 반드시 있어야 한다. ( X )
 	
 	4. Parent 클래스를 상속해서 Child 클래스를 다음과 같이 작성했는데, 
 	   Child 클래스의 생성자에서 컴파일 에러가 발생했습니다. 그 이유를 설명해보세요.
 	   
 	   부모 클래스에 기본 생성자가 없고 매개 변수가 있는 생성자만 있다면
 	   자식 생성자에서 부모 생성자 호출을 위해 super(매개값, ...)를 명시적으로 호출해야 한다.
 	   super(매개값, ...)는 자식 생성자의 첫 줄에 위치해야 하며, 그렇지 않으면 컴파일 에러가 발생한다.
 	   
 	5. 호출되는 각 클래스의 생성자의 순서를 생각하면서 출력 결과를 작성해보세요.
 	//1   Parent() call
 	//2   Child() call
 	
 	7-2
 	
 	1. 클래스 타입 변환에 대한 설명입니다. 맞는 것에 O표, 틀린 것에 X표 하세요.
 	
 	1) 자식 객체는 부모 타입으로 자동 타입 변환된다. ( O )
 	2) 부모 객체는 항상 자식 타입으로 강제 타입 변환된다. ( X )
 	3) 자동 타입 변환을 이용해서 필드와 매개 변수의 다형성을 구현한다. ( O )
 	4) 강제 타입 변환 전에 instanceof 연산자로 변환 가능한지 검사하는 것이 좋다. ( O )
 	
 	2. Tire 클래스를 상속받아 SnowTire 클래스를 다음과 같이 작성했습니다. 
 	   SnowTireExample 클래스를 실행했을 때 출력 결과는 무엇일까요?
 	   
 	   스노우 타이어가 굴러갑니다.
 	   스노우 타이어가 굴러갑니다.
 	   
 	3. A, B, C, D, E, F 클래스가 다음과 같이 상속 관계에 있을 때 
 	   다음 빈 칸에 들어올 수 없는 코드는?
 	
 	   2번
 	   
 	4. setService() 메소드의 매개값으로 올 수 있는 것에 O표, 올 수 없는 것에 X표 하세요.
 	
 	1) new Service ( X )
 	2) new MemberService ( O )
 	3) new Aservice ( O )
 	4) new Bservice ( O )
 	5) new BoardService ( X )
 	6) new Dservice ( X )
 	
 	5. service.login() 메소드를 호출하면 어떤 내용이 출력되는지 빈 칸에 기술해보세요.
 	
 	  멤버 로그인
 	  A 로그인
 	
 */





public class Test {

	public static void main(String[] args) {
		
		
		
	

	}

}
