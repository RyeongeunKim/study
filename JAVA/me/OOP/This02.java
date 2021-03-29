package oop;

	/*
	 	this() �޼ҵ�
	 	- ���� Ŭ������ �ٸ� ������ ȣ�� �� ���
	 	- ���� Ŭ���� ������ �ٸ� ������ �����ڸ� ȣ���ϴ� this()�޼ҵ� �˾ƺ���
	 */

class date{
	
	//������ ���к��� ����(year), ��(mont), ��(day)
	private int year;
	private int month;
	private int day;
	
	// ��ü������ year, month, day�� ���� ������ ������
	date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//��ü������ year, month�� ���� ���޹޴� ������
	date(int year, int month){
		//�ٸ� ������ ȣ�� -> ���� 3�� �����ϸ� �Ű������� 3���� ������ ȣ��
		this(year, month, 1);
	}

	//��ü���� year�� ���� ���޹޴� ������
	date(int year) {
		//�ٸ� ������ ȣ��
		this(year, 1, 1);
	}
	
	//�⺻������
	date(){
		//�ٸ� ������ ȣ��
		this(2016, 1, 1);
	}
	
	//�� ��ü ����(�ν��Ͻ� ����)�� ������ ����ϴ� ����� �޼ҵ�
	void print() {
		System.out.println(this.year + "/" + month + "/" + this.day);
	}

}


public class This02 {

	public static void main(String[] args) {
		//1. ��ü ������ ���ÿ� ������ ȣ�� ��
		//   1988, 8, 30 �Ű������� ������ ��ü�����鿡 ���� ����
		date d = new date(1988, 8, 30);
		d.print();
		
		//2. ��ü ������ ���ÿ� ������ ȣ�� ��
		//   1988, 8 �Ű������� ������ ��ü�����鿡 ���� ����
		date d2 = new date(1988, 8);
		d2.print();
		
		//3. ��ü ������ ���ÿ� ������ ȣ�� ��
		//   1988�� �Ű������� ���޿� ��ü�����鿡 ���� ����
		date d3 = new date(1988);
		d3.print();
		
		date d4 = new date();
		d4.print();

		
		
	}

}
