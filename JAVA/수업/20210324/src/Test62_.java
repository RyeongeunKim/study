

//AnimalŬ���� �����

	//����
    //������ �̸��� ���ڿ��� �����ų name���� ����

	//������ ���̸� ������ �����ų age���� ����

	//�⺻������
		//name������ "��" ����
		//age������ 3 ����
	
	//������ �̸��� n_name�Ű������� ���޹޾� name������ ������ ������
		//name������ n_name�Ű������� ���޹��� �̸��� ����
		//age������ 1 ����

	//������ ���̸� n_age�Ű������� ���޹޾� age������ ������ ������
		//name������ "����" ����
		//age������ n_age�Ű������� ���޹��� ���� ����

	//������ �̸��� ���̸� �Ű������� ���޹޾� name������ age������ ���� ������ ������
		//name������ n_name�Ű������� ���޹��� �̸� ����
		//age������ n_age�Ű������� ���޹��� ���� ����

class Animal{
	
	String name;
	int age;
	
	Animal() {
		name = "��";
		age = 3;
	}
	
	Animal(String n_name) {
		name = n_name;
		age = 1;
	}
	
	Animal(int n_age) {
		name = "����";
		age = n_age;
	}
	
	Animal(String n_name, int n_age) {
		name = n_name;
		age = n_age;
	}
	
	//�޼ҵ�
	//name������ ���ο� ���� ������ �뵵�� �޼ҵ�
	void setName(String n_name) {
		name = n_name;
	}
	//age������ ���ο� ���� ������ �뵵�� �޼ҵ�
	void setAge(int n_age) {
		age = n_age;
	}
	//name������ ����Ǿ� �ִ� ���� ����(��ȯ) ���ִ� �뵵�� �޼ҵ�
	String getName() {
		return name;
	}
	//age������ ����Ǿ� �ִ� ���� ����(��ȯ,����) ���ִ� �뵵�� �޼ҵ�
	int getAge() {
		return age;
	}
	//name������ ����� ������ �ڴ� <---����ϴ� ����� �޼ҵ�
	void run() {
		System.out.println(name + " �ڴ�");
	}
}//Ŭ���� ��

public class Test62_ {

	public static void main(String[] args) {
		//����� ����
		/*
			�� �ڴ�
			����� �ڴ�
			����
			10
			===============================
			�䳢 �ڴ�
			2
			�⸰ �ڴ�


		*/
		
		
		
		
		/*
		Animal dog = new Animal();
		dog.run();
		
		// name -> "�����" ����
		// age -> 5 ����
		Animal cat = new Animal("�����");
		cat.run();
		
		Animal lion = new Animal("����");
		lion.run();
		
		
		
		System.out.println("===========================");
		
		Animal r = new Animal("�䳢");
		r.run();
		
		Animal g = new Animal("�⸰");
		g.run();
		*/
		
		

		

		
		
	}

}
