
// try -catch 구문으로 예외처리하기

// 날짜를 저장하는 클래스
class MyDate{
	int year = 2006;
	int month = 4;
	int day = 1;
}


public class Test131 {

	public static void main(String[] args) {
		
		//날짜를 저장하는 클래스의 객체를 생성하여 객체의 주소를 담을 참조변수 선언
		MyDate d = null; //<-- new로 객체 생성 해야함
						 //    객체 생성 실패시.. new연산자는 null값을 되돌려 저장시킨다.
		
		try {
			//NullPointException예외 발생
			// -> null이 저장된 참조변수 d에 접근해서 사용하려고 할 때 발생하는 예외
			System.out.println(d.year + "/" + d.month + "/"  + d.day);
		} catch (Exception e) {
			// 어떤 예외가 발생했는지 예외메시지 출력
			System.out.println("예외발생메세지->" + e.toString());
			
			// 예외처리
			System.out.println("예외처리하기");
			d = new MyDate();
		}
			//예외처리 후 정상적으로 출력된다.
			System.out.println(d.year + "/" + d.month + "/"  + d.day);
			
		System.out.println("-------------------------------------");
		
	//try-catch구문으로 예외처리하기
		//ArrayIndexOutOfBoundsException:
		//배열의 범위를 벗어나 배열에 접근하려고 할 때 발생하는 예외를 처리하기 위한 클래스
		
		int num[] = {1,2,3};
		
		try {
			//존재하지 않는 인덱스 위치에 접근하여 저장하려고 할 때
			//ArrayIndexOutOfBoundsException예외 발생!!
			num[4] = 4;
		} catch (Exception e) { //부모 Exception클래스 타입의 변수e로
								//ArrayIndexOutOfBoundsException 자식객체가 전달됨
			System.out.println("예외발생 -> " + e.toString());
			
			System.out.println("예외발생 -> " + e.getMessage());
			
			//예외가 발생한 위치 및 어떤 예외를 처리해야 하는지 알려줌
			e.printStackTrace();
		}
	}

}
