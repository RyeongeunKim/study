
public class ThreadEX03 {

	public static void main(String[] args) {
		
		//두개의 자식 스레드 생성
		ThreadDemo2 td1 = new ThreadDemo2("td1", 5); //스레드 이름, 스레드 휴식시간(초)
		ThreadDemo2 td2 = new ThreadDemo2("td2", 10); //스레드 이름, 스레드 휴식시간(초)
		
		//각각 두개의 작업스레드 실행 준비 상태로 만들기 (각각 두개의 작업스레드 내부에서 run()메소드의 실행을 함)
		td1.start(); // -> run()
		td2.start(); // -> run()
		
		//두개의 다른 자식스레드 객체에 있는 메소드를 호출함!
		td1.method(); //main스레드 내부에서 실행됨
		td2.method(); //main스레드 내부에서 실행됨
		
		System.out.println("finished!!");
	}

}
