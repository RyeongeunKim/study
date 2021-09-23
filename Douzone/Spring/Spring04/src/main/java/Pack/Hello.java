package Pack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;

class A{
	void f1() {
		
	}
}
class B extends A{
	void f2() {
		
	}
}
class C{
	A m1() {return new A();}
	Object m2() {return new B();} // 업캐스팅
	//B m3() {return new A();} // 부 = 자(자바 문법에서 성립안된다.)
	B m4() {return new B();}
}
public class Hello {
	
	public static void main(String[] args) {
		// 왼쪽은 문법 = 메모리 확보
		C c = new C();
		//A a0 = c.m2();
		A a1 = (A)c.m2();
		A a2 = (B)c.m2();
		a1.f1();
		a2.f1();
		
		
		((A)c.m2()).f1();
		//((A)c.m2()).f2();
		((B)c.m2()).f1();
		((B)c.m2()).f2();
	}
}

/*
// step6)
interface Fuel {
	String getFuel();
}
class Water implements Fuel{
	public String getFuel() {
		return "물";
	}
}
class Gas implements Fuel{
	public String getFuel() {
		return "가스";
	}
}
class Airplain{
	Fuel fuel;
	Airplain(Fuel fuel){this.fuel = fuel;}
	void fly() {
		System.out.println(fuel.getFuel()+"로 날다");
	}
}
class Ship{
	Fuel fuel;
	Ship(Fuel fuel){this.fuel = fuel;}
	void fly() {
		System.out.println(fuel.getFuel()+"로 헤엄치다");
	}
}
class Car{
	Fuel fuel;
	Car(Fuel fuel){this.fuel = fuel;}
	void fly() {
		System.out.println(fuel.getFuel()+"로 달린다");
	}
}
//@Configuration
//class Factory{
//	@Bean
//	Fuel makeFuel() {
//		return new Water(); 
//	}
//	@Bean
//	Airplain airplain() {
//		return new Airplain(makeFuel());
//	}
//}
public class Hello {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("Context.xml");
		Airplain airplain = ctx.getBean("airplain", Airplain.class);
		airplain.fly();
		Ship ship = ctx.getBean("ship", Ship.class);
		ship.fly();
		Car car = ctx.getBean("car", Car.class);
		car.fly();
	}
	
}
*/
/*
// step5)
interface Fuel {
	String getFuel();
}
class Water implements Fuel{
	public String getFuel() {
		return "물";
	}
}
class Airplain{
	Fuel fuel;
	Airplain(Fuel fuel){this.fuel = fuel;}
	void fly() {
		System.out.println(fuel.getFuel()+"로 날다");
	}
}
class Ship{
	Fuel fuel;
	Ship(Fuel fuel){this.fuel = fuel;}
}
class Car{
	Fuel fuel;
	Car(Fuel fuel){this.fuel = fuel;}
}
@Configuration
class Factory{
	@Bean
	Fuel makeFuel() {
		return new Water(); 
	}
	@Bean
	Airplain airplain() {
		return new Airplain(makeFuel());
	}
}
public class Hello {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(Factory.class);		
		// Airplain airplain = new Factory().airplain();
		Airplain airplain = ctx.getBean("airplain",Airplain.class);
		airplain.fly();
		ctx.close();
	}
}
*/
/*
// step4)
interface Fuel {
	String getFuel();
}
class Water implements Fuel{
	public String getFuel() {
		return "물";
	}
}
class Airplain{
	Fuel fuel;
	Airplain(Fuel fuel){this.fuel = fuel;}
	void fly() {
		System.out.println(fuel.getFuel()+"로 날다");
	}
}
class Ship{
	Fuel fuel;
	Ship(Fuel fuel){this.fuel = fuel;}
}
class Car{
	Fuel fuel;
	Car(Fuel fuel){this.fuel = fuel;}
}
class Factory{
	Fuel makeFuel() {
		return new Water(); 
	}
	Airplain airplain() {
		return new Airplain(makeFuel());
	}
	Ship ship() {
		return new Ship(makeFuel());
	}
	Car car() {
		return new Car(makeFuel());
	}
}
public class Hello {
	
	public static void main(String[] args) {
		Airplain airplain = new Factory().airplain();
		airplain.fly();
		
		Ship ship = new Factory().ship();
		Car car = new Factory().car();
	}
}
*/
/*
// step3)
interface Fuel {
	String getFuel();
}
class Water implements Fuel{
	public String getFuel() {
		return "물";
	}
}
class Airplain{
	Fuel fuel;
	Airplain(Fuel fuel){this.fuel = fuel;}
	void fly() {
		System.out.println(fuel.getFuel()+"로 날다");
	}
}
class Ship{
	Fuel fuel;
	Ship(Fuel fuel){this.fuel = fuel;}
}
class Car{
	Fuel fuel;
	Car(Fuel fuel){this.fuel = fuel;}
}
class Factory{
	Airplain airplain() {
		Airplain airplain = new Airplain(makeFuel());
		return airplain;
	}
	Ship ship() {
		Ship ship = new Ship(makeFuel());
		return ship();
	}
	Car car() {
		Car car = new Car(makeFuel());
		return car();
	}
	Fuel makeFuel() {
		return new Water(); 
	}
}
public class Hello {
	
	public static void main(String[] args) {
		Airplain airplain = new Factory().airplain();
		airplain.fly();
		
		Ship ship = new Factory().ship();
		Car car = new Factory().car();
	}
}
*/
/*
// step2)
interface Fuel {
	String getFuel();
}
class Water implements Fuel{
	public String getFuel() {
		return "물";
	}
}
class Airplain{
	Fuel fuel;
	Airplain(Fuel fuel){this.fuel = fuel;}
	void fly() {
		System.out.println(fuel.getFuel()+"로 날다");
	}
}
class Factory{
	// 방법1)
//	Airplain makeAirplain() {
//		Airplain airplain = new Airplain(new Water());
//		return airplain;
//	}
	// 방법2)
	Airplain airplain() {
		Airplain airplain = new Airplain(new Water());
		return airplain;
	}
}
public class Hello {

	public static void main(String[] args) {
		Airplain airplain = new Factory().airplain();
		airplain.fly();
	}
}
*/
/*
// step1)
interface Fuel {
	String getFuel();
}
class Water implements Fuel{
	public String getFuel() {
		return "물";
	}
}
class Airplain{
	Fuel fuel;
	Airplain(Fuel fuel){this.fuel = fuel;}
	void fly() {
		System.out.println(fuel.getFuel()+"로 날다");
	}
}
public class Hello {
	
	public static void main(String[] args) {
		System.out.println(1);
		Airplain airplain = new Airplain(new Water());
		airplain.fly();
	}
}
 */