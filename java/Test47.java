/*
 	1. �޼ҵ�(�Լ�)��?
 		� Ư���� ����� ó���ϱ� ���� ���ɾ���� ���� ���� ���� ���α׷����� 
 	
 	2. �ڹ��� �޼ҵ� ���� 2����
 		(1) ���� �޼ҵ� : ���� ����ϴ� ����� �̸� ���� �ڹٿ��� �����ϴ� �޼ҵ�
 		<�ڹ�API���� ����>
 		- StringŬ���� ���ο� toString()�޼ҵ� : Ư�� �����͸� ���ڿ��� ��ȯ�ϴ� ����� �޼ҵ�
 		- MathŬ���� ���ο� random()�޼ҵ� : 0.0 ~ 1.0 �������� �������ִ� ����� �޼ҵ�
 		- DateŬ���� ���ο� getDate()�޼ҵ� : ���� ��¥ �� �ð����� �����͸� �������ִ� ����� �޼ҵ�
 		
 		(2) ����� ���� �޼ҵ� : �츮 �����ڰ� Ư�� ����� �ʿ�� �� �� ���� ���Ӱ� ����� �߰��ؼ� ����� �޼ҵ�
 			1. �Ű������� ���� ��ȯ�� ���� ���� �޼ҵ带 ���� �� �ִ�.
 			2. �Ű������� �ְ� ��ȯ�� ���� ���� �޼ҵ带 ���� �� �ִ�.
 			3. �Ű������� ��ȯ�� ���� �ִ� �޼ҵ带 ���� �� �ִ�.
 			
 		(2-1) ����� ���� �޼ҵ� ����� ����
 		
 		���������� ��ȯ�Ұ���Ÿ�� �޼ҵ��(Ÿ�� �Ű�������){ 	<---- �޼ҵ��� ����� 

 			 
 			 �޼ҵ��� ����� �ڵ�� �ۼ�; 	<---- �޼ҵ��� ������ 
 			 
 			 //�޼ҵ带 ȣ���� ��ҷ� ��ȯ�� �� �ۼ�
 			 return ��ȯ�� ��;
 			 
 		
 		}
 	
 */
public class Test47 {
	

	//�ڹ����α׷��� ������ main �޼ҵ�
	//-> �޼ҵ��� �̸��� main�̴�.
	//-> ���α׷��� ���۽�Ű�� ���
	//-> main�޼ҵ� ���ο��� �ٸ� �޼ҵ带 ȣ���ؼ� ����� �� �ִ�.
	//-> ���� Ŭ���� ������ �ٸ� �޼ҵ� ȣ�� �� Ŭ������.�޼ҵ�� <--������ ����Ѵ�.
	//-> main�޼ҵ��� �߰�ȣ { ���� } �ݴ� ��ȣ ���� �����ϴ� ������� ���������� JVM�� ���� ����ȴ�.
	public static void main(String[] args) {
		
		//main�޼ҵ� ���ο��� �ٸ� �޼ҵ� ȣ�� ����
		//ù��°)
		//System�̶�� �̸��� Ŭ���� ���ο�
		//out�̶�� ����� ����� PrintStream ��ü�� �����Ͽ�
		//PrintStream��ü ���ο� ... println �޼ҵ尡 ������� �����Ƿ� �޼ҵ带 ȣ���Ͽ�
		//�� ����� ��� �� �� �ִ�.
		System.out.println("�ȳ�"); //println(String value)�޼ҵ��� ��� : �Ű����� value�� ���޹��� ������ ���
		
		
		
		//�ι�°)
		hi(); //�Ʒ��� ����� ���� hi��� �̸��� �޼ҵ� ȣ��!
			  //�̷��� hi��� �̸��� �޼ҵ带 ȣ���ϸ� 
		      //�Ʒ��� ����� ���� hi() �Լ��� {}�߰�ȣ ���ο� �������� �ڵ尡 �����
		
		for(int i=1; i<4; i++) { //3�� �ݺ�
			hello(); //hello��� �̸��� �޼ҵ� ȣ�� ����
		}
		
	}
	
	//main�޼ҵ�� �ٸ� �̸����� ����� ���� �޼ҵ� �����
	/*
	 	hello ��� ����ϴ� ����� hello��� �̸��� �޼ҵ�(�Լ�) �����
	 */
	public static void hello() {
		System.out.println("hello!");
	}
	
	/*
	 	hi!��� ����ϴ� ����� hi��� �̸��� �޼ҵ� �����
	 */
	
	public static void hi() {
		System.out.println("hi!");
	}

}// Test47 class�� �ݴ� ��ȣ