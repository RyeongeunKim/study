
//주제 : 두 작업 스레드에 각각 우선 순위를 부여해 일시키기

//작업스레드객체를 생성할 클래스 만들기
class A4 extends Thread{
	
	//스레드가 할일을 구현해 놓을 run()메소드 오버라이딩
	@Override
	public void run() {
		//숫자0부터 999까지 1000번 반복해서 출력
		for(int i=0; i<1000; i++) {
			System.out.println("A4작업스레드 num:" + i);
		}
	}	
}

//작업스레드객체를 생성할 클래스 만들기
//작업스레드객체를 생성할 클래스 만들기
class B4 extends Thread{	
	//스레드가 할일을 구현해 놓을 run()메소드 오버라이딩
	@Override
	public void run() {
		//숫자0부터 999까지 1000번 반복해서 출력
		for(int i=0; i<1000; i++) {
			System.out.println("B4작업스레드 num:" + i);
		}
	}	
}

public class PriorityMain {
	//메인스레드 
	public static void main(String[] args) {
		
		//작업스레드 객체들 생성
		A4 ap = new A4();
		B4 bp = new B4();
		
		ap.setPriority(3); //A4작업스레드에게 우선순위 3을 부여 
		bp.setPriority(8); //B4작업스레드에게 우선순위 8을 부여  <--- 작업을 더많이 할것임
		
		ap.start();
		bp.start();
		/*
			설명
			각각 A4작업스레드, B4작업스레드는 "A4"와 "B4"를 1000번 출력하는 작업을 수행하고,
			main스레드에서 우선순위를 각각 3과 8로 설정 하였다.
			실행결과를 보면 우선순위가 더 높은 B4작업스레드가 일을 먼저 많이 실행 해서 완료 될때 까지 
			A4작업스레드는 나중에 일처리를 하고 있다는 것을 알수 있다.
		*/

	}

}





