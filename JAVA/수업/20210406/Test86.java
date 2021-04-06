
//조합 4가지 중에서..
//조합 2번. 부모클래스에 기본생성자가 없는 경우 
//        자식클래스의 생성자와 부모클래스의 생성자의 조합

class D{ //부모클래스
	
	private int d;
	
//	public D() {
//		
//	}
	
	//d인스턴스 변수의 값을 초기화할 생성자
	public D(int x) {
		this.d = x;
	}
}
class E extends D{
	
	public E() {
		System.out.println("생성자E");
	}
	
	
}


public class Test86 {
	public static void main(String[] args) {
		
		E e = new E();
		
//		
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			Implicit super constructor D() is undefined. Must explicitly invoke another constructor
//
//			at E.<init>(Test86.java:17)
//			at Test86.main(Test86.java:28)
//		결론 : 클래스E의 생성자와 짝을 이를 기본생성자가 클래스D에 없으므로..
//		      컴파일러에 의해 오류메세지가 나타남
//		      클래스 D에 아무런 생성자도 정의되어 있지 않은 경우에만
//			  컴파일러에 의해 기본생성자가 자동으로 정의됨.

	}

}
