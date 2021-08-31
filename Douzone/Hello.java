package Pack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.function.Predicate;
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

//ex)
public class Hello 
{
	public static void main(String[] args) 
	{
		// System.out.println("1000");
	}
}
*/
//ex)
public class Hello 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> mm = new LinkedList<Integer>();
		mm.add(33);
		mm.add(44);
		mm.add(77);
		for(int i=0; i<10; i++) {
			mm.add(i * 2);
		}
		mm.add(101);
		mm.add(102);
		mm.add(103);
		System.out.println(mm);
		
		// ex1)
//		for(int i=0; i<mm.size(); ) {
//			int num = mm.get(i);
//			if(num % 2 == 0) {
//				mm.remove(i);
//			} else {
//				i++;
//			}
//		}
//		System.out.println(mm);
		
		// ex2) iterator �̿�
//		for (Iterator<Integer> it = mm.iterator(); it.hasNext(); ) {
//			Integer num = it.next();
//			if(num % 2 == 0)
//				it.remove();
//		}
//		System.out.println(mm);
		
		// ex3) 
		// removeIf(Tiger<������Ÿ��>)
//		mm.removeIf(new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer num) {
//				return num % 2 ==0;
//			}
//		}); 
//		System.out.println(mm);
		
		// 4. ���� �Լ� ���
		// �ڵ尡 �����ϰ� ������
		mm.removeIf(num -> num % 2 == 0);
		System.out.println(mm);
		
