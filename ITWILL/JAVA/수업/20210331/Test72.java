
/*
	클래스 내부의 멤버메소드 알아보기
*/
class AAA{
	
//멤버변수
	//인스턴스변수
	int num;
	//클래스변수
	static int staticNum;	
//멤버메소드
	//인스턴스메소드
	void add(int add) {
		num += add;
		staticNum += add;
	}
	//인스턴스변수 num에 저장된 데이터를 반환하는 인스턴스메소드
	public int getNum() {
		return num;
	}
	//인스턴스 변수 num에 새로운 데이터를 저장할 인스턴스메소드
	public void setNum(int num) {
		this.num = num;
	}
	//static이 붙은 클래스메소드
	//클래스변수 staticNum에 저장된 데이터를 반환하는 클래스메소드
	public static int getStaticNum() {
		//클래스변수 staticNum의 데이터를 반환
		return staticNum;
		
		//1.클래스 메소드 내부에서는 클래스변수에 저장된 데이터만 반환할 수 있다.
		//return num; error
	}
	//클래스변수 staticNum에 새로운 데이터를 저장시킬 클래스 메소드
	public static void setStaticNum(int staticNum) {
		//클래스변수 staticNum에 매개변수로 전달받은 데이터 저장
		//방법
		//클래스명.클래스변수명 = 매개변수명;
		AAA.staticNum = staticNum;
		
	}
	
}//class AAA 닫는기호

public class Test72 {

	//static(정적, 공용)메소드
	public static void main(String[] args) {
		
		//클래스 메소드를 사용하기 위해
		//AAA클래스로부터 객체 생성
		AAA aaa = new AAA();
		
		//클래스 변수에 데이터를 저장하는 방법(변수에 데이터를 초기화하는 방법)
		//2가지
		//1. 클래스명.클래스변수명 = 저장할 데이터;
		AAA.staticNum = 50;
		//2. 참조변수명.클래스변수명 = 저장할 데이터;
		aaa.staticNum = 50;
		
		//클래스 메소드 호출 방법 2가지
		//1. 클래스명.클래스메소드명(); 호출
		System.out.println(AAA.getStaticNum());
		//2. 참조변수명.클래스메소드명(); 호출
		int result = aaa.getStaticNum();
		System.out.println(result);
		
		/*
		 	결론 :
		 	1. 인스턴스변수, 인스턴스메소드 : 객체 생성시 객체 내부 메모리에 존재
		 	2. 클래스변수, 클래스메소드 : 클래스가 JVM메모리에 올라갈 때 존재
		 	3. 클래스메소드 내부에서 인스변스변수에 접근 불가능하다.
		 	4. ! 경고메세지의 뜻 :
		 	   정적인 클래스변수, 클래스메소드는 정적인 방식으로 접근하라는 경고를 말함
		 	   즉, 클래스명으로 접근하라는 뜻. 
		 	
		 */
		
		

	}

}
