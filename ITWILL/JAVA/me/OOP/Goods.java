package oop;

//���� : ��ǰ �ϳ��� ǥ���ϴ� Ŭ���� Goods�� �ۼ��϶�.
/*
	��ǰ�� GoodsŬ������ ǥ���Ǹ� StringŸ���� name, 
	intŸ���� price, numberOfStock, sold�� �װ��� ������(�ʵ带) ���´�.
	GoodsŬ���� ���� main()�޼ҵ带 �ۼ��Ͽ� Goods��ü�� �ϳ� ���� �ϰ�,
	�� ��ü�� ���� ������������ camera�� �϶�.
	�׸��� ���� camera�� ��ǰ �̸�(name�ʵ�)�� "Nikon" , ����(price�ʵ�)�� 400000,
	��� ����(numberOfStock�ʵ�)�� 30, �ȸ� ����(sold�ʵ�)�� 50���� �����϶�.
	�׸��� ������ �̵� ������ ȭ�鿡 ����϶�.
	
	��°��
	��ǰ�̸�: Nikon
	��ǰ����: 400000
	������: 30
	�ȸ�����: 50
*/

public class Goods {
	
	//����(�ʵ�)
	String name;
	int price, numberOfStock, sold;
	
	public static void main(String[] args) {
		//��ü ����
		Goods camera = new Goods();
		camera.name = "Nikon";
		camera.price = 400000;
		camera.numberOfStock = 30;
		camera.sold = 50;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		System.out.println(camera.numberOfStock);
		System.out.println(camera.sold);
		
		
		

	}

}