//		for(int i=0; i<10; i++) {
//			mm.add(i * 10 + i);
//		}
//		System.out.println(mm);
//		
//		// ���߿� - mm.size(�Ϲ������� ��� X, ��빮��)
//		// ���񽺿� - int size = mm.size();
//		//			i < size;
//		for (int i = 0; i < mm.size(); i++) {
//			int num = mm.get(i);
//			// System.out.println(num);
//			if(num == 44) {
//				System.out.println(i + "��° ã�Ҵ�");
//				break;
//			}
//			if(i == mm.size()-1) {
//				System.out.println("Not Found");
//			}
//		}
//		
//		for (int i = 0; i < mm.size(); i++) {
//			int num = mm.get(i);
//			// System.out.println(num);
//			if(num == 55) {
//				mm.remove(i);
//				break;
//			}
//			if(i == mm.size()-1) {
//				System.out.println("Not Found");
//			}
//		}
//		System.out.println(mm);
		
	}
}
/*
//ex53) 
public class Hello 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> mm = new LinkedList<Integer>();
		// C(reate)RUD
		mm.add(10);
		System.out.println(mm.size());
		for(int i=0; i<10; i++) {
			mm.add(i * 10 + i);
		}
		
		// CR(ead)UD
		// 1
		System.out.println(mm);
		
		// 2
		int size = mm.size();
		for(int i=0; i < size; i++) {
			int data = mm.get(i);
			System.out.print(data + " ");
		}System.out.println();
		
		// 3. x, item, data, value
		for (Integer x : mm) {
			System.out.print(x + " ");
		}System.out.println();
		
		// CR(U)pdateD
		mm.set(5, 999);
		System.out.println(mm);
		
		// CRUD(elete)
		mm.remove(5);
		System.out.println(mm);
	}
}
*/
/*
//ex52) ��Ʈ����
public class Hello 
{
//	static String result(char c) {
//		if
//	}
	static String hexaToBinary(int n) {
		String s = Integer.toBinaryString(n);
		while(s.length() < 32) 
			s = "0" + s; 
		
		StringBuffer s1 = new StringBuffer(s);
		for(int i=0; i<7; i++) 
			s1.insert((7-i) * 4, " ");

		return s1.toString();
	}
	
	public static void main(String[] args) 
	{
		int a = 0x0000cd5a;
		int b = 0x0000ff00;
		int c = 0x0000f800;
		int d = 0x000007e0;
		int e = 0x0000001f;
		
		// 205
		System.out.println(hexaToBinary( a ));
		System.out.println(hexaToBinary( b ));
		System.out.println(hexaToBinary( (a & b) ));
		System.out.println(hexaToBinary( (a & b) >> 8));
		System.out.println(( a & b ) >> 8); // cd00
		System.out.println("---------------------------------------");
		
		// 25
		System.out.println(hexaToBinary( a ));
		System.out.println(hexaToBinary( c ));
		System.out.println(hexaToBinary( (a & c) ));
		System.out.println(hexaToBinary( (a & c) >> 11));
		System.out.println((a & c) >> 11);
		System.out.println("---------------------------------------");

		// 42
		System.out.println(hexaToBinary( a ));
		System.out.println(hexaToBinary( d ));
		System.out.println(hexaToBinary( (a & d) ));
		System.out.println((a & d) >> 5);
		System.out.println("---------------------------------------");
		
		// 26
		System.out.println(hexaToBinary( a ));
		System.out.println(hexaToBinary( e ));
		System.out.println(hexaToBinary( (a & e) ));
		System.out.println(a & e);
		
		System.out.println("---------------------------------------");
		int f = 0x77000000;
		
		System.out.println(Integer.toHexString(a));
		//			0000 0000 1101 1100
		
		// ���� ����Ʈ�� �ǵ�����
		
		char g = 0x00dc; // (8���� on/off ���)
		// char mask = 0x0080;
		System.out.println(hexaToBinary(g));
		//System.out.println(hexaToBinary(mask));
		//System.out.println(hexaToBinary(mask));
		//System.out.println(hexaToBinary((g & mask)));
		System.out.println("---------------------------------------");

		// int num = Integer.parseInt(Integer.toBinaryString(g));
		
//		String[] products = new String[] 
//		{"���ڷ���", "��������", "���������̾�", "�뵹��", "��Ʈ��", "�ڵ���", "�º�", "������Ʈ"};
//		
//		for(int i=0; i<8; i++) {
//			System.out.println(i);
//			String s = (g & (mask >> i)) == 0 ? " off" : " on";
//			System.out.println(products[i] += s);
//		}
		
		// 0000 0000 1101 1100
		char c5 = 0x00dc;
		char mask = 0x80;// 1000 0000
		String [] elec = new String[] {
				"������","��ǳ��","��ġ�����","��Ź��",
				"TV","���������̱�","��Ʈ��","��ǻ��"
				};
		
//		for (int i = 0; i < 8; i++)
//		{
//			System.out.println(
//					(c5 & mask)== mask ?
//					elec[i] +" ON":
//					elec[i] +" OFF");
//					mask >>= 1;
//		}		
		
		for (int i = 0; i < 8; i++, mask >>= 1) 
		{
			System.out.println(
					(c5 & mask)== mask ?
					elec[i] +" ON":
					elec[i] +" OFF");
			
		}
	}
}
*/
/*
//ex51) 2���� ǥ��
public class Hello 
{
//	StringBuffer���� String���� �����ϴ°� �Ϲ�����
	static String hexaToBinary(int n) {
		String s = Integer.toBinaryString(n);
//		System.out.println(s);
//		System.out.println(s.length());
		while(s.length() < 32) {
			s = "0" + s; 
		}
		// System.out.println(s);
		
		StringBuffer s1 = new StringBuffer(s);
//		s1.insert(4, "��");
//		System.out.println(s1);
//		s1.insert(8, "��");
//		System.out.println(s1);
		for(int i=0; i<7; i++) {
//			System.out.println((7-i) * 4);
			s1.insert((7-i) * 4, " ");
		}
//		System.out.println(s1);
		return s1.toString();
	}
	
	public static void main(String[] args) 
	{
//		int a = 1234; // 10����
//		int b = 0x1234; // 0x.. -> 16����
//						// 1001000110100
//		System.out.println(a);
//		System.out.println(b); // 10������ ���
//		System.out.println(Integer.toBinaryString(a));
//		System.out.println(Integer.toBinaryString(b));
		
		//   11 1011 0001 0010 1100 1101 0101 1001
		// 0011 1011 0001 0010 1100 1101 0101 1001
		int a = 0x3b12cd59;
		int b = 991087961;
		System.out.println(a); // 10������ ���
		if(a == b) {
			System.out.println(1);
		}
		System.out.println(hexaToBinary(a));
		System.out.println(hexaToBinary(b));
	}
}
*/
/*
//ex50)
public class Hello 
{
	public static void main(String[] args) 
	{
		String s = "����ȭ�����Ǿ����ϴ�";
		// 1.
		System.out.println(s.length());
		
		// 2. char charAt(int index)
		// char ch = s.charAt(3);
		System.out.println(s.charAt(3));
		
		
		// 3. indexOf : "ȭ����" �ִ� ���� ��ġ��
		System.out.println(s.indexOf("ȭ����"));
		System.out.println(s.indexOf("�����"));
		
		int n = s.indexOf("ȭ����");
		if(n != -1) {
			System.out.println(n + "��°���� find");
		} else {
			System.out.println("not found");
		}
		
		// 4
		// ����:
		System.out.println(s.replace("����", "������")); // new String���� ������
		// s = s.replace("����", "������"); ������ �ʱ�ȭ�ؼ� �����
		System.out.println(s); // String�� ���� �����Ͱ� ������ �ȵ�
		// s = "���ѹα�"; // "����ȭ�����Ǿ����ϴ�" -> "���ѹα�"
		// System.out.println(s); // ������ �ִ� ��ü�� ������ ���ο� ��ü�� ���� ����
		// 5. slicing
		System.out.println(s.substring(5)); // index 5��~������ �߶��
		System.out.println(s.substring(3,6)); // index 3~6�� �ձ��� �߶��
		
		// 6. trim : �� �ڿ� �ִ� �����̽� ����
		// 			 ��� -> App   leȣ����
		// ���̵�, �н����� �Է¹��� �� ���� �����
		String s2 = "   App   le   ";
		// System.out.print(s2.trim().replace(" ", ""));
		System.out.print(s2.trim());
		System.out.println("ȣ����");
		
		// 7. ��ҹ��� ��ȯ �Լ�
		String s3 = "APple";
		System.out.println(s3.toUpperCase()); // �빮��
		System.out.println(s3.toLowerCase()); // �ҹ���
		
		// 8. ���� -> ���ڿ�
		//	  ���ڿ� -> ���� ��ȯ �Լ�
		
		// �����͸� �޾��� ��
		byte[] data = new byte[] {65, 'B', 'C', 'D'};
		String s4 = new String(data, 0, data.length); // 0 => index ��ȣ
		System.out.println(s4);
		
		// �����͸� ������ ��
		String s5 = "Banana";
		byte[] data1 = s5.getBytes();
		for (byte value : data1) {
			System.out.println((char)value);
		}
	}
}
*/
/*
//ex49)
class Tiger {
	void m1(int a, int b) {
		if(a > b) {
			System.out.println(1);
		} else {
			return;
		}
		System.out.println(2);
	}
	
	void m2(int a, int b) {
		try {
			if(a > b) {
				System.out.println(1);
			} else {
				return;
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {			
			System.out.println(2);
		}
	}
}
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t = new Tiger();
		t.m1(10, 0);
		t.m2(10, 0);
	}
}
*/
/*
//ex48) Ư���� �Լ��� ����� �� unhandleException�� �߸� �׶��� try-catch�� ����Ѵ�
public class Hello 
{
	public static void main(String[] args) // throws Exception // �ü���� å���� - ���� �ʴ� 
	{
		for(int i=0; i<5; i++) {
			System.out.println(i);
			// ���ڸ�ŭ �ð����� �Ŀ� ���α׷� ����
			// 2�� // 500 => 0.5��	
			try { Thread.sleep(2000); } catch (Exception e) {} // �Ϲ������� ����ó����
		}
	}
}
*/

