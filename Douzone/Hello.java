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
	void m2(); // �Լ�����

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

@FunctionalInterface // �ݵ�� �� �������̽����� �Լ��� �Ѱ��� �����Ѵٴ� ��
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
		Thread t2 = null; //t2�� ��ü�� �ƴϴ�(��Ȯ�ϰ� ����!)
		
		String s = null;
		StringBuffer sf = null;
	}
}
*/
/*
interface �ѱ�����{
	void �Ա�();
	void ���();
	void ��ü();
	void ����();
}

class �������� implements �ѱ�����{
	@Override
	public void �Ա�() {
		System.out.println("�������� 3%�Դϴ�");
		
	}
	@Override
	public void ���() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ��ü() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ����() {
		// TODO Auto-generated method stub
		
	}
}

class �츮���� implements �ѱ�����{
	@Override
	public void �Ա�() {
		System.out.println("�������� 6%�Դϴ�");
		
	}
	@Override
	public void ���() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ��ü() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ����() {
		// TODO Auto-generated method stub
		
	}
}

// ex40)
public class Hello 
{
	public static void main(String[] args) 
	{
		�������� t1 = new ��������();
		t1.�Ա�();
		�츮���� t2 = new �츮����();
		t2.�Ա�();
	}
}
*/


/*
class �������� {
	void Į() {
		System.out.println("Į�� �� ����ϴ�");
	}
	void ����() {};
}

class ���׳�1 extends ��������{
	void ����() {
		System.out.println("���� �� ����ϴ�");
	}
}
class ���׳�2 extends ��������{
	// �������̵� : �θ�� �ڽ��� �Լ��̸��� �����ϰ� ���
	// ������̼� : ���α׷��Ӱ� �Ǽ��� �� �ִ� ������ �̸� ����
	//			  �ڵ尡 �������� ���� �̸� �˷��ִ� ����
	@Override
	void ����() {
		
	}
}

// ex39)
public class Hello 
{
	public static void main(String[] args) 
	{
		���׳�1 t1 = new ���׳�1();
		t1.Į();
		t1.����();
		
		���׳�2 t2 = new ���׳�2();
		t2.Į();
		t2.����();
	}
}
/*
// ex38)
// class? interface? �� �� ����� �� ���� �� interface ���
interface Animal { // �ڽ��� ���̵� ����
	abstract void m1(); // �������� abstract �Ⱥ��̴� ��쵵 ����	
}

//abstract class Animal { // �������̽� ���Ҹ� �Ѵ�
//	abstract void m1(); // {} ���� -> �̿ϼ��ڵ�
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
		//Animal t2 = new Animal(); // ��ü�� ������ų �� ����
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
		System.out.println("�۸�!");
	}
	
}
class Cat extends Animal {
	void cry() {
		System.out.println("�߿�~~!");
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
// ex36) ����
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
		int a = 10; //��ǻ�Ϳ��� 4byte�޸𸮴޶�� ��û
		
		// �ϰ������� �޸𸮴޶�� ��û - �迭
		// 1 ��� O
		int[] ar = new int[5];
		// 2 �������� ��� X
		int[] br = new int[] {1,2,3,4,5};
		// 3 �������� ��� X
		int[] cr = {10,20,30,40,50};
		
		System.out.println(ar.length);
		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i] + " ");
		} System.out.println();
		
		System.out.println("ȣ����");
		
		// ����ȭ �� for��
		// i��� ����ϴ� ���� = x, data, value
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
		ss[0] = "ȣ����";
		ss[1] = "������";
		ss[2] = "�����";
		ss[3] = "�⸰";
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		for (String x : ss) {
			System.out.println(x);
		}
		String[] st = new String[] {"�����", "����", "������"};
		String s1 = "ȣ����"; // ����
		String s2 = new String("������");
		
		// ����ض�
		String[] su = new String[] {new String("�ε鷹"),new String("���޷�"), new String("������")};
		
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
		System.out.println("�۸�!");
	}
	
}
class Cat extends Animal {
	void cry() {
		System.out.println("�߿�~~!");
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
		Animal t3 = new Tiger(); // case 3 ���ڰ���(��ĳ����)
		//Tiger t4 = new Animal(); // case 4 �ٿ�ĳ����
		t3.m1(); // m2�� ������ ���� X
		t3.m3();
	}
}
*/
/*
// ex32) ��Ӱ����� �� ������
class Animal{
	Animal(){
		System.out.println("�θ� ������ ��");
	}
	
	Animal(int n){
		System.out.println(n);
	}
}

class Tiger extends Animal{
	Tiger(){
		// ���� ���ο� �ڵ尡 ������ �����Ǿ� �ִ�.
		super(); // �θ��� �����ڸ� ��
		System.out.println("�ڽ� ������ ��");
	}
	Tiger(int num){
		super(num+100);
		System.out.println(num);
	}
	Tiger(int a, int b){
		super(a * b);
		System.out.println("3��° ������");
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
// ex31) ���
// ȣ���̴� �����̴� 
// ȣ���� -> ����
// �ڽ� -> �θ�
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
		Animal t1 = new Animal(); // ��Ӱ� ���� X
		Tiger t2 = new Tiger(); 
		t2.m1();
		t2.m2(); // Tiger���� m2�� ã�� �����ϱ� Animal m2 ���
		t2.m3(); // �ڱⲬ ����Ѵ�
		t2.m4();
		//�θ��� m3 ȣ�� -> ������ X, ���������� ��밡��
		
	}
}
*/
/*
// ex30) ����
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
		
		// static�� �ƴ����� ��ü�� �����߱� ������
		// staitc���� ��ü�� ���
		t.m1();
		// m1(); static�� �ƴ϶� �� �� ����
	}
	
	void m1() {
	}
}

public class Hello 
{
	static int num = 10;
	Hello(){}
	static void m1() {
		System.out.println("1�� ��");
	}

	public static void main(String[] args) 
	{
		System.out.println(num);
		m1();

		Hello h = new Hello();
		h.m2();
		h.m1();
		Hello.m1();
		// Hello.m2(); ����� �� ����
	}
	void m2() {
		System.out.println("2�� ��");
	}
}
*/

