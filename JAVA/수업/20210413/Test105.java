import java.util.Iterator;

//추상클래스 연습 문제
//다음 추상클래스 Calculator을 상속받은 GoodCalc 클래스를 구현하라.

abstract class Calculator{ //추상클래스
	//두정수의 합을 구하여 리턴하는 기능의 추상메소드
	public abstract int add(int a, int b);
	
	//두정수의 차를 구하여 리턴하는 기능의 추상메소드
	public abstract int subtract(int a, int b);
	
	//배열에 저장된 정수의 평균을 구해 실수로 리턴하는 기능의 추상메소드
	public abstract double average(int[] a);
}

/*
	Claculator 추상클래스는 add, subtract, average 추상메소드로 선언했을뿐
	어떻게 구현할지는 상관하지 않는다. 어떤 인자가 전달되고 어떤 타입의 값이 리턴되는지만 지정한다.
	구현은 자식클래스의 몫이다.
	GoodCalc 클래스를 구현하라.
*/

class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		
		//매개변수로 전달받는 a배열에 저장된 정수들의 합을 저장할 누적변수 sum선언
		double sum = 0;
		
		//매개변수로 전달 받는 a배열에 저장된 정수들을 차례로 얻어와 sum변수에 누적
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		//sum변수에 저장된 총점수의 평균을 구해 리턴
		return sum / a.length;
	}
	
}

public class Test105 {

	public static void main(String[] args) {
		
		//업캐스팅을 이용하여 자식객체 생성
		Calculator c = new GoodCalc();
		
		//정수 2와 3의 합계 구하기 위해 add메소드 호출!
		System.out.println(c.add(2, 3));
		
		//new int[]{2,3,4} 배열에 저장된 정수의 평균을 구하기 위해 average 메소드 호출
		System.out.println(c.average(new int[] {2,3,4}));

	}

}
