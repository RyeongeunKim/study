package oop;

class Number{
	//����
	int num;

	
	//������1
	//- new Number(); ��ü ������...Number()�����ڸ� ȣ���� num������ ���� ���� ��Ų��
	//- �Ű������� ���� ���� ���� �ʰ� num������ ���� 10���� �ʱ�ȭ�� ������
	public Number() {
		num = 10;
		System.out.println("�⺻������ ȣ��");
	}

	//������2
	//- �ϳ��� ���� �Ű������� ���޹޾� num������ �����Ű�� ������
	public Number(int n) {
		num = n;
		System.out.println("�Ű����� n�� �����ϴ� ������ ȣ��");
	}
	
	//�޼ҵ�
	//- �� Number��ü ������ ��ü���� num�� ����� ���� ��ȯ�ϴ� �޼ҵ�
	public int getNumber() {
		return num;
	}
	
	
}//NumberŬ���� ���赵

public class Test60Q {

	public static void main(String[] args) {
		
		//NumberŬ������ �̿��ؼ� ��ü ����!
		
		//�ؼ� : new Number -> NumberŬ������ ��ü ����!
		//�ؼ� :     Number(); -> Number() ������ ȣ��!
		Number num1 = new Number();
		System.out.println(num1.getNumber());
		
		//NumberŬ������ ���� ��ü ������..Number()�����ڸ� ȣ���� num������ �� �ʱ�ȭ
		//������ Number��ü�� �ּҰ��� num2���������� ����

		Number num2 = new Number();
		System.out.println(num2.getNumber());
		
		//NumberŬ������ ���� ��ü ������ Number(int n)�����ڸ� ȣ���� �� 30�� �����Ͽ�
		//num������ ���� �ʱ�ȭ ��Ŵ
		//�׸��� ������ Number��ü�� �ּҰ��� num3���������� ����
		Number num3 = new Number(30);
		System.out.println(num3.getNumber());
		
		Number num4 = new Number(40);
		System.out.println(num4.getNumber());

		
		//��� : ��ü ���� �� �����ڸ� ȣ���ϸ�...
		//1.��ü�� �����ϴ� ���ÿ�..�ν��Ͻ� ������ ���� �ʱ�ȭ �� �� �ִ�.(���ٷ� �ڵ带 �ۼ��� �� �ִ�.)
		//2.�� �ѹ��� ȣ��Ǵ� �������̴�..final�� ����� �ν��Ͻ� ������ �ʱ�ȭ���� ����� �����ϴ�.
		
		

	}

}
