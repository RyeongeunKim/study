package method;

//����� ���� �޼ҵ� ����� ����
public class Test51 {
	
	//�޼ҵ� �̸� : hiEveryone
	//�Ű����� X, ���ϰ� X
	//��� : "��� start!" ���
	
	public static void hiEveryone() {
		System.out.println("��� start!");
	}
	
	//�޼ҵ� �̸� : hiEveryoneend
	//�Ű����� X, ���ϰ� X
	//��� : "����� �����ƽ��ϴ�" ���
	
	public static void hiEveryoneend() {
		System.out.println("����� �����ƽ��ϴ�");
	}
	
	//�޼ҵ� �̸� : hiEveryone
	//�Ű����� O -> ������(4) age
	//���
	//"���� ��ħ�Դϴ�"
	//"�� ���̴� 13�� �Դϴ�"
	//"�� ��Ź�帳�ϴ�" ���
	
	public static void hiEveryone(int age) {
		System.out.println("���� ��ħ�Դϴ�");
		System.out.println("�� ���̴� " + age + "�� �Դϴ�");
		System.out.println("�� ��Ź�帳�ϴ�");
	}
	
	//�޼ҵ� �̸� : byEveryone
	//�Ű����� X
	//���
	//"���� ���� �����̽��ϴ�" ���
	//�����Ұ� O -> "������ �˰ڽ��ϴ�"
	
	public static String byEveryone() {
		System.out.println("���� ���� �����̽��ϴ�.");
		return "������ �˰ڽ��ϴ�";
	}
	

	public static void main(String[] args) {
		/*
			��°��
			��� Start!
			����� �����ƽ��ϴ�.
			���� ��ħ�Դϴ�.
			�� ���̴� 13�� �Դϴ�.
			�� ��Ź�帳�ϴ�.
			���� ���� �����̽��ϴ�.
			������ �˰ڽ��ϴ�.

		*/
		
		hiEveryone();
		hiEveryoneend();
		hiEveryone(13); //�޼ҵ� �����ε�: �Ű������� �޸� �ؼ� �Ȱ��� �̸��� �޼ҵ带 ���� �� ���� �� �ִ�
		
		//System.out.println(byEveryone());
		String value = byEveryone(); // byEveryone�޼ҵ带 ȣ���ϸ� 
									 // 1. ���õ� ���� �����̽��ϴ� ���
									 // 2. ������ �˰ڽ��ϴ� ����(��ȯ, �ǵ�����)�޾� value������ ����
		System.out.println(value);
		
		
	}

}
