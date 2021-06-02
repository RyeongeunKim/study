



/*싱글 스레드에 대한 예제*/

public class SingleThreadEx1 {

	//메인(주,싱글)스레드 
	public static void main(String[] args) {
		
	//싱글(주) 스레드 작업 시작 시간 저장
		//System.currentTimeMillis()메소드는 
		//1970년 1월 1일부터 현재까지 경과 한 시간을 long값으로 리턴하며,
		//밀리세컨(1/1000초값)으로 반환
		long startTime = System.currentTimeMillis();
		/*
			1970년 1월1일부터 현재까지 경과 한 시간을 저장하는 이유는?
			작업을 할때 걸린시간을 측정 하기 위함이다.
		*/
		
		/*싱글(주) 스레드 작업1*/
		//10번 반복하면서 *을 1초에 한번씩 10번찍기 
		for(int i=0;  i<10; i++) {		
			//싱글(주)스레드 1초 휴식
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
			//작업
			System.out.print("*");
		}//for
		
		// *찍기 작업1 소요시간 (초) 구하기  : (별을 10번 찍은 후의 현재시간 - 별 10번찍기전 작업1 시작시간) / 1000
		System.out.println("작업1 소요시간 : " + (System.currentTimeMillis() - startTime) / 1000 + "초");
		
		/*싱글(메인)스레드 작업2*/
		//10번 반복하면서 #를 1초 간격으로 10번 찍기 
		for(int i=0; i<10; i++) {			
			try {
				Thread.sleep(1000); //1초 휴식
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("#");//작업
		}
		
		// #찍기 작업2 소요시간 (초) 구하기  : (#을 10번 찍은 후의 현재시간 - 별 10번찍기전 작업1 시작시간) / 1000
		System.out.println("작업2 소요시간 : " + (System.currentTimeMillis() - startTime) / 1000 + "초");	
	

	}

}









