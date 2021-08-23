import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 
	  Scanner sc = new Scanner(System.in);
	  int testCase = sc.nextInt(); // 테스트 케이스 수 입력

	  for(int i=0; i<testCase; i++){
		  int stuNum = sc.nextInt(); // 학생 수
		  int count = 0; // 평균을 넘는 학생 수
		  double avg = 0; // 평균 점수
		  double avgOver; // 평균을 넘는 학생 비율
		  int[] scoreArr = new int[stuNum]; // 각 점수를 저장할 배열 생성
		  for(int j=0; j<stuNum; j++){
			  int score = sc.nextInt();
			  scoreArr[j] = score; // 각 점수를 배열에 저장
			  avg += score; // 점수의 합 구하기
		  }
		  avg = avg / stuNum; // 평균 점수 구하기
		  for(int k=0; k<scoreArr.length; k++){
			  if(scoreArr[k]>avg){
				  count++;
			  }
		  }
		  avgOver = (double) count / stuNum * 100; // count를 double로 강제형변환시켜서 원하는 백분율 계산하기
		  											// stuNum은 double / int이므로 자동형변환이 일어남
		  System.out.printf("%.3f", avgOver);
		  System.out.println("%");
	  }
	  
  } 
}