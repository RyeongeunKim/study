package oop;

/*

	< this 참조변수 >
	
	- 인스턴스(객체)가 바로 자기 자신의 멤버를 참조하는데 사용하는 변수
	- 이러한 this 참조변수는 해당 객체의 주소를 가지고 있다
 
	< this 메소드 >
	
	- 생성자 내부에서만 호출해서 사용가능
	- 같은 클래스 내부에 존재 하는 다른 생성자를 호출할때 사용
	- this()메소드에 인수를 전달하면, 
	  생성자의 이름과 매개변수갯수가 일치하는 생성자를 찾아서 호출한다.

*/

//Car 클래스 생성
class Car{
	
	//변수명 앞에 private 단어를 붙여 Car외부의 클래스에서 내부의 변수에 접근하지 못함
	private String modelName;
	private int modelYear;
	private String color;
	private int maxSpeed;
	private int currentSpeed;
	
	//생성자 : 객체 생성 시 매개변수를 통해 객체변수에 값들을 저장함
	//생성자의 매개변수와 객체변수의 이름이 같을 경우에는 this를 붙여 구분한다.
	
	Car(String modelName, int modelYear, String color, int max) {
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.color = color;
		maxSpeed = max;
		this.currentSpeed = 0;
	}
}

//Car1 클래스 생성
class Car1{
	private String modelName;  
	private int modelYear;
	private String color;
	private int maxSpeed;      
	private int currentSpeed;
	
//두번째 생성자
	//다른 생성자를 호출하는 this()메소드 작성
	Car1(){
		//첫번째 줄에서만 다른 생성자 호출 가능
		this("소나타", 2012, "검정색", 160); 
		System.out.println("두번째 생성자");
	}

	//첫번째 생성자
	public Car1(String modelName, int modelYear, String color, int max) {
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.color = color;
		this.maxSpeed = max;
		this.currentSpeed = 0;
	}
	
	//자동차(new Car1()객체)에 대한 정보를 하나의 문자열로 만들어 반환
	public String getModel() {
		return this.modelYear + "년식 " + this.modelName + " " + this.color;
	}

}

public class This01 {
	public static void main(String[] args) {
		
		String car1Info = new Car1().getModel();
		System.out.println(car1Info);

		/*
		매개변수를 가지는 첫번째 생성자는 this참조변수를 사용하여 객체변수에 접근한다.
		매개변수를 가지지 않는 두번째 생성자는 내부에서 this()메소드를 이용하여 첫번째 생성자를 호출한다.
		이렇게 내부적으로 다른 생성자를 호출하여 객체변수를 초기화할 수 있다.
		단, 한 생성자는 다른 생성자를 호출할 때는 해당 생성자의 첫줄에서만 호출할 수 있다.
		 */
		
	}

}



