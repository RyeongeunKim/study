
/*
	Ŭ���� ������ ����޼ҵ� �˾ƺ���
*/
class AAA{
	
//�������
	//�ν��Ͻ�����
	int num;
	//Ŭ��������
	static int staticNum;	
//����޼ҵ�
	//�ν��Ͻ��޼ҵ�
	void add(int add) {
		num += add;
		staticNum += add;
	}
	//�ν��Ͻ����� num�� ����� �����͸� ��ȯ�ϴ� �ν��Ͻ��޼ҵ�
	public int getNum() {
		return num;
	}
	//�ν��Ͻ� ���� num�� ���ο� �����͸� ������ �ν��Ͻ��޼ҵ�
	public void setNum(int num) {
		this.num = num;
	}
	//static�� ���� Ŭ�����޼ҵ�
	//Ŭ�������� staticNum�� ����� �����͸� ��ȯ�ϴ� Ŭ�����޼ҵ�
	public static int getStaticNum() {
		//Ŭ�������� staticNum�� �����͸� ��ȯ
		return staticNum;
		
		//1.Ŭ���� �޼ҵ� ���ο����� Ŭ���������� ����� �����͸� ��ȯ�� �� �ִ�.
		//return num; error
	}
	//Ŭ�������� staticNum�� ���ο� �����͸� �����ų Ŭ���� �޼ҵ�
	public static void setStaticNum(int staticNum) {
		//Ŭ�������� staticNum�� �Ű������� ���޹��� ������ ����
		//���
		//Ŭ������.Ŭ���������� = �Ű�������;
		AAA.staticNum = staticNum;
		
	}
	
}//class AAA �ݴ±�ȣ

public class Test72 {

	//static(����, ����)�޼ҵ�
	public static void main(String[] args) {
		
		//Ŭ���� �޼ҵ带 ����ϱ� ����
		//AAAŬ�����κ��� ��ü ����
		AAA aaa = new AAA();
		
		//Ŭ���� ������ �����͸� �����ϴ� ���(������ �����͸� �ʱ�ȭ�ϴ� ���)
		//2����
		//1. Ŭ������.Ŭ���������� = ������ ������;
		AAA.staticNum = 50;
		//2. ����������.Ŭ���������� = ������ ������;
		aaa.staticNum = 50;
		
		//Ŭ���� �޼ҵ� ȣ�� ��� 2����
		//1. Ŭ������.Ŭ�����޼ҵ��(); ȣ��
		System.out.println(AAA.getStaticNum());
		//2. ����������.Ŭ�����޼ҵ��(); ȣ��
		int result = aaa.getStaticNum();
		System.out.println(result);
		
		/*
		 	��� :
		 	1. �ν��Ͻ�����, �ν��Ͻ��޼ҵ� : ��ü ������ ��ü ���� �޸𸮿� ����
		 	2. Ŭ��������, Ŭ�����޼ҵ� : Ŭ������ JVM�޸𸮿� �ö� �� ����
		 	3. Ŭ�����޼ҵ� ���ο��� �ν����������� ���� �Ұ����ϴ�.
		 	4. ! ���޼����� �� :
		 	   ������ Ŭ��������, Ŭ�����޼ҵ�� ������ ������� �����϶�� ��� ����
		 	   ��, Ŭ���������� �����϶�� ��. 
		 	
		 */
		
		

	}

}
