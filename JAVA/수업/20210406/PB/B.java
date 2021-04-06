package PB;

//다른 패키지(PB)에 있는 B클래스

//다른 패키지의(PA)에 있는 A클래스를 상속받아 B클래스를 정의하려면?
//import구문이 필요하다. => import 다른패키지명.다른클래스명;
import PA.A;

public class B extends A{
	
	void set() {
		//다른 패키지의 default멤버 접근 불가능
		//i = 1;
		//다른 패키지의 부모클래스의 protected 멤버 접근 가능
		pro = 2;
		//다른 패키지의 부모클래스의 private 멤버 접근 불가능
		//pri = 3;
		//다른 패키지의 부모클래스의 public 멤버 접근 가능
		pub = 4;
	}

	public static void main(String[] args) {
		B b = new B();
		b.set();
		b.print();

	}

}
