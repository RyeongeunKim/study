import javax.crypto.spec.IvParameterSpec;

/*
	주제 : 멤버변수(클래스변수,인스턴스변수)의 초기화 시기와 순서

	- 클래스변수의 초기화 시점 : .class파일내부의 클래스설계도가 처음 JVM메모리에 로딩될때..
						    단 한번만 초기화가 된다.
	- 인스턴스변수의 초기화 시점 : 인스턴스가 생성될때 마다 각 인스턴스별로~ 인스턴스변수의 초기화가 이루어짐.
	
	- 클래스변수의 초기화 순서 : 기본값 -> 명시적초기화 -> 클래스 초기화블럭을 이용해 초기화
	
	- 인스턴스변수의 초기화 순서 : 기본값 -> 명시적초기화-> 인스턴스 초기화블럭을 이용해 초기화 -> 생성자
*/

class Init{		
	//명시적 초기화
	static int cv = 1; //1위 
	
	//iv인스턴스변수 0으로 초기화 4위
	int iv = 1; //iv인스턴스변수 명시적 초기화 5위 
	
	//클래스초기화 블럭 이용
	static { //2위 
		cv = 2;
	}
	//생성자
	Init() { //6위 
		iv = 3;
	}
 	
}

public class Test76 {
	public static void main(String[] args) { //3위
				 
		Init i = new Init(); 
		
		//클래스변수 cv에 저장된 값 출력
		System.out.println( Init.cv);
		//인스턴스변수 iv에 저장된 값 출력
		System.out.println( i.iv);
		
		

	}

}







