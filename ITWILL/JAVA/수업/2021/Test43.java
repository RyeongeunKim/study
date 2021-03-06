//배열 연습

public class Test43 {

	public static void main(String[] args) {
		
		//4바이트 크기의 정수값(1,2,3,4,5)을 저장시킬 배열 생성 후
		//생성한 배열 메모리의 주소값을 저장시킬 num참조변수 선언
		
		int[] num = new int[] {1, 2, 3, 4, 5};
		
		
		//문자열값들("사과", "배", "바나나", "체리", "딸기", "포도")을 저장시킬 배열 생성 후
		//생성한 배열 메모리의 주소값을 저장시킬 names참조변수 선언
		
		String[] names = new String[] {"사과", "배", "바나나", "체리", "딸기", "포도"};
		
		//4바이트 크기의 0을 저장할 누적변수인 sum변수 선언 후 초기화
		
		int sum = 0;
		
		
		//향상된 for반복문을 이용하여 
		//num참조변수에 저장된 배열메모리의 값들을 반복하여 꺼내어서 k변수에 저장
		//반복 실행할 명령문 영역에서 sum변수에 k변수의 값 누적
		
		for(int k : num) {
			sum += k;
		}
		
		//출력결과
		//"합은 : 15"
		
		System.out.println("합은 : "+sum);
		
		System.out.println("-------------------------------------------------");
		
		//names배열에 저장된 각각의 문자열 요소들을 반복하여 얻어 출력
		for(String s : names) {
			System.out.print(s + " ");
		}

	}

}
