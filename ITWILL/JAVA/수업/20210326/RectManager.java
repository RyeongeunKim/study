public class RectManager {
	public static void main(String args[]) {

		//�簢�� r�� ��ǥ��(0,0), (0,0)�Դϴ�.
		Rectangle r = new Rectangle();
		//�簢�� r
		System.out.println("�簢��r");
		r.show();
		System.out.println();
		//�簢��s�� ��ǥ�� (1,1), (2,3)�Դϴ�.
		Rectangle s = new Rectangle(1, 1, 2, 3);
		//�簢��s
		System.out.println("�簢��s");
		s.show();
		
		//�簢��s�� ����
		System.out.println("�簢��s�� ���� : " + s.square());
		System.out.println();
		
		System.out.println("�簢��r�� ��ǥ��(-2,2), (-1,4)�� ����");
		System.out.println();
		
		//�簢��r�� ��ǥ�� (-2,2),(-1,4)�� ����
		r.set(-2, 2, -1, 4);
		//�簢��r�� ��ǥ ���
		r.show();
		
		//�簢��r��ü ������ equals�޼ҵ� ȣ��� 
		//�Ű������� �簢��s��ü ��ü�� ����
		System.out.println("�簢��r�� ���� : "+r.square());
		
		if(r.equals(s)) {
			System.out.println("�� �簢���� ���̴� �����ϴ�.");
		}
		
		
	}
}