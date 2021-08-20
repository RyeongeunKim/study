public class RectManager {
	public static void main(String args[]) {

		//사각형 r의 좌표는(0,0), (0,0)입니다.
		Rectangle r = new Rectangle();
		//사각형 r
		System.out.println("사각형r");
		r.show();
		System.out.println();
		//사각형s의 좌표는 (1,1), (2,3)입니다.
		Rectangle s = new Rectangle(1, 1, 2, 3);
		//사각형s
		System.out.println("사각형s");
		s.show();
		
		//사각형s의 넓이
		System.out.println("사각형s의 넓이 : " + s.square());
		System.out.println();
		
		System.out.println("사각형r의 좌표를(-2,2), (-1,4)로 수정");
		System.out.println();
		
		//사각형r의 좌표를 (-2,2),(-1,4)로 수정
		r.set(-2, 2, -1, 4);
		//사각형r의 좌표 출력
		r.show();
		
		//사각형r객체 내부의 equals메소드 호출시 
		//매개변수로 사각형s객체 자체를 전달
		System.out.println("사각형r의 넓이 : "+r.square());
		
		if(r.equals(s)) {
			System.out.println("두 사각형의 넓이는 같습니다.");
		}
		
		
	}
}