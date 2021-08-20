import java.util.ArrayList;
import java.util.Vector;


//주제 : String 과  StringBuffer의 속도 차이 비교
class Clock{
	
	//작업할 클래스 이름(String 또는 StringBuffer)을 저장할 변수 
	private String clockName;
	//작업 시작 시간 저장할 변수
	private long startTime;
	//작업 종료 시간 저장할 변수
	private long endTime;
	//작업 소요 시간 저장할 변수
	private long leadTime;
	
	//작업할 클래스 이름을  clockName변수에 저장할 생성자
	public Clock(String name) {
		clockName = name;
	}
	
	//작업 시작 시간을 startTime변수에 초기화할 메소드 
	public void clockStart() {
		//작업시작시간(컴퓨터의 현재 시간으로 구해서 저장)
		startTime = System.nanoTime();
	}
	
	//작업 소요시간을 leadTime변수에 초기화할 메소드
	public void clockEnd() {
		//컴퓨터 시계로부터 현재 작업종료 시간 반환 메소드
		endTime = System.nanoTime();
		//소요시간 = 작업시작시간 - 작업종료 시간
		leadTime = (endTime - startTime);	
	}
	
	//작업후 
	//작업한 클래스명 과  작업소요시간 정보를 출력 해주는 기능의 메소드
	public void showInfo() {
		System.out.println(clockName + ":" + leadTime);
	}	
}


public class Test121 {
	public static void main(String[] args) {
	
		//반복 수행할 횟수 100 지정
		final int maxCount = 100;
		
		//String클래스를 위한 시계 객체 생성
		Clock clockString =  new Clock("String");
		
		//String클래스의 작업 시작시간 초기화 하는 메소드 호출
		clockString.clockStart();
		
		String str = "Play";
		
		//100번 반복해서  String객체생성후 저장 
		for(int i=0;  i<maxCount; i++) {
			
			str = str + "JAVA";
		}
		System.out.println(str);
		
		//String 작업소요시간 을 구할 메소드 호출
		clockString.clockEnd();
		
		//String 작업후 정보 출력
		clockString.showInfo();
		
		//----------------------------------------------------
		//StringBuffer를 위한 시계 객체 생성
		Clock clocksb = new Clock("StringBuffer");
		
		//StringBuffer 작업시작 시간 구할 메소드 호출
		clocksb.clockStart();
		
		StringBuffer sb = new StringBuffer("Play");
		
		//100번반복작업
		for(int i=0; i<maxCount; i++) {
			sb.append("JAVA");
		}
		System.out.println(sb);
		
		//StringBuffer 작업 소요시간 수할 메소드 호출
		clocksb.clockEnd();
		
		//StringBuffer 작업후 소요시간 정보 출력 해주는 메소드호출
		clocksb.showInfo();
		
		//결론 
		// 변하지 않는 문자열을 저장할떄는  String클래스에 대한 문자열객체를 생성 하여 저장
		// 변할수 있는 문자열을 저장할떄는 StringBuffer클래스에 대한 문자열객체를 생성 하여 저장
//
//		
//		Vector v = new 	Vector(2);//가변길이 배열
//		v.add("1");
//		v.add("2");
//		v.add("3");
//		
//		//for반복문을 이용해 ArrayList라는 이름의 가변길이 배열 공간에 저장된
//		//데이터들을 하나씩 하나씩 반복해서 꺼내와서 출력
//		for(int i=0;  i<v.size(); i++) {
//			
//			Object object = v.get(i);
//			System.out.println(object);
//		}
//		System.out.println("---------------------------");
//		
//		
//		//ArrayList <-가변으로 늘어나는 배열
//		ArrayList list  = new ArrayList();
//		
//		list.add("안녕하세요");
//		list.add(123);
//		list.add(123.4);
//		
//		//for반복문을 이용해 ArrayList라는 이름의 가변길이 배열 공간에 저장된
//		//데이터들을 하나씩 하나씩 반복해서 꺼내와서 출력
//		for(int i=0;  i<list.size(); i++) {
//			
//			Object object = list.get(i);
//			System.out.println(object);
//		}
//		
//		
//		
//		//ArrayList라는 이름의 가변길이 배열에 저장된 데이터 갯수
//		int count = list.size();
//		System.out.println(count);
//		
//		
		
	}

}








