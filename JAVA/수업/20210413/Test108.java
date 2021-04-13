
//지상유닛, 공중유닛

class Unit{ //유닛
	
	int currentHP; //유닛의 현재 체력
	int x; //유닛의 위치(x좌표)
	int y; //유닛의 위치(y좌표)
	
}

interface Movable{
	
	//지정된(x,y)로 이동하는 기능의 추상메소드
	/*public abstract*/ void move(int x, int y);
}

interface Attactable{
	
	//지정된 대상(유닛)을 공격하는 기능의 추상메소드
	/*public abstract*/ void attack(Unit u);
}

interface Fightable extends Movable,Attactable{
	
	//위 두개의 move, attack 추상메소드를 상속받음
	
}

//Fighter클래스는 Fightable 인터페이스 내부에 있는 추상메소드를 오버라이딩해서 설계한다
//참고 : 인터페이스 내부에 있는 추상메소드를 강제로 재정의(오버라이딩) 해 놓아야 한다.
class Fighter implements Fightable{

	@Override
	public void move(int x, int y) {
		// 구현 생략
		
	}

	@Override
	public void attack(Unit u) {
		// 구현 생략
		
	}
	
}

public class Test108 {

	public static void main(String[] args) {
		

	}

}
