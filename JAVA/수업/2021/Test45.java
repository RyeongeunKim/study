/*
	가변 배열
	- 자바에서는 2차원 배열을 생성할 때 열의 길이를 명시하지 않음으로써,
	  행 마다 다른 길이의 배열을 요소로 저장할 수 있다.
	  이렇게 행마다 다른 길이의 배열을 저장할 수 있는 배열을 가변 배열이라고 한다.
*/
public class Test45 {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[1];
		
		//위 예제처럼 배열을 생성할 때 두번째 첨자를 생략하면 가변 배열을 만들 수 있다.
		
		//가변 배열도 { } 초기화블럭을 사용하여 배열 선언과 동시에 초기화할수 있다.
		
		int[][] arr2 = {
							{10,20},
							{10,20,30,40},
							{10},
						};
		
		for(int i=0; i<arr2.length; i++) { //행크기만큼 반복
			for(int j=0; j<arr2[i].length; j++) { //행위치에 대한 열크기만큼 반복
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
