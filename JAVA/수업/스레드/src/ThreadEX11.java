
//Thread클래스의 yield()메소드 예제

class ThreadT extends Thread{
	
	int result;
	
	public ThreadT(String name) {
		super(name);
		result = 0;
	}
	
	@Override
	public void run() {
		//현재 실행되고 있는 스레드 이름 + 몇번일을 했는지에 대한 정보를 100번 반복하여 출력
		for(int i=0; i<100; i++) {
			result += i; //누적
			//현재 실행하고 있는 스레드 이름 + 누적합계 출력
			System.out.println(Thread.currentThread().getName() + " result : " + result);
			Thread.yield();
			//- 같은 우선순위에 존재하는 스레드에게 실행기회를 양보하는 메소드 호출!
			//- 만약 같은 우선순위의 스레드가 하나도 없으면, 현재 실행중인 자기자신의 스레드를 다시 실행시킴
			
		}
	}
}

public class ThreadEX11 {

	public static void main(String[] args) {
		//작업스레드 3개 생성 후 스레드작업준비 시키기
		new ThreadT("첫번째 작업스레드").start(); //->run
		new ThreadT("두번째 작업스레드").start(); //->run
		new ThreadT("세번째 작업스레드").start(); //->run
		/*	
			결론
			yield의 의미는 사전적으로 양보의 뜻을 가지고 있다.
			예제에서 스레드 3개를 생성하고 돌린다.
			이론상으로 첫번째 작업스레드가 다 일을 마치고 두번째 작업스레드, 세번째 작업스레드가 실행될 수도 있는데
			보통 요즘 OS에서는 알아서 interrupt를 걸어서 서로서로 번갈아가면서 실행하는 것을 볼 수 있다.
			자바에서도 그런 역할을 하는 것 중 하나가 yield()메소드이다.
		
		*/

	}

}
