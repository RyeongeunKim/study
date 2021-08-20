

/*인터페이스 연습1*/

//MobilePhone 인터페이스 만들기
interface MobilPhone{
	//전화거는 기능을 정의 해 놓을 sendCall 추상메소드 만들기 , 리턴타입 boolean	
	public abstract boolean sendCall();
	//전화받는 기능을 정의 해 놓을 receiveCall 추상메소드 만들기, 리턴타입 boolean
	public boolean receiveCall();
	//문자보내는 기능을 정의 해 놓을 sendSMS추상메소드 만들기, 리턴타입 boolean
	boolean sendSMS();
	//문자 받는 기능을 정의 해 놓을 receiveSMS추상메소드 만들기, 리턴타입 boolean
	public boolean receiveSMS();
}
//MP3 인터페이스 만들기
interface MP3{
	//음악 재생기능을 정의 해 놓을 play추상메소드 만들기, 리턴타입 void
	public void play();
	//음악 정지기능을 정의 해 놓을 stop추상메소드 만들기, 리턴타입 void
	public abstract void stop();
}
//MusicPhone 인터페이스 만들기 (MobiePhone, MP3) 인터페이스 상속 받아 만들기 
interface MusicPhone extends MobilPhone, MP3{
//MobilePhone인터페이스로부터 상속받은 추상메소드?
	//public abstract boolean sendCall();
	//public boolean receiveCall();
	//boolean sendSMS();
	//public boolean receiveSMS();
//MP3인터페이스로 부터 상속 받은 추상메소드?
	//public void play();
	//public abstract void stop();
	
	//playMP3RingTone추상메소드 만들기, 리턴타입 void
	public void playMP3RingTone();

}
//PDA 클래스 만들기
class PDA{
	//두개의 정수값을 매개변수로 전달 받아 그 합을 int로 리턴 하는  calculate메소드 만들기 
	public int calculate(int x, int y) {
		return x + y;
	}
}
//SmartPhone 클래스 만들기 ( PAD클래스 상속받고,  MusicPhone인터페이스 구현)
class SmartPhone extends PDA implements MusicPhone{
	
//     PDA클래스로 부터 상속받은 메소드 
//		public int calculate(int x, int y) {
//			return x + y;
//		}
	
		//MP3인터페이스를 상속한 MusicPhone인터페이스의 모든 추상메소드 재구현(오버라이딩)
		//play메소드에 재구현할 내용 ->  "음악재생" 출력
		@Override
		public void play() {
			System.out.println("음악재생");
		}
		//stop메소드에 재구현할 내용 ->  "재생중지" 출력
		@Override
		public void stop() {
			System.out.println("재생중지");
		}
	
	//MobilePhone클래스가 상속한  MusicPhone의 모든 추상메소드를 재구현(오버라이딩)
		//sendCall메소드에 재구현할 내용 -> "전화걸기" 출력 , true 리턴
		@Override
		public boolean sendCall() {
			System.out.println("전화걸기");
			return true;
		}
		//receiveCall메소드에 재구현할 내용 -> "전화받기" 출력, true 리턴
		@Override
		public boolean receiveCall() {
			System.out.println("전화받기");
			return true;
		}	
		//sendSMS메소드에 재구현할 내용 ->"SMS보내기" 출력, true리턴
		@Override
		public boolean sendSMS() {
			System.out.println("SMS보내기");
			return true;
		}
		
		//receiveSMS메소드에 재구현할 내용 ->"SMS받았다" 출력 , true 리턴
		@Override
		public boolean receiveSMS() {
			System.out.println("SMS받았다");
			return true;
		}
		
	//MusicPhone의 모든 추상메소드를 재구현(오버라이딩)
		//playMP3RingTone메소드에 재구현할 내용 -> 비워두자
		@Override
		public void playMP3RingTone() {
			
		}		
}
public class Test109 {
	public static void main(String[] args) {
		//SmartPhone객체 생성 , 참조변수이름 p
		SmartPhone p = new SmartPhone();
		System.out.println("철수가 SmartPhone을 구입하였다.");
		System.out.print("영희에게 "); p.sendCall();
		System.out.print("철수는 영희가 지금 부재중...이라는.."); p.receiveSMS();
		System.out.print("화가난 철수는 최신음악을 들으려고!"); p.play();
		/*
			출력결과
			철수가 SmartPhone을 구입하였다.
			영희에게 전화걸기
			철수는 영희가 지금 부재중...이라는..SMS받았다
			화가난 철수는 최신음악을 들으려고!음악재생
		*/
	}

}




