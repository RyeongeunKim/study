package iteration;

public class Test34 {

	public static void main(String[] args) {
		
		//문제 : 0과 10사이의 짝수들의 합구하기
		
		//4바이트 크기의 정수값을 저장할 sum1변수 선언 후 0 저장
		int sum1 = 0;
		
		// for반복문을 이용! 초기식 -> int j=0; 
					      //조건식은 -> j변수의 값이 10보다 작거나 같냐?
	      				  //증감식은 -> j변수에 저장된 값을 2씩 증가
		//반복 출력결과

		for(int j=0; j<=10; j+=2) {
			sum1 += j;
			System.out.println(j + " : " + sum1);
		}
		
		//출력결과
		/*
			0 j변수에 저장된 값 출력 : 0 sum1변수에 저장된 값 출력
			2 : 2
			4 : 6
			6 : 12
			8 : 20
			10 : 30
		*/
		
		System.out.println("------------------------------------");
		
		//문제 : for문을 이용하여 "Hello World"문자열을 10번 반복해서 출력!
		
		for(int i=0; i<10; i++) {
			System.out.println("Hello World");
		}
		
		System.out.println("for문을 빠져나옴");
		System.out.println("------------------------------------");
		
		//문제: for문을 이용하여 1부터 10까지 숫자중 홀수들의 합을 최종적으로 구해 한번만 출력
		//출력결과
		//총 합계는 25
		
		int sum2 = 0;
		
		for(int i=1; i<11; i+=2) {
			sum2 += i;
		}
		
		System.out.println("총 합계는 " + sum2);
		System.out.println("--------------------------------------");
		
		//문제 : 1부터 100까지의 짝수합(2550) 출력
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2==0) {
				sum += i;
				System.out.println(sum);
			}
		}
		
		System.out.println("--------------------------------------");
		/*
			break문 
			break문은 현재 위치에서 가장 가까운 반복문을 벗어나는데 사용하는 키워드
			주로 if문과 함께 사용되어 특정 조건식을 만족하면 반복문을 벗어나는데 사용하는 키워드
		*/
		//10번반복하여 i변수값을 출력하되 i변수에 저장되는 값이 5가 되면, for반복물을 완전히 빠져나가게 하기
		for(int i=0; i<10; i++) {
			
			if(i == 5) {
				break; //for반복문 {}블럭 영역 완전히 빠져나가게 하기
			}
			
			System.out.println(i);
		}
		
		System.out.println("----------------------------------------");
		
		//문제 : for반복문을 이용하여 구구단 출력
		
		//단 제목 붙이기 표시
		for(int i=2; i<=9; i++) {
			
			//%6d는 정수형으로 6자리까지 나타냄
			System.out.printf("%6d단", i);
	
		}
		System.out.println();
		
			for(int i=1; i<=9; i++) {//바깥쪽 for	행(세로) 반복
				
				for(int j=2; j<=9; j++) {//안쪽 for		열(가로) 반복		2단부터 9단까지
					
					//System.out.print(j + "X" + i + "=" + (j*i) + "     ");
					System.out.printf("%d X %d = %2d  ", j,i,(j*i));
					
				}//안쪽 for닫는 기호
				
				//하나의 행이 완성될 때 마다 줄바꿈 출력
				System.out.println();
				
			}//바깥쪽 for닫는 기호
			
		
			
	System.out.println("-----------------------------------------------------");
	
	/*
	   문제 : 다중 for문 사용하여 아래와 같이 * 출력
	 	*
	 	**
	 	***
	 	****
	 	*****
	 
	 */
	
	for(int i=0; i<5; i++) {
		for(int j=0; j<i+1; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int i=1; i<=5; i++) {//5번 반복
		for(int j=1; j<=i; j++) {//i변수에 저장된 값 만큼 반복
			System.out.print("*");
		}
		System.out.println();
	}
		
	}

}
