
/*
  	자바에서 예외처리 방법 2가지
  	
  	1. try-catch-finally문 이용
  	2. throws 키워드 이용하는 방법
  	
  	
 	throw 와 throws 키워드
 	
 	1. throw 키워드
 	   -> 예외를 강제로 발생시킬 때 사용하는 키워드
 	      (문법) throw new 예외클래스의 생성자 호출;
 	      
 	2. throws 키워드
 	   -> 발생된 예외처리를 자신이 직접 처리 하는 것이 아니라..
 	      자신을 호출한 객체로 떠넘기는 역할을 하는 키워드.
 	      (문법) throw Exception { ..... }
 
 */

class Test{
	//throws Exception
	//a메소드를 호출한 곳으로 가서 예외처리 하세요!라고 말하는 것과 같은 문장이다.
	void a(int num) throws Exception {
		
		System.out.println("num=" + num);
		if(num < 100) {
			//예외를 인위적으로 발생시키기 : 의도적으로 예외발생시킴 
			throw new Exception("num값이 100보다 작다");
		}
		
	}
	
}


public class Test132 {
	public static void main(String[] args) /*throws Exception*/ { //JVM가상머신이 main메소드를 호출하니
		System.out.println("프로그램 시작");						  //JVM에게 예외처리를 떠넘김
		
		Test test = new Test();
		
		//a메소드 내부에서 예외가 발생하면 예외 처리를 여기서 하자
		try {
			//메소드를 호출한 곳
			test.a(50);
		}catch (Exception e) {
			System.out.println(e);//예외메시지 출력
		}
		System.out.println("프로그램 종료");
	}

}
