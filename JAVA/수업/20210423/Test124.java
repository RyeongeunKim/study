/*
	자바에서 기본자료형의 데이터를 객체의 변수에 저장하기 위해 
	제공되는 Wrapper역할을 하는 클래스들을 미리 만들어놓고 제공함
	
	<기본자료형>		<Wrapper역할을 하는 클래스들>
	boolean			Boolean
	char			Character
	byte			Byte
	short			Short
	int				Integer
	long			Long
	float			Float
	double			Double

*/
public class Test124 {

	public static void main(String[] args) {
		
		//1. Integer 래퍼클래스의 생성자 종류 2가지
			//Integer(int value) : 정수값을 인자로 갖는 생성자
			//Integer(String str) : 문자열을 인자로 갖는 생성자
		
		//정수값을 인자로 갖는 생성자를 호출해 10을 저장하여 객체 생성
		Integer num01 = new Integer(10);
		//문자열값을 인자로 갖는 생성자를 호출해 "20"을 저장하여 객체 생성
		Integer num02 = new Integer("20");
		
		//2. Integer 래퍼클래스의 메소드
			//int intValue()메소드 : Integer객체에 저장된 int값을 반환하는 메소드
			int n01 = num01.intValue(); //10
			int n02 = num02.intValue(); //20
			
			int sum = n01 + n02; //Integer래퍼객체로 부터 반환받은 기본데이터들의 합
			
			System.out.println("두 정수의 합 -> " + sum);
			
			//sum변수에 저장된 값을 2진수, 8진수, 16진수 형태의 문자열로 변환해서 반환하는 메소드
			System.out.println("합을 2진수로 -> " + Integer.toBinaryString(sum));
			System.out.println("합을 8진수로 -> " + Integer.toOctalString(sum));
			System.out.println("합을 16진수로 -> " + Integer.toHexString(sum));
			
			Integer num03 = new Integer(30);
				//double doubleValue()메소드 : 
				//Integer객체에 저장된 double타입의 값으로 변환해서 리턴하는 메소드
				System.out.println(num03.doubleValue()); //30.0
				
				//static int parseInt(String s)메소드 :
				//숫자형태의 문자열을 매개변수 s로 전달받아..
				//정수로 변환해서 int정수로 반환하는 메소드
				//예) "100" -> 100
				System.out.println(Integer.parseInt("100")); //정수 100 출력
	}

}
