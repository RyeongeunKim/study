package Pack;

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
	}
	
	void m3(Lion a) {
		System.out.println(a.hashCode());
		a.sound();
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