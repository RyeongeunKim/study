
//주제 : 플래그 변수를 이용하여 현재 실행중인 스레드 강제 중지 시키기



//작업스레드의 일을 수행하는 run()메소드가 존재하는 클래스 
class StopThreadDemo1 implements Runnable{
	
	//플래그 변수  : 스레드 진행 또는 중지에 대한 조건을 판단하는 값을 저장할 변수 
	private boolean stoped = false;
	
	
	//작업스레드의 일을 수행하는 run()메소드 오버라이딩
	@Override
	public void run() {
		//플래그 변수의 값이 true가 될때까지 반복
		while (!stoped) {
			//메세지를 출력하는일
			System.out.println("Thread는 현재 동작하고 있다.....");
			//메세지를 출력한 후 0.5초 휴식
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}//while끝
		
		System.out.println("Thread는 현재 dead.....");
	}//run
	
	
	//스레드를 중지 하기 위한 메소드 만들기
	public void stop() {
		//스레드를 중지 시키기 위해 플래그변수의 값을 true로 저장
		stoped = true;
	}

}

//메인스레드가 존재하는 클래스 
public class StopThreadEx1 {
	
	//일반 메소드  : 작업스레드 객체를 생성하여 작업스레드 일 시작 시키는 기능의 메소드 
	public void process() {
		//run메소드가 저장되어 있는 클래스의 객체 생성
		StopThreadDemo1 std = new StopThreadDemo1();
		//실제 작업스레드 객체 생성
		Thread thread = new Thread(std);
		//작업스레드 일시키기
		thread.start();
		
		//작업스레드 일 시킨후 메인스레드 1초간 휴식 주기
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//stop메소드를 호출하여 플래그변수값을 true로 저장
		//즉~! 강제로 작업스레드 일 중지 시키기
		std.stop();	
	}

	//메인스레드
	public static void main(String[] args) {
		System.out.println("## 플래그 변수를 이용한 스레드 종료 기능 시작");	
		
		StopThreadEx1 ste = new StopThreadEx1();
		ste.process();
	}

}









