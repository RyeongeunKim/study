import java.util.Iterator;
import java.util.Map;

//주제 : 스택 메모리 안에 현재 실행되고 있는 일반 스레드 + 데몬 스레드 정보 출력 하는 예제


//현재 실행되고 있는 스레드에게 5초 휴식을 제공하는일을 하는 스레드 
class ThreadDemo4 extends Thread{
	
	//현재 실행되고 있는 스레드의 이름을 매개변수로 전달 받아 저장할 생성자
	public ThreadDemo4(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		//현재 실행되고 있는 스레드에게  5초 휴식 주기
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

//현재 실행중인 모든 스레드에 대한 정보를 화면에 출력하는 일을 하는 스레드 
class ThreadDemo5 extends Thread{
	
	//현재 실행중인 스레드의 이름을 매개변수로 전달 받아 저장할 생성자
	public ThreadDemo5(String name) {
		super(name);
	}
	
	//현재 실행중인 스레드에 대한 정보를 화면에 출력하는 일을 run()메소드 내부에 재구현 하자
	@Override
	public void run() {
/*		
Thread클래스의  static 메소드인? getAllStackTraces()메소드 : 
- 프로세스 내부에서 실행하는 모든 스레드에 대한 정보를 얻을 수 있습니다.
- getAllStackTraces()메소드는 Map타입의 객체를 리턴 하는데...
  key는 스레드객체이고 ,  value는  스레드의 상태 기록들을 갑고 있는 StackTraceElement[] 배열 입니다.			
*/		
		//스택안의 현재 실행중인 모든 스레드객체(key)들과...
		//key에 대한 스레드의 상태기록들을 Map에 담아 반환
		Map<Thread, StackTraceElement[]>  map = Thread.getAllStackTraces();
		
		//현재 map안에 있는 모든 스레드객체(key)를 기준으로 해서 스레드(key)에 대한?
		//스레드의 상태기록들을 모두담은? Iterator반복자를 구해온다.
		Iterator it = map.keySet().iterator();
		
		//스택안에 있는 모든 스레드들의 순서를 나타낼 변수
		int x = 0;
		
		//Iterator반복기에 현재 실행중인( 스레드객체(key), 스레드 상태정보)에 대한 정보가 저장되어 있을떄까지 반복
		while (it.hasNext()) {
			 //스레드 객체(key)를 하나씪 꺼내와 담고
			 Object obj  = it.next();
			 //다운캐스팅
			 Thread t = (Thread)obj;
			 //스레드 객체(key)에 대한 스레드의 상태기록정보를 얻어서 배열에 각각 저장
			 StackTraceElement[]  ste = (StackTraceElement[])map.get(obj);
			 
			 System.out.println("[" + (++x) + "] name : " + t.getName() + 
					 			", group : " + t.getThreadGroup().getName() + 
					 			", demon : " + t.isDaemon()
					 		   );
			 //스레드 객체(key)에 대한 스레드의 상태기록 정보 출력
			 for(int i=0;  i<ste.length;  i++) {
				 System.out.println(ste[i]);
			 }//for
			 System.out.println();
		}//while
	}//run
}//ThreadDemo5클래스 





public class ThreadEx10 {

	//일반스레드(메인스레드)
	public static void main(String[] args) {
		
		ThreadDemo4 t1 = new ThreadDemo4("첫번째 작업 스레드");
		ThreadDemo5 t2 = new ThreadDemo5("두번째 작업 스레드");
		
		t1.start();
		t2.start();
		
		//Finalizer 스레드 (파이널라이저)
		//-> 가비지컬렉션(현재 사용되고 있지 않는 객체메모리 제거를 위한 데몬스레드),
		//-> System스레드그룹에 가입되어 있음
		
		//Reference Handler 스레드
		//-> 객체메모리를 참조하기 위한 핸들러 역할을 하는 데몬 스레드
		
		//Attach Listener 스레드
		//-> 이벤트를 수행하기 위한 데몬 스레드 
		
		/*
		 * [1] name : Signal Dispatcher, group : system, demon : true
		 * 
		 * [2] name : 첫번째 작업 스레드, group : main, demon : false
		 * java.base@15.0.1/java.lang.Thread.sleep(Native Method)
		 * app//ThreadDemo4.run(ThreadEx10.java:19)
		 * 
		 * [3] name : Reference Handler, group : system, demon : true
		 * java.base@15.0.1/java.lang.ref.Reference.waitForReferencePendingList(Native
		 * Method)
		 * java.base@15.0.1/java.lang.ref.Reference.processPendingReferences(Reference.
		 * java:241)
		 * java.base@15.0.1/java.lang.ref.Reference$ReferenceHandler.run(Reference.java:
		 * 213)
		 * 
		 * [4] name : Notification Thread, group : system, demon : true
		 * 
		 * [5] name : Attach Listener, group : system, demon : true
		 * 
		 * [6] name : 두번째 작업 스레드, group : main, demon : false
		 * java.base@15.0.1/java.lang.Thread.dumpThreads(Native Method)
		 * java.base@15.0.1/java.lang.Thread.getAllStackTraces(Thread.java:1649)
		 * app//ThreadDemo5.run(ThreadEx10.java:46)
		 * 
		 * [7] name : Finalizer, group : system, demon : true
		 * java.base@15.0.1/java.lang.Object.wait(Native Method)
		 * java.base@15.0.1/java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:155)
		 * java.base@15.0.1/java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:176)
		 * java.base@15.0.1/java.lang.ref.Finalizer$FinalizerThread.run(Finalizer.java:
		 * 170)
		 * 
		 * [8] name : Common-Cleaner, group : InnocuousThreadGroup, demon : true
		 * java.base@15.0.1/java.lang.Object.wait(Native Method)
		 * java.base@15.0.1/java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:155)
		 * java.base@15.0.1/jdk.internal.ref.CleanerImpl.run(CleanerImpl.java:148)
		 * java.base@15.0.1/java.lang.Thread.run(Thread.java:832)
		 * java.base@15.0.1/jdk.internal.misc.InnocuousThread.run(InnocuousThread.java:
		 * 134)
		 * 
		 */
	}

}







