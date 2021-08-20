
public class Test127 {

	public static void main(String[] args) {
	
		//JDK 5.0버전이 이후 부터 적용되는 오토박싱(자동박싱), 오토언박싱(자동언박싱)
		
		int n1 = 10;
		int n2;
		
		Integer num1;
		Integer num2 = new Integer(20); //수동 박싱
		num1 = Integer.valueOf(n1);//수동 박싱  
		num1 = n1; //오토박싱 : Integer클래스의 valueOf메소드 호출 생략 가능 
		
		System.out.println("오토박싱");
		System.out.println("n1변수 : " + n1);
		System.out.println("num1참조변수 : " + num1);
		
		
		n2 = num2.intValue(); //수동 언박싱 //20
		n2 = num2;//오토 언박싱 : Integer클래스의 intValue메소드 호출 생략가능 //20
		
		//---------------------------------------------------------------
		
//오토 박싱, 오토 언박싱 연습하기
		
//정수 10을 저장하기 위한 Integer객체 오토 박싱 해서 저장 , 참조변수 it
Integer it = 10; // new Integer(10);
/*
	오토박싱 설명
		Integer클래스타입의 참조변수it에는 Integer객체의 주소값이 저장되어야 합니다.
		그런데 이문장에서는 정수 10을 저장 하려고 합니다.
		이러한 경우 정수10을 Integer클래스에 대한 객체가 자동으로 생성되고(new Integer(10))
		이 new Integer(10)객체를 정수 10을 대신해서 저장 하게 됩니다.
*/
//오토박싱된 Integer객체의 인스턴스변수에 저장된 정수10을 문자열 변환해서 반환 받아 출력
System.out.println(  it.toString() );

//위 Integer객체에의 인스턴스변수에 저장된 정수10을  오토언박싱해서  int a변수에 저장
int a = it; //it.intValue()메소드 호출 부분(수동 언박싱 부분)이 생략 됨

//오토언박싱된 변수a의 기본값을 출력
System.out.println(a); //10


//실수값 3.14를 Double클래스타입의 du참조변수에 저장하기 위해 오토박싱하기
Double du = 3.14; //<--오토박싱 , new Double(3.14);<--수동 박싱		

//new Double(3.14)객체에 오토박싱된 3.14실수값을 문자열로 변환해서 반환 받아 출력("3.14")
System.out.println(du.toString());

//위 Double객체의 인스턴스변수에 저장된 3.14를 오토언박싱해서 double b변수에 저장
double b = du; //<--오토언박싱 ,  du.doubleValue(); <--수동 언박싱

//double b변수에 저장된 값 출력(3.14)
System.out.println(b);

//-------------------------------------------------------------------------
/* Wrapper클래스를 이용해   오토박싱과   오토언박싱을 통해서 산술연산 가능하게 하기 */

Integer c1 = 10; //오토박싱 ,  수동박싱 Integer c1 = new Integer(10);
Integer c2 = 20; //오토박싱 ,  수동박싱 Integer c2 = new Integer(20);

c2+=3;
//c2 = c2 + 3;
//c2 = new Integer(20);
//c2 = new Integer(c2.intValue() + 3);
System.out.println(c2);//23

c1++;
//c1 = new Integer(c1.intValue() + 1);
	// c1.intValue() <- 수동언박싱 (기본데이터10 얻기)
	// c1 <- 오토언박싱  +  1 을 하여 new Integer(10+1)객체에 저장 한다 <-박싱
	// c1++ <- 오토박싱
System.out.println(c1);//11


int addResult = c1 + c2; //각각 오토언박싱되어 연산함   11 + 23
System.out.println("addResult : " + addResult);

int minResult = c1 - c2; //각각 오토언박싱되어 연산함  11 - 23
System.out.println("minResult : " + minResult);
	
//자동으로 발생하는 오토박싱과 오토언박싱으로 인해서  Wrapper클래스들의 객체 역시 산술 연산이 가능하다
		

	}

}




