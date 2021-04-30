
/*
제네릭 기법?
: 클래스 내부에서 사용할 변수의 타입을 클래스 외부에서 지정하는 기법
  즉! 클래스를 정의할때 매개변수의 데이터타입을 확정하지 않고,
  객체를 생성할때??? 매개변수의 데이터타입을 지정하는 기법

<> 오브 기호를 이용하여 제네렉 기법을 설정 할수 있다.
*/

//사용자 정의 제네릭기법의 클래스 만들기
class Person<T>{
	//변수
	public T info; //info변수의 타입의 결정 되지 않음 
	
	//생성자
	public Person(T infor) {
		this.info = infor;
	}
	//**************************
	// 위의 3가지 T제네릭 타입은  new Person<결정할타입>()객체를 생성할때 자동으로 바뀌면서 설정 된다.
	//**************************
}
public class Test140 {
	public static void main(String[] args) {
		
		Person<String> p1 = new Person<String>("2021년 새해 복 많이 받으세요");
		
		System.out.println(   p1.info     );
		
		//결론 : 
		//결국 컬렉션 API에서 제공해주는 모든 클래스들은 Person<T>클래스와 같은 형태로
		//만들어져 있다.
		
		/*
		 보충
		 	   1.JSP에서  모든 회원정보들을 DB에서 조회 해 옵니다.
		 	   2.조회해온 한사람의 정보는  (자바빈객체)VO객체에 저장됩니다.
		 	   3.조회한 한사람의 정보(VO객체) 하나 하나를  ArrayList배열에 추가해서 저장 시킵니다.
		 	   4.ArrayList배열에는 VO객체들의 각 인덱스 위치에 저장되어 있습니다.
		 	   5.클라이언트의 웹브라우저에 조회된 회원정보들을 출력하려면?
		 	     ArrayList배열에 저장된 VO객체들을 for문을 이용하여 각각 꺼내와서 출력 해야 한다.
		 	     꺼내 오기 위해서는 get(index)메소드를 호출하게 되는데...
		 	     get메소드는 항상! Object부모클래스타입으로 자식VO객체를 반환합니다.
		 	     그러므로 VO객체의 getter메소드를 사용하기 위해서는 VO클래스타입의 참조변수에 저장 해야합니다.
		 	     다운캐스팅이 필요합니다.
		 	  6. 하지만 ........ ArrayList객체를 생성할때  new ArrayList<VO>(); 제네릭 타입을 VO로 해서
		 	     생성하면  나중에  ArrayList배열에서 VO를 꺼내올떄 다운캐스팅 하지 않아도
		 	     VO클래스타입의 참조변수에 저장 할수 있습니다.
		 	     왜냐하면 ArrayList의 add()메소드의 매개변수 타입은 VO로 바뀌어서 VO객체만 저장 했기 떄문입니다
		 	        
		 
		 
		
		
		*/
	}

}








