public class Test3 {
	public static void main(String[] args) {

		String[] stringNumber = { "23", "12", "998", "3.141592" };

		try {
			for (int i = 0; i < stringNumber.length; i++) {
				//"3.141592"실수형태의 문자열을 정수로 변환할 수 없기 때문에..
				//NumberFormatException 예외 발생
				int j = Integer.parseInt(stringNumber[i]);
				
				System.out.println("숫자로 변환된 값은  " + j);
			}
		} catch (Exception e) {
			//예외 처리
			System.out.println("'3.141592'문자열은 정수로 변환할 수 없습니다.");
		}
		System.out.println("프로그램의 소스코드가 끝까지 수행됨");
	}

//실행결과
//숫자로 변환된 값은 23
//숫자로 변환된 값은 12
//숫자로 변환된 값은 998
//정수로 변환할 수 없습니다.
	
}