/*
//ex 47) exception

class Tiger {
	// ������ ���ϴ� ��� 1
	void m1() {
		System.out.println(1);
		try {
			throw new Exception();			
		} catch (Exception e) {
			System.out.println("�ͼ��� �߻���");
		}
	}
	
	// ������ ���ϴ� ��� 2 : ���� ���ѱ��
	// �� �Լ��� ����ϴ� ����� catch�� �ض�
	void m2()  throws Exception {
		System.out.println(2);
		
		throw new Exception();			
	}
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger();
		t1.m1();
		// Unhandled exception?
		// �� �Լ����� exception�� �߻��ϴϱ� å���� ������
		try {
			t1.m2();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(3);
		
//		System.out.println(1);
//		// 1. Arithmetic Exception
//		try { // try�� �߻��ϸ� catch�� ����
//			  // �߻����� ������ catch�� ���� �ʰ� �Ʒ������� �����Ѵ�
//			int a = 10 / 0;			
//		} catch (Exception e) {
//			// e.printStackTrace();
//		}
//		System.out.println(2);
//		
//		// 2. Array Index Out Of Bounds Exception
//		int[] ar = {1, 2, 3};
//		try {
//			ar[3] = 10;			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		System.out.println(3);
//		
//		String s = "����ȭ�����Ǿ����ϴ�";
//		System.out.println(s.length());
//		s = null;
//		// 3. NullPointerException
//		try {
//			System.out.println(s.length());			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		System.out.println(4);
	}
}
*/

