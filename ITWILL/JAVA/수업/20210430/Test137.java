import java.util.Iterator;
import java.util.Vector;

//주제 : Vector배열 내부에 저장된 객체(데이터) 검색과 삭제 연습
/*
	참고!
		Vector클래스 내부의 메소드
		
			int indexOf(Object o) 메소드
			- 지정된 객체(데이터)가 Vector배열내부에서 최초로 검출된 인덱스 위치번호를 반환
			
			E remove(int index)메소드
			- Vector배열내부에 지정된 인덱스 위치의 객체(데이터)를 삭제하는 메소드
			
			boolean remove(Object o)메소드
			- Vector배열내부에 최초로 검출(검색)된 객체(데이터)를 삭제하는 메소드
			
			boolean contains(Object o)메소드
			- Vector배열 내부에 매개변수로 전달받은 객체(데이터)가 포함되어 있으면 true반환
			  포함되어 있지 않으면 false 반환

*/
public class Test137 {

	public static void main(String[] args) {
		//컬렉션 API 내부에 존재하는 Vector클래스에 대한 객체 생성
		Vector vec = new Vector();
		//기본생성자로 벡터배열객체를 생성하면 초기 용량은 10칸, 
		//모든 배열에 데이터가 저장된 상태에서 데이터를 추가하면 배열이 1칸씩 늘어난다.
		
		double[] arr = new double[] {38.6, 9.2, 45.3, 6.1, 4.7, 1.6};
		
		for(int i=0; i<arr.length; i++) {
			//위 Vector배열에 new double[]배열에 저장된 모든 데이터들을 꺼내어 추가(저장)
			 vec.add(arr[i]);
		}
		
		//위 Vector객체 배열에 저장된 객체(데이터)를 반복해서 얻어 출력
		for(int i=0; i<vec.size(); i++) {
			System.out.println("" + vec.get(i));
		}
		
		//한줄 뛰우기 
		System.out.println();
		
		//Vector객체 배열 내부에 저장된 데이터 검색
		//1. 검색할 데이터를 저장할 변수 선언 후 6.1저장
		double searchData = 6.1;
		//2. Vector객체 배열에 접근하여 6.1이 저장되어 있는지 검색
		//	 6.1이 Vector객체 배열에 저장되어 있으면 6.1이 저장되어 있는 위치의 인덱스 번호 반환
		int index = vec.indexOf(10);
		
		//조건식을 이용하여 검사
		if(index != -1) { //Vector배열 내부에 검색한 6.1이 저장되어 있으면?
						  //(Index변수에 저장되어 있는 값이 -1이 아니면? 검색한 데이터가 저장되어 있다는 뜻)
			System.out.println("검색 성공! 검색한 데이터" + searchData + "는?" + index + "번째 인덱스에 위치함");
			
		}else { //검색할 데이터인 6.1이 Vector배열 내부에 저장되어 있지 않으면?
			
			System.out.println("검색 실패! 찾을 데이터가 벡터내부에 저장되어 있지 않음");
			
		}
		//--------------------------------------------------------------------------------------------
		//Vector객체 배열 내부에 저장된 데이터 삭제
		//1. 삭제할 데이터를 저장할 변수를 선언하고 45.3저장
		double delData = 45.3;
		//2. Vector객체 배열 내부에 삭제할 데이터가 저장되어 있는지 판단해주는 메소드 호출하여 조건판단하기
		if(vec.contains(delData)) {
			//해당 delData변수의 값 45.3을 Vector객체 배열 내부에서 삭제
			boolean result = vec.remove(delData);
			//result변수에 값이 true라면?
			if(result == true) {
			  //삭제완료 <-- 출력
				System.out.println("45.3 삭제완료");
			}else {
			//result변수에 값이 false라면?
			  //삭제실패 <-- 출력
			  System.out.println("45.3 삭제실패");
			}//else
		}//바깥 if
		
		System.out.println("--------------------------------------------------");
		//Iterator인터페으스를 구현한 자식배열객체에 Vector배열에 저장된 모든 객체(데이터)를 꺼내어서
		//저장 후 while문을 이용해서 하나씩 출력하자.
		
		Iterator iterator = vec.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
	}//main메소드 끝

}//클래스 끝
