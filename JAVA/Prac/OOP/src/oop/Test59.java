package oop;


//���� Test55.java���Ͽ� �ۼ��� ������� �̾߱� ���׷��̵� ��Ű��

//(2�ܰ�) Ŭ���� ���赵 �����

//�������(�����Ǹ���) FruitSellerŬ���� �����
class FruitSeller{
	
	//����Ѱ��� ����
	/*final*/ int APPLE_PRICE; /*= 1000*/
	
	//�����ϰ� �ִ� ��� ����
	int numOfApple;
	
	//�Ǹż���
	int myMoney;
	
//�޼ҵ�	
	//�����Ǹ� �޼ҵ�
	int saleApple(int money) { //��� �����ڷ� ���� ���� ���� �Ű������� ��´�.
		
		//�� ��� ���� ���ϱ� = ��� �����ڷκ��� ���� �ݾ� / ��� �Ѱ��� ����
		int num = money / APPLE_PRICE;
		
		//��� �Ǹ� �� ����Ǹ��ڰ� �����ϰ� �ִ� ����� ����
		numOfApple -= num; //�Ǹ��� ����� ���� 
		
		//�Ǹ� ���� ����
		myMoney += money;
		
		//���� �Ǹ�(����)�� �߻��� ��� ������ ��ȯ(����)
		return num;
		 
	}
	//��� �Ǹ� �� ���� ��� ����, �Ǹż���(�����Ǹ����� �ܰ�)�� ����ϴ� ����� �޼ҵ�
	void showSaleResult() {
		System.out.println("���� ��� ���� : " + numOfApple);
		System.out.println("�Ǹ� ���� : "+myMoney);
	}
	
	//�߰��� �޼ҵ��� ��� : ���� �Ǹ����� ó�� ���� ���� �����ų ����� �޼ҵ�
	void initMembers(int money, int appleNum, int price) {
		myMoney = money; //ó�� ������ �ִ� ��
		numOfApple = appleNum; //ó�� ������ �ִ� ��� ����
		APPLE_PRICE = price; //��� ���� ������ ó���� �ʱ�ȭ�� ����
	}
	
}

//���ϱ����� FruitBuyerŬ���� �����
class FruitBuyer{
	//���� ���� ����
	int myMoney = 10000;
	//���� �����ϰ� �ִ� ��� ����
	int numOfApple = 0;
	
	//���ϱ��� ����� �޼ҵ�
	//�Ű����� : ������ �����ϱ� ���� �Ǹ��� ��� ��ü�� ���޹��� ����
	public void buyApple(FruitSeller seller, int money) {
		
		//���� �Ǹ��� ��ü(seller��������Ȱ��)���� ������ �����ϱ� ����
		//���� �Ǹ��� ��ü saleApple(int money)�޼ҵ� ȣ�� ��..���� �Ű������� ������
		//�׸��� ���� �Ǹ��ڰ� �Ǹ���(���� �����ڰ� ������) ��� ������ ��ȯ �޾ƿ�.
		//���� �����ڰ�ü �������� ������ ��� ������ �ڽ��� ���� �����ϰ� �ִ� ��������� ����
		numOfApple += seller.saleApple(money);
		
		//���� �����ڰ�ü �������� ���� ���� �� ���� �����߱⿡ 
		//�������� ���� �����Ǿ�� �Ѵ�
		myMoney -= money;
		
	}
	
	//���� ���� �� ���� �������� ���� ���� ���� ���� ������ �ִ� ��� ���� ���
	void showBuyResult() {
		System.out.println("���� ���� �� : "+ myMoney);
		System.out.println("���� ������ �ִ� ��� ���� : "+ numOfApple);
	}

	
}

public class Test59 {

	public static void main(String[] args) {
		
		//���� �Ǹ���(���� ���)1 ��ü ����
		FruitSeller seller1 = new FruitSeller();
		//���� �Ǹ���1 �ܰ�: 0��, ó�� �����ϰ� �ִ� ��� ����: 30��, ���� ���� : 1,500
		seller1.initMembers(0, 30, 1500);
		
		//���� �Ǹ���(���� ���)2 ��ü ����
		FruitSeller seller2 = new FruitSeller();
		//���� �Ǹ���2 �ܰ�: 0��, �����ϰ� �ִ� ��� ����: 20��, ���� ���� : 1,000
		seller2.initMembers(0, 20, 1000);
		
		//���� ������ ��ü ����
		FruitBuyer buyer = new FruitBuyer();
		
		//���� ������ ��ü�� ���� �Ǹ���1 ��ü���� 4500����ġ ����� �����ϱ� ����
		//���� ������ ��ü�� buyApple(FruitSeller seller, int money)�޼ҵ� ȣ�� ��
		//���� �Ǹ��� ��ü1(new FruitSeller())�� �Ű������� �����ϰ�,
		//���� ���� �ݾ��� int money�Ű������� ���� �Ѵ�.
		buyer.buyApple(seller1, 4500);
		
		//���� ������ ��ü�� ���� �Ǹ���2 ��ü���� 2000����ġ ����� �����ϱ� ����
		//���� ������ ��ü�� buyApple(FruitSeller seller, int money)�޼ҵ� ȣ�� ��
		//���� �Ǹ��� ��ü1(new FruitSeller())�� �Ű������� �����ϰ�,
		//���� ���� �ݾ��� int money�Ű������� ���� �Ѵ�.
		buyer.buyApple(seller2, 2000);
		
		//���� �Ǹ���2�� ���� ��Ȳ (�ܰ�, �Ȱ� ���� ���� �� ) ���
		System.out.println("-----���� �Ǹ���2�� ���� ��Ȳ----");
		seller2.showSaleResult();
		
		//���� �������� ���� ��Ȳ(�ܰ�, ���� �� �����ϰ� �ִ� ���ϼ� )���
		System.out.println("------���� �������� ���� ��Ȳ----");
		buyer.showBuyResult();
	}

}
