
//Ŭ���� ������ ������� ����� ����1

//StudentŬ���� �����
	//�ν��Ͻ����� ���� : 4����Ʈ ũ���� ������ ������ num���� ����


	//Ŭ���� ���� ���� : 4����Ʈ ũ���� ������ ������ staticNum���� ����


	//�⺻ ������ ���� : �ƹ����ϵ� ���� ����(�������)


	//�޼ҵ� ���� : �Ű����� add�� �ϳ��� ������ ���޹޾� 
    //           �ν��Ͻ� ������ Ŭ���� ������ �����ϴ� ���

class Student{
	
	int num;
	static int staticNum;
	
	Student(){
		
	}
	
	void add(int n) {
		num += n;
		staticNum += n;
	}
	
}



public class Test71 {

	public static void main(String[] args) {
		
		//��°��
		//�������� a_student�� ����� ��ü
		//�ν��Ͻ����� num�� �� : 5
		//Ŭ�������� staticNum�� �� : 5
		
		//�������� b_student�� ����� ��ü
		//�ν��Ͻ����� num�� �� : 5
		//Ŭ�������� staticNum�� �� : 10
		
		Student a_student = new Student();
		a_student.add(5);
		System.out.println("�������� a_student�� ����� ��ü");
		System.out.println("�ν��Ͻ����� num�� �� : "+a_student.num);
		System.out.println("Ŭ�������� staticNum�� �� : "+a_student.staticNum);
		
		System.out.println();
		
		Student b_student = new Student();
		b_student.add(5);
		System.out.println("�������� b_student�� ����� ��ü");
		System.out.println("�ν��Ͻ����� num�� �� : "+b_student.num);
		System.out.println("Ŭ�������� staticNum�� �� : "+Student.staticNum);
		

	}

}
