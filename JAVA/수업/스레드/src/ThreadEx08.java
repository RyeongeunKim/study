
public class ThreadEx08 {
	//메인스레드 를 기준으로 해서 스레드 그룹을 만들어보기(메인그룹)
	public static void main(String[] args) {
		//설명 : 기본적으로 메인스레드 자체가 하나의 메인그룹에 형성이 되어서 자동적으로 그안에 포함에 되어있기때문에... 
		//현재 실행하고 있는 메인스레드가 속해 있는  그룹에 대한 스레드그룹객체정보 얻기
		//1.
		ThreadGroup g_main = Thread.currentThread().getThreadGroup();//mian그룹
		
	
		//수동으로 스레드 그룹 만들어보기
		ThreadGroup grp1 = new ThreadGroup("Group1"); //스레드그룹이름 지정
		ThreadGroup grp2 = new ThreadGroup("Group2");
		
		//grp1스레드그룹에 대한 서브 스레드그룹 만들기 (부모스레드그룹지정,"서브스레드그룹이름")
		ThreadGroup subGrp1 = new ThreadGroup(grp1, "SubGroup1");
	
		//설명)
		//어떤 특정스레드를  rp1 스레드 그룹에 가입시켜야한다.
		//어떤 특정스레드를  rp1 스레드 그룹에 포함시키기전에 ................ 
		grp1.setMaxPriority(3);//grp1 스레드그룹의 우선순위를 3으로 설정 
		//우선순위란?
		//요약 : 특정 스레드 그룹안에 있는  Thread들이  더 많은 작업 시간을 가지도록 한다
		//보충설명)현재 grp1스레드그룹안에 있는 모든 스레드들의 우선순위값을 3으로 일괄적으로 지정가능함.
		
		//grp1스레드 그룹에 포함시킬  스레드 객체 생성 
		Thread t1 = new Thread(grp1,"t1");//(가입할 스레드그룹, 스레드이름)
		//subGrp1스레드 그룹에 포함시킬  스레드 객체 생성 
		Thread t2 = new Thread(subGrp1,"t2");//(가입할 스레드그룹, 스레드이름)
		
		//grp2스레드 그룹에 포함시킬  스레드 객체 생성 
		Thread t3 = new Thread(grp2,"t3");//(가입할 스레드그룹, 스레드이름)
		
		//스레드들 실행
		t1.start();
		t2.start();
		t3.start();
		
		
		//1.
		//현재 실행하고 있는 메인스레드가 속해 있는 그룹에 대한 스레드 그룹 이름 얻기 (main)
		System.out.print(">> List of ThreadGroup : " + g_main.getName() + "그룹, ");
		
		//현재 생성한 스레드 그룹의 개수 출력
		System.out.print("Activity ThreadGroup : " + g_main.activeGroupCount());
		
		//현재 실행중인 스레드는 의 개수 출력
		//이 스레드 그룹내, 또는 이 스레드 그룹을 상위에 가지는 그 외의 스레드 그룹 중의 액티브 스레드의 대략의 수
		System.out.println(", Activity Thread : " + g_main.activeCount());
		
		//마지막에~~
		/*스레드 그룹에 관한 정보를 자세히 알아보자*/
		//이 스레드 그룹에 대한 정보를 표준 출력에 출력합니다. 이 메서드는 디버그의 경우에만 도움이 됩니다. 
		g_main.list();
/*		
		
		java.lang.ThreadGroup[name=main,maxpri=10]    //main스레드그룹의 최대우선순위값 10
			    Thread[main,5,main] //main스레드 의  기본우선순위 정보 5
			    java.lang.ThreadGroup[name=Group1,maxpri=3] //grp1스레드그룹의 최대우선순위값 3
			        java.lang.ThreadGroup[name=SubGroup1,maxpri=3]//grp1스레드 그룹의 서브스레드그룹(subGrp1)도 최대우선순위값을 상속받아서 3이됨
			    java.lang.ThreadGroup[name=Group2,maxpri=10]//grp2스레드그룹은 최대우선순위값을 지정하지 않았으므로..
			    											//부모인 main스레드그룹의 최대우선순위값10을 상속받아 사용함
		
		*/
		
//결론
/*
스레드 그룹(ThreadGroup) 

◦서로 관련된 쓰레드를 그룹으로 묶어서 다루기 위한것.

◦모든 쓰레드는 반드시 하나의 쓰레드 그룹에 포함되어 있어야한다.

◦쓰레드 그룹을 지정하지 않고 생성한 쓰레드는 main쓰레드 그룹에 속한다.

◦자신을 생성한 쓰레드(부모 쓰레드)의 그룹과 우선순위를 상속받는다.
*/
		
		
		
		
		
		
		
		
		
		
	
	}

}
