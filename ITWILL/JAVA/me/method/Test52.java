package method;
/*
	
	JVM �޸� ����
	
	Test52.java 
	-> Test52.class �ڹ����α׷� 
	-> JVM����ӽ��� ���� ��? 
	-> JVM�޸𸮴� �ü���� ���� �ʿ��� �޸𸮸� �Ҵ� ����
	
	JVM �޸� ���� 3����
	1. �޼ҵ� ���� : .class���� ���� �� JVM�� �о .class������ ����Ǵ� ����
	2. ȣ�⽺�� ���� : ȣ��Ǵ� �޼ҵ���� ��� ���̴� ����
					����1. �޼ҵ� ȣ�� �� ū �޸� �Ҵ�(�޼ҵ� ���� ���������� ����Ǵ� ��)
					����2. �޼ҵ� �۾� �� �Ҵ�� �޸� ������ JVM�� ���� �����
	3. �� ���� : Ŭ���� -> ��ü�޸� �����ϸ� ��ü�޸𸮰� �ö󰡴� ����

*/

// �޼ҵ� ȣ�� �� JVM �޸� ���� �˾ƺ���
public class Test52 {
	
	//���α׷��� ������Ű�� ������ �ϴ� main�޼ҵ�
	public static void main(String[] args) {
		System.out.println("main(String[] args)�޼ҵ尡 ȣ��Ǿ� ���۵�");
		firstMethod();	
		System.out.println("main(String[] args)�޼ҵ��� ��� �ڵ带 ���� �� ������");
	}
	
	public static void firstMethod() {
		System.out.println("firstMethod()�޼ҵ尡 ȣ��Ǿ� ���۵�");
		secondMethod();
		System.out.println("firstMethod()�޼ҵ��� �ڵ� ���� �� ������");
	}
	
	public static void secondMethod() {
		System.out.println("secondMethod()�޼ҵ尡 ȣ��Ǿ� ���۵�");
		System.out.println("secondMethod()�޼ҵ��� �ڵ� ���� �� ������");
	}


}
