
//�ڹ��� Ư¡ �߿� �ϳ���?
//������(�پ��� ������ ������ ���� �� �ִ�)

//������ �����ε�(�������� Ư���� ������ �ִ�.)
//- �ϳ��� ������ �̸����� �������� �����ڸ� ����� ���� �� �ִ�.

//�޼ҵ� �����ε�(�������� Ư¡�� ������ �ִ�.) 
//- �ϳ��� �̸����� �پ��� ������ �޼ҵ带 ����� ���� �� �ִ�.

//System.out.println()�޼ҵ� ȣ�� �κ� ���� ����� ����

//System1Ŭ���� �����
class System1{
	
	static PrintStream1 out = new PrintStream1();
			
}
//PrintStream1Ŭ���� �����
class PrintStream1{
	
//�޼ҵ�� �����ε� �س���	
	//���� �ٿ�� ����� println�޼ҵ� �����ε�
	void println() {
		System.out.println(); //���
	}
	//������ �Ű������� ���޹޾� ����ϴ� ����� println�޼ҵ� �����ε�
	void println(boolean x) {
		System.out.println(x); //���
	}
	//�������� �Ű������� ���޹޾� ����ϴ� ����� println�޼ҵ� �����ε�
	void println(int x) {
		System.out.println(x); //���
	}
	//�Ǽ����� �Ű������� ���޹޾� ����ϴ� ����� println�޼ҵ� �����ε�
	void println(double x) {
		System.out.println(x); //���
	}
	//���ڿ��� �Ű������� ���޹޾� ����ϴ� ����� println�޼ҵ� �����ε�
	void println(String x) {
		System.out.println(x); //���
	}
}//PrintStream1Ŭ����

public class Test68 {
	public static void main(String[] args) {
		
		System1.out.println(); //���ٶٿ��
 		System1.out.println(2); //�������� �����ϸ� ��� �� ���� �ٿ��
 		System1.out.println(1.2); //�Ǽ� ���� �����ϸ� ��� �� ���� �ٿ��
 		System1.out.println("���� ���ڿ�"); //���ڿ��� �����ϸ� ��� �� ���� �ٿ��
	}

}
