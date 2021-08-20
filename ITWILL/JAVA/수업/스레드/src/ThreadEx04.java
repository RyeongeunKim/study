


public class ThreadEx04 {
	//메인스레드 
	public static void main(String[] args) {
		//작업스레드 객체 생성
		ThreadDemo3 td = new ThreadDemo3();
		td.start();//새로운 작업스레드가 생성되어 작업스레드에서 작업을 실행시키고
				   //다시~ main스레드로 돌아온다.
		//실행결과
//		java.lang.Exception
//		at ThreadDemo3.throwException(ThreadDemo3.java:16)
//		at ThreadDemo3.run(ThreadDemo3.java:10)
		
		td.run();//새로운 작업스레드 객체가 만들어지는 것이 아니라 main스레드 내부에서 run메소드가 실행됨
		//실행결과
//		java.lang.Exception
//		at ThreadDemo3.throwException(ThreadDemo3.java:16)
//		at ThreadDemo3.run(ThreadDemo3.java:10)
//		at ThreadEx04.main(ThreadEx04.java:16)
		
		//결론 : 1. start()메소드 호출시 작업스레드가 생성되고,run()메소드를 새로운 스택공간에 올려 놓아 호출하게 됨
		//      2. run()메소드를 직접 호출하면 작업스레드가 생성되는 것이 아니라,
		//         main메소드에서 run메소드만 호출하는 것이다.
		

	}

}







