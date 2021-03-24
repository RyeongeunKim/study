package array;
/*
	4. 향상된 for 반복문
	
	   - JDK 1.5부터 배열의 모든 요소를 참조하기 위해 새롭게 추가된 반복문
	   
	   - 문법
	   	 
	   	 for(타입		변수이름 : 배열이름 ){
	   	 	배열의 길이만큼 반복적으로 실행하고자 하는 명령문;
	   	 }
	   	 
	   	 설명 : 배열이름 <- 배열 
	   	 	   타입 변수이름 <- 변수
	   	 	   
	   	 	   배열의 길이만큼 for반복하는데... 
	   	 	   먼저 배열의 0번째 인덱스 위치의 값부터 꺼내어서 변수에 저장 후
	   	 	   반복적으로 실행하고자 하는 명령문을 수행함.
	   	 	   그리고 다시~ 배열의 1번째 인덱스 위치의 값을 꺼내어서 변수에 저장 후
	   	 	   반복적으로 실행하고자 하는 명령문을 수행함.
	   	 	   더 이상 배열메모리에서 꺼내올 값이 존재 하지 않으면 for반복문을 완전히 빠져 나감.

*/
public class Test42 {

	public static void main(String[] args) {
		
		//배열선언, 생성, 초기화
		String[] colors = new String[] {"Red", "Green", "Blue"};
		
		//향상된 for반복문 사용 - 사용하고 있는 배열에 저장된 데이터 갯수만큼 반복
		for(String s : colors) {
			System.out.println(s);
		}
		//향상된 for반복문 사용 장점 : 인덱스 위치값 사용하지 않아도 됨
		//				    단점 : 무조건 순차적으로 꺼내옴
		
		System.out.println("----------------------------------");
		
		//일반 for반복문 사용
		for(int i=0; i<colors.length; i++) {
			System.out.println(colors[i]);
		}
				
	}

}
