
// Ŭ��������  �ν��Ͻ�����  Ŭ�����޼ҵ�  �ν��Ͻ��޼ҵ� ����� ����

//��ǰŬ���� Product�����
class Product{
    //��ǰ���� ���ڿ��� ������ Ŭ�������� modelName �����
    static String modelName;
    //��ǰ�� �ܰ��� ������ ������ Ŭ�������� unitPrice �����
    static int unitPrice;

    //��ǰ��� �ܰ��� �ϳ��� ���ڿ��� ���� ����� �����
    //Ŭ���� �޼ҵ� print �����
    static void print() {
    	System.out.println(modelName+", "+unitPrice);
    }
}
//��Ŭ���� customer �����
class Customer{
    //������ ���ڿ��� �����ų �ν��Ͻ����� name �����
	String name;
    //���� ���̸� ������ �����ų �ν��Ͻ����� age �����
	int age;
    //�⺻������ ����� (�ƹ����ϵ� ���� ����, �������)
	public Customer(){
		
	}
    //���ο� ���� �Ű������� ���޹޾� �� �ν��Ͻ������� �ʱ�ȭ�� ������ �����
	public Customer(String n_name){
		name = n_name;
	}
    //���ο� �� ���̸� �Ű������� ���� �޾� �� �ν��Ͻ������� �ʱ�ȭ�� ������ �����
	public Customer(int n_age){
		age = n_age;
	}
    //�ν��Ͻ����� name�� �ν��Ͻ����� age�� ����� ���� �̸��� ���̸� �ϳ��� ���ڿ��� ���� ��ȯ�� 
    //�ν��Ͻ� �޼ҵ� print �����
	/*
	  String print() { 
	     return name+","+age; 
	  }
	 */
	
	//�� �ν��Ͻ� ���� name�� age�� �ϳ��� ���ڿ��� ���ļ�
	//����� ����� �ν���Ʈ�޼ҵ� print �����
	void print() {
		System.out.println(name + "," + age);
	}

}

public class Test73 {

	public static void main(String[] args) {
		
		//��°��
		/*
		 	���Թ����ڹ�, 33000
		 	-----------------
		 	���1��,31
		 	�纰2��,33
		 */
		//modelName, unitPriceŬ���������� ������
		//���� "���Թ����ڹ�",33000�� ����

		Product.modelName = "���Թ����ڹ�";
		Product.unitPrice = 33000;
		
		//print()Ŭ���� �޼ҵ� ȣ��
		//���Թ����ڹ�, 33000 <---��µǰ� �ϱ�
		Product.print();
		
		//------------------- <---��µǰ� �ϱ�
		System.out.println("-------------------------");
		
		
		//CustomerŬ�����κ��� new ��ü ����! ���������̸� c1
		
		Customer c1 = new Customer();
		
		//���1��, 31�� ���� �ν��Ͻ������� ����
		
		c1.name = "���1��";
		c1.age = 31;
		
		//print()�ν��Ͻ����� ȣ���ؼ� ���1��, 31 <-- ���
		
		c1.print();
		
		//CustomerŬ�����κ��� new ��ü ����! ���������̸� c2
		
		Customer c2 = new Customer();
		
		//���2��, 33�� ���� �ν��Ͻ������� ����
		
		c2.name = "���2��";
		c2.age = 33;
		
		//print()�ν��Ͻ����� ȣ���ؼ� ���2��, 33 <-- ���
		
		c2.print();

	}

}
