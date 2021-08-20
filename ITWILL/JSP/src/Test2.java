class Parent{
	public void pprn(){
		System.out.println("부모-pprn()");
	}
}

class Child extends Parent{
	public void cprn(){
		System.out.println("자식-cprn()");
	}
}


public class Test2 {

	public static void main(String[] args) {
		
		
		Parent p = new Parent();
		p.pprn();
		//p.cprn();
		System.out.println("----------------------");
		Child c = new Child();
		c.cprn();
		c.pprn();
		
		System.out.println("----------------------");
		// 업캐스팅
		// 부모 레퍼런스에 자식의 인스턴스를 저장
		Parent p1 = new Child();
		p1.pprn();
		//p1.cprn();
		
		// 다운캐스팅
		// 자식의 레퍼런스에 부모의 인스턴스를 저장
		
		// 컴파일러가 자동으로 형변환 X => 문제가 있음
		//Child c1 =  new Parent();
		//Child c1 = (Child) new Parent();
		// 강제형변환 => 컴파일러에게 문제가있음을 알고, 그래도 진행한다
		//c1.cprn();
		//c1.pprn();
		
		// * 업캐스팅/다운캐스팅 시에는 2번에 단계를 사용해서 에러체크
		// 1) 컴파일시 - 컴파일오류 체크
		// 2) 실행시 - 예외를 체크 (메모리 생성)
		
		//////////////////////////////////////////
		
		Parent p2 = new Child();
		
		Child c2 = (Child)p2;
		c2.cprn();
		c2.pprn();
		
		
		
		
		
		

	}

}
