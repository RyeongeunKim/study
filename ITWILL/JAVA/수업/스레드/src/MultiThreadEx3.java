import javax.swing.JOptionPane;

// 전 MultiThreadEx2.java파일의 예제 업그레이드 시키기
// 업그레이드 내용 : 10초간 다이얼로그창에 아무것도 입력하지 않으면 강제로 다이얼로그창 종료 되게 하기 

public class MultiThreadEx3 {//메인스레드가 존재하는 클래스 

	//사용자가 10초안에 데이터를 다이얼로그창에 입력했는지 판단(검사)하는 플래그 변수 선언
	//플래그변수의 값이 true로 저장되면?(입력 했음)
	//플래그변수의 값이 false로 저장되면?(입력 안함)
	static boolean inputCheck = false;
	
	//메인스레드 역할: 두개의 작업 스레드객체를 생성하고 실행시키는 역할만 함 
	public static void main(String[] args) {
		//작업1을 하는  InputThreadDemo클래스로 부터 작업 스레드 객체 생성 후 작업 시작 시키기
		new InputThreadDemo().start();
		//작업2를 하는  MultiThreadDemo3클래스로 부터 작업 스레드 객체 생성 후 작업 시작 시키기 
		new MultiThreadDemo3().start();
	}
}

//작업1 스레드 객체를 생성하기 위한 클래스 설계도
class InputThreadDemo extends Thread{	
	@Override
	public void run() { //스레드가 해야할일 작성 하는 곳 (작업1. 다이얼로그창에 입력받은 내용 출력)
		System.out.println("10초안에 값을 입력해야 합니다.");
		String input = JOptionPane.showInputDialog("아무것이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
		//다이얼로그창에 데이터를 입력했으면 체크변수의 값을 true로 바꿔서 저장 
		MultiThreadEx3.inputCheck = true;
	}
}

//작업2 스레드 객체를 생성하기 위한 클래스 설계도 
class MultiThreadDemo3 extends Thread{
	
	@Override
	public void run() { //스레드가 해야할일 작성 하는 곳 (카운트 다운 작업)
	
		for(int i=10; i>0; i--) {
			//사용자가 10초안에 다이얼로그창에 데이터를 입력하면?(inputCheck변수에 저장된 값이 true이면?)
			if(MultiThreadEx3.inputCheck) {
				return;//카운트 다운 작업 끝내기 위해 for반복을 빠져나가자
			}
			System.out.println(i);//작업
			try {
				Thread.sleep(1000); //1초 휴식
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
		
		System.out.println("10초 동안 값이 입력 되지 않아 프로그램을 강제로 종료 합니다.");
		//프로그램 강제 종료
		System.exit(0);
	}//run
}












