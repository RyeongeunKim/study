
//화장실 설계도(클래스) : 각 스레드들(아버지,어머니,누나,형,나)이 공용으로 사용하는 화장실 문을 가지고 있음
class Toilet{
	
	//synchronized 키워드
	// - 자바에서 스레드 동기화를 위한 장치
	// - synchronized 키워드를 지정한 메소드 블럭에 진입하는 스레드가 락(lock)을 걸고 소유하며, 
	//	 락(lock)을 소유하지 못한 다른 스레드는 synchronized 키워드를 지정한 메소드 앞에서
	//	 락(lock)을 소유할 때 까지 대기함.
	
	//메소드 (화장실 사용 문 기능)
	public synchronized void openDoor(String name) {//화장실에 들어오는 사람의 이름을 매개변수로 받는다.
		//특정 사람이 화장실 문에 입장하는 것을 표현하기 위해 출력
		System.out.println(name + "화장실 입장");
		//대변보는 시간 억번 반복
		for(int i=0; i<100000000; i++) {
			//만 번이 될 때마다 대변보는 효과 출력
			if(i == 10000) {
				System.out.println(name + " : 끄으응~~");
			}
		}
		//대변 다보고 효과 출력
		System.out.println(name + " : 아~시원해~");
		
	}//openDoor메소드 끝
	
}//화장실 클래스 끝

//아버지, 누나, 어머니, 형, 나 등..각각의 스레드를 생성할 하나의 사람클래스 설계도 만들기
class Family extends Thread{
	//화장실 객체의 주소를 저장하기 위한 참조변수 선언
	Toilet toilet;
	//가족 중에서 화장실을 이용할 한명의 이름을 저장할 변수 선언
	String who;
	//Family클래스로 부터 스레드 생성 시 스레드의 이름과 사용할 화장실 객체(new Toilet()객체)를
	//매개변수로 전달받아 초기화할 생성자
	public Family(String name, Toilet t) {
		who = name;
		toilet = t;
	}
	//화장실 문으로 들어가는 일을하는 run메소드 오버라이딩
	@Override
	public void run() {
		toilet.openDoor(who);
	}
}

public class SyncThreadEx1 {

	public static void main(String[] args) {
		
		//화장실 객체 생성
		Toilet t = new Toilet();
		
		//작업스레드(아버지, 어머니, 누나, 형, 나) 생성
		new Family("아버지", t).start(); //스레드 준비 상태로 만들기
		new Family("어머니", t).start(); //스레드 준비 상태로 만들기
		new Family("누나", t).start(); //스레드 준비 상태로 만들기
		new Family("형", t).start(); //스레드 준비 상태로 만들기
		new Family("나", t).start(); //스레드 준비 상태로 만들기
		

	}

}
