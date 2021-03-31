
//---����1---

//�޼ҵ� �����
class SimpleMath { // �ܼ� ��� Ŭ����
	public static final double PI = 3.1415;

	public double add(double n1, double n2) {
		return n1 + n2;
	}

	public double min(double n1, double n2) {
		return n1 - n2;
	}

	public double mul(double n1, double n2) {
		return n1 * n2;
	}
}

class AreaMath { // ���� ��� Ŭ����

	// ������ ��� �޼ҵ�
	public double calCircleArea(double rad) {
		// SimpleMath��ü����
		SimpleMath sm = new SimpleMath();

		// ������ * ������ �� ����޾ƿͼ� double(8) result����������
		double result = sm.mul(rad, rad);

		// ������ * ������ * 3.14 ����޾� �ͼ� double(8) result����������
		result = sm.mul(result, SimpleMath.PI);

		// ȣ���Ѱ�����!! ������ ����
		return result; // ������ ����
	}

}

class PerimeterMath { // ���簢���� �ѷ����Ŭ����
	// ���簢���� �ѷ� ��� �޼ҵ�
	public double calRectanglePeri(double width, double height) {
		// SimpleMath ��ü����
		SimpleMath sm = new SimpleMath();

		// {(����) �� (����)} �� 2 <--���簢�� �ѷ� ����
		
//		double result1 = sm.mul(width, 2);
//		double result2 = sm.mul(height, 2);
//		double result3 = sm.add(result1, result2);
		
		return sm.add(sm.mul(width, 2), sm.mul(height, 2)); // ���簢�� �ѷ� ����
				//	   	(���� X 2)           (���� X 2)
	}
}

public class HowMethod {
	public static void main(String[] args) {
	
	//����!! ������ ���ϴ� �޼ҵ� ȣ�� , ȣ��� 2.4����
	AreaMath am = new AreaMath();
//	double result1 = am.calCircleArea(2.4);
//	System.out.println("���� ���� : "+result1);
	System.out.println("���� ���� : "+am.calCircleArea(2.4));
	
	//����!! ���簢�� �ѷ� ���ϴ� �޼ҵ� ȣ��, ȣ���  2.0, 4.0 ����
	PerimeterMath pm = new PerimeterMath();
	System.out.println("���簢�� �ѷ� : "+new PerimeterMath().calRectanglePeri(2.0, 4.0));

		// ��� ���
		// ���� ���� : 18.09504
		// ���簢�� �ѷ� : 12.0
	}
}
