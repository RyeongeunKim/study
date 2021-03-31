
// 클래스변수  인스턴스변수  클래스메소드  인스턴스메소드 만들기 연습

//상품클래스 Product만들기
class Product{
    //상품명을 문자열로 저장할 클래스변수 modelName 만들기
    static String modelName;
    //상품의 단가를 정수로 저장할 클래스변수 unitPrice 만들기
    static int unitPrice;

    //상품명과 단가를 하나의 문자열로 만들어서 출력할 기능의
    //클래스 메소드 print 만들기
    static void print() {
    	System.out.println(modelName+", "+unitPrice);
    }
}
//고객클래스 customer 만들기
class Customer{
    //고객명을 문자열로 저장시킬 인스턴스변수 name 만들기
	String name;
    //고객의 나이를 정수로 저장시킬 인스턴스변수 age 만들기
	int age;
    //기본생성자 만들기 (아무런일도 하지 않음, 비워두자)
	public Customer(){
		
	}
    //새로운 고객명만 매개변수로 전달받아 위 인스턴스변수에 초기화할 생성자 만들기
	public Customer(String n_name){
		name = n_name;
	}
    //새로운 고객 나이만 매개변수로 전달 받아 위 인스턴스변수에 초기화할 생성자 만들기
	public Customer(int n_age){
		age = n_age;
	}
    //인스턴스변수 name과 인스턴스변수 age에 저장된 고객의 이름과 나이를 하나의 문자열로 만들어서 반환할 
    //인스턴스 메소드 print 만들기
	/*
	  String print() { 
	     return name+","+age; 
	  }
	 */
	
	//위 인스턴스 변수 name과 age를 하나의 문자열로 합쳐서
	//출력할 기능의 인스턴트메소드 print 만들기
	void print() {
		System.out.println(name + "," + age);
	}

}

public class Test73 {

	public static void main(String[] args) {
		
		//출력결과
		/*
		 	쉽게배우는자바, 33000
		 	-----------------
		 	재벌1세,31
		 	재별2세,33
		 */
		//modelName, unitPrice클래스변수의 값들을
		//각각 "쉽게배우는자바",33000로 저장

		Product.modelName = "쉽게배우는자바";
		Product.unitPrice = 33000;
		
		//print()클래스 메소드 호출
		//쉽게배우는자바, 33000 <---출력되게 하기
		Product.print();
		
		//------------------- <---출력되게 하기
		System.out.println("-------------------------");
		
		
		//Customer클래스로부터 new 객체 생성! 참조변수이름 c1
		
		Customer c1 = new Customer();
		
		//재벌1세, 31을 각각 인스턴스변수에 저장
		
		c1.name = "재벌1세";
		c1.age = 31;
		
		//print()인스턴스변수 호출해서 재벌1세, 31 <-- 출력
		
		c1.print();
		
		//Customer클래스로부터 new 객체 생성! 참조변수이름 c2
		
		Customer c2 = new Customer();
		
		//재벌2세, 33을 각각 인스턴스변수에 저장
		
		c2.name = "재벌2세";
		c2.age = 33;
		
		//print()인스턴스변수 호출해서 재벌2세, 33 <-- 출력
		
		c2.print();

	}

}
