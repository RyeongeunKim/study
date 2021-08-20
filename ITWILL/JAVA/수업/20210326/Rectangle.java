
/*
다음과 같은 멤버(private변수,public메소드)를 가지는 직사각형을 표현하는 Rectangle 클래스를 작성하라.

-int 타입의 x1,y1, x2,y2(필드) : 사각형을 구성하는 두점의 좌표
-생성자 2개 : 기본생성자와 x1,y1,x2,y2의 값을 설정하는 생성자
-void set(int x1, int y1, int x2, int y2) : x1,y1,x2,y2좌표 설정
-int square() : 사각형 넓이 리턴
-void show() : 좌표와 넓이 등 직사각형 정보의 화면 출력
-boolean equals(Rectangle r) : 인자로 전달된 객체 r과 현 객체가 동일한 직사각형이면 true 리턴


//Rectangle을 이용한 main()메소드는 다음과 같으며 이main()메소드가 잘 작동하도록하라.

public class RectManager {
	public static void main(String args[]) {
				
		Rectangle r = new Rectangle();
	
		System.out.println("사각형r");
		r.show();
		System.out.println();
	
		System.out.println("사각형s");
	
		Rectangle s = new Rectangle(1, 1, 2, 3);
		s.show();
	
		System.out.println("사각형s의 넓이 : " + s.square());
		System.out.println();
		System.out.println("사각형r의 좌표를 (-2,2), (-1,4)로 수정");
		System.out.println();
	
		System.out.println("사각형r");
	
		r.set(-2, 2, -1, 4);
	
		r.show();
	
		System.out.println("사각형r의 넓이 : " + r.square());
	
		if (r.equals(s)) {
			System.out.println("두 사각형의 넓이는 같습니다.");
		}
	}
}

클래스 파일 2개생성  Rectangle.java   RectManager.java

*/



public class Rectangle {
	
	//int 타입의 x1,y1, x2,y2(필드) : 사각형을 구성하는 두점의 좌표
	int x1, y1, x2, y2;
	
	//기본생성자
	public Rectangle() {
		x1 = x2 = y1 = y2 = 0;
	}
	
	//x1,y1,x2,y2의 변수의 값을 설정하는 생성자
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
//메소드-void set(int x1, int y1, int x2, int y2) : x1, y1, x2, y2 좌표 설정
	void set(int n_x1, int n_y1, int n_x2, int n_y2) {
		x1 = n_x1;
		y1 = n_y1;
		x2 = n_x2;
		y2 = n_y2;
	}
	
	//-int square() : 사각형 넓이 리턴
	public int square() {
		int size = (x1-x2) * (y1-y2); //면적계산
		if(size < 0) { //면적이 음수인 경우 양수로 만들어 줌
			size = -size;
		}
		return size;
	}
	//-void show() : 좌표와 넓이 등 직사각형 정보의 화면 출력
	public void show() {
		System.out.print("사각형의 좌표는(");
		System.out.print(x1 + "," + y1 + "),(");
		System.out.println(x2 + "," + y2 + ")입니다.");
	}
	//-boolean equals(Rectangle r) : 
	//인자로 전달된 객체 r과 현 객체가 동일한 직사각형이면 true 리턴
	public boolean equals(Rectangle x) {
		
		//x매개변수로 전달받는 사각형 s객체의 가로길이
		int width1 = (x.x1>x.x2?(x.x1-x.x2):x.x2-x.x1); 
		//this(사각형 r객체)의 가로길이
		int width2 = (x1>x2?(x1-x2):(x2-x1));
		
		//x매개변수로 전달받는 사각형 s객체의 세로길이
		int height1 = (x.y1>x.y2?(x.y1-x.y2):x.y2-x.y1); 
		//this(사격형 r객체)의 세로길이
		int height2 = (y1>y2?(y1-y2):(y2-y1));
		
		//width1(사각형s) 가로길이와 width2(사각형r) 가로길이가 같고,
		//height1(사각형r) 세로길이와 height2(사각형s) 세로길이가 모두 같을 때
		//두사각형의 넓이가 같으면?
		if(width1 == width2 && height1 == height2) {
			return true;
		}
		//다르면?
		return false;
	}//equals메소드 끝

}//Rectangle클래스 끝
	

