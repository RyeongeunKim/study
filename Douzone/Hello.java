package Pack;

import java.util.Iterator;
import java.util.Random;

/*
// ex)
public class Hello 
{
	public static void main(String[] args) 
	{
		// System.out.println("1000");
	}
}
*/
/*
// ex)
class Animal {
	
}

class Tiger extends Animal {
	
}

public class Hello 
{
	public static void main(String[] args) 
	{
		// System.out.println("1000");
	}
}
*/
/*
class A{
	void m1() {
		System.out.println(1);
	}
}

interface B{
	void m2(); // 함수원형

}

interface C{
	void m3();
}

class D extends A implements B, C{
	@Override
	public void m2() {
		System.out.println(2);
		
	}
	@Override
	public void m3() {
		System.out.println(3);
	}
}

@FunctionalInterface // 반드시 이 인터페이스에는 함수는 한개만 존재한다는 뜻
interface E{
	void m1();
}


// ex41)
public class Hello 
{
	public static void main(String[] args) 
	{
		D t = new D();
		t.m1();
		t.m2();
		t.m3();	
		Thread t2 = null; //t2는 객체가 아니다(명확하게 적기!)
		
		String s = null;
		StringBuffer sf = null;
	}
}
*/
/*
interface 한국은행{
	void 입금();
	void 출금();
	void 이체();
	void 대출();
}

class 국민은행 implements 한국은행{
	@Override
	public void 입금() {
		System.out.println("이자율은 3%입니다");
		
	}
	@Override
	public void 출금() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 이체() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 대출() {
		// TODO Auto-generated method stub
		
	}
}

class 우리은행 implements 한국은행{
	@Override
	public void 입금() {
		System.out.println("이자율은 6%입니다");
		
	}
	@Override
	public void 출금() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 이체() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 대출() {
		// TODO Auto-generated method stub
		
	}
}

// ex40)
public class Hello 
{
	public static void main(String[] args) 
	{
		국민은행 t1 = new 국민은행();
		t1.입금();
		우리은행 t2 = new 우리은행();
		t2.입금();
	}
}
*/


