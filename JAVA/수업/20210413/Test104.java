
//ShapeClass1 추상클래스 만들기

abstract class ShapeClass1{
	
	//draw 추상메소드 만들기, 리턴타입 void, 매개변수 없음
	abstract void draw();
	
}

//ShapeClass1추상클래스를 상속받는 Circle자식일반클래스 만들기

class Circle extends ShapeClass1{
	
	//draw 추상메소드 오버라이딩 
		//오버라이딩(재구현) 내용 -> "원을 그린다" 출력
	@Override
	void draw() {
		System.out.println("원을 그린다");
	}
}

//ShapeClass1추상클래스를 상속받는 Rect1자식일반클래스 만들기

class Rect1 extends ShapeClass1{

	//draw 추상메소드 오버라이딩
		//오버라이딩(재구현) 내용 -> "사각형을 그린다" 출력	
	
	@Override
	void draw() {
		System.out.println("사각형을 그린다");
	}
}

//ShapeClass1추상클래스를 상속받는 Tria1자식일반클래스 만들기

class Tria1 extends ShapeClass1{
	
	//draw 추상메소드 오버라이팅 
	//오버라이딩(재구현) 내용 -> "삼각형을 그린다" 출력	
	@Override
	void draw() {
		System.out.println("삼각형을 그린다");
	}
}

public class Test104 {

	public static void main(String[] args) {
		
		//추상(부모)클래스타입의 참조변수 ref선언
		
		ShapeClass1 ref;
		
		//업캐스팅 -> new Circle()객체 생성 후 저장
		
		ref = new Circle();
		
		//new Circle()객체의 draw()메소드 호출
		
		ref.draw();
		
		//업캐스팅 -> new Rect1()객체 생성 후 저장
		
		ref = new Rect1();
		
		//new Rect1()객체의 draw()메소드 호출
		
		ref.draw();
		
		//업캐스팅 -> new Tria1()객체 생성 후 저장
		
		ref = new Tria1();
		
		//new Tria1()객체의 draw()메소드 호출
		
		ref.draw();
		
		//결론 : 추상클래스로부터 오버라이딩된 메소드는...
		//	   참조변수의 클래스타입과 무관하게 그 참조변수가 참조하고 있는 자식객체에 따라
		//     draw()메소드의 출력 결과가 달라진다.
		
		System.out.println("----------------------------------------------");
		
		//추상클래스타입의 배열을 저장할 arr참조변수 선언
		ShapeClass1[] arr;
		
		//추상클래스타입의 배열 3칸 생성
		arr = new ShapeClass1[3];
		
		//arr각 인덱스 위치에 자식객체 저장
		arr[0] = new Circle(); //업캐스팅
		arr[1] = new Rect1(); //업캐스팅
		arr[2] = new Tria1(); //업캐스팅
		
		//배열의 각인덱스 위치에 저장된 자식객체들을 꺼내서 자식객체의 draw()메소드 호출
		for(int i=0; i<3; i++) {
			arr[i].draw();
		}
		//결론 : 배열의 각인덱스 위치에 저장된 자식객체가 다르므로...
		//	    for반복문으로 일괄 처리하더라도 출력 결과가 다르게 됨.
		System.out.println("-----------------------------------------------");
		
		//static으로 선언한 정적메소드(클래스메소드)이기 때문에
		//메소드명 put으로 바로 호출가능
		put(new Circle());
		put(new Rect1());
		put(new Tria1());
		
	}//main메소드 끝
	
	//추상클래스ShapeClass1타입의 매개변수 s를 갖는 클래스메소드 put만들기
	//-> 업캐스팅에 의해서 매개변수 s는 ShapeClass1추상클래스로 부터 확장된 자식객체를 참조할 수 있다.
	public static void put(ShapeClass1 s) {
		//s.draw()만 봐서는 원, 사각형, 삼각형 중 어느 것을 그릴지 모름
		//그러나 한가지 코드로 작성된 s.draw()라는 문장으로 3가지 도형을 그리는 결과를 얻는다.
		//다형성
		s.draw();
	}

}//Test104클래스 끝
