/*
	스레드는 크게 2가지 종류로 분류 한다
	1. 일반 스레드 (독립스레드 : main스레드 및 다른 작업스레드) : 직접 개발자에 의해서 제어가 되어는 스레드
	2. 데몬 스레드 (일반 스레드에 의해서 실행되는 종속 스레드) : 일반스레드의 작업을 돕는 보조적인 역할을 하는 스레드
	
	데몬 스레드 
	- 다른 일반 스레드의 작업을 돕는 보조조적인 역할을 하는 스레드 
	- 일반 스레드가 모두 종료되면 데몬 스레드는 강제적으로 자동 종료 된다.
	- 일반 스레드를 생성 한 다음 일반 스레드를 실행하기 전에  setDemon(true);를 호출 한다.
	
	시나리오 
	어떤 두개의 스레드가 있다고 가정 했을때....
	하나의 스레드가 종료 될때(메인스레드 종료)..
	나머지 일반 스레드도 강제로 자동 종료 되게 하기 
*/


//데몬스레드 역할을 할 일반 스레드 클래스 만들기 (단! run 메소드가 오버라이딩 되어 있는 클래스이니 참고!)
class T implements Runnable{
	
	//작업파일을 자동저장을 할것인가 말것인가 여부를 판단하는 값이 저장되는 변수 
	static boolean autoSave = false;
	
	//작업파일을 자동 저장 하는 기능을 표시하는 일  -> run
	@Override
	public void run() {
		//무한 반복
		while (true) {
			//3초 간격으로 작업파일 자동되었다! 라고 출력 하기 위해 
			//3초 간 스레드 휴식 
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			
			//autoSave변수의 값이 true일때...
			//작업파일이 자동 저장되었습니다. 구문 출력되게  아래의 autoSave()메소드 호출
			if(autoSave) {
				autoSave();
			}
		}
	}//run
	
	//작업 파일이 자동 저장되었다! 라는 구문을 출력할 기능의 메소드 
	public void autoSave() {
		System.out.println("작업파일이 자동 저장 되었습니다.");
	}

}


public class ThreadEx09 {
	//일반 스레드 (메인스레드)
	public static void main(String[] args) throws InterruptedException {
		//일반 스레드 (작업스레드) 만들기
		Thread t = new Thread(new T());
		//위 일반 스레드 -> 데몬스레드로 만들기
		t.setDaemon(true);
	
		t.start();
		
		//메인스레드 에서 카운트 다운 작업
		for(int i=0; i<=20; i++) {
			//1초휴식 
			Thread.sleep(1000);
			//출력
			System.out.println(i);
			
			//i변수 값이 5가 되면 autoSave변수 값을  true로 바꾸기 
			if(i == 5) {
				T.autoSave = true;
			}
		}//for
		
		System.out.println("프로그램을 종료 합니다.");
		
	}//main메소드(메인스레드)
}//클래스 











