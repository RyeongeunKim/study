package method;


//�޼ҵ� ȣ�� ����
public class Test50 {
	
	// ���� : �ΰ��� �����͸� �Ű������� ���޹޾� ��Ģ������ �����ϴ� �޼ҵ�� �����
	
	// 1. �޼ҵ� �̸� : addPrint
	//    �Ű� ���� : long a, long b
	//    ��� : �Ű������� ���� ���� �� �������� ���� �������� �ٷ� ���
	
	public static void addPrint(long a, long b) {
		System.out.println(a + b);
	}
	
	// 2. �޼ҵ� �̸� : add
	//    �Ű� ���� : long a, long b
	//    ��� : �Ű������� ���� ���� �� �������� ���� ��������(long������)�� �޼ҵ带 ȣ���� ��ҷ� ����
	
	public static long add(long a, long b) {
		return a + b;
	}
	
	// 3. �޼ҵ� �̸� : subPrint
	//    �Ű� ���� : long a, long b
	//    ��� : �Ű������� ���� ���� �� �������� ���� �������� �ٷ� ���
	
	public static void subPrint(long a, long b) {
		System.out.println(a - b);
	}
	
	// 4. �޼ҵ� �̸� : sub
	//    �Ű� ���� : long a, long b
	//    ��� : �Ű������� ���� ���� �� �������� ���� ��������(long������)�� �޼ҵ带 ȣ���� ��ҷ� ����
	
	public static long sub(long a, long b) {
		return a - b;
	}
	
	// 5. �޼ҵ� �̸� : multiPrint
	//    �Ű� ���� : long a, long b
	//    ��� : �Ű������� ���� ���� �� �������� ���� ���������� �ٷ� ���
	
	public static void multiPrint(long a, long b) {
		System.out.println(a * b);
	}
	
	// 6. �޼ҵ� �̸� : multi
	//    �Ű� ���� : long a, long b
	//    ��� : �Ű������� ���� ���� �� �������� ���� ��������(long������)�� �޼ҵ带 ȣ���� ��ҷ� ����
	
	public static long multi(long a, long b) {
		return a * b;
	}
	
	// 7. �޼ҵ� �̸� : divPrint
	//    �Ű� ���� : long a, long b
	//    ��� : �Ű������� ���� ���� �� �������� ������ ���������� �ٷ� ���
	
	public static void divPrint(long a, long b) {
		long result = a / b;
		System.out.println(result);
	}
	
	// 8. �޼ҵ� �̸� : div
	//    �Ű� ���� : long a, long b
	//    ��� : �Ű������� ���� ���� �� �������� ������ ��������(long������)�� �޼ҵ带 ȣ���� ��ҷ� ����
	
	public static long div(long a, long b) {
		long result = a / b;
		return result;
	}

	public static void main(String[] args) {
		// add�޼ҵ� ȣ�� ��..long�����ͷ� 6�� 3�� ������� ���� �Ͽ� 
		// add�޼ҵ� ������ ���� ����� ���� �޾� ���
		
		//System.out.println(add(6,3); //int���� long�� ���� �۱⿡ 6, 3 ����
		System.out.println(Test50.add(6L,3L)); 
		
		// addPrint �޼ҵ� ȣ�� ��..long�����ͷ� 6�� 3�� ������� ���� �Ͽ�
		// addPrint �޼ҵ� ������ ���� ����� addPrint�޼ҵ� ���ο��� �ٷ� ���

		addPrint(6,3);
		
		

	}

}
