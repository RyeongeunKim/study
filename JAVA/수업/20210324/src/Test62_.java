

//Animal클래스 만들기

	//변수
    //동물의 이름을 문자열로 저장시킬 name변수 선언

	//동물의 나이를 정수로 저장시킬 age변수 선언

	//기본생성자
		//name변수에 "개" 저장
		//age변수에 3 저장
	
	//동물의 이름을 n_name매개변수로 전달받아 name변수에 저장할 생성자
		//name변수에 n_name매개변수로 전달받은 이름을 저장
		//age변수에 1 저장

	//동물의 나이를 n_age매개변수로 전달받아 age변수에 저장할 생성자
		//name변수에 "동물" 저장
		//age변수에 n_age매개변수로 전달받은 나이 저장

	//동물의 이름과 나이를 매개변수로 전달받아 name변수와 age변수에 각각 저장할 생성자
		//name변수에 n_name매개변수로 전달받은 이름 저장
		//age변수에 n_age매개변수로 전달받은 나이 저장

class Animal{
	
	String name;
	int age;
	
	Animal() {
		name = "개";
		age = 3;
	}
	
	Animal(String n_name) {
		name = n_name;
		age = 1;
	}
	
	Animal(int n_age) {
		name = "동물";
		age = n_age;
	}
	
	Animal(String n_name, int n_age) {
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
		System.out.println(name + " 뛴다");
	}
}//클래스 끝

public class Test62_ {

	public static void main(String[] args) {
		//출력할 내용
		/*
			개 뛴다
			고양이 뛴다
			사자
			10
			===============================
			토끼 뛴다
			2
			기린 뛴다


		*/
		
		
		
		
		/*
		Animal dog = new Animal();
		dog.run();
		
		// name -> "고양이" 변경
		// age -> 5 변경
		Animal cat = new Animal("고양이");
		cat.run();
		
		Animal lion = new Animal("사자");
		lion.run();
		
		
		
		System.out.println("===========================");
		
		Animal r = new Animal("토끼");
		r.run();
		
		Animal g = new Animal("기린");
		g.run();
		*/
		
		

		

		
		
	}

}
