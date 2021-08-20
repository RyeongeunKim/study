public class ThreadEx02 {

	//메인(주) 스레드  : 작업스레드1객체 생성  + 0.5초간격으로 .찍는 일을 하는 메인스레드 
	public static void main(String[] args) throws InterruptedException{
		System.out.println("메인스레드 시작");
		
		//작업스레드 객체 생성  : 1초 간격으로 숫자세기 하는 작업스레드1
		ThreadDemo1 td1 = new ThreadDemo1("작업스레드1");
		
		//메인스레드에게  .점을 찍는 일을 시켜 보자!
		int count = 0;
		
		do {
			//메인스레드(현재 CPU를 점유해서 일을 할수도 있는 스레드)에게 0.5초간 휴식 후 .을 찍게 한다.
			Thread.sleep(500);//0.5초 휴식
			System.out.print(".");
			count++;
			
		}while(count < 10); //점 10번 찍게 하기 
		
		System.out.println("메인스레드 끝");
	}

}
//숫자세기 작업을 할!! 작업스레드객체 생성을 위한 작업스레드 클래스 따로 만들기 
class ThreadDemo1 extends Thread{
	//숫자를 세는 작업
	int count;
	//ThreadDemo1 스레드 객체 생성시 현재 작업하고 있는 스레드 이름을 매개변수로 전달 받아 저장할 생성자
	public ThreadDemo1(String name) {
		//부모 Thread객체의 생성자를 호출해 현재 작업중인 스레드이름 저장 
		super(name);
		//초기화
		count = 0;
		//작업스레드객체 일 시작! JVM에게 요청!
		this.start();
	}
	//실제 작업스레드가 하는일을 기술하는 run메소드 오버라이딩
	@Override
	public void run() {
		//현재 작업을 시작한 스레드객체의 이름  + "시작"  출력
		System.out.println(this.getName() + "시작");
		
		do {
			//현재 작업을 하는 작업스레드에게 1초 휴식
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//현재 작업을 하는 작업스레드의 이름, 카운터 출력
			System.out.println(this.getName() + ", 카운터 = " + count);
			//카운터 1증가
			count++;
		}while(count < 10);
		
		//현재 작업이 끝나는 스레드 객체의 이름 + "끝" 출력
		System.out.println(this.getName() + "끝");
	}//run

}//실행결과 : 시간의 텀을 주어서 주메인스레드와 자식스레드가 일을 한다.