/*
class 대장장이 {
	void 칼() {
		System.out.println("칼을 잘 만듭니다");
	}
	void 방패() {};
}

class 나그네1 extends 대장장이{
	void 방패() {
		System.out.println("방패 잘 만듭니다");
	}
}
class 나그네2 extends 대장장이{
	// 오버라이딩 : 부모와 자식이 함수이름을 동일하게 사용
	// 어노테이션 : 프로그래머가 실수할 수 있는 사항을 미리 방지
	//			  코드가 오류나기 전에 미리 알려주는 역할
	@Override
	void 방패() {
		
	}
}

// ex39)
public class Hello 
{
	public static void main(String[] args) 
	{
		나그네1 t1 = new 나그네1();
		t1.칼();
		t1.방패();
		
		나그네2 t2 = new 나그네2();
		t2.칼();
		t2.방패();
	}
}
/*
// ex38)
// class? interface? 둘 다 사용할 수 있을 땐 interface 사용
interface Animal { // 자식의 가이드 역할
	abstract void m1(); // 실전에는 abstract 안붙이는 경우도 있음	
}

//abstract class Animal { // 인터페이스 역할만 한다
//	abstract void m1(); // {} 없음 -> 미완성코드
//	
//}

class Tiger implements Animal {
	public void m1() {
		System.out.println(2);
	}
}

public class Hello 
{
	public static void main(String[] args) 
	{
		Animal a = new Tiger();
		a.m1();
		//Animal t2 = new Animal(); // 객체를 생성시킬 수 없다
	}
}
*/
/*
// ex37)
class Animal {
	void cry() {
		System.out.println("...");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("멍멍!");
	}
	
}
class Cat extends Animal {
	void cry() {
		System.out.println("야옹~~!");
	}
	
}
class Snake extends Animal {
	
}

public class Hello 
{
	public static void main(String[] args) 
	{
		Random rm = new Random();
		Animal t0 = new Dog();
		Animal t1 = new Cat();
		Animal t2 = new Snake();
		
		for(int i=0; i<10; i++) {
			int num = rm.nextInt(3);
			switch (num) {
			case 0:
				t0.cry();
				break;
			case 1:
				t1.cry();
				break;
			case 2:
				t2.cry();
				break;
			}
		}
		System.out.println("----------------------------------");
		for(int i=0; i<10; i++) {
			Animal[] t3 = new Animal[] {new Dog(), new Cat(), new Snake()};
			t3[rm.nextInt(3)].cry();
		}
	}
}
*/
/*
// ex36) 랜덤
public class Hello 
{
	public static void main(String[] args) 
	{
		Random rm = new Random();
		//System.out.println(rm.nextInt());
		for(int i=0; i<10; i++) {
			int num = rm.nextInt(2); // 0 1 2
			System.out.println(num);
			System.out.println("---------------------------------");
			System.out.println(rm.nextInt(10));
		}
	}
}
*/
/*
// ex35)
public class Hello 
{
	public static void main(String[] args) 
	{
		int a = 10; //컴퓨터에게 4byte메모리달라고 요청
		
		// 일괄적으로 메모리달라는 요청 - 배열
		// 1 사용 O
		int[] ar = new int[5];
		// 2 실전에선 사용 X
		int[] br = new int[] {1,2,3,4,5};
		// 3 실전에선 사용 X
		int[] cr = {10,20,30,40,50};
		
		System.out.println(ar.length);
		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i] + " ");
		} System.out.println();
		
		System.out.println("호랑이");
		
		// 간략화 된 for문
		// i대신 사용하는 변수 = x, data, value
		for (int x : cr) {
			System.out.print(x + " ");
		} System.out.println();
		

		cr[0] = 100;
		cr[4] = 200;
		//cr[5] = 300;
		//ar[-1] = 400;
		int num = 3;
		ar[num] = 500;
		ar[num * 3 - 5] = 400; 
		ar[2] = 3;
		ar[ar[2]] = 999;
		System.out.println(ar[2] + " " + ar[3]);
		ar[ar[3]-998] = 888;
		for (int x : ar) {
			System.out.print(x + " ");
		} System.out.println();
		System.out.println("-------------------------------");
		boolean[] dr = {true, false, false, true};
		for (boolean x : dr) {
			System.out.print(x + " ");
		} System.out.println();
		System.out.println("--------------------------------");
		String[] ss = new String[4];
		ss[0] = "호랑이";
		ss[1] = "강아지";
		ss[2] = "고양이";
		ss[3] = "기린";
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		for (String x : ss) {
			System.out.println(x);
		}
		String[] st = new String[] {"제비꽃", "벚꽃", "개나리"};
		String s1 = "호랑이"; // 정석
		String s2 = new String("독수리");
		
		// 기억해라
		String[] su = new String[] {new String("민들레"),new String("진달래"), new String("개나리")};
		
	}
}
*/	

