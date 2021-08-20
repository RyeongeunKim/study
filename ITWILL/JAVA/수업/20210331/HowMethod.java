
//---문제1---

//메소드 사용방법
class SimpleMath { // 단순 계산 클래스
	public static final double PI = 3.1415;

	public double add(double n1, double n2) {
		return n1 + n2;
	}

	public double min(double n1, double n2) {
		return n1 - n2;
	}

	public double mul(double n1, double n2) {
		return n1 * n2;
	}
}

class AreaMath { // 넓이 계산 클래스

	// 원넓이 계산 메소드
	public double calCircleArea(double rad) {
		// SimpleMath객체생성
		SimpleMath sm = new SimpleMath();

		// 반지름 * 반지름 의 결과받아와서 double(8) result변수에저장
		double result = sm.mul(rad, rad);

		// 반지름 * 반지름 * 3.14 결과받아 와서 double(8) result변수에저장
		result = sm.mul(result, SimpleMath.PI);

		// 호출한곳으로!! 원넓이 리턴
		return result; // 원넓이 리턴
	}

}

class PerimeterMath { // 직사각형의 둘레계산클래스
	// 직사각형의 둘레 계산 메소드
	public double calRectanglePeri(double width, double height) {
		// SimpleMath 객체생성
		SimpleMath sm = new SimpleMath();

		// {(가로) ＋ (세로)} × 2 <--직사각형 둘레 리턴
		
//		double result1 = sm.mul(width, 2);
//		double result2 = sm.mul(height, 2);
//		double result3 = sm.add(result1, result2);
		
		return sm.add(sm.mul(width, 2), sm.mul(height, 2)); // 직사각형 둘레 리턴
				//	   	(가로 X 2)           (세로 X 2)
	}
}

public class HowMethod {
	public static void main(String[] args) {
	
	//참고!! 원넓이 구하는 메소드 호출 , 호출시 2.4전달
	AreaMath am = new AreaMath();
//	double result1 = am.calCircleArea(2.4);
//	System.out.println("원의 넓이 : "+result1);
	System.out.println("원의 넓이 : "+am.calCircleArea(2.4));
	
	//참고!! 직사각형 둘레 구하는 메소드 호출, 호출시  2.0, 4.0 전달
	PerimeterMath pm = new PerimeterMath();
	System.out.println("직사각형 둘레 : "+new PerimeterMath().calRectanglePeri(2.0, 4.0));

		// 출력 결과
		// 원의 넓이 : 18.09504
		// 직사각형 둘레 : 12.0
	}
}
