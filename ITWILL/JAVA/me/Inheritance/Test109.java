

/*인터페이스 연습1*/

//MobilePhone 인터페이스 만들기
	//전화거는 기능을 정의 해 놓을 sendCall 추상메소드 만들기 , 리턴타입 boolean	
	//전화받는 기능을 정의 해 놓을 receiveCall 추상메소드 만들기, 리턴타입 boolean
	//문자보내는 기능을 정의 해 놓을 sendSMS추상메소드 만들기, 리턴타입 boolean
	//문자 받는 기능을 정의 해 놓을 receiveSMS추상메소드 만들기, 리턴타입 boolean
//MP3 인터페이스 만들기
	//음악 재생기능을 정의 해 놓을 play추상메소드 만들기, 리턴타입 void
	//음악 정지기능을 정희 해 놓을 stop추상메소드 만들기, 리턴타입 void

//MusicPhone 인터페이스 만들기 (MobiePhone, MP3) 인터페이스 상속 받아 만들기 
	//playMP3RingTone추상메소드 만들기, 리턴타입 void

//PDA 클래스 만들기
	//두개의 정수값을 매개변수로 전달 받아 그 합을 int로 리턴 하는  calculate메소드 만들기 

//SmartPhone 클래스 만들기 ( PAD클래스 상속받고,  MusicPhone인터페이스 구현)
	//MP3인터페이스를 상속한 MusicPhone클래스의 모든 추상메소드 재구현(오버라이딩)
		//play메소드에 재구현할 내용 ->  "음악재생" 출력
		//stop메소드에 재구현할 내용 ->  "재생중지" 출력
	//MobilePhone인터페이스를 상속한  MusicPhone의 모든 추상메소드를 재구현(오버라이딩)
		//sendCall메소드에 재구현할 내용 -> "전화걸기" 출력 , true 리턴
		//receiveCall메소드에 재구현할 내용 -> "전화받기" 출력, true 리턴
		//sendSMS메소드에 재구현할 내용 ->"SMS보내기" 출력, true리턴
		//receiveSMS메소드에 재구현할 내용 ->"SMS받았다" 출력 , true 리턴
	//MusicPhone의 모든 추상메소드를 재구현(오버라이딩)
		//playMP3RingTone메소드에 재구현할 내용 -> 비워두자

public class Test109 {
	public static void main(String[] args) {
		//SmartPhone객체 생성 , 참조변수이름 p
		
		/*
			출력결과
			철수가 SmartPhone을 구입하였다.
			영희에게 전화걸기
			철수는 영희가 지금 부재중...이라는..SMS받았다
			화가난 철수는 최신음악을 들으려고!음악재생
		*/
	}

}




