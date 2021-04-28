//문제3
/*문자열을 정수로 변환할떄 발생하는..
 *  NumberFormatException을 처리하는 프로그램을 작성하라.*/
public class Test3 {
	public static void main(String[] args) {

		String[] stringNumber = { "23", "12", "998", "3.141592" };

		for (int i = 0; i < stringNumber.length; i++) {

			int j = Integer.parseInt(stringNumber[i]);
			
			System.out.println("숫자로 변환된 값은  " + j);
		}

	}

}
//실행결과
//숫자로 변환된 값은 23
//숫자로 변환된 값은 12
//숫자로 변환된 값은 998
//정수로 변환할 수 없습니다.