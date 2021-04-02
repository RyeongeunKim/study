
/*
	주제 : 코드를 재활용하는 상속의 장점
	- 기존의 클래스에 새로운 내용을 추가하거나 변경할 때
	  기존 클래스에 변경된 내용만 추가하여
	  새로운 클래스를 만들어 기존클래스의 변수나 메소드를 그대로 사용할 수 있다.
*/
//2차원 평면의 좌표값 한점을 나타내는 x, y를 저장하는 Point2D클래스 만들기
class Point2D{
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
}

//3차원 공간 상의 좌표값 한점을 나타내는 x, y, z를 저장하여 제공하는 Point3D클래스 만들기
class Point3D{
	
	private int x; //Point2D클래스의 x변수와 중복
	private int y; //Point2D클래스의 y변수와 중복
	private int z; 
	
	//get으로 시작하는 메소드가 하는 역할
	//-> private으로 선언된 변수값을 외부클래스에 제공(반환,리턴)해줄 목적
	
	//set으로 시작하는 메소드가 하는 역할
	//-> 외부클래스에서 현재 클래스의 private으로 선언된 변수에 접근하여 새로운 값을 설정할 목적
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	//변수 하나당 setter역할을 하는 메소드 getter역할을 하는 메소드 만들기 단축키
	//alt + shift + s    r

}
//--------------------------------------------------------------
//Point2D, Point3D클래스의 중복된 코드 간의 상속관계도입!!

//Point3D클래스를 수정! -> Point3DTest클래스로 새로 만들기
//Point2D클래스의 모든 멤버들을 상속받아 Point3DTest새로운 클래스 만들기
class Point3DTest extends Point2D {
	
  //private int x;	//Point2D클래스로부터 상속받은 x변수
  //private int y;	//Point2D클래스로부터 상속받은 y변수
	private int z;
	
//	public void setX(int x) {
//		this.x = x;
//	}
//	public int getX() {
//		return x;
//	}
//	public void setY(int y) {
//		this.y = y;
//	}
//	public int getY() {
//		return y;
//	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}







public class Test79 {
	public static void main(String[] args) {
		
		Point3DTest pt = new Point3DTest();//자식클래스로 부터 객체 생성
		
		//Point2D클래스로부터 상속받아 사용하는 setX()메소드 호출
		pt.setX(10);
		//Point2D클래스로부터 상속받아 사용하는 setY()메소드 호출
		pt.setY(20);
		//Point3DTest클래스를 이용해 생성한 객체 자기자신의 setZ()메소드 호출
		pt.setZ(30);
		//Point2D클래스로부터 상속받아 사용하는 getX()메소드, getY()메소드 호출
		System.out.print(pt.getX() + "," + pt.getY());
		//Point3DTest클래스를 이용해 생성한 객체 자기자신의 setZ()메소드 호출
		System.out.print(","+pt.getZ());
	}

}