/*
//ex46-5) 
// �ذ� : �Լ��� �μ��� ������!
class Baduk {
	private final Ai ai;
	
	Baduk(Ai ai){
		this.ai = ai;
		System.out.println("�뱹�� �����մϴ�");
	}
	void play() {
		ai.play();
	}	
	void stop() {
		ai.stop();
	}
}
interface Ai {
	void play();
	void stop();
}
// ���ۿ��� ����
class AlphaGo implements Ai {
	public void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�");		
	}
	public void stop() {
		System.out.println("���İ� ��������� �մϴ�");
	}
}
// �Ƹ������� ����
class BetaGo implements Ai {
	public void play() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�");		
	}
	
	public void stop() {
		System.out.println("��Ÿ�� ��������� �մϴ�");
	}
}
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk1 = new Baduk(new AlphaGo());
		Baduk baduk2 = new Baduk(new BetaGo());
		
		baduk1.play();
		baduk1.stop();
		baduk2.play();
		baduk2.stop();
	}
}
*/
/*
//ex46-4) 
// �ذ� : �Լ��� �μ��� ������!
class Baduk {
	Baduk(){
		System.out.println("�뱹�� �����մϴ�");
	}
	void play(Ai ai) {
		ai.play();
	}	
	void stop(Ai ai) {
		ai.stop();
	}
}
interface Ai {
	void play();
	void stop();
}
// ���ۿ��� ����
class AlphaGo implements Ai {
	public void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�");		
	}
	
	public void stop() {
		System.out.println("���İ� ��������� �մϴ�");
	}
}
// �Ƹ������� ����
class BetaGo implements Ai {
	public void play() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�");		
	}
	
	public void stop() {
		System.out.println("��Ÿ�� ��������� �մϴ�");
	}
}
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk = new Baduk();
		baduk.play(new AlphaGo());
		baduk.play(new BetaGo());
		baduk.stop(new AlphaGo());
		baduk.stop(new BetaGo());
	}
}
*/
/*
// ex46-3) 
// ���� : �Լ��� �μ������� ��� �ؾ��Ѵ�
// ����ǰ� �ִ� �Լ��� �������̽���Ű��!(AlphaGo, BetaGo)
class Baduk {
	Baduk(){
		System.out.println("�뱹�� �����մϴ�");
	}
	void play(Ai ai) {
		ai.play();
	}	
}
interface Ai {
	void play();
}
// ���ۿ��� ����
class AlphaGo implements Ai {
	public void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�");		
	}
}
// �Ƹ������� ����
class BetaGo implements Ai {
	public void play() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�");		
	}
}
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk = new Baduk();
		baduk.play(new AlphaGo());
		baduk.play(new BetaGo());
	}
}
*/
/*
//ex46-2) 46-1�ذ���
class Baduk {
	Baduk(){
		System.out.println("�뱹�� �����մϴ�");
	}
	void play(AlphaGo alphago) {
		System.out.println("�ΰ������� ���İ��Դϴ�");
	}	
	void play(BetaGo betago) {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�");		
	}
}
// ���ۿ��� ����
class AlphaGo {
	void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�");		
	}
}
// �Ƹ������� ����
class BetaGo {
	void play() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�");		
	}
}
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk = new Baduk();
		baduk.play(new AlphaGo());
		baduk.play(new BetaGo());
	}
}
*/
/*
//ex46-1) ������ : �ΰ������� �ٲ�ٸ� ��� �� ���ΰ�?
class Baduk {
	Baduk(){
		System.out.println("�뱹�� �����մϴ�");
	}
	void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�");
	}
}
public class Hello 
{
	public static void main(String[] args) 
	{
		Baduk baduk = new Baduk();
		baduk.play();
	}
}
*/
/*
//ex45-2)
interface Animal{
	void m1();
}
class Zoo{
	void sound(Animal t) {
		t.m1();
	}
}


public class Hello 
{
	public static void main(String[] args) 
	{
		Animal t1 = new Animal() {
			@Override
			public void m1() {
				System.out.println(1);
			}
		};
		t1.m1();
		
		Zoo t2 = new Zoo();
		t2.sound(new Animal() {
			@Override
			public void m1() {
				System.out.println(2);
			}
		});
		t2.sound(t1);
	}
}
*/
/*
//ex45-1) �������̽� ����
interface Animal {
	void m1();
}

class Tiger implements Animal {

	public void m1() {
		System.out.println(1);
	}
	
}

class Zoo {
	void m1(Animal t) {
		t.m1();
	}
}

public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		t1.m1();
		Animal t2 = new Tiger(); // ��ĳ���� - �ʿ� �� ���
		t2.m1();
		Animal t3 = new Animal() { // �͸�Ŭ����
			@Override
			public void m1() {
				System.out.println(2);
			}
		};
		t3.m1();
		new Animal() { // �͸�ü
			@Override
			public void m1() {
				System.out.println(3);
			}
		}.m1();
		
		Zoo t4 = new Zoo();
		
		t4.m1(new Animal() {
			@Override
			public void m1() {
				System.out.println(4);
			}
		});

	}
}
*/
/*
class Tiger {
	Tiger(){
		System.out.println(1);
	}
	Tiger(int a){
		this(); // �μ������� ���� �����ڸ� ��
		System.out.println(a);
	}
	Tiger(int a, int b){
		this(a + b); // ������ ȣ��
		System.out.println(a + " " + b);
	}
}
//ex44)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger(10, 20);
	}
}
*/
/*
class Tiger {
	void m1() {	
		System.out.println("��ȥ���ּ���");
		Lion t1 = new Lion();
		if(t1.merry(this)) { // this = Tiger
			System.out.println("�����մϴ�");
		} else {
			System.out.println("�Ф�");
		}
	}
	int m2() {
		System.out.println("���� ������ �ִ� �����");
		return 100;
	}
	
	String m3() {
		return "����";
	}
}

class Lion {
	boolean merry(Tiger t) {
		if(t.m2() >= 80) {
			return true;
		} else {
			String s = t.m3();
			switch (s) {
			case "�¼�":
				return true;
			case "����":
				return false;
			}
			return false;
		}
	}
}
//ex43-4)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		t1.m1();
	}
}
*/
/*
class Tiger {
	Tiger m1() {
//		return new Tiger(); // 1
//		Tiger t = new Tiger(); // 2
//		return t;
		System.out.println(1);
		return this; // 3) this=TigerŸ���̴�
	}
	
	Tiger m2() {
		System.out.println(2);
		return this;
	}
	
	void m3() {
		System.out.println(3);
	}
}
// ex43-3)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		Tiger t2 = t1.m1(); // t1, t2�� �̸��� �ٸ��� �����ϴ�
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		t2.m2();
		t1.m1().m2().m1().m2().m3(); // ü�̴� : ���ο� �ִ� �Լ��� �����ؼ� ȣ��
		System.out.println("-----------------------");
		t1.m1().m2().m3();
		t1.m1();
		t1.m2();
		System.out.println("ȣ����");
		t1.m3();
	}
}
*/
/*
class Tiger {
//	Tiger this;
//	Tiger(Tiger t){
//		this = t;
//	}
	int a, b;
	int size;
	
	Tiger(int a, int b, int size){ // ������ : �ʵ��ʱ�ȭ
		this.a = a; // �ʵ��� a = �μ����� a 
		this.b = b; 
		this.size = size;
	}
	
	void show() {
		System.out.println(this.a+" "+this.b+" "+this.size); 
	}
}

// ex43-2)
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger(10, 20, 30);
		int num = 10;
		num = num; // �ڱ����, ������� �ڵ�
		t1.show();
	}
}
*/
/*
// ex43-1)
class Tiger {
//	Tiger this;
//	Tiger(Tiger t, int a, int b){ //Tiger t1, 10, 20
//		this = t;
//	}
	
	Tiger(int a, int b){
		//Tiger t1, 10, 20
		System.out.println(this.hashCode());
	}
	void m1(int a, String b, Tiger c) {
		System.out.println(1);
	}
	
	
}
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger(10, 20);
		//t1.m1();
		System.out.println(t1.hashCode());
		Tiger t2 = new Tiger(30, 40);
		System.out.println(t2.hashCode());
		
	}
}
*/
/*
//ex42)
final class Animal { // ����� �������̴� -> ��ӱ���
	final int NUM = 10;
	
	final void m1(){ // �������̵��� �������̴�
		
	}
}

// class Tiger extends Animal {
	// void m1() {} // �θ� m1�Լ����� finalŰ���带 �ٿ��� ������ ����ؼ� ����� �� X
// }

public class Hello 
{
	public static void main(String[] args) 
	{
		Animal t1 = new Animal();
		// t1.num = 20; ���� ������ �� X
		System.out.println(Math.PI);
		String s1 = null;
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