
public class Test61 {
	public static void main(String[] args) {
		
		//PointŬ�����κ��� ��ü ������ �⺻�����ڸ� ȣ��!
		Point p = new Point();
		//p���������� �����ϰ� �ִ� ��ü�� ������ ���
		System.out.println("x������ �� = " + p.x);
		System.out.println("y������ �� = " + p.y);
		//prn()�޼ҵ� ȣ��
		p.prn(); //��� x, y : 2,2
		
		//p���������� �����ϰ� �ִ� x����, y������ ���� ���� 10�� 20���� �ٽ� ����
		
		p.x = 10;
		p.y = 20;
		
		//prn()�޼ҵ� ȣ��
		p.prn();
		
		//x������ �� 100����
		//y������ �� 200���� �ʱ�ȭ�ϱ� ���� setX�޼ҵ�� setY�޼ҵ� ȣ��
		p.setX(100);
		p.setY(200);
		
		//prn() �޼ҵ� ȣ��
		p.prn();
		
		System.out.println(p.getX()); //p.x
		System.out.println(p.getY()); //p.y
		
		System.out.println("---------------------------------------");
		
		//x������ ���� �ʱ�ȭ ��ų ������ ȣ���� �̿��� ��ü ����
		Point p2 = new Point(300);
		p2.prn();
		
		//x����, y�������� �ʱ�ȭ��ų ������ ������ ȣ���� �̿��� ��ü ����
		Point p3 = new Point(300,400);
		p3.prn();
		
		

	}

}
