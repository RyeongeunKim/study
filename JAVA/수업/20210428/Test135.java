import java.util.HashSet;
import java.util.Set;

//최상위 Collection인터페이스 - Set인터페이스 - HashSet클래스

//HashSet클래스
//1. 객체(데이터)를 추가하면 순서대로 저장되지 않고 랜덤으로 저장되는 공간
//2. 객체(데이터)를 중복으로 저장할 수 없다.

//주제 : Set인터페이스를 구현한 HashSet클래스


public class Test135 {

	public static void main(String[] args) {
		
		//부모 Set인터페이스 타입의 참조변수에 자식HashSet객체를 생성해서 저장할 수 있다.(업캐스팅)
		Set set = new HashSet(); //HashSet set = new HashSet(); 가능
		
		//HashSet컬렉션 공간 안의 객체(데이터) 갯수 : 0
		System.out.println("HashSet컬렉션 공간 안의 객체(데이터) 갯수 : " + set.size());
		
		//HashSet컬렉션 객체에 객체(데이터) 추가
		set.add("하나"); //1번째
		set.add(new Integer(2)); //2번째
		set.add(2); //3번째
		set.add(3.42); //4번째
		set.add(new Float(3.52)); //5번째
		set.add("여섯"); //6번째
		set.add(7); //7번째
		
		System.out.println("HashSet컬렉션 공간 안의 객체(데이터) 갯수 : " + set.size());
		
		//HashSet컬렉션 객체메모리에 저장된 데이터들을 모두 꺼내어 하나의 문자열로 반환해 출력하기
		System.out.println(set.toString());
		
		/*
		  HashSet클래스 API에서 add(E e)메소드 살펴보기
		  
		  boolean add(E	e)메소드 : 지정된 요소가 이세트의 요소로서 존재하지 않는 경우에
		  						 그 요소를 세트에 추가시킨다.
		  
		  해설 : 추가시킬 객체(데이터)가 HashSet컬렉션 배열공간에 저장되어 있지 않는 경우에,
		  		추가시킬 객체(데이터)를 HashSet컬렉션 배열공간에 추가 시킨다는 뜻.
		 
		 ***********************************************
		 boolean add(E	e)메소드의 매개변수 타입에 대해서 알아보자
		 ***********************************************
		 매개변수 E타입 이라는 것은 모든 객체를 전달 받을 수 있는 제네릭 타입을 말하고
		 제네릭 타입은 아직 결정되지 않은 타입
		 
		 new HashSet()<String>;
		 
	   */
		//예)
		HashSet<String> hashSet = new HashSet<String>();
//		hashSet.add(1); //String객체만 저장할 수 있음
//		hashSet.add(new Character('고')); //에러
		hashSet.add("String타입"); //가능
		
		//결론 : 1.HashSet컬렉션 배열에는 객체(데이터)가 순서없이 랜덤으로 저장됨
		//	    2. 중복 저장 X 
		
		
	}

}
