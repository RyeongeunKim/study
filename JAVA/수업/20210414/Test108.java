

//지상유닛, 공중유닛 

class Unit{ //유닛
	
	int currentHP;//유닛의 현재 체력 
	int x;//유닛의 위치(x좌표)
	int y;//유닛의 위치(y좌표)

}

interface Movable{
	
	//지정된(x,y)로 이동하는 기능의 추상메소드
	/*public abstract*/ void move(int x, int y);
}

interface Attackable{
	
	//지정된 대상(유닛)을 공격 하는 기능의 추상메소드
	/*public abstract*/ void attack(Unit  u);
	
}

interface Fightable extends Movable,Attackable{
	/* 위 두 인터페이스로 부터 상속 받은 추상메소드들

	//지정된(x,y)로 이동하는 기능의 추상메소드
		void move(int x, int y);
	//지정된 대상(유닛)을 공격 하는 기능의 추상메소드
		void attack(Unit  u);
	*/
}


//Fighter클래스는 Fightable인터페이스 내부에 있는 추상메소드를 오버라이딩 해서 설계한다
//참고 : 인터페이스 내부에 있는 추상메소드를 강제로 재정의(오버라이딩) 해 놓아야 한다.
class Fighter implements Fightable{

	@Override
	public void move(int x, int y) {
		//구현 생략
		
	}
	@Override
	public void attack(Unit u) {
		//구현 생략 
	}		
	
}


//하나의 클래스를 상속받고  하나의 인터페이스를 구현 받아 새로운 클래스 설계
class Fighter2  extends Unit implements Fightable{

//  Unit클래스로 부터 상속 받은 멤버들
	//	int currentHP;//유닛의 현재 체력 
	//	int x;//유닛의 위치(x좌표)
	//	int y;//유닛의 위치(y좌표)

//Fihtable인터페이스 내부의 추상메소드를 강제로 오버라이딩 
	//alt + shift +  s   v
	@Override
	public void move(int x, int y) {
		//재구현 생략
	}

	@Override
	public void attack(Unit u) {
		//재구현 생략	
	}	
}

// 사용된 클래스와  인터페이스 간의 관계도 그림
/*

		Object클래스 
								Movable인터페이스    Attackble인터페이스
		   ^
		   |							^			^
		   								|			|
		Unit클래스 				 Fightable인터페이스 
		
		   ^							^
		   |						 	|
		   						
				   Fighter2클래스 



*/






public class Test108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