/*
class Tiger{
	int num1;
	static int num2 = 100;
	
	static void m1() {
		System.out.println("static �Լ� ��");	
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
		System.out.println(Tiger.num2); // ��Ģ
		Tiger.m1();
		
		// ����
		System.out.println(Math.abs(-10));
		
	}
}
*/
/*
class Car {
	int fuel = 100;
	String name;
	
	Car(){
		System.out.println("default ������ ��");
		name = "����";
	}
	
	Car(String n, int f){
		System.out.println("�μ����� ������ ��");
		fuel = f;
		name = n;
	}
	
	void move() {
		System.out.println(name + "�ڵ����� �޸���");
		fuel -= 30;
	}
	
	void stop() {
		System.out.println(name + "�ڵ����� �����");
		fuel -= 10;
	}
	
	void inject(int f) {
		System.out.println(name + "���Ḧ �����ϴ�");
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
		Car car2 = new Car("����", 200);
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
	String name = "ȫ�浿";
	
	//default ������
	Tiger(){
		System.out.println("��������");
		System.out.println("�����ڰ� ȣ��Ǿ���");
		
		//age = 20;
		//name = "ȫ�浿";
	}
	
	Tiger(int a, String n){
		age = a;
		name = n;
	}
	
	void showInfo() {
		System.out.println(age + " " + name);
	}
}

// ex25) ������
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();

		Tiger t3 = new Tiger(100, "������");
		Tiger t4 = new Tiger(200, "�޹���");

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
		t.method01("ȣ����", 20);
		
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
			System.out.println("ȣ����");
			
			while(true) {
				int num = 0;
				num++;
				if(num%2==0) {
					System.out.println("ȣ����" + num);
					continue;
				}
				if(num==10) {
					System.out.println("�ڳ���" + num);
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
			System.out.println("ȣ����");
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
				System.out.println("ã�Ҵ�");
			}
		}
		System.out.println("�˻������� ã������");
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
		
		return "������";
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
	// ���� => int a, b (X)
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
		System.out.println("����~~~~~~!");
	}
}

// ex20)
public class Hello 
{
	public static void main(String[] args) 
	{
		String s1 = "ȣ����";
		System.out.println(s1);
		System.out.println(s1.length());
		
		Tiger t1 = new Tiger();
		t1.m1(3, 4);
		t1.m2(10, '��', false, 3.14f, "ȣ����");
		
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
		System.out.println('��');
	}
	// int num = 3
	void happy(int num) {
		for(int i=0; i<num; i++) {
			System.out.println('��');			
		}
	}
	
	int turtle() {
		System.out.println("�ź��� ��");
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
		// ��ü ����
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
		
		// ���ϰ�   �μ�����
		// x       x
		// x       o
		// o       x
		// o       o
	}
}

/*
class Tiger{
	// �ʵ� : Ŭ���� �ȿ��� ����Ǵ� ����
	int a;
	int b = 20;
	int c, d = 30;
	
	// ������ 
	// �޼ҵ�
}

// ex17) 
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger(); // ��ü����
		Tiger t2 = new Tiger(); // ��ü����
		t1.a = 100;
		t1.c = t1.a + 30;
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t1.c);
		System.out.println(t1.d);
		System.out.println(t2.c);
		
		// ��� ��ü�� ������ �� �� �ݵ�� ������ ��ȣ�� �߱޹޴´�
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		Tiger t3;
		t3 = t2;
		
		// t2�� t3�� �޸𸮸� �����Ѵ�
		// ������ �޸𸮸� ���� �̸����� �����ִ�
		System.out.println(t3.hashCode()); 
		
		
		t3.a = 999;
		System.out.println(t2.a);
	}
}
*/
/*
// ex15) ����, ���� ������
public class Hello 
{
	public static void main(String[] args) 
	{
		// ���� -> ���� ����
		int a = 10, b;
		b = a++;
		System.out.println(a + " " + b);
		
		// ���� -> ���� ����
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
// ex14) ��ڼ� ��� ���α׷�
public class Hello 
{
	public static void main(String[] args) 
	{
		// ���� 1
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
				System.out.println("Ż���ϱ� ����");
				break;
			}
		}
		
		// ���� 2
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
		
		// int : Ÿ��
		// a : ����
		// = : ���Կ�����
		// 10 : ���ͷ�
		int a = 10;
		int b = 20;
		short c = 30;
		
		// ���Կ����ڴ� �ֹ氣�� Ÿ���� ���ƾ��Ѵ�
		// �޴� Ÿ������ �Ȱ��� �ٲ��ֱ�
		// b 4byte, c 2byte
		b = (int)c;
		// c 2byte, b 4byte
		c = (short)a;
		
		int num = 10;
		num = num + 3;
		num += 3; // �� �ڵ庸�� �� ���� �����
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
// ex13) ��� -  while
// ó������ �ݺ�Ƚ���� �� ���� for��, �� ���� while��
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
				System.out.println("Ż���ϱ� ����");
				break;
			}
			a++;
		}
		
	}
}
*/
/*
// ex12) ��� - for�� 
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
// ex11) ��� - for��
public class Hello 
{
	public static void main(String[] args) 
	{
		// ���ؾߵǴ� ����
		// i�� 0,1�� ������ �ٸ� ���ڰ� ���� �ȵȴ�!
		// �ε�ȣ ��ȣ �ٲٸ� �ȵ� (>)
		// ����Ƚ���� 1�������� �ٸ� ���ڴ� �ȵȴ�!
		//��)
		 //for (int i = 5; i > 4; i=i+3) {
		 //
		 //}
		 
		
		// 1����
		for (int i = 0; i < 5; i++) {
			
		}
		
		// 2����
		for (int i = 1; i <= 5; i++) {
			
		}
		
		// 3����
		// ����, ����� ��ǥ�� ����
		// �ݺ�Ƚ�� 5*2+1
		int n = 5;
		for (int i = -n; i <= n; i++) {
			
		}
		
		
		// �⺻
		for (int i = 0; i < 3; i++) {
			System.out.println("ȣ����"+i);
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
// ex10) ��� - switch��
public class Hello 
{
	public static void main(String[] args) 
	{
		// 1) case �ڿ��� ������ �� �� ����
		// 2) switch �ȿ��� ������ �� �� ����		
		// 3) default�� ��������
		// 4) �ǵ����� ���� break�� ��������
		// 5) case���忡�� ����Ǵ� �� ���� �̻��� ���� �Ϲ�������
		//    ���ó���� �ع�����
		
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
			System.out.println("A�����Դϴ�");
		} else if(q == 8) {
			System.out.println("B�����Դϴ�");
		} else if(q == 7) {
			System.out.println("C�����Դϴ�");
		} else if(q >= 6) {
			System.out.println("D�����Դϴ�");
		} else {
			System.out.println("F�����Դϴ�");
		}
	}
}
*/
/*
// ex9) ��� - if��
public class Hello 
{
	public static void main(String[] args) 
	{
		// 1) if��
		System.out.println(1);

		if(true) {
			System.out.println(2);
			System.out.println(4);
		};

		System.out.println(3);

		// 2) if-else
		//if-else -> ���׿����ڷ� �ٲ� �� ������ ġȯ�ϱ�!
		if(true) {
			System.out.println(5);
		} else {
			System.out.println(6);
		}

		// 3) ���׿�����
		int a = 10;
		int b = 5;
		int c;

		// if, else�� �޴� ������ �Ȱ�����?
		// => �� ���ǿ� �����ϸ� ���׿����ڷ� ���!
		//if��
		if(a>b) {
			c = 7;
		} else {
			c = 8;
		}
		System.out.println(c);
		//���׿����� 
		// : �ڿ� ���°� else
		c = a > b ? 7 : 8; 
		System.out.println(c);
		
		if(a>b) {
			System.out.println("ȣ����");
		} else {
			System.out.println("�ڳ���");
		}
		
		System.out.println(a > b ? "ȣ����" : "�ڳ���");
		
		// 4) else-if => n�� �߿� �Ѱ�
		//switch�� �ٲ� �� �ִٸ� �ٲٴ°� ��Ģ!
		int num = 83;
		
		if(num >= 90) {
			System.out.println("A�����Դϴ�");
		} else if(num >=80) {
			System.out.println("B�����Դϴ�");
		} else if(num >=70) {
			System.out.println("C�����Դϴ�");
		} else if(num >=60) {
			System.out.println("D�����Դϴ�");
		} else {
			System.out.println("F�����Դϴ�");
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
		
		// ���>��>��
		System.out.println(a>b*7); 
		System.out.println(a>b*7||a-10>b);
	}
}
*/
/*
// ex7) ��������
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
		
		//swap ���α׷�
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
		
		// char cat = 1234; �̷��� ����ϸ� X
		char cat = '��';
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
		System.out.println(10); // ����
		System.out.println('��'); // ����
		System.out.println("ȣ����"); // ���ڿ�
		System.out.println("1000"); // ���ڿ�
		
		
		System.out.println(10+20); // ����+����=����
		System.out.println(10+"ȣ����"); // ����+���ڿ�=���ڿ�
		System.out.println("ȣ����"+10); // ���ڿ�+����=���ڿ�
		System.out.println("ȣ����"+"�ڳ���"); // ���ڿ�+���ڿ�=���ڿ�
		System.out.println(10+"ȣ����"+20); // ����+���ڿ�+����=���ڿ�
		System.out.println(10+20+"ȣ����"); // �� -> �� 
		System.out.println("ȣ����"+10+20); // �� -> ��
		System.out.println(10+" "+20); 
	}
	
}
*/
/*
// ex4) ��������
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
// ex3) �񱳿�����
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
// ex2) ���������
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