/*
// ex34)
class Animal {
	void cry() {
		System.out.println("...");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("멍멍!");
	}
	
}
class Cat extends Animal {
	void cry() {
		System.out.println("야옹~~!");
	}
	
}
class Snake extends Animal {
	
}

class Zoo {
//	void sound(Dog t) {
//		t.cry();
//	}
//	void sound(Cat t) {
//		t.cry();
//	}
//	void sound(Snake t) {
//		t.cry();
//	}
	void sound(Animal t) {
		t.cry();
	}
}

public class Hello 
{
	public static void main(String[] args) 
	{
		Animal t1 = new Dog();
		Animal t2 = new Cat();
		Animal t3 = new Snake();
		
		Dog t4 = new Dog();
		Cat t5 = new Cat();
		Snake t6 = new Snake();
		
		t1.cry();
		t2.cry();
		t3.cry();
		t4.cry();
		t5.cry();
		t6.cry();
		System.out.println("----------------------");
		
		Zoo t7 = new Zoo();
		t7.sound(new Dog());
		t7.sound(new Cat());
		t7.sound(new Snake());
	}
}
*/
/*
// ex33)
class Animal {
	void m1() {
		System.out.println(1);
	}
	void m3() {
		System.out.println(31);
	}
	
}

class Tiger extends Animal {
	void m2() {
		System.out.println(2);
	}
	void m3() {
		System.out.println(32);
	}
}

public class Hello 
{
	public static void main(String[] args) 
	{
		Animal t1 = new Animal(); // case 1
		Tiger t2 = new Tiger(); // case 2
		Animal t3 = new Tiger(); // case 3 부자관계(업캐스팅)
		//Tiger t4 = new Animal(); // case 4 다운캐스팅
		t3.m1(); // m2는 문법이 지원 X
		t3.m3();
	}
}
*/
/*
// ex32) 상속관계일 때 생성자
class Animal{
	Animal(){
		System.out.println("부모 생성자 콜");
	}
	
	Animal(int n){
		System.out.println(n);
	}
}

class Tiger extends Animal{
	Tiger(){
		// 현재 라인에 코드가 한줄이 생략되어 있다.
		super(); // 부모의 생성자를 콜
		System.out.println("자식 생성자 콜");
	}
	Tiger(int num){
		super(num+100);
		System.out.println(num);
	}
	Tiger(int a, int b){
		super(a * b);
		System.out.println("3번째 생성자");
	}
}


public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger(100);
		Tiger t3 = new Tiger(3, 4);
	}
}
*/
/*
// ex31) 상속
// 호랑이는 동물이다 
// 호랑이 -> 동물
// 자식 -> 부모
class Animal{
	void m2() {
		System.out.println(2);
	}
	void m3() {
		System.out.println(31);
		System.out.println("---------------------------");
	}
	
	
}

class Tiger extends Animal {
	
	void m1() {
		System.out.println(1);
	}
	void m3() {
		System.out.println(32);
		System.out.println("---------------------------");
	}
	void m4() {
		m3();
		super.m3();
		System.out.println(4);
		System.out.println("---------------------------");
	}
}

public class Hello 
{
	public static void main(String[] args) 
	{
		Animal t1 = new Animal(); // 상속과 관계 X
		Tiger t2 = new Tiger(); 
		t2.m1();
		t2.m2(); // Tiger에서 m2를 찾고 없으니까 Animal m2 사용
		t2.m3(); // 자기껄 사용한다
		t2.m4();
		//부모의 m3 호출 -> 직접적 X, 간접적으로 사용가능
		
	}
}
*/
/*
// ex30) 수학
public class Hello 
{
	public static void main(String[] args) 
	{
		int v1 = Math.abs(-5);
		System.out.println("v1 = "+v1);
		double v2 = Math.abs(-3.14);
		System.out.println("v2 = "+v2);
		double v3 = Math.ceil(6.0);
		double v4 = Math.ceil(-5.0);
		double v5 = Math.floor(5.0);
		double v6 = Math.floor(-6.0);
	}
}
*/
/*
// ex29)
class Tiger{
	static void myMain() {
		Tiger t = new Tiger();
		
		// static은 아니지만 객체를 생성했기 때문에
		// staitc안의 객체를 사용
		t.m1();
		// m1(); static이 아니라서 쓸 수 없다
	}
	
	void m1() {
	}
}

public class Hello 
{
	static int num = 10;
	Hello(){}
	static void m1() {
		System.out.println("1번 콜");
	}

	public static void main(String[] args) 
	{
		System.out.println(num);
		m1();

		Hello h = new Hello();
		h.m2();
		h.m1();
		Hello.m1();
		// Hello.m2(); 사용할 수 없다
	}
	void m2() {
		System.out.println("2번 콜");
	}
}
*/

