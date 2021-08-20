import java.util.ArrayList;
import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
	    // 컬렉션: 자료구조를 클래스로 구현한 형태, 제네릭 (1.6~)

		// int[] arr : 고정길이 배열
		// ArrayList : 가변길이 배열 (동적배열)
		// => 데이터의 크기 자동으로 변경 , list 계열 (순서를 기억(index), 중복허용)
		
		ArrayList arr = new ArrayList();

		// 데이터 입력
		//arr[0] = 100; (x)
		
		//Integer ->  int
		//Character -> char
		// Boolean -> boolean

		// * 박싱 : 기본형데이터 -> 참조형 데이터  / 언박싱 : 참조형데이터 -> 기본형데이터
		// => 오토박싱/ 오토언박싱 (1.6~)
		
		arr.add(100);  // wrapper 클래스 : 기본형데이터타입을 참조형 변경
		arr.add(new Integer(100));  // wrapper 클래스 : 기본형데이터타입을 참조형 변경
		arr.add("hello"); // String -> Object 업캐스팅
		arr.add(3.1313); // 기본형 -> 참조형(오토박싱) -> Object 업캐스팅
		arr.add(true);
		
		System.out.println(arr);
		
		System.out.println(arr.get(2));
		
		arr.add(1,500);
		
		System.out.println(arr);
		
		arr.remove(0);
		
		System.out.println(arr);
		arr.remove(new Integer(100));
		
		System.out.println(arr);
		
		System.out.println(arr.size());
		
		
		
		
		

	}

}
