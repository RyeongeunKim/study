
//Ani클래스 만들기 

class Ani{

	//변수
	//동물의 이름을 문자열로 저장시킬 name변수 선언
	
	String name;

	//동물의 나이를 정수로 저장시킬 age변수 선언
	
	int age;

	//기본생성자
		//name변수에 "개" 저장
		//age변수에 3 저장
	
	Ani(){
		name = "개";
		age = 3;
	}
	
	//동물의 이름을 n_name매개변수로 전달 받아  name변수에 저장할 생성자
		//name변수에 n_name매개변수로 전달 받은 이름을 저장
		//age변수에 1 저장
	
	Ani(String n_name){
		name = n_name;
		age = 1;
	}
	
	//동물의 나이를 n_age매개변수로 전달 받아  age변수에 저장할 생성자
		//name변수에 "동물" 저장
		//age변수에  n_age매개변수로 전달 받은 나이 저장
	
	Ani(int n_age){
		name = "동물";
		age = n_age;
	}

	//동물의 이름과 나이를 매개변수로 전달 받아 name변수와 age변수에 각각 저장할 생성자
		//name변수에 n_name매개변수로 전달 받은 이름 저장
		//age변수에 n_age매개변수로 전달 받은 나이 저장 
	
	Ani(String n_name, int n_age){
		name = n_name;
		age = n_age;
	}

	//메소드
	//name변수에 새로운 값을 저장할 용도의 메소드
	
	void setName(String n_name) {
		name = n_name;
	}

	//age변수에 새로운 값을 저장할 용도의 메소드
	
	void setAge(int n_age) {
		age = n_age;
	}
	
	//name변수에 저장되어 있는 값을 제공(반환) 해주는 용도의 메소드
	
	String getName() {
		return name;
	}
	
	//age변수에 저장되어 있는 값을 제공(반환,리턴) 해주는 용도의 메소드
	
	int getAge() {
		return age;
	}
	
	//name변수에 저장된 동물이 뛴다 <---출력하는 기능의 메소드
	
	void run() {
		System.out.println(name+" 뛴다");
	}
	
}//클래스 끝



public class Test62 {

	public static void main(String[] args) {
		
		//Ani클래스의 a 객체를 생성하고 초기화를 위한 기본생성자 호출
		Ani a = new Ani();
		
		// 개 뛴다
		a.run(); 
		
		// 고양이 뛴다
		// 고양이의 나이 : 5
		a.name = "고양이";
		a.age=5;
		a.run();
		System.out.println("고양이의 나이 : " +a.getAge());
		
		// 사자
		// 사자의 나이 : 10
		a.setName("사자");
		a.setAge(10);
		System.out.println(a.getName());
		System.out.println("사자의 나이 : " +a.getAge());
		
		// 10
		a.age = 10;
		System.out.println(a.age);
		
		// Ani클래스의 a2 객체를 생성하고 토끼로 초기화를 위한 기본생성자 호출
		Ani a2 = new Ani("토끼");
		
		// 토끼 뛴다
		a2.run();
		
		// Ani클래스의 a3 객체를 생성하고 2로 초기화를 위한 기본생성자 호출
		Ani a3 = new Ani(2);
		// 2
		System.out.println(a3.getAge());
		
		// Ani클래스의 a4 객체를 생성하고 기린과 4로 초기화를 위한 기본생성자 호출
		Ani a4 = new Ani("기린",4);
		
		//기린 뛴다
		a4.run();
		
		//4
		System.out.println(a4.getAge());

		
		
		
	

		

	}

}
