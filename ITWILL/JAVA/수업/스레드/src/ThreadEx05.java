import java.util.Scanner;

/*
	어떤값을 입력하여 엔터키를 누르면...
	결과가 오랜시간뒤에 나온다고 가장할때...
	결과가 나오기전에 약간의 효과를 줘서  ~잠시만 기다려주세요.. 라는 메세지를 스레드를 이용하여 처리하기
	
	예)
	숫자 입력 : ___
	잠시만 기다려주세요.... <----스레드를 이용하여 처리 
	결과 : ~~~
*/

//스레드가 할일을 구현해 놓는 run메소드가 선언되는 있는 클래스 만들기
class TestThread implements Runnable{
	
	//스레드가 할일을 구현해 놓을 run메소드 오버라이딩
	@Override
	public void run() {
		System.out.println("\n\n잠시만 기다려 주세요...\n\n");
	}
}

//메인스레드가 존재하는 클래스 
public class ThreadEx05 {	
	//메인스레드
	public static void main(String[] args) {

		System.out.print("숫자입력 : ");
		
		//키보드로부터 입력받은 데이터를 바이트단위로 읽어 들일 스트림통로객체 생성
		Scanner s = new Scanner(System.in);   
		//키보드로부터 입력받은 바이트데이터들을  long데이터로 스캔한후 반환 하는 메소드 호출
		long num = s.nextLong();
		//--------------------------------------------------------------
		//run()메소드를 가지고 있는 객체 생성
		TestThread te = new TestThread();
		//실제 작업스레드객체 생성시 
		//run()메소드를 가지고 있는 new TestThread()객체를 생성자로 전달해 스레드를 만들어준다
		Thread t = new Thread(te); //작업스레드 생성
		//실제 작업스레드 시작 시키기
		t.start();
		//------------------------------------------------------------------
		
		//숫자 0부터 우리가 입력받은 숫자까지의 총합을 계산하여 저장할 변수 
		long total = 0;
		
		for(long i=0;   i<=num; i++) {
			total += i;
		}
		
		System.out.println("결과 : " + total);
	}

}