/*
class Tiger{
	int num1;
	static int num2 = 100;
	
	static void m1() {
		System.out.println("static 함수 콜");	
	}
}

// ex28)
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println(Tiger.num2);
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		System.out.println(t1.num2);
		t2.num2 = 200;
		System.out.println(t1.num2);
		System.out.println(Tiger.num2); // 원칙
		Tiger.m1();
		
		// 이해
		System.out.println(Math.abs(-10));
		
	}
}
*/
/*
class Car {
	int fuel = 100;
	String name;
	
	Car(){
		System.out.println("default 생성자 콜");
		name = "무명";
	}
	
	Car(String n, int f){
		System.out.println("인수전달 생성자 콜");
		fuel = f;
		name = n;
	}
	
	void move() {
		System.out.println(name + "자동차가 달린다");
		fuel -= 30;
	}
	
	void stop() {
		System.out.println(name + "자동차가 멈춘다");
		fuel -= 10;
	}
	
	void inject(int f) {
		System.out.println(name + "연료를 주입하다");
		fuel += f;
	}
	
	void show() {
		System.out.println(name + " " + fuel);
	}
	
	
}


// ex27)
public class Hello 
{
	public static void main(String[] args) 
	{
		Car car1 = new Car();
		Car car2 = new Car("꼬마", 200);
		car1.move();
		car2.move();
		car1.show();
		car2.show();
		car1.stop();
		car2.stop();
	}
}
*/
/*
class Tiger {
	
	Tiger(){}
	
	Tiger(int a, int b){
		
	}
}


// ex26)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger(10, 20);
	}
}
*/
/*
class Tiger {
	
	int age = 20;
	String name = "홍길동";
	
	//default 생성자
	Tiger(){
		System.out.println("생성자콜");
		System.out.println("생성자가 호출되었다");
		
		//age = 20;
		//name = "홍길동";
	}
	
	Tiger(int a, String n){
		age = a;
		name = n;
	}
	
	void showInfo() {
		System.out.println(age + " " + name);
	}
}

// ex25) 생성자
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();

		Tiger t3 = new Tiger(100, "독수리");
		Tiger t4 = new Tiger(200, "앵무새");

		t1.showInfo();
		t2.showInfo();
		t3.showInfo();
		t4.showInfo();
	}
}
*/
/*
// ex24)
public class Hello 
{
	public static void main(String[] args) 
	{
		int a = 100;
		String s1 = Integer.toString(a);
		System.out.println(s1 + 200);
		String s2 = ""+a;
		System.out.println(s2 + 100);
		String s3 = "456";
		int b = Integer.parseInt(s3);
		System.out.println(b + 100);
	}
}
*/
/*
// ex23)
class Tiger {
	void method01() {
		System.out.println(1);
	}
	void method01(int a) {
		System.out.println(2);
	}
	void method01(int a, int b) {
		System.out.println(3);
	}
	void method01(String a, int b) {
		System.out.println(4);
	}
	int getAreaRect(int width, int height) {		
		return width*height;
	}
	int getAreaRect(int length) {
		return length * length;
	}
}
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t = new Tiger();
		t.method01();
		t.method01(10);
		t.method01(10, 20);
		t.method01("호랑이", 20);
		
	}
}
*/
/*
// ex22)
public class Hello 
{
	public static void main(String[] args) 
	{
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i<3) {
				continue;
			}
			System.out.println("호랑이");
			
			while(true) {
				int num = 0;
				num++;
				if(num%2==0) {
					System.out.println("호랑이" + num);
					continue;
				}
				if(num==10) {
					System.out.println("코끼리" + num);
					break;
				}
			}
			if(i==7) {
				break;
			}
		}
	}
}
*/

/*
// ex21)
class Tiger {
	
	int m1(int a, int b) {
		if(a>b) {
			return 100;
		} else {
			System.out.println("호랑이");
		}
		return 5000;
	}
	
	void m2() {
		System.out.println(1);
		return;
		//System.out.println(2);
	}
	
	void m3(int num) {
		for(int i=0; i<10; i++) {
			if(i==num) {
				System.out.println("찾았다");
			}
		}
		System.out.println("검색데이터 찾지못함");
		return;
	}
}

public class Hello 
{
	
	public static void main(String[] args) 
	{
		Tiger t = new Tiger();
		t.m1(2, 3);
		t.m3(2);
	}
}
*/

