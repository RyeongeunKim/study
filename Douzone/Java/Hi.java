/*
// ex)
class Airplane{
	Fuel fuel; // DI(의존적 주입)
	public Airplane(Fuel fuel) {
		this.fuel = fuel;
	}
	void fly() {
		fuel.use();
		System.out.println("로 날아갑니다.");
	}
}

interface Fuel{
	void use();
}
class Water implements Fuel{
	@Override
	public void use() {
		System.out.println("물");
	}
}
public class Hi {
	public static void main(String[] args) {
		Airplane airplane = new Airplane(new Water());
		airplane.fly();
	}
}
*/

// ex5) DAO
class UserDao{
	ConnectionMaker c;
	UserDao(ConnectionMaker c){
		
		this.c = c;
	}
	void addUser() { // 의도적으로 인수 전달 하지 않음
		c.connect();
		System.out.println("insert into");
		
	}
}

interface ConnectionMaker{
	void connect();
}
class AmazonConnection implements ConnectionMaker{
	@Override
	public void connect() {
		System.out.println("오라클 DB연결");
	}
	
}
public class Hi {
	public static void main(String[] args) {
		UserDao userDao = new UserDao(new AmazonConnection());
		userDao.addUser();
	}
}
/*
// ex4) DAO
abstract class UserDao{
	void addUser() { // 의도적으로 인수 전달 하지 않음
		// 1. DB접속
		ConnectionMaker conn = getConnection();
		conn.connect();
		
		// 2. DB등록(insert into)
		System.out.println("insert into");

	}

	void method() {}; // hook 함수
	
	abstract ConnectionMaker getConnection(); // 템플릿 메소드 패턴
}

class AmazonDao extends UserDao{
	@Override
	ConnectionMaker getConnection() {
		return new AmazonConnection();
	}
}

interface ConnectionMaker{
	void connect();
	void close();
}
class AmazonConnection implements ConnectionMaker{
	@Override
	public void connect() {
		System.out.println("오라클 DB연결");
	}

	@Override
	public void close() {
		System.out.println("오라클 DB종료");
	}
	
	
}
public class Hi {
	public static void main(String[] args) {
		UserDao userDao = new AmazonDao();
		userDao.addUser();
	}
}
*/
/*
// ex3)
abstract class PizzaStore{
	void orderPizza() {
		// getFuel().use();
		Pizza pizza = createPizza();
		pizza.make();
		System.out.println("본점 브랜드를 이용해서 판매한다");
	}
	void method() {}; // hook 함수
	// 나를 상속받는 함수는 반드시 abstract 함수를 구현하세요
	abstract Pizza createPizza(); // 템플릿 메소드 패턴
	
}

// 팩토리 메소드 패턴 : 자식 클래스가 어떤 객체를 생성할지 결정하는 패턴
class SeoulPizzaStore extends PizzaStore{
	@Override
	Pizza createPizza() {
		return new SeoulPizza();
	}
}

interface Pizza{
	void make();
}
class SeoulPizza implements Pizza{
	@Override
	public void make() {
		System.out.println("서울형 피자를 만든다");
	}
}
public class Hi {
	public static void main(String[] args) {
		PizzaStore pizzaStore = new SeoulPizzaStore();
		pizzaStore.orderPizza();
	}
}
*/
/*
// ex2)
abstract class Airplane{
	void fly() {
		getFuel().use();
		System.out.println("로 날아갑니다.");
	}
	void method() {}; // hook 함수
	// 나를 상속받는 함수는 반드시 abstract 함수를 구현하세요
	abstract Fuel getFuel(); // 템플릿 메소드 패턴
	
}

// 팩토리 메소드 패턴 : 자식 클래스가 어떤 객체를 생성할지 결정하는 패턴
class KoreaAir extends Airplane{
	@Override
	Fuel getFuel() {
		return new Water();
	}
	
}

interface Fuel{
	void use();
}
class Water implements Fuel{
	@Override
	public void use() {
		System.out.println("물");
	}
}
public class Hi {
	public static void main(String[] args) {
		Airplane airplane = new KoreaAir();
		airplane.fly();
	}
}
*/
/*
//ex1)
class Airplane{
	Fuel fuel; // DI(의존적 주입)
	public Airplane(Fuel fuel) {
		this.fuel = fuel;
	}
	void fly() {
		fuel.use();
		System.out.println("로 날아갑니다.");
	}
}

interface Fuel{
	void use();
}
class Water implements Fuel{
	@Override
	public void use() {
		System.out.println("물");
	}
}
public class Hi {
	public static void main(String[] args) {
		Airplane airplane = new Airplane(new Water());
		airplane.fly();
	}
}
*/