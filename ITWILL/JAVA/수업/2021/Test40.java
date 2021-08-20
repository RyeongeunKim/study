
public class Test40 {

	public static void main(String[] args) {
		/*배열 연습2*/
		
		//예제. 5명의 학생의 점수를 저장시킬 배열 생성 후 총합, 평균 구하기
		
		//4바이트 크기의 정수 데이터들을 저장시킬 배열 생성 한 후
		//배열메모리의 주소를 담을 score변수 만들기
		//단, 배열에 저장시킬값 95, 70, 80, 75, 100
		
		int[] score = {95, 70, 80, 75, 100};
		
		//점수의 총합을 저장시킬 total이름의 변수만들기 , 0 저장
		
		int total = 0;
		
		//평균을 구하여 8바이트 크기의 실수값을 저장할 ave변수 만들기 
		
		double ave;
		
		//for반복문을 이용하여 5명 학생의 점수들을 반복해서 total변수에 누적(총합구하기)
		
		for(int i=0; i<5; i++) {
			total += score[i];
		}
		
		//평균을 구하여 ave변수에 저장
		
		ave = total / 5.0;
		
		//총합출력 Total = 420
		//평균출력 ave = 84.0
		
		System.out.println("Total = " + total);
		System.out.println("ave = "+ave);
	
		System.out.println("----------------------------------------------");
		
		//예제. 5개의 실수값 중에서 최대값 구하기
		
		// 8바이트 크기의 실수값들 9.5 7.0 13.6 7.5 1.0 을 저장할 배열메모리 생성후
		// 생성한 배열 메모리의 주소값을 data변수에 저장
		
		double[] data = {9.5, 7.0, 13.6, 7.5, 1.0};
		
		// 5개의 숫자중 최대값을 저장시킬 max변수 선언(8바이트 크기의 실수값을 저장할 max변수 만들기)
		
		double max;
		
		// max변수에 data배열의 0번째 인덱스 위치에 있는 데이터를 꺼내어 최대값으로 저장
		
		max = data[0]; // 9.5
		
		// for문을 이용하여 
		// data배열의 1인덱스 위치의 값부터 ~ 4인덱스 위치의 값을 반복해서 꺼내어서
		// max변수에 저장된 값과 비교합니다.
			//if문을 이용하여
			//data배열의 인덱스 위치에 저장된 값이 max변수에 저장된 값보다 크면?
				//그값을 최대값으로 정하기 위해 max변수에 저장
		
		for(int i=1; i<5; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		
		
		//max변수에 저장된 5개의 숫자 중 최대값 출력
		
		System.out.println("max = " + max);
		
		
	
		

	}

}
