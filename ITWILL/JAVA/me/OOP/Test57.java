package oop;

//주제 : 여러개의 객체메모리를 만든 후 그 객체 메모리들을 배열에 저장시킬 수 있다.
/*
 	< main 코드 밖 >
 	
 	1. 클래스 만들기 - 변수
 		         - 메소드

	< main 코드 내 >
	
	1. 배열메모리의 주소를 담을 변수선언
	2. 객체메모리들을 저장할 배열메모리 생성 후 배열메모리의 주소를 변수에 저장
	3. 변수에 저장된 배열의 크기만큼 객체생성
 					
 */

//사람 클래스 만들기
class Person{
	//변수
		//이름을 저장할 변수 만들기
		String name;
		//나이를 저장할 변수 만들기
		int age;

	//메소드
		//이름을 알려주는 기능의 메소드 만들기
		String getName() {
			return name;
		}
	
}
	

public class Test57 {

	public static void main(String[] args) {
		
		//객체 배열이란?
		//생성된 객체메모리에 대한 주소번지를 원소로 갖는 배열
		
		//new Person()객체 메모리들이 저장되어 있는 배열메모리의 주소를 담을 pa변수 선언
		//new Person()객체 메모리들을 저장할 배열메모리 생성 후 배열메모리의 주소를 pa변수에 저장
		//Person[] pa; 
		//pa = new Person[10];

		Person[] pa = new Person[10];
		
		//pa변수에 저장된 new Person[10]배열의 크기만큼 반복해서 
		//new Person()객체를 10번 생성 후 배열의 각 인덱스 위치에 저장
		for(int i=0; i<pa.length; i++) {
			
			//배열에 각 인덱스 위치에 새로운 new Person()객체 생성 후 저장
			pa[i] = new Person();
			
			//배열의 i변수에 저장된 인덱스 위치 번째에 존재하는
			//new Person()객체 내부의 age객체변수에 접근하여
			//30 ~ 39 저장
			pa[i].age = 30 + i;
			
		}
		
		//배열에 각 인덱스 위치에 저장된 new Person()객체내부의 age변수 값을 얻어 출력
		/*
			배열에 0~10번째 인덱스 위치에 저장된 Person객체1 객체변수 age = 30...
		*/
		
		for(int i = 0; i < pa.length; i++) {
			System.out.println("배열에" + i + "번째 인덱스 위치에 저장된 Person객체" + 
						       (i+1) + " 객체변수 age = " + pa[i].age);
			
		}

	}

}
