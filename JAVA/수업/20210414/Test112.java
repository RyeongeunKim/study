

//thank , dropship , scv    <- 기계 유닛 이기때문에
//기계유닛을 묶어 주기 위해 Repairable인터페이스 만들기
interface Repairable{
}

//최고 조상 유닛클래스 만들기
class Unit{
	 //유닛의 현재체력을 저장할 변수
	 int hitPoint;
	 //유닛의 최대체력을 한번한 초기화 해서 저장할 상수
	 final int MAX_HP;
	 //Unit객체 생성시 유닛의 최대체력을 초기화할 생성자
	 Unit(int hp) {
		 MAX_HP = hp;
	 } 
}
//지상유닛 GroundUnit클래스 만들기 <--- Unit조상클래스 상속 받기 
class GroundUnit extends Unit{
	
	//지상유닛의 최대 체력을 초기화
	GroundUnit(int hp) {
		super(hp);
	}
}
//탱크 지상유닛 Tank클래스 만들기 <---지상유닛이기때문에  GroundUnit클래스를 상속받고,
//						    <---기계화 유닛이기때문에  Repairable인터페이스를 구현 받는다
class Tank extends GroundUnit implements Repairable{
	
	public Tank() {
		//Tank의 최대체력 150
		super(50);
		//최대 체력과 현재체력을 똑같이 만들어 주기 
		hitPoint = MAX_HP;
	}
	
	//"Tank"문자열 반환할 메소드
	public  String toString() {
		return "Tank";
	}

}

//SCV지상유닛 클래스 만들기  <---지상유닛이기때문에  GroundUnit클래스를 상속받고,
//						<---기계화 유닛이기때문에  Repairable인터페이스를 구현 받는다
class SCV extends GroundUnit implements Repairable{
	//생성자
	SCV() {
		//scv객체의 최대최력 60 초기화
		super(60);
		//현재체력 == 최대체력 과 같아지게 만들기
		hitPoint = MAX_HP;
	}
	//유닛(tank,dropship,scv)을 치료(수리)하는 기능의 메소드
	void repair(Repairable  r) {
			
		 Unit u = (Unit)r;//실제 위 3개의 객체중 하나가 될것이다.
		 
		 //매개변수r로 전달받아 u변수에 저장된 tank또는 dropship또는 scv객체의 
		 //현재 체력이  최대체력과 같지 않을 동안만(피가 줄어 들어 있으면) 반복해서 치료하자
		 while ( u.hitPoint != u.MAX_HP ) {
			//HP증가(치료하자)
			u.hitPoint++;
		 }
		//현재 체력이 최대체력과 같을때(치료가 끝났으면, 피가 최대치가 되었을떄) 수리완료 출력
		System.out.println(u.toString() + "의 수리가 끝났습니다.");	 
	}
}


//지상유닛인 마린클래스 만들기  <-- 지상유닛이기때문에 GroundUnit클래스 상속받기 
class Marine extends GroundUnit{
	//생성자
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}	
}

//공중유닛들을 묶어서 표현하기 위한 AirUnit클래스 만들기 <-- Unit클래스 상속받기
class AirUnit extends Unit{
	//생성자 : 공중유닛의 최대체력 초기화
	AirUnit(int hp) {
		super(hp);
	}
}

//공중 유닛 중에서  DropShip클래스 만들기 <---공유닛이므로 AirUnit클래스 상속받기
//                                  <---기계유닛이므로 Repairable인터페이스 구현받기






public class Test112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
