
//메소드 오버라이딩시 상속되지 않고 은닉된 부모클래스의 메소드 와 같이...
//부모클래스에 정의된 변수와 같은 이름을 가진 변수를 자식클래스에서 선언할수 있는데...
//이러한 경우에도 부모클래스의 변수는 자식클래스에서 사용할 수 없게 된다. 
// <부모클래스의 멤버변수를 상속받아 사용하는 예>

class Point2D {
	protected int x = 10;
	protected int y = 20;
}

class Point3D extends Point2D {
	
	protected int x = 40;
	protected int y = 50;
	
	
	protected int z = 30;
	
	public void print(){
		//x와 y는 상속받아서 사용하는 멤버변수 임.
		System.out.println(x + "," + y + ","  + z);
	}

}

public class Test100 {

	public static void main(String[] args) {
		
		Point3D pt = new Point3D();
		pt.print(); // 10, 20, 30 <--Point2D로부터 상속 받은 x,y 출력한거임

	}

}




