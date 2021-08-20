package iteration;

public class Test30 {

	public static void main(String[] args) {
		//예제 : 숫자10부터 1씩 감소시켜가면서 숫자값을 반복 출력하는 예제
		int i = 10;
		while (i >= 0) {//i변수에 저장된 값이 0 이상일 때 까지 명령문 반복 실행
			System.out.println(i--);
		}
		//위 명령문의 i--의 --는 후위형 감소연산자이기 때문에 i변수의 값이 출력된 후 1감소한다.
		
		System.out.println("-------------------------------------");
		
		//i = 2		j = 1
		
		//예제 : while반복문을 사용해서 구구단을 반복해서 출력하는 예제
		i = 2;
		
		while(i <= 9) { //바깥쪽 while반복문
			
			int j = 1;
			
			while(j <= 9) { //안쪽 while반복문
				
				System.out.println(i + "X" + j + "=" + i*j);
				
				j++; // 2X1...2X2...곱하는 수 1씩 증가 해주어야 한다.
			}
			
			i++; //2단, 3단, 4단,.....9단을 표현하기 위해 i변수값을 1씩 증가
		}
		
		//예제: while반복문을 사용하여 1부터 몇까지를 더하면 누적합계가 100에 가까워지는지 계산하는 예제
		
				int sum = 0;
				
				i = 0;
				
				while(sum + i <= 100) {
					sum += ++i;; // sum = sum + ++i;
					System.out.println(i + "-" + sum);
				}
		
		

	}

}