/*
// ex20)

class Tiger {
	
	String m1() {
		
		return "독수리";
	}
	
	Lion m2() {
		//return new Lion();
		Lion t = new Lion();
		return t;
	}
	
	Lion m3(Lion t) {
		return t;
	}
}

class Lion {
	void show() {
		System.out.println(1000);
	}
}

public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		String s1 = t1.m1();
		System.out.println(s1);
		System.out.println(t1.m1());
		
		Lion t2 = t1.m2();
		t2.show();
		
		Lion t3 = t1.m3(new Lion());
		t3.show();
		
		t1.m3(new Lion()).show();;
	}
}
*/
/*
class Tiger {
	// 주의 => int a, b (X)
	void m1(int a, int b) {
		System.out.println(a+" "+b);
		System.out.println(a * b + a);
		System.out.println("-----------------------------------");
	}
	
	void m2(int a, char b, boolean c, float d, String e) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println("-----------------------------------");
	}
	
	void m3(Lion a) {
		System.out.println(a.hashCode());
		a.sound();
		System.out.println("-----------------------------------");
	}
}

class Lion{
	
	void sound() {
		System.out.println("어흥~~~~~~!");
	}
}

// ex20)
public class Hello 
{
	public static void main(String[] args) 
	{
		String s1 = "호랑이";
		System.out.println(s1);
		System.out.println(s1.length());
		
		Tiger t1 = new Tiger();
		t1.m1(3, 4);
		t1.m2(10, '한', false, 3.14f, "호랑이");
		
		Lion t2 = new Lion();
		System.out.println(t2.hashCode());
		t1.m3(t2);
		
		// Lion a = new Lion();
		t1.m3(new Lion());
	}
}
*/
/*
// ex19)
class Tiger{
	
	void merry() {
		System.out.println('멍');
	}
	// int num = 3
	void happy(int num) {
		for(int i=0; i<num; i++) {
			System.out.println('왕');			
		}
	}
	
	int turtle() {
		System.out.println("거북이 콜");
		return 15;
	}
	
	int fish(int num) {
		int n = num * 3;
		return n;
	}
}

// ex18)
public class Hello 
{
	public static void main(String[] args) 
	{
		// 객체 생성
		Tiger t = new Tiger();
		t.merry();
		t.merry();
		t.merry();		

		
		for(int i=0; i<10; i++) {
			t.merry();
		}
		
		System.out.println("---------------------------------");
		t.happy(5);
		
		System.out.println("---------------------------------");
		int num = t.turtle();
		System.out.println(num);
		System.out.println(t.turtle());
		
		System.out.println("---------------------------------");
		int cp = t.fish(7);
		System.out.println(cp);
		System.out.println(t.fish(345));
		
		// 리턴값   인수전달
		// x       x
		// x       o
		// o       x
		// o       o
	}
}

/*
class Tiger{
	// 필드 : 클래스 안에서 선언되는 변수
	int a;
	int b = 20;
	int c, d = 30;
	
	// 생성자 
	// 메소드
}

// ex17) 
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger(); // 객체생성
		Tiger t2 = new Tiger(); // 객체생성
		t1.a = 100;
		t1.c = t1.a + 30;
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t1.c);
		System.out.println(t1.d);
		System.out.println(t2.c);
		
		// 모든 객체는 생성이 될 때 반드시 고유한 번호를 발급받는다
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		Tiger t3;
		t3 = t2;
		
		// t2와 t3는 메모리를 공유한다
		// 동일한 메모리를 같은 이름으로 쓰고있다
		System.out.println(t3.hashCode()); 
		
		
		t3.a = 999;
		System.out.println(t2.a);
	}
}
*/
/*
// ex15) 대입, 증가 연산자
public class Hello 
{
	public static void main(String[] args) 
	{
		// 대입 -> 증가 순서
		int a = 10, b;
		b = a++;
		System.out.println(a + " " + b);
		
		// 증가 -> 대입 순서
		int c = 10;
		int d = 0;
		d = ++c;
		System.out.println(c + " " + d);
		
		int a1 = 10, a2 = 10;
		System.out.println(a1++);
		System.out.println(++a2);
		System.out.println(a1 + " " + a2);
	}
}
*/
/*
// ex14) 우박수 출력 프로그램
public class Hello 
{
	public static void main(String[] args) 
	{
		// 예제 1
		int n = 77;
		while(true) {
			System.out.println(n);
//			if(n%2==0) {
//				n = n / 2;
//			} else {
//				n = n * 3 + 1;
//			}
			n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
			
			if(n==1) {
				System.out.println(n);
				System.out.println("탈출하기 직전");
				break;
			}
		}
		
		// 예제 2
		int n2 = 1234;
		int sum = 0;
		while(true) {
			int r = n2 % 10;
			n2 = n2 / 10;
			System.out.println(n2 + " " + r);
			sum = sum + r;
			if(n2 == 0) {
				break;
			}
		}
		System.out.println(sum);
		
		// int : 타입
		// a : 변수
		// = : 대입연산자
		// 10 : 리터럴
		int a = 10;
		int b = 20;
		short c = 30;
		
		// 대입연산자는 쌍방간의 타입이 같아야한다
		// 받는 타입으로 똑같이 바꿔주기
		// b 4byte, c 2byte
		b = (int)c;
		// c 2byte, b 4byte
		c = (short)a;
		
		int num = 10;
		num = num + 3;
		num += 3; // 위 코드보다 더 많이 사용함
		int a1 = 0;
		int a2 = 0;
		a1 = a2+3;
		int t = +1;
		int u = -1;
		
		int k = 10;
		k += 3;
		System.out.println(k);
		k = +3;
		System.out.println(k);
		
		int d = 0;
		d++;
		System.out.println(d);
		++d;
		System.out.println(d);
		d = d+1;
		System.out.println(d);
		d += 1;
		System.out.println(d);
	}
}
*/
// ex13) 제어문 -  while
// 처음부터 반복횟수를 알 때는 for문, 모를 때는 while문
/*
public class Hello 
{
	public static void main(String[] args) 
	{
//		int num = 0;
//		while(true) {
//			System.out.println(num + " ");
//			num++;
//		}
		
		int a = 0;
		while(true) {
			System.out.println(a);
			if(a==5) {
				System.out.println("탈출하기 직전");
				break;
			}
			a++;
		}
		
	}
}
*/
/*
// ex12) 제어문 - for문 
public class Hello 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
		
		int n = 7;
		for (int i = 0; i < 10; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
}
*/
/*
// ex11) 제어문 - for문
public class Hello 
{
	public static void main(String[] args) 
	{
		// 피해야되는 문법
		// i는 0,1을 제외한 다른 숫자가 들어가면 안된다!
		// 부등호 부호 바꾸면 안됨 (>)
		// 증가횟수가 1증가말고 다른 숫자는 안된다!
		//예)
		 //for (int i = 5; i > 4; i=i+3) {
		 //
		 //}
		 
		
		// 1형식
		for (int i = 0; i < 5; i++) {
			
		}
		
		// 2형식
		for (int i = 1; i <= 5; i++) {
			
		}
		
		// 3형식
		// 음수, 양수의 좌표값 제어
		// 반복횟수 5*2+1
		int n = 5;
		for (int i = -n; i <= n; i++) {
			
		}
		
		
		// 기본
		for (int i = 0; i < 3; i++) {
			System.out.println("호랑이"+i);
			int num = 10;
			num = num + 3;
			System.out.println(num);
			num = num + 1;
			System.out.println(num);
			num++;
			System.out.println(num);
			num--;
			System.out.println(num);
			++num;
			System.out.println(num);
			--num;
			System.out.println(num);
		}
	}
}
*/
/*
// ex10) 제어문 - switch문
public class Hello 
{
	public static void main(String[] args) 
	{
		// 1) case 뒤에는 변수가 올 수 없음
		// 2) switch 안에는 변수가 올 수 있음		
		// 3) default는 생략가능
		// 4) 의도적인 경우는 break는 생략가능
		// 5) case문장에서 실행되는 한 문장 이상일 때는 일반적으로
		//    블록처리를 해버린다
		
		int num = 10;
		
		switch (10) {
		case 10:
			System.out.println(1);
			//break;
		case 20:{
			System.out.println(2);
			System.out.println(100);			
		} break;
		case 30:
			System.out.println(3);
			break;
		default:
			System.out.println(4);
			break;
		}
		
		int jumsu = 83;
		int q = jumsu / 10;
		if(q == 9) {
			System.out.println("A학점입니다");
		} else if(q == 8) {
			System.out.println("B학점입니다");
		} else if(q == 7) {
			System.out.println("C학점입니다");
		} else if(q >= 6) {
			System.out.println("D학점입니다");
		} else {
			System.out.println("F학점입니다");
		}
	}
}
*/
/*
// ex9) 제어문 - if문
public class Hello 
{
	public static void main(String[] args) 
	{
		// 1) if문
		System.out.println(1);

		if(true) {
			System.out.println(2);
			System.out.println(4);
		};

		System.out.println(3);

		// 2) if-else
		//if-else -> 삼항연산자로 바꿀 수 있으면 치환하기!
		if(true) {
			System.out.println(5);
		} else {
			System.out.println(6);
		}

		// 3) 삼항연산자
		int a = 10;
		int b = 5;
		int c;

		// if, else에 받는 변수가 똑같은가?
		// => 이 조건에 충족하면 삼항연산자로 사용!
		//if문
		if(a>b) {
			c = 7;
		} else {
			c = 8;
		}
		System.out.println(c);
		//삼항연산자 
		// : 뒤에 들어가는게 else
		c = a > b ? 7 : 8; 
		System.out.println(c);
		
		if(a>b) {
			System.out.println("호랑이");
		} else {
			System.out.println("코끼리");
		}
		
		System.out.println(a > b ? "호랑이" : "코끼리");
		
		// 4) else-if => n개 중에 한개
		//switch로 바꿀 수 있다면 바꾸는게 원칙!
		int num = 83;
		
		if(num >= 90) {
			System.out.println("A학점입니다");
		} else if(num >=80) {
			System.out.println("B학점입니다");
		} else if(num >=70) {
			System.out.println("C학점입니다");
		} else if(num >=60) {
			System.out.println("D학점입니다");
		} else {
			System.out.println("F학점입니다");
		}
	}
}
*/
/*
// ex8)
public class Hello 
{
	public static void main(String[] args) 
	{
		int a = 17, b = 3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		// 산술>비교>논리
		System.out.println(a>b*7); 
		System.out.println(a>b*7||a-10>b);
	}
}
*/
/*
// ex7) 변수선언
public class Hello 
{
	public static void main(String[] args) 
	{
		int a;
		a = 10;
		System.out.println(a);
		int b, c, d;
		b = 20;
		c = 30;
		d = 40;
		System.out.println(b+" "+c+" "+d);
		
		int e = 10;
		int f = 20, g = 30;
		int h, i = 40, j;
		h = 40;
		j = 60;
		System.out.println(e+" "+f+" "+g);
		System.out.println(h+" "+i+" "+j);
		
		int a10;
		a10 = 10;
		System.out.println(a10);
		a10 = 20;
		System.out.println(a10);
		
		int aa = 88, bb = 99;
		int temp;
		
		//swap 프로그램
		System.out.println(aa+" "+bb);
		temp = aa; // temp = 88
		aa = bb; // aa = 99;
		bb = temp; // bb = 88
		System.out.println(aa+" "+bb);
		
		int cc = 100;
		int dd = 200;
		int tt = cc;
		cc = dd;
		dd = tt;
	}
}
*/
/*
// ex6)
public class Hello 
{
	public static void main(String[] args) 
	{
		byte apple = 127;
		System.out.println(apple);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		short banana = 30000;
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(banana);
		
		int orange =2100000;
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(orange);
		
		long melon = 92000000;
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(melon);
		
		float tiger = 3.14f;
		System.out.println(tiger);
		
		double lion = 3.14;
		System.out.println(lion);
		
		// char cat = 1234; 이렇게 사용하면 X
		char cat = '한';
		System.out.println((int)Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		System.out.println(cat);
		
		boolean nabi = true;
		System.out.println(nabi);

	}
}
*/
/*
// ex5) 
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println(10); // 숫자
		System.out.println('한'); // 문자
		System.out.println("호랑이"); // 문자열
		System.out.println("1000"); // 문자열
		
		
		System.out.println(10+20); // 숫자+숫자=숫자
		System.out.println(10+"호랑이"); // 숫자+문자열=문자열
		System.out.println("호랑이"+10); // 문자열+숫자=문자열
		System.out.println("호랑이"+"코끼리"); // 문자열+문자열=문자열
		System.out.println(10+"호랑이"+20); // 숫자+문자열+숫자=문자열
		System.out.println(10+20+"호랑이"); // 왼 -> 오 
		System.out.println("호랑이"+10+20); // 왼 -> 오
		System.out.println(10+" "+20); 
	}
	
}
*/
/*
// ex4) 논리연산자
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);
		
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);
		
		System.out.println(true && true && false);
		System.out.println(false || false || true);
		System.out.println((false || false) && true); 
		System.out.println(3>2 || false || 6<=3); 
		System.out.println(!true); 
		System.out.println(!(3>2)); 
	}
	
}
*/
/*
// ex3) 비교연산자
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println(5<3);
		System.out.println(5<=3);
		System.out.println(5>3);
		System.out.println(5>=3);
		System.out.println(5==3);
		System.out.println(5!=3);
	}
	
}
*/
/*
// ex2) 산술연산자
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println(20+3);
		System.out.println(20-3);
		System.out.println(20*3);
		System.out.println(20/3);
		System.out.println(20%3);
		System.out.println(3+2*4);
		System.out.println((3+2)*4);
	}
	
}
*/
/*
// ex1) 
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println("1000");
		
	}
	
}
*/