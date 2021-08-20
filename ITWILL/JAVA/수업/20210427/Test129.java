

/*
  	자바에서 발생하는 예외종류 및 예외종류의 메시지를 제공하고 처리해주는 클래스들 2, 3, 5 중요?
  	
  	1. 정수를 0으로 나누는 경우 발생하는 예외 -> ArithmeticException 클래스
  	2. null값이 저장된 참조변수를 이용하려고 할 때 발생하는 예외
  	   -> NullPointException클래스
  	3. 배열의 인덱스 범위를 벗어나 배열을 참조하려고 하는 경우에 발생하는 예외
  	   -> ArrayIndexOutBoundsException클래스
  	4. 형변환을 수행할 때 객체의 타입이 일치하지 않으면 발생하는 예외
  	   -> ClassCastException 클래스
  	   
  	   Object obj = request.getParameter("name");
  	   String name = (String)obj; <-형변환하지 않을 때 예외 발생
  	5. 리소스에 포함된 클래스를 사용하고자 하는데 그 클래스가 존재하지 않을 때 발생하는 예외
  	   -> ClassNotFoundException클래스
  	   
  	자바에서 예외가 발생되는 코드를 예외처리 하기 위한 2가지 방법
  	1. try-catch 구문을 활용
  	2. throws키워드를 이용한 예외 처리
  	
  	
  	1. try-catch 구문을 활용하여 예외처리
  	문법 
  	   try{
  	   
  	   		예외가 예상되는 코드 작성
  	   		
  	   }catch(발생한 해당 예외클래스타입의 참조변수){
  	   
  	   		try{}구문 영역에서 발생한 예외를 처리하는 코드 작성
  	   		어떤 예외가 발생했는지에 대한 정보 코드 작성
  	     	   
  	   }
  	
 */

public class Test129 {
	public static void main(String[] args) {
		
		System.out.println("시작");
	try {	
		int su1 = 10;
		int su2 = 0;
		
		System.out.println(su1 / su2);
		
		System.out.println("예외 발생 안함");
		
	}catch (Exception e) { //new ArithmeticException("/ by zero");
		//예외 처리 코드 작성
		System.out.println("정수를 0으로 나눌 수 없습니다.");
		
		//위 매개변수 e에 저장된 객체의 예외정보를 출력하는 메소드 2가지
		//1. e.printStackTrace()메소드
		//  -> 예외 발생 당시의 호출스택에 있었던 메소드의 정보와 예외 메시지를 화면(이클립스 Console)
		//  -> 예외 발생하기 까지의 모든 과정과 예외가 발생한 소스코드의 행 번호를 출력
		//2. System.out.println(e.getMessage() 메소드)
		//  -> 발생한 예외객체에 저장된 메시지를 간략히 얻을 수 있게 도와주는 메소드
		//  -> 간략한 예외정보만 출력한다.
		//e.printStackTrace();
		System.out.println(e.getMessage());
	}
		System.out.println("끝");

	}

}
