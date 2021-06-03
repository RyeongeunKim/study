

//작업 스레드 클래스 
public class ThreadDemo2 extends Thread {

	String name; //스레드 이름
	int interval; //스레드 휴식 시간 지정한 값 저장
	
	//생성자 : 스레드 이름 및 휴식시간을 매개변수로 전달 받아 초기화 하는 생성자
	public ThreadDemo2(String name, int interval) {
		this.name = name;
		this.interval = interval;
	}
	//작업스레드가 할일을 구현 :  현재 작업을 수행중인 스레드이름을 반복해서 출력하는일 
	@Override
	public void run() {
		for(;;) {//무한 반복
			try {
				//작업스레드 휴식 주기
				Thread.sleep(interval * 1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ThreadDemo(" + name + ") Printed....");
		}	
	}//run
	
	//method()메소드는 작업클래스 내부에 만들어져 있지만? main스레드에서 동작한다.
	public void method() {
		System.out.println("called from main()");
	}
		
}





