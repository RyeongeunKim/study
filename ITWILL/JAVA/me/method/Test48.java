package method;

//����� ���� �޼ҵ� ����� ����
public class Test48 {

//�޼ҵ带 ����� ����.
//�޼ҵ带 ����°� main���� �ۿ� ����� ����ϴ°� �ȿ��� ȣ���ϸ� �ȴ�.

	// �޼ҵ��̸� : javaSpeak
	// ��� : "���� �ڹ�!" ����ϴ� ���

	public static void javaSpeak() {
		System.out.println("���� �ڹ�!");
	}

	// �޼ҵ��̸� : absTest
	// ��� : "���밪�� ���ϴ� �޼ҵ�" ����ϴ� ���

	public static void absTest() {
		System.out.println("���밪�� ���ϴ� �޼ҵ�");
	}

	// �޼ҵ��̸� : move
	// ��� : "�̵��϶�!" ��� �ϴ� ���

	public static void move() {
		System.out.println("�̵��϶�!");
	}

	public static void main(String[] args) {

		// ���� ����� ���� javaSpeak�޼ҵ� ȣ���Ͽ� �� ����� ����ǵ��� �ϱ�
		//Ŭ������.�޼ҵ������ ȣ��
		Test48.javaSpeak(); //�տ� static�� �پ����� ��� Ŭ������ ��������

		// absTest�޼ҵ�, move�޼ҵ� ���� ȣ���Ͽ� �� ����� ����ǵ��� �ϱ�
		// �޼ҵ������ ȣ��
		absTest();
		move();

	}

}
