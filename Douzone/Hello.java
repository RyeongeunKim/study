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
		
	}
}

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