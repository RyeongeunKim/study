
public class Test61 {
	public static void main(String[] args) {
		
		//Point클래스로부터 객체 생성시 기본생성자를 호출!
		Point p = new Point();
		//p참조변수가 참조하고 있는 객체의 변수값 출력
		System.out.println("x변수의 값 = " + p.x);
		System.out.println("y변수의 값 = " + p.y);
		//prn()메소드 호출
		p.prn(); //출력 x, y : 2,2
		
		//p참조변수가 참조하고 있는 x변수, y변수의 값을 각각 10과 20으로 다시 저장
		
		p.x = 10;
		p.y = 20;
		
		//prn()메소드 호출
		p.prn();
		
		//x변수의 값 100으로
		//y변수의 값 200으로 초기화하기 위해 setX메소드와 setY메소드 호출
		p.setX(100);
		p.setY(200);
		
		//prn() 메소드 호출
		p.prn();
		
		System.out.println(p.getX()); //p.x
		System.out.println(p.getY()); //p.y
		
		System.out.println("---------------------------------------");
		
		//x변수의 값을 초기화 시킬 생성자 호출을 이용한 객체 생성
		Point p2 = new Point(300);
		p2.prn();
		
		//x변수, y변수값을 초기화시킬 목적의 생성자 호출을 이용한 객체 생성
		Point p3 = new Point(300,400);
		p3.prn();
		
		

	}

}
