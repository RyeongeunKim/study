
//주제 : 상속관계에서의 접근 제어자 알아보기
//      -> 부모클래스와 자식클래스가 같은 패키지에 있는 경우의 접근

class AA{//<-부모클래스
	//default 접근제어자 이용
	//부모클래스의 멤버가 default이면 같은 패키지에 있는 클래스는 모두 접근 가능
	int i;
	//protected 접근제어자 이용
	//- 같은 패키지에 속한 다른 클래스에서 접근 허용
	//- 패키지가 같던 다르던 상속받은 자식클래스에서 접근 허용
	protected int pro;
	//public 접근제어자 이용
	//- 다른 패키지 또는 같은 패키지의 모든 클래스에서 접근을 허용함.
	public static int pub;
	
	//private 접근제어자 이용
	//- 같은 클래스 내부에서만 이 변수에 접근을 허용함.
	//- 인스턴스 변수 정의 시 사용
	private int pri;
	
	//public 접근 제어자를 이용해 getter, setter역할을 하는 메소드 만들기
	public int getPri() {
		return pri;
	}
	public void setPri(int pri) {
		this.pri = pri;
	}
}//AA클래스 끝

//AA클래스의 멤버를 상속받은 BB클래스 만들기
class BB extends AA{
	
	void set() {
		
		i = 1;
		pro = 2;
	//  pri = 3;
		setPri(3);
		pub = 4;
	}
	
	public String get() {
		
		return i + ", " + pro + ", " + pub + ", " + getPri();
	}
}

public class Test82 {

	public static void main(String[] args) {
		
		BB bb = new BB();
		bb.set();
		System.out.println(bb.get());

	}

}
