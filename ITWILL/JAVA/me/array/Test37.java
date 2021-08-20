package array;

public class Test37 {

	public static void main(String[] args) {
		
		//1. new연산자를 이용하는 방법(배열선언, 배열생성, 배열초기화)
		
		//배열선언
		int[] arr; //정수데이터들이 담길 배열메모리의 주소값을 저장할 arr변수만들기
		
		//배열생성
		arr = new int[3]; //새로운 3칸의 정수값을 저장할 배열 메모리 생성 후 arr변수에 주소저장
		
		//참고
		//배열 선언 후 배열 생성
		//int[] arr = new int[3];
		
		//배열초기화
		arr[0] = 10; //arr배열메모리의 0인덱스 위치에 10저장
		arr[1] = 20; //arr배열메모리의 1인덱스 위치에 20저장
		arr[2] = 30; //arr배열메모리의 2인덱스 위치에 30저장
		
		//for문을 이용하여 arr배열에 저장된 모든 데이터를 반복해서 꺼내어 출력
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		

	}

}
