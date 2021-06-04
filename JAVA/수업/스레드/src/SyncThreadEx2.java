import java.util.Stack;

//주제 : 스레드 동기화 처리 자판기 예제

/*
 	시나리오
 	- 음료수를 제공하는 일을하는 공급자 스레드 -> 자판기에서 음료를 뽑아먹는 소비자 스레드
 	  공급자 스레드가 음료수를 자판기에 제공해야 소비자 스레드는 자판기에서 음료를 뽑아먹을 수 있게 처리하자
*/

//자판기 클래스 (공급자 스레드와 소비자 스레드가 사용할 공용 데이터 역할을 함)
class AutoMachine{
	//자판기 공간(스택객체 메모리) 생성
	Stack store = new Stack();
	
	//음료 공급자 스레드가 자판기 공간에 음료캔을 공급하기 위한 기능의 메소드
	public synchronized void putDrink(String drink) { //어떤 음료캔을 집어 넣는지에 대한 음료이름 받기
		
		//음료수를 자판기(스택)에 공급했으니 기다리고 있는 소비자 스레드야~ 스택에서 음료를 뽑아 먹어라~
		this.notify();
		
		//자판기 공간(스택객체 메모리)에 음료캔 집어 넣기(저장)
		store.push(drink);

	}
	
	//소비자 스레드가 자판기 공간에 채워져 있는 음료캔을 뽑아먹을 수 있게 하기 위한 기능의 메소드
	//synchronized 키워드로 메소드에 동기화 처리를 하면 하나의 스레드가 getDrink메소드로 진입하여
	//일을 모두 마칠 때까지 다른 스레드가 getDrink 메소드에 진입하지 못한다.
	public synchronized String getDrink() { //리턴 타입 String? 어떤 음료캔을 뽑아먹을건지 출력하기 위해 문자열로 리턴함.
		
		//자판기(스택) 공간에 음료캔이 저장되어 있지 않을 때 반복
		while (store.isEmpty()) {
			
			//자판기(스택) 공간에 들어오지 말고 소비자 스레드 기다리게 하기
			//이유 : 공급자 스레드가 자판기(스택)에 음료수를 채워넣어야 음료를 뽑아 먹을 수 있기 때문
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		//자판기(스택)공간의 가장 위쪽 첫번째에 저장된 음료수를 뽑아먹는데..
		//어떤 음료수를 뽑아먹었는지 알려주기 위해 문자열로 바꿔서 반환
		return store.pop().toString();
	}
}

//공급자 스레드를 만들기 위한 클래스
class Producer implements Runnable{
	
	//자판기에 음료수를 공급하기 위해 자판기 객체를 생성해 저장할 참조변수 선언
	private AutoMachine machine;
	
	//자판기 객체를 매개변수로 전달받아 초기화할 생성자
	public Producer(AutoMachine am) {
		machine = am;
	}
	//자판기(스택)에 9개의 음료수 공급하는 일을 하는 run()메소드 오버라이딩
	@Override
	public void run() {
		for(int i=1; i<10; i++) {
			//현재 실행 중인 공급자스레드가 음료수를 자판기에 공급하고 있다는 것을 시각적으로 보여주기 위해 출력
			System.out.println(Thread.currentThread().getName() + " : 음료수 No."+ i + "채워넣음");
			//실제로 음료수를 자판기(스택공간)에 집어 넣기
			machine.putDrink("음료수 No." + i);
			//현재 실행 중인 공급자스레드에게 0.1초 휴식
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for문
		
	}//run
	
}//공급자 클래스 끝

//소비자 스레드를 만들기 위한 클래스
//->자판기에 저장된 음료를 뽑아먹는 소비자 스레드를 만들기 위한 클래스
class Consumer implements Runnable{
	
	//자판기객체를 저장할 참조변수
	private AutoMachine machine;
	
	//자판기객체를 매개변수로 전달받아 저장할 생성자
	public Consumer(AutoMachine am) {
		machine = am;
	}
	//자판기(스택)에서 음료를 뽑아먹는 기능을 표현하기 위한 run()메소드 오버라이딩
	@Override
	public void run() {
		
		//자판기에서 9개의 음료수 뽑아먹는 작업
		for(int i=1; i<10; i++) {
			
			//현재 실행중인 소비자 스레드가 자판기 공간에서 음료를 뽑아먹는 효과를 출력
			System.out.println(Thread.currentThread().getName() 
					+ " : " + machine.getDrink() +  " 뽑아 먹음");
			//소비자 스레드 0.1초 휴식
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}//run
}//소비자 클래스

public class SyncThreadEx2 {
	public static void main(String[] args) {
		
		//자판기 객체 생성
		AutoMachine autoMachine = new AutoMachine();
		
		//공급자 스레드를 만들기 위한 run()메소드가 오버라이딩 되어있는 클래스에 대한 객체 생성
		Producer minsu = new Producer(autoMachine);
		
		//공급자 스레드 만들기
		Thread t1 = new Thread(minsu, "민수 공급자");
		
		//공급자 스레드 시작 준비 시키기
		t1.start();
		
		//소비자 스레드를 만들기 위한 run()메소드가 오버라이딩 되어 있는 클래스에 대한 객체 생성
		Consumer gildong = new Consumer(autoMachine);
		
		//소비자 스레드 만들기
		Thread t2 = new Thread(gildong, "길동 소비자");
		
		//소비자 스레드 시작 준비 시키기
		t2.start();
		

	}

}
