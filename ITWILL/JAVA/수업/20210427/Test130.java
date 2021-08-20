
// 발생할 수 있는 예외가 1개 이상일 경우...
// try-다중 catch문-finally을 이용한 예외처리를 할 수 있다.


public class Test130 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		String name = null;
		
		try {
			//정수3을 0으로 나누기 때문에 ArithmeticException예외가 발생함
			int num = 3 / 0;
			System.out.println("문자열의 길이:" + name.length());
			
		} catch (NullPointerException e) {
			
			e.printStackTrace();
			
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
			
		} catch (Exception e) { //위에서 다른 예외가 발생했을 대 다른 모든 예외처리
			System.out.println("모든 예외처리 가능");
			
		} finally {
			//예외 여부와 관계 없이 반드시 한번은 실행되야 하는 코드를 작성하는 영역
			//데이터베이스 연결 후 Connection객체 자원해제 코드를 작성하는 영역
			//데이터베이스 작업 후 ResultSet객체의 자원해제 코드를 작성하는 영역
			//데이터베이스 작업 후 PreparedStatement객체의 자원해제 코드를 작성하는 영역
			System.out.println("반드시 수행되는 문장");
			System.out.println("DB작업 자원해제는 여기서 하자.");

		}
		
		System.out.println("프로그램 정상 종료");

	}

	/*
	   결론 :
	   [예외 처리 순서 과정]
	   1. try구문으로 진입
	   2. try구문내부에서 예외가 발생하면
	   3. catch 블럭을 순차적으로 살펴보면서 일치하는 예외가 있는지 조사하여
	   4. 해당 catch 블럭으로 진입한다.
	   5. 해당 catch 블럭 내부의 구문을 실행하여 예외메세지를 출력하고 예외 처리를 한다.
	   5. finally 블럭은 예외 발생 유무에 상관없이 무조건 한번은 실행된다.
	*/

}
